package com.google.firebase;

final class AutoValue_StartupTime extends StartupTime {

    /* renamed from: a  reason: collision with root package name */
    public final long f29628a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29629b;

    /* renamed from: c  reason: collision with root package name */
    public final long f29630c;

    public AutoValue_StartupTime(long j2, long j3, long j4) {
        this.f29628a = j2;
        this.f29629b = j3;
        this.f29630c = j4;
    }

    public long b() {
        return this.f29629b;
    }

    public long c() {
        return this.f29628a;
    }

    public long d() {
        return this.f29630c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.f29628a == startupTime.c() && this.f29629b == startupTime.b() && this.f29630c == startupTime.d();
    }

    public int hashCode() {
        long j2 = this.f29628a;
        long j3 = this.f29629b;
        long j4 = this.f29630c;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f29628a + ", elapsedRealtime=" + this.f29629b + ", uptimeMillis=" + this.f29630c + "}";
    }
}
