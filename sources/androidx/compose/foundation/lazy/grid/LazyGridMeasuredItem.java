package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a  reason: collision with root package name */
    public final int f4652a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4653b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4654c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4655d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4656e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutDirection f4657f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4658g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4659h;

    /* renamed from: i  reason: collision with root package name */
    public final List f4660i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4661j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f4662k;

    /* renamed from: l  reason: collision with root package name */
    public final LazyLayoutItemAnimator f4663l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4664m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4665n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4666o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4667p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4668q;

    /* renamed from: r  reason: collision with root package name */
    public int f4669r;

    /* renamed from: s  reason: collision with root package name */
    public int f4670s;

    /* renamed from: t  reason: collision with root package name */
    public int f4671t;

    /* renamed from: u  reason: collision with root package name */
    public final long f4672u;

    /* renamed from: v  reason: collision with root package name */
    public long f4673v;

    /* renamed from: w  reason: collision with root package name */
    public int f4674w;

    /* renamed from: x  reason: collision with root package name */
    public int f4675x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4676y;

    public /* synthetic */ LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i4, boolean z3, LayoutDirection layoutDirection, int i5, int i6, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, z2, i3, i4, z3, layoutDirection, i5, i6, list, j2, obj2, lazyLayoutItemAnimator, j3, i7, i8);
    }

    private final int q(long j2) {
        return l() ? IntOffset.l(j2) : IntOffset.k(j2);
    }

    private final int s(Placeable placeable) {
        return l() ? placeable.C0() : placeable.L0();
    }

    public long a() {
        return this.f4672u;
    }

    public int b() {
        return this.f4660i.size();
    }

    public int c() {
        return this.f4665n;
    }

    public long d() {
        return this.f4664m;
    }

    public long e() {
        return this.f4673v;
    }

    public int f() {
        return this.f4674w;
    }

    public void g(boolean z2) {
        this.f4676y = z2;
    }

    public int getIndex() {
        return this.f4652a;
    }

    public Object getKey() {
        return this.f4653b;
    }

    public int h() {
        return this.f4668q;
    }

    public boolean i() {
        return this.f4676y;
    }

    public int j() {
        return this.f4666o;
    }

    public Object k(int i2) {
        return ((Placeable) this.f4660i.get(i2)).t();
    }

    public boolean l() {
        return this.f4654c;
    }

    public long m(int i2) {
        return e();
    }

    public int n() {
        return this.f4675x;
    }

    public void o(int i2, int i3, int i4, int i5) {
        u(i2, i3, i4, i5, -1, -1);
    }

    public final void p(int i2, boolean z2) {
        if (!i()) {
            long e2 = e();
            int k2 = l() ? IntOffset.k(e2) : IntOffset.k(e2) + i2;
            boolean l2 = l();
            int l3 = IntOffset.l(e2);
            if (l2) {
                l3 += i2;
            }
            this.f4673v = IntOffset.f((((long) k2) << 32) | (((long) l3) & 4294967295L));
            if (z2) {
                int b2 = b();
                for (int i3 = 0; i3 < b2; i3++) {
                    LazyLayoutItemAnimation e3 = this.f4663l.e(getKey(), i3);
                    if (e3 != null) {
                        long s2 = e3.s();
                        int k3 = l() ? IntOffset.k(s2) : Integer.valueOf(IntOffset.k(s2) + i2).intValue();
                        boolean l4 = l();
                        int l5 = IntOffset.l(s2);
                        if (l4) {
                            l5 = Integer.valueOf(l5 + i2).intValue();
                        }
                        e3.J(IntOffset.f((((long) l5) & 4294967295L) | (((long) k3) << 32)));
                    }
                }
            }
        }
    }

    public final int r() {
        return this.f4667p;
    }

    public final void t(Placeable.PlacementScope placementScope, boolean z2) {
        GraphicsLayer graphicsLayer;
        if (!(this.f4669r != Integer.MIN_VALUE)) {
            InlineClassHelperKt.a("position() should be called first");
        }
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            Placeable placeable = (Placeable) this.f4660i.get(i2);
            int s2 = this.f4670s - s(placeable);
            int i3 = this.f4671t;
            long e2 = e();
            LazyLayoutItemAnimation e3 = this.f4663l.e(getKey(), i2);
            if (e3 != null) {
                if (z2) {
                    e3.F(e2);
                } else {
                    long o2 = IntOffset.o(!IntOffset.j(e3.q(), LazyLayoutItemAnimation.f4799s.a()) ? e3.q() : e2, e3.r());
                    if ((q(e2) <= s2 && q(o2) <= s2) || (q(e2) >= i3 && q(o2) >= i3)) {
                        e3.n();
                    }
                    e2 = o2;
                }
                graphicsLayer = e3.p();
            } else {
                graphicsLayer = null;
            }
            if (this.f4656e) {
                e2 = IntOffset.f((((long) (l() ? (this.f4669r - IntOffset.l(e2)) - s(placeable) : IntOffset.l(e2))) & 4294967295L) | (((long) (l() ? IntOffset.k(e2) : (this.f4669r - IntOffset.k(e2)) - s(placeable))) << 32));
            }
            long o3 = IntOffset.o(e2, this.f4661j);
            if (!z2 && e3 != null) {
                e3.E(o3);
            }
            if (l()) {
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.B(placementScope, placeable, o3, graphicsLayer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.A(placementScope, placeable, o3, 0.0f, (Function1) null, 6, (Object) null);
                }
            } else if (graphicsLayer != null) {
                Placeable.PlacementScope.v(placementScope, placeable, o3, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.u(placementScope, placeable, o3, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void u(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f4669r = l() ? i5 : i4;
        if (!l()) {
            i4 = i5;
        }
        if (l() && this.f4657f == LayoutDirection.Rtl) {
            i3 = (i4 - i3) - this.f4655d;
        }
        this.f4673v = l() ? IntOffset.f((((long) i3) << 32) | (4294967295L & ((long) i2))) : IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
        this.f4674w = i6;
        this.f4675x = i7;
        this.f4670s = -this.f4658g;
        this.f4671t = this.f4669r + this.f4659h;
    }

    public final void v(int i2) {
        this.f4669r = i2;
        this.f4671t = i2 + this.f4659h;
    }

    public LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i4, boolean z3, LayoutDirection layoutDirection, int i5, int i6, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i7, int i8) {
        long j4;
        List list2 = list;
        this.f4652a = i2;
        this.f4653b = obj;
        this.f4654c = z2;
        this.f4655d = i3;
        this.f4656e = z3;
        this.f4657f = layoutDirection;
        this.f4658g = i5;
        this.f4659h = i6;
        this.f4660i = list2;
        this.f4661j = j2;
        this.f4662k = obj2;
        this.f4663l = lazyLayoutItemAnimator;
        this.f4664m = j3;
        this.f4665n = i7;
        this.f4666o = i8;
        this.f4669r = Integer.MIN_VALUE;
        int size = list2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = (Placeable) list2.get(i10);
            i9 = Math.max(i9, l() ? placeable.C0() : placeable.L0());
        }
        this.f4667p = i9;
        this.f4668q = RangesKt.e(i9 + i4, 0);
        if (l()) {
            j4 = IntSize.c((((long) i9) & 4294967295L) | (((long) this.f4655d) << 32));
        } else {
            j4 = IntSize.c((((long) this.f4655d) & 4294967295L) | (((long) i9) << 32));
        }
        this.f4672u = j4;
        this.f4673v = IntOffset.f19160b.b();
        this.f4674w = -1;
        this.f4675x = -1;
    }
}
