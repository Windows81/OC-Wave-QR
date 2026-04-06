package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata
public final class TextLayoutStateKt {
    public static final long a(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.o() ? rect.o() : Float.intBitsToFloat(i2) > rect.p() ? rect.p() : Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) < rect.r() ? rect.r() : Float.intBitsToFloat(i3) > rect.i() ? rect.i() : Float.intBitsToFloat(i3))) & 4294967295L));
    }

    public static final long b(TextLayoutState textLayoutState, long j2) {
        Offset offset;
        LayoutCoordinates j3 = textLayoutState.j();
        if (j3 == null) {
            return j2;
        }
        LayoutCoordinates e2 = textLayoutState.e();
        if (e2 != null) {
            offset = Offset.d((!j3.b() || !e2.b()) ? j2 : j3.N(e2, j2));
        } else {
            offset = null;
        }
        return offset != null ? offset.t() : j2;
    }

    public static final long c(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates j3 = textLayoutState.j();
        if (j3 == null) {
            return j2;
        }
        Offset offset = null;
        if (!j3.b()) {
            j3 = null;
        }
        if (j3 == null) {
            return j2;
        }
        LayoutCoordinates d2 = textLayoutState.d();
        if (d2 != null) {
            if (!d2.b()) {
                d2 = null;
            }
            if (d2 != null) {
                offset = Offset.d(d2.N(j3, j2));
            }
        }
        return offset != null ? offset.t() : j2;
    }

    public static final long d(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates e2 = textLayoutState.e();
        return (e2 == null || !e2.b()) ? j2 : e2.d0(j2);
    }
}
