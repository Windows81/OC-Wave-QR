package androidx.compose.ui.layout;

import kotlin.Metadata;

@Metadata
public final class ContentScale$Companion$Fit$1 implements ContentScale {
    public long a(long j2, long j3) {
        float b2 = ContentScaleKt.d(j2, j3);
        return ScaleFactor.a((((long) Float.floatToRawIntBits(b2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(b2))));
    }
}
