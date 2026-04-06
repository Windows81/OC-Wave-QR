package com.google.common.primitives;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {

    /* renamed from: A  reason: collision with root package name */
    public static final UnsignedInteger f29192A = f(0);

    /* renamed from: B  reason: collision with root package name */
    public static final UnsignedInteger f29193B = f(1);
    public static final UnsignedInteger C = f(-1);

    /* renamed from: z  reason: collision with root package name */
    public final int f29194z;

    public UnsignedInteger(int i2) {
        this.f29194z = i2;
    }

    public static UnsignedInteger f(int i2) {
        return new UnsignedInteger(i2);
    }

    /* renamed from: d */
    public int compareTo(UnsignedInteger unsignedInteger) {
        Preconditions.q(unsignedInteger);
        return UnsignedInts.a(this.f29194z, unsignedInteger.f29194z);
    }

    public double doubleValue() {
        return (double) longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.f29194z == ((UnsignedInteger) obj).f29194z;
    }

    public float floatValue() {
        return (float) longValue();
    }

    public String h(int i2) {
        return UnsignedInts.d(this.f29194z, i2);
    }

    public int hashCode() {
        return this.f29194z;
    }

    public int intValue() {
        return this.f29194z;
    }

    public long longValue() {
        return UnsignedInts.c(this.f29194z);
    }

    public String toString() {
        return h(10);
    }
}
