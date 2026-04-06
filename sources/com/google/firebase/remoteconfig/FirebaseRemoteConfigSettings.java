package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

public class FirebaseRemoteConfigSettings {

    /* renamed from: a  reason: collision with root package name */
    public final long f31216a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31217b;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f31218a = 60;

        /* renamed from: b  reason: collision with root package name */
        public long f31219b = ConfigFetchHandler.f31276j;

        public FirebaseRemoteConfigSettings c() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public Builder d(long j2) {
            if (j2 >= 0) {
                this.f31218a = j2;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j2)}));
        }

        public Builder e(long j2) {
            if (j2 >= 0) {
                this.f31219b = j2;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f31216a;
    }

    public long b() {
        return this.f31217b;
    }

    public FirebaseRemoteConfigSettings(Builder builder) {
        this.f31216a = builder.f31218a;
        this.f31217b = builder.f31219b;
    }
}
