package com.google.android.datatransport.cct.internal;

final class AutoValue_LogResponse extends LogResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f23973a;

    public AutoValue_LogResponse(long j2) {
        this.f23973a = j2;
    }

    public long c() {
        return this.f23973a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogResponse) {
            return this.f23973a == ((LogResponse) obj).c();
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f23973a;
        return ((int) (j2 ^ (j2 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f23973a + "}";
    }
}
