package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    public static float h(float f2, float... fArr) {
        Intrinsics.i(fArr, "other");
        for (float max : fArr) {
            f2 = Math.max(f2, max);
        }
        return f2;
    }

    public static int i(int i2, int... iArr) {
        Intrinsics.i(iArr, "other");
        for (int max : iArr) {
            i2 = Math.max(i2, max);
        }
        return i2;
    }

    public static Comparable j(Comparable comparable, Comparable comparable2) {
        Intrinsics.i(comparable, "a");
        Intrinsics.i(comparable2, "b");
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static float k(float f2, float... fArr) {
        Intrinsics.i(fArr, "other");
        for (float min : fArr) {
            f2 = Math.min(f2, min);
        }
        return f2;
    }
}
