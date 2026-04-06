package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a  reason: collision with root package name */
    public final LazyListState f4355a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4356b;

    public LazyListBeyondBoundsState(LazyListState lazyListState, int i2) {
        this.f4355a = lazyListState;
        this.f4356b = i2;
    }

    public int b() {
        return this.f4355a.x().h();
    }

    public int c() {
        return Math.min(b() - 1, ((LazyListItemInfo) CollectionsKt.p0(this.f4355a.x().k())).getIndex() + this.f4356b);
    }

    public int d() {
        if (this.f4355a.x().k().isEmpty()) {
            return 0;
        }
        int d2 = LazyListSnapLayoutInfoProviderKt.d(this.f4355a.x());
        int a2 = LazyListLayoutInfoKt.a(this.f4355a.x());
        if (a2 == 0) {
            return 1;
        }
        return RangesKt.e(d2 / a2, 1);
    }

    public boolean e() {
        return !this.f4355a.x().k().isEmpty();
    }

    public int f() {
        return Math.max(0, this.f4355a.s() - this.f4356b);
    }
}
