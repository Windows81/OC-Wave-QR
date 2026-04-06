package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class HorizontalRuler extends Ruler {
    public HorizontalRuler() {
        super((DefaultConstructorMarker) null);
    }

    public float a(float f2, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.N(layoutCoordinates, Offset.e((((long) Float.floatToRawIntBits(((float) ((int) (layoutCoordinates.a() >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L))) & 4294967295L));
    }
}
