package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;

@Metadata
public final class PagerScrollPosition {

    /* renamed from: a  reason: collision with root package name */
    public final PagerState f5341a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntState f5342b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f5343c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5344d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5345e;

    /* renamed from: f  reason: collision with root package name */
    public final LazyLayoutNearestRangeState f5346f;

    public PagerScrollPosition(int i2, float f2, PagerState pagerState) {
        this.f5341a = pagerState;
        this.f5342b = SnapshotIntStateKt.a(i2);
        this.f5343c = PrimitiveSnapshotStateKt.a(f2);
        this.f5346f = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public final void a(int i2) {
        h(c() + (this.f5341a.J() == 0 ? 0.0f : ((float) i2) / ((float) this.f5341a.J())));
    }

    public final int b() {
        return this.f5342b.e();
    }

    public final float c() {
        return this.f5343c.c();
    }

    public final LazyLayoutNearestRangeState d() {
        return this.f5346f;
    }

    public final int e(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        int a2 = LazyLayoutItemProviderKt.a(pagerLazyLayoutItemProvider, this.f5345e, i2);
        if (i2 != a2) {
            g(a2);
            this.f5346f.i(i2);
        }
        return a2;
    }

    public final void f(int i2, float f2) {
        i(i2, f2);
        this.f5345e = null;
    }

    public final void g(int i2) {
        this.f5342b.k(i2);
    }

    public final void h(float f2) {
        this.f5343c.j(f2);
    }

    public final void i(int i2, float f2) {
        g(i2);
        this.f5346f.i(i2);
        h(f2);
    }

    public final void j(float f2) {
        h(f2);
    }

    public final void k(PagerMeasureResult pagerMeasureResult) {
        MeasuredPage v2 = pagerMeasureResult.v();
        this.f5345e = v2 != null ? v2.c() : null;
        if (this.f5344d || !pagerMeasureResult.i().isEmpty()) {
            this.f5344d = true;
            MeasuredPage v3 = pagerMeasureResult.v();
            i(v3 != null ? v3.getIndex() : 0, pagerMeasureResult.w());
        }
    }
}
