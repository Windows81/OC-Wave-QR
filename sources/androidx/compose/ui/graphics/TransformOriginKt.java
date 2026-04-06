package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata
public final class TransformOriginKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return TransformOrigin.c((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
