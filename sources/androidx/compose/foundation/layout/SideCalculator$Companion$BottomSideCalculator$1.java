package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;

@Metadata
public final class SideCalculator$Companion$BottomSideCalculator$1 implements SideCalculator {
    public int b(Insets insets) {
        return insets.bottom;
    }

    public float d(float f2, float f3) {
        return -f3;
    }

    public long e(long j2) {
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
    }

    public Insets f(Insets insets, int i2) {
        return Insets.of(insets.left, insets.top, insets.right, i2);
    }

    public long g(long j2, float f2) {
        return VelocityKt.a(0.0f, Velocity.i(j2) + f2);
    }
}
