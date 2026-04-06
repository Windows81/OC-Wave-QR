package com.google.common.math;

@ElementTypesAreNonnullByDefault
final class MathPreconditions {
    public static void a(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    public static int b(String str, int i2) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c(String str, int i2) {
        if (i2 > 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
