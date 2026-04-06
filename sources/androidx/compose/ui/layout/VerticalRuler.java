package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VerticalRuler extends Ruler {
    public VerticalRuler() {
        super((DefaultConstructorMarker) null);
    }

    public float a(float f2, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Float.intBitsToFloat((int) (layoutCoordinates2.N(layoutCoordinates, Offset.e((((long) Float.floatToRawIntBits(((float) ((int) (layoutCoordinates.a() & 4294967295L))) / 2.0f)) & 4294967295L) | (floatToRawIntBits << 32))) >> 32));
    }
}
