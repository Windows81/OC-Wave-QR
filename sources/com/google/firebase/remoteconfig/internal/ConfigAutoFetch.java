package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConfigAutoFetch {

    /* renamed from: a  reason: collision with root package name */
    public final Set f31246a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpURLConnection f31247b;

    /* renamed from: c  reason: collision with root package name */
    public final ConfigFetchHandler f31248c;

    /* renamed from: d  reason: collision with root package name */
    public final ConfigCacheClient f31249d;

    /* renamed from: e  reason: collision with root package name */
    public final ConfigUpdateListener f31250e;

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f31251f;

    /* renamed from: g  reason: collision with root package name */
    public final Random f31252g = new Random();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.f31247b = httpURLConnection;
        this.f31248c = configFetchHandler;
        this.f31249d = configCacheClient;
        this.f31246a = set;
        this.f31250e = configUpdateListener;
        this.f31251f = scheduledExecutorService;
    }

    public static Boolean e(ConfigFetchHandler.FetchResponse fetchResponse, long j2) {
        boolean z2 = false;
        if (fetchResponse.d() != null) {
            if (fetchResponse.d().k() >= j2) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
        if (fetchResponse.f() == 1) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public final void b(final int i2, final long j2) {
        if (i2 == 0) {
            k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f31251f.schedule(new Runnable() {
            public void run() {
                ConfigAutoFetch.this.d(i2, j2);
            }
        }, (long) this.f31252g.nextInt(4), TimeUnit.SECONDS);
    }

    public final synchronized void c(ConfigUpdate configUpdate) {
        for (ConfigUpdateListener b2 : this.f31246a) {
            b2.b(configUpdate);
        }
    }

    public synchronized Task d(int i2, long j2) {
        int i3;
        Task n2;
        Task e2;
        i3 = i2 - 1;
        n2 = this.f31248c.n(ConfigFetchHandler.FetchType.REALTIME, 3 - i3);
        e2 = this.f31249d.e();
        return Tasks.j(n2, e2).i(this.f31251f, new a(this, n2, e2, j2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r9.f31250e.a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (g() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r6 = r9.f31248c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r4 <= r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        b(3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L_0x0012:
            r4 = r3
        L_0x0013:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L_0x0096
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x0013
        L_0x003b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x005b }
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            boolean r4 = r5.getBoolean(r1)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x005d
            com.google.firebase.remoteconfig.ConfigUpdateListener r4 = r9.f31250e     // Catch:{ JSONException -> 0x005b }
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ JSONException -> 0x005b }
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x005b }
            r5.<init>((java.lang.String) r6, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r7)     // Catch:{ JSONException -> 0x005b }
            r4.a(r5)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0096
        L_0x005b:
            r4 = move-exception
            goto L_0x007d
        L_0x005d:
            boolean r4 = r9.g()     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0064
            goto L_0x0096
        L_0x0064:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x005b }
            if (r4 == 0) goto L_0x0012
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r4 = r9.f31248c     // Catch:{ JSONException -> 0x005b }
            long r6 = r4.r()     // Catch:{ JSONException -> 0x005b }
            long r4 = r5.getLong(r0)     // Catch:{ JSONException -> 0x005b }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0012
            r6 = 3
            r9.b(r6, r4)     // Catch:{ JSONException -> 0x005b }
            goto L_0x0012
        L_0x007d:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L_0x0012
        L_0x0096:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.f(java.io.InputStream):void");
    }

    public final synchronized boolean g() {
        return this.f31246a.isEmpty();
    }

    public final /* synthetic */ Task h(Task task, Task task2, long j2, int i2, Task task3) {
        if (!task.n()) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable) task.j()));
        }
        if (!task2.n()) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable) task2.j()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.k();
        ConfigContainer configContainer = (ConfigContainer) task2.k();
        if (!e(fetchResponse, j2).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i2, j2);
            return Tasks.e((Object) null);
        } else if (fetchResponse.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.e((Object) null);
        } else {
            if (configContainer == null) {
                configContainer = ConfigContainer.l().a();
            }
            Set f2 = configContainer.f(fetchResponse.d());
            if (f2.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return Tasks.e((Object) null);
            }
            c(ConfigUpdate.a(f2));
            return Tasks.e((Object) null);
        }
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f31247b;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e2);
            } catch (Throwable th) {
                this.f31247b.disconnect();
                throw th;
            }
            this.f31247b.disconnect();
        }
    }

    public final String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    public final synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener a2 : this.f31246a) {
            a2.a(firebaseRemoteConfigException);
        }
    }
}
