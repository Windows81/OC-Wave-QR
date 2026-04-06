package kotlin.internal;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;

@Metadata
public final class UProgressionUtilKt {
    public static final int a(int i2, int i3, int i4) {
        int remainderUnsigned = Integer.remainderUnsigned(i2, i4);
        int remainderUnsigned2 = Integer.remainderUnsigned(i3, i4);
        int compareUnsigned = Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int f2 = UInt.f(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? f2 : UInt.f(f2 + i4);
    }

    public static final long b(long j2, long j3, long j4) {
        long remainderUnsigned = Long.remainderUnsigned(j2, j4);
        long remainderUnsigned2 = Long.remainderUnsigned(j3, j4);
        int compareUnsigned = Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long f2 = ULong.f(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? f2 : ULong.f(f2 + j4);
    }

    public static final long c(long j2, long j3, long j4) {
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i2 > 0) {
            if (Long.compareUnsigned(j2, j3) >= 0) {
                return j3;
            }
            return ULong.f(j3 - b(j3, j2, ULong.f(j4)));
        } else if (i2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (Long.compareUnsigned(j2, j3) <= 0) {
            return j3;
        } else {
            return ULong.f(j3 + b(j2, j3, ULong.f(-j4)));
        }
    }

    public static final int d(int i2, int i3, int i4) {
        if (i4 > 0) {
            return Integer.compareUnsigned(i2, i3) >= 0 ? i3 : UInt.f(i3 - a(i3, i2, UInt.f(i4)));
        }
        if (i4 < 0) {
            return Integer.compareUnsigned(i2, i3) <= 0 ? i3 : UInt.f(i3 + a(i2, i3, UInt.f(-i4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
