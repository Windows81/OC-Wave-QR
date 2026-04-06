package org.bson.internal;

import java.math.BigInteger;

public final class UnsignedLongs {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f43899a = new long[37];

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f43900b = new int[37];

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f43901c = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i2 = 2; i2 <= 36; i2++) {
            long j2 = (long) i2;
            f43899a[i2] = c(-1, j2);
            f43900b[i2] = (int) d(-1, j2);
            f43901c[i2] = bigInteger.toString(i2).length() - 1;
        }
    }

    public static int a(long j2, long j3) {
        return b(j2 - Long.MIN_VALUE, j3 - Long.MIN_VALUE);
    }

    public static int b(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static long c(long j2, long j3) {
        if (j3 < 0) {
            return a(j2, j3) < 0 ? 0 : 1;
        }
        if (j2 >= 0) {
            return j2 / j3;
        }
        int i2 = 1;
        long j4 = ((j2 >>> 1) / j3) << 1;
        if (a(j2 - (j4 * j3), j3) < 0) {
            i2 = 0;
        }
        return j4 + ((long) i2);
    }

    public static long d(long j2, long j3) {
        if (j3 < 0) {
            return a(j2, j3) < 0 ? j2 : j2 - j3;
        }
        if (j2 >= 0) {
            return j2 % j3;
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (a(j4, j3) < 0) {
            j3 = 0;
        }
        return j4 - j3;
    }

    public static String e(long j2) {
        if (j2 >= 0) {
            return Long.toString(j2);
        }
        long j3 = (j2 >>> 1) / 5;
        return Long.toString(j3) + (j2 - (10 * j3));
    }
}
