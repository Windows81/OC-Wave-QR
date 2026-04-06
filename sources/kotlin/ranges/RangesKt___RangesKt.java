package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;

@Metadata
class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static double c(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static float d(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static int e(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static long f(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static Comparable g(Comparable comparable, Comparable comparable2) {
        Intrinsics.i(comparable, "<this>");
        Intrinsics.i(comparable2, "minimumValue");
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static double h(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static float i(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static int j(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static long k(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static Comparable l(Comparable comparable, Comparable comparable2) {
        Intrinsics.i(comparable, "<this>");
        Intrinsics.i(comparable2, "maximumValue");
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static double m(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float n(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int o(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static int p(int i2, ClosedRange closedRange) {
        Intrinsics.i(closedRange, "range");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((Number) RangesKt.r(Integer.valueOf(i2), (ClosedFloatingPointRange) closedRange)).intValue();
        }
        if (!closedRange.isEmpty()) {
            return i2 < ((Number) closedRange.e()).intValue() ? ((Number) closedRange.e()).intValue() : i2 > ((Number) closedRange.m()).intValue() ? ((Number) closedRange.m()).intValue() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedRange + '.');
    }

    public static long q(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + '.');
    }

    public static Comparable r(Comparable comparable, ClosedFloatingPointRange closedFloatingPointRange) {
        Intrinsics.i(comparable, "<this>");
        Intrinsics.i(closedFloatingPointRange, "range");
        if (!closedFloatingPointRange.isEmpty()) {
            return (!closedFloatingPointRange.g(comparable, closedFloatingPointRange.e()) || closedFloatingPointRange.g(closedFloatingPointRange.e(), comparable)) ? (!closedFloatingPointRange.g(closedFloatingPointRange.m(), comparable) || closedFloatingPointRange.g(comparable, closedFloatingPointRange.m())) ? comparable : closedFloatingPointRange.m() : closedFloatingPointRange.e();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + closedFloatingPointRange + '.');
    }

    public static IntProgression s(int i2, int i3) {
        return IntProgression.C.a(i2, i3, -1);
    }

    public static IntProgression t(IntProgression intProgression) {
        Intrinsics.i(intProgression, "<this>");
        return IntProgression.C.a(intProgression.o(), intProgression.n(), -intProgression.p());
    }

    public static IntProgression u(IntProgression intProgression, int i2) {
        Intrinsics.i(intProgression, "<this>");
        RangesKt__RangesKt.a(i2 > 0, Integer.valueOf(i2));
        IntProgression.Companion companion = IntProgression.C;
        int n2 = intProgression.n();
        int o2 = intProgression.o();
        if (intProgression.p() <= 0) {
            i2 = -i2;
        }
        return companion.a(n2, o2, i2);
    }

    public static IntRange v(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? IntRange.D.a() : new IntRange(i2, i3 - 1);
    }
}
