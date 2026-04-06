package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
public final class UnsignedKt {
    public static final int a(int i2, int i3) {
        return Intrinsics.k(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j2, long j3) {
        return Intrinsics.l(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    public static final double c(long j2) {
        return (((double) (j2 >>> 11)) * ((double) 2048)) + ((double) (j2 & 2047));
    }

    public static final String d(long j2, int i2) {
        if (j2 >= 0) {
            String l2 = Long.toString(j2, CharsKt.a(i2));
            Intrinsics.h(l2, "toString(...)");
            return l2;
        }
        long j3 = (long) i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        String l3 = Long.toString(j4, CharsKt.a(i2));
        Intrinsics.h(l3, "toString(...)");
        sb.append(l3);
        String l4 = Long.toString(j5, CharsKt.a(i2));
        Intrinsics.h(l4, "toString(...)");
        sb.append(l4);
        return sb.toString();
    }
}
