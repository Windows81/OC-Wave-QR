package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$FillWidth$1 implements ContentScale {
    public long a(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        return ScaleFactor.a((((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L));
    }
}
