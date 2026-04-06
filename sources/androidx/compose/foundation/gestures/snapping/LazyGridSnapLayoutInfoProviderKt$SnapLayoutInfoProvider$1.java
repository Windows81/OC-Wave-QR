package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 implements SnapLayoutInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LazyGridState f3653a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SnapPosition f3654b;

    public float a(float f2, float f3) {
        return RangesKt.d(Math.abs(f3) - ((float) c()), 0.0f) * Math.signum(f3);
    }

    public float b(float f2) {
        List k2 = d().k();
        SnapPosition snapPosition = this.f3654b;
        int size = k2.size();
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < size; i2++) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) k2.get(i2);
            float a2 = SnapPositionKt.a(LazyGridSnapLayoutInfoProviderKt.a(d()), d().f(), d().d(), LazyGridSnapLayoutInfoProviderKt.c(lazyGridItemInfo, d().e()), LazyGridSnapLayoutInfoProviderKt.b(lazyGridItemInfo, d().e()), lazyGridItemInfo.getIndex(), snapPosition, d().h());
            if (a2 <= 0.0f && a2 > f3) {
                f3 = a2;
            }
            if (a2 >= 0.0f && a2 < f4) {
                f4 = a2;
            }
        }
        return SnapFlingBehaviorKt.j(LazyListSnapLayoutInfoProviderKt.c(this.f3653a.q(), f2), f3, f4);
    }

    public final int c() {
        LazyGridLayoutInfo d2 = d();
        int i2 = 0;
        if (d2.k().isEmpty()) {
            return 0;
        }
        int size = d2.k().size();
        for (LazyGridItemInfo c2 : d2.k()) {
            i2 += LazyGridSnapLayoutInfoProviderKt.c(c2, d2.e());
        }
        return i2 / size;
    }

    public final LazyGridLayoutInfo d() {
        return this.f3653a.w();
    }
}
