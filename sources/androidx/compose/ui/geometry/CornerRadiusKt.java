package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata
public final class CornerRadiusKt {
    public static /* synthetic */ long a(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return CornerRadius.b((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
