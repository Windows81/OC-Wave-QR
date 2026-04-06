package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class LazyListSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider a(LazyListState lazyListState, SnapPosition snapPosition) {
        return new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState, snapPosition);
    }

    public static /* synthetic */ SnapLayoutInfoProvider b(LazyListState lazyListState, SnapPosition snapPosition, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snapPosition = SnapPosition.Center.f3675a;
        }
        return a(lazyListState, snapPosition);
    }

    public static final int c(Density density, float f2) {
        return Math.abs(f2) < density.B1(SnapFlingBehaviorKt.m()) ? FinalSnappingItem.f3648b.a() : f2 > 0.0f ? FinalSnappingItem.f3648b.b() : FinalSnappingItem.f3648b.c();
    }

    public static final int d(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.e() == Orientation.Vertical ? lazyListLayoutInfo.c() & 4294967295L : lazyListLayoutInfo.c() >> 32);
    }
}
