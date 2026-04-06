package com.google.common.util.concurrent;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public transient AtomicLong f29377z;

    public final double a() {
        return Double.longBitsToDouble(this.f29377z.get());
    }

    public double doubleValue() {
        return a();
    }

    public float floatValue() {
        return (float) a();
    }

    public int intValue() {
        return (int) a();
    }

    public long longValue() {
        return (long) a();
    }

    public String toString() {
        return Double.toString(a());
    }
}
