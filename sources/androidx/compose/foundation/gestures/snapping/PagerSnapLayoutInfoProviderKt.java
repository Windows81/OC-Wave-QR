package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider a(PagerState pagerState, PagerSnapDistance pagerSnapDistance, Function3 function3) {
        return new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(pagerState, function3, pagerSnapDistance);
    }

    public static final float c(PagerState pagerState, LayoutDirection layoutDirection, float f2, float f3, float f4, float f5) {
        boolean e2 = e(pagerState, f3);
        if (!(pagerState.C().e() == Orientation.Vertical || layoutDirection == LayoutDirection.Ltr)) {
            e2 = !e2;
        }
        int k2 = pagerState.C().k();
        float d2 = k2 == 0 ? 0.0f : d(pagerState) / ((float) k2);
        float f6 = d2 - ((float) ((int) d2));
        int c2 = LazyListSnapLayoutInfoProviderKt.c(pagerState.x(), f3);
        FinalSnappingItem.Companion companion = FinalSnappingItem.f3648b;
        if (FinalSnappingItem.f(c2, companion.a())) {
            if (Math.abs(f6) > f2) {
                if (!e2) {
                    return f4;
                }
            } else if (Math.abs(d2) >= Math.abs(pagerState.N())) {
                if (e2) {
                    return f4;
                }
            } else if (Math.abs(f4) < Math.abs(f5)) {
                return f4;
            }
        } else if (!FinalSnappingItem.f(c2, companion.b())) {
            if (FinalSnappingItem.f(c2, companion.c())) {
                return f4;
            }
            return 0.0f;
        }
        return f5;
    }

    public static final float d(PagerState pagerState) {
        return pagerState.C().e() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.T() >> 32)) : Float.intBitsToFloat((int) (pagerState.T() & 4294967295L));
    }

    public static final boolean e(PagerState pagerState, float f2) {
        boolean h2 = pagerState.C().h();
        boolean z2 = (pagerState.V() ? -f2 : d(pagerState)) > 0.0f;
        return (z2 && h2) || (!z2 && !h2);
    }
}
