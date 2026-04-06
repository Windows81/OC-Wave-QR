package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class FileBackedNativeSessionFile implements NativeSessionFile {

    /* renamed from: a  reason: collision with root package name */
    public final File f30083a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30084b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30085c;

    public FileBackedNativeSessionFile(String str, String str2, File file) {
        this.f30084b = str;
        this.f30085c = str2;
        this.f30083a = file;
    }

    private byte[] d() {
        InputStream b2;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            b2 = b();
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (b2 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (b2 != null) {
                    b2.close();
                }
                return null;
            }
            while (true) {
                int read = b2.read(bArr);
                if (read > 0) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    b2.close();
                    return byteArray;
                }
            }
            throw th;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public String a() {
        return this.f30085c;
    }

    public InputStream b() {
        if (this.f30083a.exists() && this.f30083a.isFile()) {
            try {
                return new FileInputStream(this.f30083a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public CrashlyticsReport.FilesPayload.File c() {
        byte[] d2 = d();
        if (d2 != null) {
            return CrashlyticsReport.FilesPayload.File.a().b(d2).c(this.f30084b).a();
        }
        return null;
    }
}
