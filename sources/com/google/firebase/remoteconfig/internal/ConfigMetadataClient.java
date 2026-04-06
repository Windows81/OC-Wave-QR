package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

public class ConfigMetadataClient {

    /* renamed from: e  reason: collision with root package name */
    public static final Date f31309e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    public static final Date f31310f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f31311a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f31312b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f31313c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Object f31314d = new Object();

    public static class BackoffMetadata {

        /* renamed from: a  reason: collision with root package name */
        public int f31315a;

        /* renamed from: b  reason: collision with root package name */
        public Date f31316b;

        public BackoffMetadata(int i2, Date date) {
            this.f31315a = i2;
            this.f31316b = date;
        }

        public Date a() {
            return this.f31316b;
        }

        public int b() {
            return this.f31315a;
        }
    }

    public static class RealtimeBackoffMetadata {

        /* renamed from: a  reason: collision with root package name */
        public int f31317a;

        /* renamed from: b  reason: collision with root package name */
        public Date f31318b;

        public RealtimeBackoffMetadata(int i2, Date date) {
            this.f31317a = i2;
            this.f31318b = date;
        }

        public Date a() {
            return this.f31318b;
        }

        public int b() {
            return this.f31317a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.f31311a = sharedPreferences;
    }

    public BackoffMetadata a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f31313c) {
            backoffMetadata = new BackoffMetadata(this.f31311a.getInt("num_failed_fetches", 0), new Date(this.f31311a.getLong("backoff_end_time_in_millis", -1)));
        }
        return backoffMetadata;
    }

    public long b() {
        return this.f31311a.getLong("fetch_timeout_in_seconds", 60);
    }

    public FirebaseRemoteConfigInfo c() {
        FirebaseRemoteConfigInfoImpl a2;
        synchronized (this.f31312b) {
            long j2 = this.f31311a.getLong("last_fetch_time_in_millis", -1);
            int i2 = this.f31311a.getInt("last_fetch_status", 0);
            a2 = FirebaseRemoteConfigInfoImpl.c().c(i2).d(j2).b(new FirebaseRemoteConfigSettings.Builder().d(this.f31311a.getLong("fetch_timeout_in_seconds", 60)).e(this.f31311a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f31276j)).c()).a();
        }
        return a2;
    }

    public String d() {
        return this.f31311a.getString("last_fetch_etag", (String) null);
    }

    public Date e() {
        return new Date(this.f31311a.getLong("last_fetch_time_in_millis", -1));
    }

    public long f() {
        return this.f31311a.getLong("last_template_version", 0);
    }

    public long g() {
        return this.f31311a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f31276j);
    }

    public RealtimeBackoffMetadata h() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.f31314d) {
            realtimeBackoffMetadata = new RealtimeBackoffMetadata(this.f31311a.getInt("num_failed_realtime_streams", 0), new Date(this.f31311a.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return realtimeBackoffMetadata;
    }

    public void i() {
        k(0, f31310f);
    }

    public void j() {
        o(0, f31310f);
    }

    public void k(int i2, Date date) {
        synchronized (this.f31313c) {
            this.f31311a.edit().putInt("num_failed_fetches", i2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void l(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.f31312b) {
            this.f31311a.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.a()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.b()).commit();
        }
    }

    public void m(String str) {
        synchronized (this.f31312b) {
            this.f31311a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void n(long j2) {
        synchronized (this.f31312b) {
            this.f31311a.edit().putLong("last_template_version", j2).apply();
        }
    }

    public void o(int i2, Date date) {
        synchronized (this.f31314d) {
            this.f31311a.edit().putInt("num_failed_realtime_streams", i2).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void p() {
        synchronized (this.f31312b) {
            this.f31311a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void q(Date date) {
        synchronized (this.f31312b) {
            this.f31311a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void r() {
        synchronized (this.f31312b) {
            this.f31311a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
