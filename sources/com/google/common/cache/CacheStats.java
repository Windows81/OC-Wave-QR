package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
public final class CacheStats {

    /* renamed from: a  reason: collision with root package name */
    public final long f27866a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27867b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27868c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27869d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27870e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27871f;

    public CacheStats(long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j2;
        long j9 = j3;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        long j13 = j7;
        boolean z2 = false;
        Preconditions.d(j8 >= 0);
        Preconditions.d(j9 >= 0);
        Preconditions.d(j10 >= 0);
        Preconditions.d(j11 >= 0);
        Preconditions.d(j12 >= 0);
        Preconditions.d(j13 >= 0 ? true : z2);
        this.f27866a = j8;
        this.f27867b = j9;
        this.f27868c = j10;
        this.f27869d = j11;
        this.f27870e = j12;
        this.f27871f = j13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        return this.f27866a == cacheStats.f27866a && this.f27867b == cacheStats.f27867b && this.f27868c == cacheStats.f27868c && this.f27869d == cacheStats.f27869d && this.f27870e == cacheStats.f27870e && this.f27871f == cacheStats.f27871f;
    }

    public int hashCode() {
        return Objects.b(Long.valueOf(this.f27866a), Long.valueOf(this.f27867b), Long.valueOf(this.f27868c), Long.valueOf(this.f27869d), Long.valueOf(this.f27870e), Long.valueOf(this.f27871f));
    }

    public String toString() {
        return MoreObjects.c(this).c("hitCount", this.f27866a).c("missCount", this.f27867b).c("loadSuccessCount", this.f27868c).c("loadExceptionCount", this.f27869d).c("totalLoadTime", this.f27870e).c("evictionCount", this.f27871f).toString();
    }
}
