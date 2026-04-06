package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyStaggeredGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a  reason: collision with root package name */
    public final LazyStaggeredGridState f4993a;

    public LazyStaggeredGridBeyondBoundsState(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f4993a = lazyStaggeredGridState;
    }

    public int b() {
        return this.f4993a.y().h();
    }

    public int c() {
        return ((LazyStaggeredGridItemInfo) CollectionsKt.p0(this.f4993a.y().k())).getIndex();
    }

    public int d() {
        if (this.f4993a.y().k().isEmpty()) {
            return 0;
        }
        int c2 = LazyStaggeredGridMeasureResultKt.c(this.f4993a.y());
        int d2 = LazyStaggeredGridMeasureResultKt.d(this.f4993a.y());
        if (d2 == 0) {
            return 1;
        }
        return RangesKt.e(c2 / d2, 1);
    }

    public boolean e() {
        return !this.f4993a.y().k().isEmpty();
    }

    public int f() {
        return this.f4993a.s();
    }
}
