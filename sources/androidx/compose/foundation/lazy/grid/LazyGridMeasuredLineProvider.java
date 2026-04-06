package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt;

@Metadata
public abstract class LazyGridMeasuredLineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4688a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyGridSlots f4689b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4690c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4691d;

    /* renamed from: e  reason: collision with root package name */
    public final LazyGridMeasuredItemProvider f4692e;

    /* renamed from: f  reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f4693f;

    public LazyGridMeasuredLineProvider(boolean z2, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.f4688a = z2;
        this.f4689b = lazyGridSlots;
        this.f4690c = i2;
        this.f4691d = i3;
        this.f4692e = lazyGridMeasuredItemProvider;
        this.f4693f = lazyGridSpanLayoutProvider;
    }

    public final long a(int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = this.f4689b.b()[i2];
        } else {
            int i5 = (i3 + i2) - 1;
            i4 = (this.f4689b.a()[i5] + this.f4689b.b()[i5]) - this.f4689b.a()[i2];
        }
        int e2 = RangesKt.e(i4, 0);
        return this.f4688a ? Constraints.f19137b.e(e2) : Constraints.f19137b.d(e2);
    }

    public abstract LazyGridMeasuredLine b(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, int i3);

    public final LazyGridMeasuredLine c(int i2) {
        LazyGridSpanLayoutProvider.LineConfiguration c2 = this.f4693f.c(i2);
        int size = c2.b().size();
        int i3 = (size == 0 || c2.a() + size == this.f4690c) ? 0 : this.f4691d;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int d2 = GridItemSpan.d(((GridItemSpan) c2.b().get(i5)).g());
            LazyGridMeasuredItem d3 = this.f4692e.d(c2.a() + i5, a(i4, d2), i4, d2, i3);
            i4 += d2;
            Unit unit = Unit.f40552a;
            lazyGridMeasuredItemArr[i5] = d3;
        }
        return b(i2, lazyGridMeasuredItemArr, c2.b(), i3);
    }

    public final int d(int i2) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.f4693f;
        return lazyGridSpanLayoutProvider.i(i2, lazyGridSpanLayoutProvider.e());
    }
}
