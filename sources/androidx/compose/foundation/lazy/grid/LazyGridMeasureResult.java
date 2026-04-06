package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final LazyGridMeasuredLine f4633a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4634b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4635c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4636d;

    /* renamed from: e  reason: collision with root package name */
    public final MeasureResult f4637e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4638f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4639g;

    /* renamed from: h  reason: collision with root package name */
    public final CoroutineScope f4640h;

    /* renamed from: i  reason: collision with root package name */
    public final Density f4641i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4642j;

    /* renamed from: k  reason: collision with root package name */
    public final Function1 f4643k;

    /* renamed from: l  reason: collision with root package name */
    public final List f4644l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4645m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4646n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4647o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4648p;

    /* renamed from: q  reason: collision with root package name */
    public final Orientation f4649q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4650r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4651s;

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, CoroutineScope coroutineScope, Density density, int i3, Function1 function1, List list, int i4, int i5, int i6, boolean z4, Orientation orientation, int i7, int i8) {
        this.f4633a = lazyGridMeasuredLine;
        this.f4634b = i2;
        this.f4635c = z2;
        this.f4636d = f2;
        this.f4637e = measureResult;
        this.f4638f = f3;
        this.f4639g = z3;
        this.f4640h = coroutineScope;
        this.f4641i = density;
        this.f4642j = i3;
        this.f4643k = function1;
        this.f4644l = list;
        this.f4645m = i4;
        this.f4646n = i5;
        this.f4647o = i6;
        this.f4648p = z4;
        this.f4649q = orientation;
        this.f4650r = i7;
        this.f4651s = i8;
    }

    public int a() {
        return this.f4637e.a();
    }

    public int b() {
        return this.f4637e.b();
    }

    public long c() {
        int b2 = b();
        return IntSize.c((((long) a()) & 4294967295L) | (((long) b2) << 32));
    }

    public int d() {
        return this.f4650r;
    }

    public Orientation e() {
        return this.f4649q;
    }

    public int f() {
        return -j();
    }

    public int g() {
        return this.f4646n;
    }

    public int h() {
        return this.f4647o;
    }

    public int i() {
        return this.f4651s;
    }

    public int j() {
        return this.f4645m;
    }

    public List k() {
        return this.f4644l;
    }

    public final LazyGridMeasureResult l(int i2, boolean z2) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int i3 = i2;
        if (this.f4639g || k().isEmpty() || (lazyGridMeasuredLine = this.f4633a) == null) {
            return null;
        }
        int d2 = lazyGridMeasuredLine.d();
        int i4 = this.f4634b - i3;
        if (i4 < 0 || i4 >= d2) {
            return null;
        }
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.e0(k());
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.p0(k());
        if (lazyGridMeasuredItem.i() || lazyGridMeasuredItem2.i()) {
            return null;
        }
        if (i3 < 0) {
            if (Math.min((LazyGridSnapLayoutInfoProviderKt.b(lazyGridMeasuredItem, e()) + lazyGridMeasuredItem.h()) - j(), (LazyGridSnapLayoutInfoProviderKt.b(lazyGridMeasuredItem2, e()) + lazyGridMeasuredItem2.h()) - g()) <= (-i3)) {
                return null;
            }
        } else if (Math.min(j() - LazyGridSnapLayoutInfoProviderKt.b(lazyGridMeasuredItem, e()), g() - LazyGridSnapLayoutInfoProviderKt.b(lazyGridMeasuredItem2, e())) <= i3) {
            return null;
        }
        List k2 = k();
        int size = k2.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ((LazyGridMeasuredItem) k2.get(i5)).p(i3, z2);
        }
        LazyGridMeasuredLine lazyGridMeasuredLine2 = this.f4633a;
        int i6 = this.f4634b - i3;
        if (this.f4635c || i3 > 0) {
            z3 = true;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine2, i6, z3, (float) i3, this.f4637e, this.f4638f, this.f4639g, this.f4640h, this.f4641i, this.f4642j, this.f4643k, k(), j(), g(), h(), x(), e(), d(), i());
    }

    public final boolean m() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.f4633a;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.a() : 0) == 0 && this.f4634b == 0) ? false : true;
    }

    public final boolean n() {
        return this.f4635c;
    }

    public final float o() {
        return this.f4636d;
    }

    public final CoroutineScope p() {
        return this.f4640h;
    }

    public Map q() {
        return this.f4637e.q();
    }

    public void r() {
        this.f4637e.r();
    }

    public Function1 s() {
        return this.f4637e.s();
    }

    public final Density t() {
        return this.f4641i;
    }

    public final LazyGridMeasuredLine u() {
        return this.f4633a;
    }

    public final int v() {
        return this.f4634b;
    }

    public final Function1 w() {
        return this.f4643k;
    }

    public boolean x() {
        return this.f4648p;
    }

    public final float y() {
        return this.f4638f;
    }

    public final int z() {
        return this.f4642j;
    }
}
