package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata
public final class RectKt {
    public static final Rect a(long j2, long j3) {
        return new Rect(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public static final Rect b(long j2, float f2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i2) - f2, Float.intBitsToFloat(i3) - f2, Float.intBitsToFloat(i2) + f2, Float.intBitsToFloat(i3) + f2);
    }

    public static final Rect c(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }
}
