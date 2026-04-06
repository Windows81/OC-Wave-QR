package com.google.common.util.concurrent;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
public class AtomicDoubleArray implements Serializable {

    /* renamed from: z  reason: collision with root package name */
    public transient AtomicLongArray f29378z;

    public final int a() {
        return this.f29378z.length();
    }

    public String toString() {
        int a2 = a();
        int i2 = a2 - 1;
        if (i2 == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(a2 * 19);
        sb.append('[');
        int i3 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f29378z.get(i3)));
            if (i3 == i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i3++;
        }
    }
}
