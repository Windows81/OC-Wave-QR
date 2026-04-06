package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyListState f3655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SnapPosition f3656b;

    public LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(LazyListState lazyListState, SnapPosition snapPosition) {
        this.f3655a = lazyListState;
        this.f3656b = snapPosition;
    }

    private final int c() {
        LazyListLayoutInfo d2 = d();
        int i2 = 0;
        if (d2.k().isEmpty()) {
            return 0;
        }
        int size = d2.k().size();
        for (LazyListItemInfo e2 : d2.k()) {
            i2 += e2.e();
        }
        return i2 / size;
    }

    public float a(float f2, float f3) {
        return RangesKt.d(Math.abs(f3) - ((float) c()), 0.0f) * Math.signum(f3);
    }

    public float b(float f2) {
        List k2 = d().k();
        SnapPosition snapPosition = this.f3656b;
        int size = k2.size();
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < size; i2++) {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) k2.get(i2);
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof LazyLayoutMeasuredItem ? (LazyLayoutMeasuredItem) lazyListItemInfo : null;
            if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.i()) {
                float a2 = SnapPositionKt.a(LazyListSnapLayoutInfoProviderKt.d(d()), d().f(), d().d(), lazyListItemInfo.e(), lazyListItemInfo.f(), lazyListItemInfo.getIndex(), snapPosition, d().h());
                if (a2 <= 0.0f && a2 > f3) {
                    f3 = a2;
                }
                if (a2 >= 0.0f && a2 < f4) {
                    f4 = a2;
                }
            }
        }
        return SnapFlingBehaviorKt.j(LazyListSnapLayoutInfoProviderKt.c(this.f3655a.r(), f2), f3, f4);
    }

    public final LazyListLayoutInfo d() {
        return this.f3655a.x();
    }
}
