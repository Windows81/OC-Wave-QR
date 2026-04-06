package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$FillHeight$1 implements ContentScale {
    public long a(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        return ScaleFactor.a((((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L));
    }
}
