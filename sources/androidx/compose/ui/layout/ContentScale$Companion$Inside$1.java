package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$Inside$1 implements ContentScale {
    public long a(long j2, long j3) {
        if (Float.intBitsToFloat((int) (j2 >> 32)) > Float.intBitsToFloat((int) (j3 >> 32)) || Float.intBitsToFloat((int) (j2 & 4294967295L)) > Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            float b2 = ContentScaleKt.d(j2, j3);
            return ScaleFactor.a((((long) Float.floatToRawIntBits(b2)) << 32) | (((long) Float.floatToRawIntBits(b2)) & 4294967295L));
        }
        return ScaleFactor.a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
    }
}
