package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* renamed from: a  reason: collision with root package name */
    public final List f5320a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5321b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5322c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5323d;

    /* renamed from: e  reason: collision with root package name */
    public final Orientation f5324e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5325f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5326g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5327h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5328i;

    /* renamed from: j  reason: collision with root package name */
    public final MeasuredPage f5329j;

    /* renamed from: k  reason: collision with root package name */
    public final MeasuredPage f5330k;

    /* renamed from: l  reason: collision with root package name */
    public final float f5331l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5332m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5333n;

    /* renamed from: o  reason: collision with root package name */
    public final SnapPosition f5334o;

    /* renamed from: p  reason: collision with root package name */
    public final MeasureResult f5335p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5336q;

    /* renamed from: r  reason: collision with root package name */
    public final List f5337r;

    /* renamed from: s  reason: collision with root package name */
    public final List f5338s;

    /* renamed from: t  reason: collision with root package name */
    public final CoroutineScope f5339t;

    public PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z2, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, CoroutineScope coroutineScope) {
        this.f5320a = list;
        this.f5321b = i2;
        this.f5322c = i3;
        this.f5323d = i4;
        this.f5324e = orientation;
        this.f5325f = i5;
        this.f5326g = i6;
        this.f5327h = z2;
        this.f5328i = i7;
        this.f5329j = measuredPage;
        this.f5330k = measuredPage2;
        this.f5331l = f2;
        this.f5332m = i8;
        this.f5333n = z3;
        this.f5334o = snapPosition;
        this.f5335p = measureResult;
        this.f5336q = z4;
        this.f5337r = list2;
        this.f5338s = list3;
        this.f5339t = coroutineScope;
    }

    public int a() {
        return this.f5335p.a();
    }

    public int b() {
        return this.f5335p.b();
    }

    public long c() {
        int b2 = b();
        return IntSize.c((((long) a()) & 4294967295L) | (((long) b2) << 32));
    }

    public int d() {
        return this.f5323d;
    }

    public Orientation e() {
        return this.f5324e;
    }

    public int f() {
        return -j();
    }

    public int g() {
        return this.f5326g;
    }

    public boolean h() {
        return this.f5327h;
    }

    public List i() {
        return this.f5320a;
    }

    public int j() {
        return this.f5325f;
    }

    public int k() {
        return this.f5321b;
    }

    public int l() {
        return this.f5322c;
    }

    public int m() {
        return this.f5328i;
    }

    public SnapPosition n() {
        return this.f5334o;
    }

    public final PagerMeasureResult o(int i2) {
        int i3;
        int i4 = i2;
        int k2 = k() + l();
        PagerMeasureResult pagerMeasureResult = null;
        if (!this.f5336q && !i().isEmpty() && this.f5329j != null && (i3 = this.f5332m - i4) >= 0 && i3 < k2) {
            float f2 = k2 != 0 ? ((float) i4) / ((float) k2) : 0.0f;
            float f3 = this.f5331l - f2;
            if (this.f5330k != null && f3 < 0.5f && f3 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) CollectionsKt.e0(i());
                MeasuredPage measuredPage2 = (MeasuredPage) CollectionsKt.p0(i());
                if (i4 >= 0 ? Math.min(j() - measuredPage.f(), g() - measuredPage2.f()) > i4 : Math.min((measuredPage.f() + k2) - j(), (measuredPage2.f() + k2) - g()) > (-i4)) {
                    List i5 = i();
                    int size = i5.size();
                    boolean z2 = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        ((MeasuredPage) i5.get(i6)).a(i4);
                    }
                    List list = this.f5337r;
                    int size2 = list.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((MeasuredPage) list.get(i7)).a(i4);
                    }
                    List list2 = this.f5338s;
                    int size3 = list2.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        ((MeasuredPage) list2.get(i8)).a(i4);
                    }
                    List i9 = i();
                    int k3 = k();
                    int l2 = l();
                    int d2 = d();
                    Orientation e2 = e();
                    int j2 = j();
                    int g2 = g();
                    boolean h2 = h();
                    int m2 = m();
                    MeasuredPage measuredPage3 = this.f5329j;
                    MeasuredPage measuredPage4 = this.f5330k;
                    float f4 = this.f5331l - f2;
                    int i10 = this.f5332m - i4;
                    if (this.f5333n || i4 > 0) {
                        z2 = true;
                    }
                    pagerMeasureResult = new PagerMeasureResult(i9, k3, l2, d2, e2, j2, g2, h2, m2, measuredPage3, measuredPage4, f4, i10, z2, n(), this.f5335p, this.f5336q, this.f5337r, this.f5338s, this.f5339t);
                }
            }
        }
        return pagerMeasureResult;
    }

    public final boolean p() {
        MeasuredPage measuredPage = this.f5329j;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.f5332m == 0) ? false : true;
    }

    public Map q() {
        return this.f5335p.q();
    }

    public void r() {
        this.f5335p.r();
    }

    public Function1 s() {
        return this.f5335p.s();
    }

    public final boolean t() {
        return this.f5333n;
    }

    public final CoroutineScope u() {
        return this.f5339t;
    }

    public final MeasuredPage v() {
        return this.f5330k;
    }

    public final float w() {
        return this.f5331l;
    }

    public final MeasuredPage x() {
        return this.f5329j;
    }

    public final int y() {
        return this.f5332m;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerMeasureResult(List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6, boolean z2, int i7, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f2, int i8, boolean z3, SnapPosition snapPosition, MeasureResult measureResult, boolean z4, List list2, List list3, CoroutineScope coroutineScope, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i2, i3, i4, orientation, i5, i6, z2, i7, measuredPage, measuredPage2, f2, i8, z3, snapPosition, measureResult, z4, (i9 & 131072) != 0 ? CollectionsKt.m() : list2, (i9 & 262144) != 0 ? CollectionsKt.m() : list3, coroutineScope);
    }
}
