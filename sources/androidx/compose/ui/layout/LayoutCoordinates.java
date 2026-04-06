package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public interface LayoutCoordinates {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ Rect J(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return layoutCoordinates.X(layoutCoordinates2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    long G(long j2);

    boolean H() {
        return false;
    }

    long I(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long N(LayoutCoordinates layoutCoordinates, long j2);

    LayoutCoordinates P();

    void W(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    Rect X(LayoutCoordinates layoutCoordinates, boolean z2);

    long a();

    boolean b();

    long d0(long j2);

    void e0(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.f("transformFrom is not implemented on this LayoutCoordinates");
    }

    long f(long j2) {
        return Offset.f15855b.b();
    }

    LayoutCoordinates g0();

    long o0(long j2);

    long w(long j2) {
        return Offset.f15855b.b();
    }
}
