package com.google.firebase.heartbeatinfo;

public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    /* renamed from: d */
    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return f() < sdkHeartBeatResult.f() ? -1 : 1;
    }

    public abstract long f();

    public abstract String h();
}
