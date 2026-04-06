package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

@Metadata
public final class ScaleFactorKt {
    public static final long a(long j2, long j3) {
        return Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    public static final long b(long j2, long j3) {
        return a(j3, j2);
    }
}
