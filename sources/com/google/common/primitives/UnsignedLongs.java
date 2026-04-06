package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
public final class UnsignedLongs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                long j2 = jArr[i2];
                long j3 = jArr2[i2];
                if (j2 != j3) {
                    return UnsignedLongs.a(j2, j3);
                }
            }
            return jArr.length - jArr2.length;
        }

        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {

        /* renamed from: a  reason: collision with root package name */
        public static final long[] f29202a = new long[37];

        /* renamed from: b  reason: collision with root package name */
        public static final int[] f29203b = new int[37];

        /* renamed from: c  reason: collision with root package name */
        public static final int[] f29204c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i2 = 2; i2 <= 36; i2++) {
                long j2 = (long) i2;
                f29202a[i2] = UnsignedLongs.b(-1, j2);
                f29203b[i2] = (int) UnsignedLongs.d(-1, j2);
                f29204c[i2] = bigInteger.toString(i2).length() - 1;
            }
        }
    }

    public static int a(long j2, long j3) {
        return Longs.c(c(j2), c(j3));
    }

    public static long b(long j2, long j3) {
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

    public static long c(long j2) {
        return j2 ^ Long.MIN_VALUE;
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
        return f(j2, 10);
    }

    public static String f(long j2, int i2) {
        Preconditions.g(i2 >= 2 && i2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i2);
        int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i3 == 0) {
            return "0";
        }
        if (i3 > 0) {
            return Long.toString(j2, i2);
        }
        int i4 = 64;
        char[] cArr = new char[64];
        int i5 = i2 - 1;
        if ((i2 & i5) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            do {
                i4--;
                cArr[i4] = Character.forDigit(((int) j2) & i5, i2);
                j2 >>>= numberOfTrailingZeros;
            } while (j2 != 0);
        } else {
            long b2 = (i2 & 1) == 0 ? (j2 >>> 1) / ((long) (i2 >>> 1)) : b(j2, (long) i2);
            long j3 = (long) i2;
            int i6 = 63;
            cArr[63] = Character.forDigit((int) (j2 - (b2 * j3)), i2);
            while (b2 > 0) {
                i6--;
                cArr[i6] = Character.forDigit((int) (b2 % j3), i2);
                b2 /= j3;
            }
            i4 = i6;
        }
        return new String(cArr, i4, 64 - i4);
    }
}
