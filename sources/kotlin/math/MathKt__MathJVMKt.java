package kotlin.math;

import kotlin.Metadata;

@Metadata
class MathKt__MathJVMKt extends MathKt__MathHKt {
    public static int a(int i2) {
        return Integer.signum(i2);
    }

    public static int b(long j2) {
        return Long.signum(j2);
    }

    public static int c(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
    }

    public static int d(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long e(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long f(float f2) {
        return MathKt.e((double) f2);
    }

    public static float g(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        return (float) (f2 > 0.0f ? Math.floor((double) f2) : Math.ceil((double) f2));
    }
}
