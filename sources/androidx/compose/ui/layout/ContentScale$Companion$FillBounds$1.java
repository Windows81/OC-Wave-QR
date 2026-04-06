package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$FillBounds$1 implements ContentScale {
    public long a(long j2, long j3) {
        return ScaleFactor.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L));
    }
}
