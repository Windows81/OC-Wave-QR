package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata
public final class OffsetKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(long j2, long j3, float f2) {
        return Offset.e((((long) Float.floatToRawIntBits(MathHelpersKt.b(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2))) << 32) | (((long) Float.floatToRawIntBits(MathHelpersKt.b(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2))) & 4294967295L));
    }
}
