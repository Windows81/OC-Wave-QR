package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class RangesKt__RangesKt {
    public static final void a(boolean z2, Number number) {
        Intrinsics.i(number, "step");
        if (!z2) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    public static ClosedFloatingPointRange b(float f2, float f3) {
        return new ClosedFloatRange(f2, f3);
    }
}
