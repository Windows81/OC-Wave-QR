package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class NestedScrollInteropConnectionKt {
    public static final float e(float f2) {
        return (float) (f2 >= 0.0f ? Math.ceil((double) f2) : Math.floor((double) f2));
    }

    public static final int f(float f2) {
        return ((int) e(f2)) * -1;
    }

    public static final int g(long j2) {
        int i2 = Math.abs(Float.intBitsToFloat((int) (j2 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j2 & 4294967295L))) >= 0.5f ? i2 | 2 : i2;
    }

    public static final float h(int i2) {
        return ((float) i2) * -1.0f;
    }

    public static final long i(int[] iArr, long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) >= 0.0f ? RangesKt.i(h(iArr[0]), Float.intBitsToFloat(i2)) : RangesKt.d(h(iArr[0]), Float.intBitsToFloat(i2)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) >= 0.0f ? RangesKt.i(h(iArr[1]), Float.intBitsToFloat(i3)) : RangesKt.d(h(iArr[1]), Float.intBitsToFloat(i3)))) & 4294967295L));
    }

    public static final int j(int i2) {
        return NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) ^ true ? 1 : 0;
    }

    public static final float k(float f2) {
        return f2 * -1.0f;
    }
}
