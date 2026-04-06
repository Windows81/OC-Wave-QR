package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata
public final class SizeKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Size.d((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(long j2) {
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f)) << 32));
    }

    public static final Rect c(long j2) {
        return RectKt.c(Offset.f15855b.c(), j2);
    }
}
