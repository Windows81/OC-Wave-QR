package com.google.firebase.heartbeatinfo;

final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {

    /* renamed from: A  reason: collision with root package name */
    public final long f30752A;

    /* renamed from: z  reason: collision with root package name */
    public final String f30753z;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        return this.f30753z.equals(sdkHeartBeatResult.h()) && this.f30752A == sdkHeartBeatResult.f();
    }

    public long f() {
        return this.f30752A;
    }

    public String h() {
        return this.f30753z;
    }

    public int hashCode() {
        long j2 = this.f30752A;
        return ((this.f30753z.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f30753z + ", millis=" + this.f30752A + "}";
    }
}
