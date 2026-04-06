package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: a  reason: collision with root package name */
    public File f30835a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f30836b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.f30836b = firebaseApp;
    }

    public final File a() {
        if (this.f30835a == null) {
            synchronized (this) {
                try {
                    if (this.f30835a == null) {
                        File filesDir = this.f30836b.k().getFilesDir();
                        this.f30835a = new File(filesDir, "PersistedInstallation." + this.f30836b.o() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f30835a;
    }

    public PersistedInstallationEntry b(PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.d());
            jSONObject.put("Status", persistedInstallationEntry.g().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.b());
            jSONObject.put("RefreshToken", persistedInstallationEntry.f());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.h());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.c());
            jSONObject.put("FisError", persistedInstallationEntry.e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f30836b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return persistedInstallationEntry;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public final JSONObject c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public PersistedInstallationEntry d() {
        JSONObject c2 = c();
        String optString = c2.optString("Fid", (String) null);
        int optInt = c2.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c2.optString("AuthToken", (String) null);
        String optString3 = c2.optString("RefreshToken", (String) null);
        long optLong = c2.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c2.optLong("ExpiresInSecs", 0);
        return PersistedInstallationEntry.a().d(optString).g(RegistrationStatus.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c2.optString("FisError", (String) null)).a();
    }
}
