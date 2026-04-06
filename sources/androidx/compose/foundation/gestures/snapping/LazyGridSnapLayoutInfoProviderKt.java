package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

@Metadata
public final class LazyGridSnapLayoutInfoProviderKt {
    public static final int a(LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.e() == Orientation.Vertical ? lazyGridLayoutInfo.c() & 4294967295L : lazyGridLayoutInfo.c() >> 32);
    }

    public static final int b(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? IntOffset.l(lazyGridItemInfo.e()) : IntOffset.k(lazyGridItemInfo.e());
    }

    public static final int c(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? lazyGridItemInfo.a() & 4294967295L : lazyGridItemInfo.a() >> 32);
    }
}
