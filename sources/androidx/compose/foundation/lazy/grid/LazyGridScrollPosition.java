package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import kotlin.Metadata;

@Metadata
public final class LazyGridScrollPosition {

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntState f4695a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntState f4696b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4697c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4698d;

    /* renamed from: e  reason: collision with root package name */
    public final LazyLayoutNearestRangeState f4699e;

    public LazyGridScrollPosition(int i2, int i3) {
        this.f4695a = SnapshotIntStateKt.a(i2);
        this.f4696b = SnapshotIntStateKt.a(i3);
        this.f4699e = new LazyLayoutNearestRangeState(i2, 90, 200);
    }

    public final int a() {
        return this.f4695a.e();
    }

    public final LazyLayoutNearestRangeState b() {
        return this.f4699e;
    }

    public final int c() {
        return this.f4696b.e();
    }

    public final void d(int i2, int i3) {
        g(i2, i3);
        this.f4698d = null;
    }

    public final void e(int i2) {
        this.f4695a.k(i2);
    }

    public final void f(int i2) {
        this.f4696b.k(i2);
    }

    public final void g(int i2, int i3) {
        if (!(((float) i2) >= 0.0f)) {
            InlineClassHelperKt.a("Index should be non-negative");
        }
        e(i2);
        this.f4699e.i(i2);
        f(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.g0((r0 = r0.b()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r5) {
        /*
            r4 = this;
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = r5.u()
            if (r0 == 0) goto L_0x0019
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r0.b()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = kotlin.collections.ArraysKt.g0(r0)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r0 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r0
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.getKey()
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r4.f4698d = r0
            boolean r0 = r4.f4697c
            if (r0 != 0) goto L_0x0026
            int r0 = r5.h()
            if (r0 <= 0) goto L_0x006c
        L_0x0026:
            r0 = 1
            r4.f4697c = r0
            int r1 = r5.v()
            float r2 = (float) r1
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            if (r0 != 0) goto L_0x0051
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "scrollOffset should be non-negative ("
            r0.append(r2)
            r0.append(r1)
            r2 = 41
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.c(r0)
        L_0x0051:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r5 = r5.u()
            if (r5 == 0) goto L_0x0069
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r5 = r5.b()
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = kotlin.collections.ArraysKt.g0(r5)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r5 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r5
            if (r5 == 0) goto L_0x0069
            int r3 = r5.getIndex()
        L_0x0069:
            r4.g(r3, r1)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollPosition.h(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult):void");
    }

    public final void i(int i2) {
        if (!(((float) i2) >= 0.0f)) {
            InlineClassHelperKt.c("scrollOffset should be non-negative");
        }
        f(i2);
    }

    public final int j(LazyGridItemProvider lazyGridItemProvider, int i2) {
        int a2 = LazyLayoutItemProviderKt.a(lazyGridItemProvider, this.f4698d, i2);
        if (i2 != a2) {
            e(a2);
            this.f4699e.i(i2);
        }
        return a2;
    }
}
