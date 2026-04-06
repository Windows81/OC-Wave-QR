package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {

    /* renamed from: a  reason: collision with root package name */
    public final long f31354a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31355b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseRemoteConfigSettings f31356c;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public long f31357a;

        /* renamed from: b  reason: collision with root package name */
        public int f31358b;

        /* renamed from: c  reason: collision with root package name */
        public FirebaseRemoteConfigSettings f31359c;

        public FirebaseRemoteConfigInfoImpl a() {
            return new FirebaseRemoteConfigInfoImpl(this.f31357a, this.f31358b, this.f31359c);
        }

        public Builder b(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.f31359c = firebaseRemoteConfigSettings;
            return this;
        }

        public Builder c(int i2) {
            this.f31358b = i2;
            return this;
        }

        public Builder d(long j2) {
            this.f31357a = j2;
            return this;
        }

        public Builder() {
        }
    }

    public static Builder c() {
        return new Builder();
    }

    public int a() {
        return this.f31355b;
    }

    public long b() {
        return this.f31354a;
    }

    public FirebaseRemoteConfigInfoImpl(long j2, int i2, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f31354a = j2;
        this.f31355b = i2;
        this.f31356c = firebaseRemoteConfigSettings;
    }
}
