package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScrollScope f5347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PagerState f5348b;

    public PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.f5348b = pagerState;
        this.f5347a = scrollScope;
    }

    public int b() {
        return this.f5348b.H();
    }

    public int c() {
        return ((PageInfo) CollectionsKt.p0(this.f5348b.C().i())).getIndex();
    }

    public int d(int i2, int i3) {
        return (int) (RangesKt.q(PagerScrollPositionKt.a(this.f5348b) + ((long) MathKt.d((((float) ((i2 - this.f5348b.v()) * this.f5348b.J())) - (this.f5348b.w() * ((float) this.f5348b.J()))) + ((float) i3))), this.f5348b.F(), this.f5348b.D()) - PagerScrollPositionKt.a(this.f5348b));
    }

    public void e(int i2, int i3) {
        this.f5348b.m0(i2, ((float) i3) / ((float) this.f5348b.J()), true);
    }

    public int f() {
        return this.f5348b.z();
    }

    public float g(float f2) {
        return this.f5347a.g(f2);
    }

    public int h() {
        return this.f5348b.y();
    }
}
