package com.google.common.primitives;

import java.util.Comparator;

@ElementTypesAreNonnullByDefault
public final class UnsignedInts {

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                if (i3 != i4) {
                    return UnsignedInts.a(i3, i4);
                }
            }
            return iArr.length - iArr2.length;
        }

        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    public static int a(int i2, int i3) {
        return Ints.d(b(i2), b(i3));
    }

    public static int b(int i2) {
        return i2 ^ Integer.MIN_VALUE;
    }

    public static long c(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static String d(int i2, int i3) {
        return Long.toString(((long) i2) & 4294967295L, i3);
    }
}
