package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: A  reason: collision with root package name */
    public final long f31214A;

    public FirebaseRemoteConfigFetchThrottledException(long j2) {
        this("Fetch was throttled.", j2);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j2) {
        super(str);
        this.f31214A = j2;
    }
}
