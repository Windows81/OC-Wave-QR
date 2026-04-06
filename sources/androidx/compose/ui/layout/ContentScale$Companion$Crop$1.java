package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$Crop$1 implements ContentScale {
    public long a(long j2, long j3) {
        float a2 = ContentScaleKt.c(j2, j3);
        return ScaleFactor.a((((long) Float.floatToRawIntBits(a2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(a2))));
    }
}
