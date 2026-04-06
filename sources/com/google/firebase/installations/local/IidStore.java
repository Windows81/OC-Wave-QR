package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class IidStore {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f30832c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30833a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30834b;

    public IidStore(FirebaseApp firebaseApp) {
        this.f30833a = firebaseApp.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f30834b = b(firebaseApp);
    }

    public static String b(FirebaseApp firebaseApp) {
        String d2 = firebaseApp.n().d();
        if (d2 != null) {
            return d2;
        }
        String c2 = firebaseApp.n().c();
        if (!c2.startsWith("1:") && !c2.startsWith("2:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    public String f() {
        synchronized (this.f30833a) {
            try {
                String g2 = g();
                if (g2 != null) {
                    return g2;
                }
                String h2 = h();
                return h2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f30833a) {
            string = this.f30833a.getString("|S|id", (String) null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f30833a) {
            try {
                String string = this.f30833a.getString("|S||P|", (String) null);
                if (string == null) {
                    return null;
                }
                PublicKey e2 = e(string);
                if (e2 == null) {
                    return null;
                }
                String c2 = c(e2);
                return c2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f30833a
            monitor-enter(r0)
            java.lang.String[] r1 = f30832c     // Catch:{ all -> 0x002d }
            int r2 = r1.length     // Catch:{ all -> 0x002d }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0034
            r5 = r1[r3]     // Catch:{ all -> 0x002d }
            java.lang.String r6 = r7.f30834b     // Catch:{ all -> 0x002d }
            java.lang.String r5 = r7.a(r6, r5)     // Catch:{ all -> 0x002d }
            android.content.SharedPreferences r6 = r7.f30833a     // Catch:{ all -> 0x002d }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x0031
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x002d }
            if (r5 != 0) goto L_0x0031
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002f
            java.lang.String r4 = r7.d(r4)     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r1 = move-exception
            goto L_0x0036
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0031:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.IidStore.i():java.lang.String");
    }
}
