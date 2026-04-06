package com.google.common.math;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class DoubleUtils {
    public static double a(double d2) {
        Preconditions.d(!Double.isNaN(d2));
        return Math.max(d2, 0.0d);
    }
}
