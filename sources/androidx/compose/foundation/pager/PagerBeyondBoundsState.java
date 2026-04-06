package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a  reason: collision with root package name */
    public final PagerState f5260a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5261b;

    public PagerBeyondBoundsState(PagerState pagerState, int i2) {
        this.f5260a = pagerState;
        this.f5261b = i2;
    }

    public int b() {
        return this.f5260a.H();
    }

    public int c() {
        return Math.min(b() - 1, ((PageInfo) CollectionsKt.p0(this.f5260a.C().i())).getIndex() + this.f5261b);
    }

    public int d() {
        if (this.f5260a.C().i().size() == 0) {
            return 0;
        }
        int a2 = PagerLayoutInfoKt.a(this.f5260a.C());
        int k2 = this.f5260a.C().k() + this.f5260a.C().l();
        if (k2 == 0) {
            return 1;
        }
        return RangesKt.e(a2 / k2, 1);
    }

    public boolean e() {
        return !this.f5260a.C().i().isEmpty();
    }

    public int f() {
        return Math.max(0, this.f5260a.y() - this.f5261b);
    }
}
