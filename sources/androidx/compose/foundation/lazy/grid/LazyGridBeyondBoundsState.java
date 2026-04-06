package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridState f4522a;

    public LazyGridBeyondBoundsState(LazyGridState lazyGridState) {
        this.f4522a = lazyGridState;
    }

    public int b() {
        return this.f4522a.w().h();
    }

    public int c() {
        return ((LazyGridItemInfo) CollectionsKt.p0(this.f4522a.w().k())).getIndex();
    }

    public int d() {
        if (this.f4522a.w().k().isEmpty()) {
            return 0;
        }
        int a2 = LazyGridSnapLayoutInfoProviderKt.a(this.f4522a.w());
        int a3 = LazyGridLayoutInfoKt.a(this.f4522a.w());
        if (a3 == 0) {
            return 1;
        }
        return RangesKt.e(a2 / a3, 1);
    }

    public boolean e() {
        return !this.f4522a.w().k().isEmpty();
    }

    public int f() {
        return this.f4522a.r();
    }
}
