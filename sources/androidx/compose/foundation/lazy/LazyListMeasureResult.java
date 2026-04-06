package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final LazyListMeasuredItem f4405a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4406b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4407c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4408d;

    /* renamed from: e  reason: collision with root package name */
    public final MeasureResult f4409e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4410f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4411g;

    /* renamed from: h  reason: collision with root package name */
    public final CoroutineScope f4412h;

    /* renamed from: i  reason: collision with root package name */
    public final Density f4413i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4414j;

    /* renamed from: k  reason: collision with root package name */
    public final List f4415k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4416l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4417m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4418n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4419o;

    /* renamed from: p  reason: collision with root package name */
    public final Orientation f4420p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4421q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4422r;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, CoroutineScope coroutineScope, Density density, long j2, List list, int i3, int i4, int i5, boolean z4, Orientation orientation, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i2, z2, f2, measureResult, f3, z3, coroutineScope, density, j2, list, i3, i4, i5, z4, orientation, i6, i7);
    }

    public int a() {
        return this.f4409e.a();
    }

    public int b() {
        return this.f4409e.b();
    }

    public long c() {
        int b2 = b();
        return IntSize.c((((long) a()) & 4294967295L) | (((long) b2) << 32));
    }

    public int d() {
        return this.f4421q;
    }

    public Orientation e() {
        return this.f4420p;
    }

    public int f() {
        return -j();
    }

    public int g() {
        return this.f4417m;
    }

    public int h() {
        return this.f4418n;
    }

    public int i() {
        return this.f4422r;
    }

    public int j() {
        return this.f4416l;
    }

    public List k() {
        return this.f4415k;
    }

    public final LazyListMeasureResult l(int i2, boolean z2) {
        LazyListMeasuredItem lazyListMeasuredItem;
        int i3 = i2;
        LazyListMeasureResult lazyListMeasureResult = null;
        if (!this.f4411g && !k().isEmpty() && (lazyListMeasuredItem = this.f4405a) != null) {
            int h2 = lazyListMeasuredItem.h();
            int i4 = this.f4406b - i3;
            if (i4 >= 0 && i4 < h2) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.e0(k());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.p0(k());
                if (!lazyListMeasuredItem2.i() && !lazyListMeasuredItem3.i() && (i3 >= 0 ? Math.min(j() - lazyListMeasuredItem2.f(), g() - lazyListMeasuredItem3.f()) > i3 : Math.min((lazyListMeasuredItem2.f() + lazyListMeasuredItem2.h()) - j(), (lazyListMeasuredItem3.f() + lazyListMeasuredItem3.h()) - g()) > (-i3))) {
                    List k2 = k();
                    int size = k2.size();
                    boolean z3 = false;
                    for (int i5 = 0; i5 < size; i5++) {
                        ((LazyListMeasuredItem) k2.get(i5)).a(i3, z2);
                    }
                    LazyListMeasuredItem lazyListMeasuredItem4 = this.f4405a;
                    int i6 = this.f4406b - i3;
                    if (this.f4407c || i3 > 0) {
                        z3 = true;
                    }
                    lazyListMeasureResult = new LazyListMeasureResult(lazyListMeasuredItem4, i6, z3, (float) i3, this.f4409e, this.f4410f, this.f4411g, this.f4412h, this.f4413i, this.f4414j, k(), j(), g(), h(), x(), e(), d(), i(), (DefaultConstructorMarker) null);
                }
            }
        }
        return lazyListMeasureResult;
    }

    public final boolean m() {
        LazyListMeasuredItem lazyListMeasuredItem = this.f4405a;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.f4406b == 0) ? false : true;
    }

    public final boolean n() {
        return this.f4407c;
    }

    public final long o() {
        return this.f4414j;
    }

    public final float p() {
        return this.f4408d;
    }

    public Map q() {
        return this.f4409e.q();
    }

    public void r() {
        this.f4409e.r();
    }

    public Function1 s() {
        return this.f4409e.s();
    }

    public final CoroutineScope t() {
        return this.f4412h;
    }

    public final Density u() {
        return this.f4413i;
    }

    public final LazyListMeasuredItem v() {
        return this.f4405a;
    }

    public final int w() {
        return this.f4406b;
    }

    public boolean x() {
        return this.f4419o;
    }

    public final float y() {
        return this.f4410f;
    }

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, CoroutineScope coroutineScope, Density density, long j2, List list, int i3, int i4, int i5, boolean z4, Orientation orientation, int i6, int i7) {
        this.f4405a = lazyListMeasuredItem;
        this.f4406b = i2;
        this.f4407c = z2;
        this.f4408d = f2;
        this.f4409e = measureResult;
        this.f4410f = f3;
        this.f4411g = z3;
        this.f4412h = coroutineScope;
        this.f4413i = density;
        this.f4414j = j2;
        this.f4415k = list;
        this.f4416l = i3;
        this.f4417m = i4;
        this.f4418n = i5;
        this.f4419o = z4;
        this.f4420p = orientation;
        this.f4421q = i6;
        this.f4422r = i7;
    }
}
