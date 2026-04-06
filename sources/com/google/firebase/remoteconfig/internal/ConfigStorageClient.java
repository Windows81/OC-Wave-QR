package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ConfigStorageClient {

    /* renamed from: c  reason: collision with root package name */
    public static final Map f31351c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f31352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31353b;

    public ConfigStorageClient(Context context, String str) {
        this.f31352a = context;
        this.f31353b = str;
    }

    public static synchronized ConfigStorageClient c(Context context, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            try {
                Map map = f31351c;
                if (!map.containsKey(str)) {
                    map.put(str, new ConfigStorageClient(context, str));
                }
                configStorageClient = (ConfigStorageClient) map.get(str);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return configStorageClient;
    }

    public synchronized Void a() {
        this.f31352a.deleteFile(this.f31353b);
        return null;
    }

    public String b() {
        return this.f31353b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[SYNTHETIC, Splitter:B:17:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.ConfigContainer d() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f31352a     // Catch:{ FileNotFoundException | JSONException -> 0x0032, all -> 0x002d }
            java.lang.String r2 = r6.f31353b     // Catch:{ FileNotFoundException | JSONException -> 0x0032, all -> 0x002d }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0032, all -> 0x002d }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = com.google.firebase.remoteconfig.internal.ConfigContainer.b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x003a, all -> 0x002b }
            r1.close()     // Catch:{ all -> 0x0029 }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x0040
        L_0x002b:
            r0 = move-exception
            goto L_0x0034
        L_0x002d:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0034
        L_0x0032:
            r1 = r0
            goto L_0x003a
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0029 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x003a:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ all -> 0x0029 }
            goto L_0x0042
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x0042:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.d():com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    public synchronized Void e(ConfigContainer configContainer) {
        FileOutputStream openFileOutput = this.f31352a.openFileOutput(this.f31353b, 0);
        try {
            openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
