package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;

@Metadata
public final class LazyListScrollPosition {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntState f4456a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntState f4457b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4458c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4459d;

    /* renamed from: e  reason: collision with root package name */
    public final LazyLayoutNearestRangeState f4460e;

    public LazyListScrollPosition(int i2, int i3) {
        this.f4456a = SnapshotIntStateKt.a(i2);
        this.f4457b = SnapshotIntStateKt.a(i3);
        this.f4460e = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public final int a() {
        return this.f4456a.e();
    }

    public final LazyLayoutNearestRangeState b() {
        return this.f4460e;
    }

    public final int c() {
        return this.f4457b.e();
    }

    public final void d(int i2, int i3) {
        g(i2, i3);
        this.f4459d = null;
    }

    public final void e(int i2) {
        this.f4456a.k(i2);
    }

    public final void f(int i2) {
        this.f4457b.k(i2);
    }

    public final void g(int i2, int i3) {
        if (!(((float) i2) >= 0.0f)) {
            InlineClassHelperKt.a("Index should be non-negative (" + i2 + ')');
        }
        e(i2);
        this.f4460e.i(i2);
        f(i3);
    }

    public final void h(LazyListMeasureResult lazyListMeasureResult) {
        LazyListMeasuredItem v2 = lazyListMeasureResult.v();
        this.f4459d = v2 != null ? v2.getKey() : null;
        if (this.f4458c || lazyListMeasureResult.h() > 0) {
            boolean z2 = true;
            this.f4458c = true;
            int w2 = lazyListMeasureResult.w();
            int i2 = 0;
            if (((float) w2) < 0.0f) {
                z2 = false;
            }
            if (!z2) {
                InlineClassHelperKt.c("scrollOffset should be non-negative");
            }
            LazyListMeasuredItem v3 = lazyListMeasureResult.v();
            if (v3 != null) {
                i2 = v3.getIndex();
            }
            g(i2, w2);
        }
    }

    public final void i(int i2) {
        if (!(((float) i2) >= 0.0f)) {
            InlineClassHelperKt.c("scrollOffset should be non-negative");
        }
        f(i2);
    }

    public final int j(LazyListItemProvider lazyListItemProvider, int i2) {
        int a2 = LazyLayoutItemProviderKt.a(lazyListItemProvider, this.f4459d, i2);
        if (i2 != a2) {
            e(a2);
            this.f4460e.i(i2);
        }
        return a2;
    }
}
