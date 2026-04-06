package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;

@Metadata
public interface LookaheadScope {
    static /* synthetic */ long b(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Offset.f15855b.c();
            }
            long j3 = j2;
            if ((i2 & 4) != 0) {
                z2 = true;
            }
            return lookaheadScope.t(layoutCoordinates, layoutCoordinates2, j3, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
    }

    LayoutCoordinates f(LayoutCoordinates layoutCoordinates);

    long t(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        return LookaheadScopeKt.b(this, layoutCoordinates, layoutCoordinates2, j2, z2);
    }

    LayoutCoordinates u(Placeable.PlacementScope placementScope);
}
