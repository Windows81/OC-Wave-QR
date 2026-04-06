package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final UnsignedLong f29197A = new UnsignedLong(0);

    /* renamed from: B  reason: collision with root package name */
    public static final UnsignedLong f29198B = new UnsignedLong(1);
    public static final UnsignedLong C = new UnsignedLong(-1);

    /* renamed from: z  reason: collision with root package name */
    public final long f29199z;

    public UnsignedLong(long j2) {
        this.f29199z = j2;
    }

    /* renamed from: d */
    public int compareTo(UnsignedLong unsignedLong) {
        Preconditions.q(unsignedLong);
        return UnsignedLongs.a(this.f29199z, unsignedLong.f29199z);
    }

    public double doubleValue() {
        long j2 = this.f29199z;
        if (j2 >= 0) {
            return (double) j2;
        }
        return ((double) ((j2 & 1) | (j2 >>> 1))) * 2.0d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.f29199z == ((UnsignedLong) obj).f29199z;
    }

    public float floatValue() {
        long j2 = this.f29199z;
        if (j2 >= 0) {
            return (float) j2;
        }
        return ((float) ((j2 & 1) | (j2 >>> 1))) * 2.0f;
    }

    public int hashCode() {
        return Longs.e(this.f29199z);
    }

    public int intValue() {
        return (int) this.f29199z;
    }

    public long longValue() {
        return this.f29199z;
    }

    public String toString() {
        return UnsignedLongs.e(this.f29199z);
    }
}
