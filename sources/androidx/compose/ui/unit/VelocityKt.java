package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata
public final class VelocityKt {
    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Velocity.c((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
