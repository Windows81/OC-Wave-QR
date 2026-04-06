package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class ConfigFetchHandler {

    /* renamed from: j  reason: collision with root package name */
    public static final long f31276j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f31277k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseInstallationsApi f31278a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f31279b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f31280c;

    /* renamed from: d  reason: collision with root package name */
    public final Clock f31281d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f31282e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigCacheClient f31283f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHttpClient f31284g;

    /* renamed from: h  reason: collision with root package name */
    public final ConfigMetadataClient f31285h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f31286i;

    public static class FetchResponse {

        /* renamed from: a  reason: collision with root package name */
        public final Date f31287a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31288b;

        /* renamed from: c  reason: collision with root package name */
        public final ConfigContainer f31289c;

        /* renamed from: d  reason: collision with root package name */
        public final String f31290d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        public FetchResponse(Date date, int i2, ConfigContainer configContainer, String str) {
            this.f31287a = date;
            this.f31288b = i2;
            this.f31289c = configContainer;
            this.f31290d = str;
        }

        public static FetchResponse a(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, (String) null);
        }

        public static FetchResponse b(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.h(), 0, configContainer, str);
        }

        public static FetchResponse c(Date date) {
            return new FetchResponse(date, 2, (ConfigContainer) null, (String) null);
        }

        public ConfigContainer d() {
            return this.f31289c;
        }

        public String e() {
            return this.f31290d;
        }

        public int f() {
            return this.f31288b;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: z  reason: collision with root package name */
        public final String f31293z;

        /* access modifiers changed from: public */
        FetchType(String str) {
            this.f31293z = str;
        }

        public String f() {
            return this.f31293z;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map map) {
        this.f31278a = firebaseInstallationsApi;
        this.f31279b = provider;
        this.f31280c = executor;
        this.f31281d = clock;
        this.f31282e = random;
        this.f31283f = configCacheClient;
        this.f31284g = configFetchHttpClient;
        this.f31285h = configMetadataClient;
        this.f31286i = map;
    }

    public final ConfigMetadataClient.BackoffMetadata A(int i2, Date date) {
        if (t(i2)) {
            B(date);
        }
        return this.f31285h.a();
    }

    public final void B(Date date) {
        int b2 = this.f31285h.a().b() + 1;
        this.f31285h.k(b2, new Date(date.getTime() + q(b2)));
    }

    public final void C(Task task, Date date) {
        if (task.n()) {
            this.f31285h.q(date);
            return;
        }
        Exception j2 = task.j();
        if (j2 != null) {
            if (j2 instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.f31285h.r();
            } else {
                this.f31285h.p();
            }
        }
    }

    public final boolean f(long j2, Date date) {
        Date e2 = this.f31285h.e();
        if (e2.equals(ConfigMetadataClient.f31309e)) {
            return false;
        }
        return date.before(new Date(e2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    public final FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int a2 = firebaseRemoteConfigServerException.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a2 == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a2 != 500) {
            switch (a2) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a3 = firebaseRemoteConfigServerException.a();
        return new FirebaseRemoteConfigServerException(a3, "Fetch failed: " + str, (Throwable) firebaseRemoteConfigServerException);
    }

    public final String h(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    public Task i() {
        return j(this.f31285h.g());
    }

    public Task j(long j2) {
        HashMap hashMap = new HashMap(this.f31286i);
        hashMap.put("X-Firebase-RC-Fetch-Type", FetchType.BASE.f() + "/" + 1);
        return this.f31283f.e().i(this.f31280c, new h(this, j2, hashMap));
    }

    public final FetchResponse k(String str, String str2, Date date, Map map) {
        try {
            FetchResponse fetch = this.f31284g.fetch(this.f31284g.d(), str, str2, s(), this.f31285h.d(), map, p(), date);
            if (fetch.d() != null) {
                this.f31285h.n(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.f31285h.m(fetch.e());
            }
            this.f31285h.i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            ConfigMetadataClient.BackoffMetadata A2 = A(e2.a(), date);
            if (z(A2, e2.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(A2.a().getTime());
            }
            throw g(e2);
        }
    }

    public final Task l(String str, String str2, Date date, Map map) {
        try {
            FetchResponse k2 = k(str, str2, date, map);
            return k2.f() != 0 ? Tasks.e(k2) : this.f31283f.k(k2.d()).p(this.f31280c, new i(k2));
        } catch (FirebaseRemoteConfigException e2) {
            return Tasks.d(e2);
        }
    }

    /* renamed from: m */
    public final Task u(Task task, long j2, Map map) {
        Task task2;
        Date date = new Date(this.f31281d.a());
        if (task.n() && f(j2, date)) {
            return Tasks.e(FetchResponse.c(date));
        }
        Date o2 = o(date);
        if (o2 != null) {
            task2 = Tasks.d(new FirebaseRemoteConfigFetchThrottledException(h(o2.getTime() - date.getTime()), o2.getTime()));
        } else {
            Task m2 = this.f31278a.m();
            Task n2 = this.f31278a.n(false);
            task2 = Tasks.j(m2, n2).i(this.f31280c, new f(this, m2, n2, date, map));
        }
        return task2.i(this.f31280c, new g(this, date));
    }

    public Task n(FetchType fetchType, int i2) {
        HashMap hashMap = new HashMap(this.f31286i);
        hashMap.put("X-Firebase-RC-Fetch-Type", fetchType.f() + "/" + i2);
        return this.f31283f.e().i(this.f31280c, new e(this, hashMap));
    }

    public final Date o(Date date) {
        Date a2 = this.f31285h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    public final Long p() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f31279b.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.a(true).get("_fot");
    }

    public final long q(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f31277k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f31282e.nextInt((int) millis));
    }

    public long r() {
        return this.f31285h.f();
    }

    public final Map s() {
        HashMap hashMap = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f31279b.get();
        if (analyticsConnector == null) {
            return hashMap;
        }
        for (Map.Entry entry : analyticsConnector.a(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    public final boolean t(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    public final /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) {
        return !task.n() ? Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", (Throwable) task.j())) : !task2.n() ? Tasks.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", (Throwable) task2.j())) : l((String) task.k(), ((InstallationTokenResult) task2.k()).b(), date, map);
    }

    public final /* synthetic */ Task x(Date date, Task task) {
        C(task, date);
        return task;
    }

    public final /* synthetic */ Task y(Map map, Task task) {
        return u(task, 0, map);
    }

    public final boolean z(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i2) {
        return backoffMetadata.b() > 1 || i2 == 429;
    }
}
