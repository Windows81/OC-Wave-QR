package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyGridMeasuredLine {

    /* renamed from: a  reason: collision with root package name */
    public final int f4680a;

    /* renamed from: b  reason: collision with root package name */
    public final LazyGridMeasuredItem[] f4681b;

    /* renamed from: c  reason: collision with root package name */
    public final LazyGridSlots f4682c;

    /* renamed from: d  reason: collision with root package name */
    public final List f4683d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4684e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4685f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4686g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4687h;

    public LazyGridMeasuredLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List list, boolean z2, int i3) {
        this.f4680a = i2;
        this.f4681b = lazyGridMeasuredItemArr;
        this.f4682c = lazyGridSlots;
        this.f4683d = list;
        this.f4684e = z2;
        this.f4685f = i3;
        int i4 = 0;
        for (LazyGridMeasuredItem r2 : lazyGridMeasuredItemArr) {
            i4 = Math.max(i4, r2.r());
        }
        this.f4686g = i4;
        this.f4687h = RangesKt.e(i4 + this.f4685f, 0);
    }

    public final int a() {
        return this.f4680a;
    }

    public final LazyGridMeasuredItem[] b() {
        return this.f4681b;
    }

    public final int c() {
        return this.f4686g;
    }

    public final int d() {
        return this.f4687h;
    }

    public final boolean e() {
        return this.f4681b.length == 0;
    }

    public final LazyGridMeasuredItem[] f(int i2, int i3, int i4) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.f4681b;
        int length = lazyGridMeasuredItemArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i5];
            int i8 = i6 + 1;
            int d2 = GridItemSpan.d(((GridItemSpan) this.f4683d.get(i6)).g());
            int i9 = this.f4682c.a()[i7];
            boolean z2 = this.f4684e;
            lazyGridMeasuredItem.u(i2, i9, i3, i4, z2 ? this.f4680a : i7, z2 ? i7 : this.f4680a);
            Unit unit = Unit.f40552a;
            i7 += d2;
            i5++;
            i6 = i8;
        }
        return this.f4681b;
    }
}
