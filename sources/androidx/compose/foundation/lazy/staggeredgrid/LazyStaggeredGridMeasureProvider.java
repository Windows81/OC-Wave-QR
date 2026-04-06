package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5114a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyStaggeredGridItemProvider f5115b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyLayoutMeasureScope f5116c;

    /* renamed from: d  reason: collision with root package name */
    public final LazyStaggeredGridSlots f5117d;

    public LazyStaggeredGridMeasureProvider(boolean z2, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.f5114a = z2;
        this.f5115b = lazyStaggeredGridItemProvider;
        this.f5116c = lazyLayoutMeasureScope;
        this.f5117d = lazyStaggeredGridSlots;
    }

    public final long b(int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = this.f5117d.b()[i2];
        } else {
            int i5 = this.f5117d.a()[i2];
            int i6 = (i2 + i3) - 1;
            i4 = (this.f5117d.a()[i6] + this.f5117d.b()[i6]) - i5;
        }
        return this.f5114a ? Constraints.f19137b.e(i4) : Constraints.f19137b.d(i4);
    }

    public abstract LazyStaggeredGridMeasuredItem c(int i2, int i3, int i4, Object obj, Object obj2, List list, long j2);

    /* renamed from: d */
    public LazyStaggeredGridMeasuredItem a(int i2, int i3, int i4, long j2) {
        return c(i2, i3, i4, this.f5115b.c(i2), this.f5115b.f(i2), this.f5116c.k1(i2, j2), j2);
    }

    public final LazyStaggeredGridMeasuredItem e(int i2, long j2) {
        Object c2 = this.f5115b.c(i2);
        Object f2 = this.f5115b.f(i2);
        int length = this.f5117d.b().length;
        int i3 = (int) (j2 >> 32);
        int j3 = RangesKt.j(i3, length - 1);
        int j4 = RangesKt.j(((int) (j2 & 4294967295L)) - i3, length - j3);
        long b2 = b(j3, j4);
        return c(i2, j3, j4, c2, f2, this.f5116c.k1(i2, b2), b2);
    }

    public final LazyLayoutKeyIndexMap f() {
        return this.f5115b.a();
    }
}
