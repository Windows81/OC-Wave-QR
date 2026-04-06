package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

@Metadata
public final class SideCalculator$Companion$RightSideCalculator$1 implements SideCalculator {
    public int b(Insets insets) {
        return insets.right;
    }

    public float d(float f2, float f3) {
        return -f2;
    }

    public long e(long j2) {
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public Insets f(Insets insets, int i2) {
        return Insets.of(insets.left, insets.top, i2, insets.bottom);
    }

    public long g(long j2, float f2) {
        return VelocityKt.a(Velocity.h(j2) + f2, 0.0f);
    }
}
