package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ConfigRealtimeHttpClient {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f31331q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f31332r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Set f31333a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31334b;

    /* renamed from: c  reason: collision with root package name */
    public int f31335c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31336d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f31337e;

    /* renamed from: f  reason: collision with root package name */
    public final int f31338f = 8;

    /* renamed from: g  reason: collision with root package name */
    public final ScheduledExecutorService f31339g;

    /* renamed from: h  reason: collision with root package name */
    public final ConfigFetchHandler f31340h;

    /* renamed from: i  reason: collision with root package name */
    public final FirebaseApp f31341i;

    /* renamed from: j  reason: collision with root package name */
    public final FirebaseInstallationsApi f31342j;

    /* renamed from: k  reason: collision with root package name */
    public ConfigCacheClient f31343k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f31344l;

    /* renamed from: m  reason: collision with root package name */
    public final String f31345m;

    /* renamed from: n  reason: collision with root package name */
    public final Random f31346n;

    /* renamed from: o  reason: collision with root package name */
    public final Clock f31347o;

    /* renamed from: p  reason: collision with root package name */
    public final ConfigMetadataClient f31348p;

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        this.f31333a = set;
        this.f31334b = false;
        this.f31339g = scheduledExecutorService;
        this.f31346n = new Random();
        this.f31335c = Math.max(8 - configMetadataClient.h().b(), 1);
        this.f31347o = DefaultClock.d();
        this.f31341i = firebaseApp;
        this.f31340h = configFetchHandler;
        this.f31342j = firebaseInstallationsApi;
        this.f31343k = configCacheClient;
        this.f31344l = context;
        this.f31345m = str;
        this.f31348p = configMetadataClient;
        this.f31336d = false;
        this.f31337e = false;
    }

    public static String k(String str) {
        Matcher matcher = f31332r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized ConfigAutoFetch B(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new ConfigAutoFetch(httpURLConnection2, this.f31340h, this.f31343k, this.f31333a, new ConfigUpdateListener() {
            public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.j();
                ConfigRealtimeHttpClient.this.u(firebaseRemoteConfigException);
            }

            public void b(ConfigUpdate configUpdate) {
            }
        }, this.f31339g);
    }

    public void C() {
        s(0);
    }

    public final void D(Date date) {
        int b2 = this.f31348p.h().b() + 1;
        this.f31348p.o(b2, new Date(date.getTime() + m(b2)));
    }

    public void e() {
        if (f()) {
            if (new Date(this.f31347o.a()).before(this.f31348p.h().a())) {
                w();
                return;
            }
            Task h2 = h();
            Tasks.j(h2).h(this.f31339g, new k(this, h2));
        }
    }

    public final synchronized boolean f() {
        return !this.f31333a.isEmpty() && !this.f31334b && !this.f31336d && !this.f31337e;
    }

    public void g(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public Task h() {
        Task n2 = this.f31342j.n(false);
        Task m2 = this.f31342j.m();
        return Tasks.j(n2, m2).i(this.f31339g, new l(this, n2, m2));
    }

    public final JSONObject i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", k(this.f31341i.n().c()));
        hashMap.put("namespace", this.f31345m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f31340h.r()));
        hashMap.put("appId", this.f31341i.n().c());
        hashMap.put("sdkVersion", "22.0.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    public final synchronized void j() {
        this.f31336d = true;
    }

    public final String l() {
        try {
            Context context = this.f31344l;
            byte[] a2 = AndroidUtilsLight.a(context, context.getPackageName());
            if (a2 != null) {
                return Hex.b(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f31344l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f31344l.getPackageName());
            return null;
        }
    }

    public final long m(int i2) {
        int[] iArr = f31331q;
        int length = iArr.length;
        if (i2 >= length) {
            i2 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i2 - 1]);
        return (millis / 2) + ((long) this.f31346n.nextInt((int) millis));
    }

    public final String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{k(this.f31341i.n().c()), str});
    }

    public final URL o() {
        try {
            return new URL(n(this.f31345m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    public final boolean p(int i2) {
        return i2 == 408 || i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.tasks.Task q(com.google.android.gms.tasks.Task r10, com.google.android.gms.tasks.Task r11) {
        /*
            r9 = this;
            java.lang.String r11 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            r0 = 403(0x193, float:5.65E-43)
            r1 = 1
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r4 = 0
            boolean r5 = r10.n()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            if (r5 == 0) goto L_0x008b
            r9.y(r1)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Object r10 = r10.k()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            int r5 = r10.getResponseCode()     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x007e, all -> 0x0079 }
            if (r5 != r2) goto L_0x0037
            r9.v()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.ConfigMetadataClient r7 = r9.f31348p     // Catch:{ IOException -> 0x0035 }
            r7.j()     // Catch:{ IOException -> 0x0035 }
            com.google.firebase.remoteconfig.internal.ConfigAutoFetch r7 = r9.B(r10)     // Catch:{ IOException -> 0x0035 }
            r7.i()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0037
        L_0x0032:
            r4 = move-exception
            goto L_0x00f0
        L_0x0035:
            r5 = move-exception
            goto L_0x0095
        L_0x0037:
            r9.g(r10)
            r9.y(r3)
            boolean r1 = r9.p(r5)
            if (r1 == 0) goto L_0x0051
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.Clock r7 = r9.f31347o
            long r7 = r7.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0051:
            if (r1 != 0) goto L_0x0074
            if (r5 != r2) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            if (r5 != r0) goto L_0x0068
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0068:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r10 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r5, (java.lang.String) r11, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r0)
        L_0x006f:
            r9.u(r10)
            goto L_0x00eb
        L_0x0074:
            r9.w()
            goto L_0x00eb
        L_0x0079:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x00f0
        L_0x007e:
            r5 = move-exception
            r6 = r4
            goto L_0x0095
        L_0x0081:
            r10 = move-exception
            r6 = r4
            r4 = r10
            r10 = r6
            goto L_0x00f0
        L_0x0087:
            r5 = move-exception
            r10 = r4
            r6 = r10
            goto L_0x0095
        L_0x008b:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            java.lang.Exception r10 = r10.j()     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            r5.<init>(r10)     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
            throw r5     // Catch:{ IOException -> 0x0087, all -> 0x0081 }
        L_0x0095:
            java.lang.String r7 = "FirebaseRemoteConfig"
            java.lang.String r8 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r7, r8, r5)     // Catch:{ all -> 0x0032 }
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x00b0
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00c0
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.Clock r5 = r9.f31347o
            long r7 = r5.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x00c0:
            if (r1 != 0) goto L_0x0074
            int r1 = r6.intValue()
            if (r1 != r2) goto L_0x00c9
            goto L_0x0074
        L_0x00c9:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x00df
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x00df:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r10 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r0 = r6.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r1 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r1)
            goto L_0x006f
        L_0x00eb:
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.e(r4)
            return r10
        L_0x00f0:
            r9.g(r10)
            r9.y(r3)
            if (r6 == 0) goto L_0x0104
            int r5 = r6.intValue()
            boolean r5 = r9.p(r5)
            if (r5 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r1 = r3
        L_0x0104:
            if (r1 == 0) goto L_0x0114
            java.util.Date r3 = new java.util.Date
            com.google.android.gms.common.util.Clock r5 = r9.f31347o
            long r7 = r5.a()
            r3.<init>(r7)
            r9.D(r3)
        L_0x0114:
            if (r1 != 0) goto L_0x0141
            int r1 = r6.intValue()
            if (r1 == r2) goto L_0x0141
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r11 = java.lang.String.format(r11, r1)
            int r1 = r6.intValue()
            if (r1 != r0) goto L_0x0132
            java.io.InputStream r10 = r10.getErrorStream()
            java.lang.String r11 = r9.t(r10)
        L_0x0132:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r10 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r0 = r6.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r1 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r10.<init>((int) r0, (java.lang.String) r11, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r1)
            r9.u(r10)
            goto L_0x0144
        L_0x0141:
            r9.w()
        L_0x0144:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.q(com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public final /* synthetic */ Task r(Task task, Task task2, Task task3) {
        if (!task.n()) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task.j()));
        }
        if (!task2.n()) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task2.j()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) task2.k(), ((InstallationTokenResult) task.k()).b());
            return Tasks.e(httpURLConnection);
        } catch (IOException e2) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", (Throwable) e2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void s(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f31335c     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0020
            int r0 = r0 + -1
            r3.f31335c = r0     // Catch:{ all -> 0x001e }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f31339g     // Catch:{ all -> 0x001e }
            com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$1 r1 = new com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$1     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x001e }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x001e }
            goto L_0x0030
        L_0x001e:
            r4 = move-exception
            goto L_0x0032
        L_0x0020:
            boolean r4 = r3.f31337e     // Catch:{ all -> 0x001e }
            if (r4 != 0) goto L_0x0030
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x001e }
            r4.<init>((java.lang.String) r5, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r0)     // Catch:{ all -> 0x001e }
            r3.u(r4)     // Catch:{ all -> 0x001e }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.s(long):void");
    }

    public final String t(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (ConfigUpdateListener a2 : this.f31333a) {
            a2.a(firebaseRemoteConfigException);
        }
    }

    public final synchronized void v() {
        this.f31335c = 8;
    }

    public synchronized void w() {
        s(Math.max(0, this.f31348p.h().a().getTime() - new Date(this.f31347o.a()).getTime()));
    }

    public final void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f31341i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f31344l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final synchronized void y(boolean z2) {
        this.f31334b = z2;
    }

    public void z(boolean z2) {
        this.f31337e = z2;
    }
}
