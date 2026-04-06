package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a  reason: collision with root package name */
    public final int f5145a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5146b;

    /* renamed from: c  reason: collision with root package name */
    public final List f5147c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5148d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5149e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5150f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5151g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5152h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f5153i;

    /* renamed from: j  reason: collision with root package name */
    public final LazyLayoutItemAnimator f5154j;

    /* renamed from: k  reason: collision with root package name */
    public final long f5155k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5156l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5157m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5158n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5159o;

    /* renamed from: p  reason: collision with root package name */
    public int f5160p;

    /* renamed from: q  reason: collision with root package name */
    public int f5161q;

    /* renamed from: r  reason: collision with root package name */
    public int f5162r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5163s;

    /* renamed from: t  reason: collision with root package name */
    public final long f5164t;

    /* renamed from: u  reason: collision with root package name */
    public long f5165u;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, obj, list, z2, i3, i4, i5, i6, i7, obj2, lazyLayoutItemAnimator, j2);
    }

    public long a() {
        return this.f5164t;
    }

    public int b() {
        return this.f5147c.size();
    }

    public int c() {
        return this.f5149e;
    }

    public long d() {
        return this.f5155k;
    }

    public long e() {
        return this.f5165u;
    }

    public final void f(int i2, boolean z2) {
        if (!i()) {
            long e2 = e();
            int k2 = l() ? IntOffset.k(e2) : IntOffset.k(e2) + i2;
            boolean l2 = l();
            int l3 = IntOffset.l(e2);
            if (l2) {
                l3 += i2;
            }
            this.f5165u = IntOffset.f((((long) k2) << 32) | (((long) l3) & 4294967295L));
            if (z2) {
                int b2 = b();
                for (int i3 = 0; i3 < b2; i3++) {
                    LazyLayoutItemAnimation e3 = this.f5154j.e(getKey(), i3);
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

    public void g(boolean z2) {
        this.f5163s = z2;
    }

    public int getIndex() {
        return this.f5145a;
    }

    public Object getKey() {
        return this.f5146b;
    }

    public int h() {
        return this.f5158n;
    }

    public boolean i() {
        return this.f5163s;
    }

    public int j() {
        return this.f5150f;
    }

    public Object k(int i2) {
        return ((Placeable) this.f5147c.get(i2)).t();
    }

    public boolean l() {
        return this.f5148d;
    }

    public long m(int i2) {
        return e();
    }

    public final int n(long j2) {
        return l() ? IntOffset.l(j2) : IntOffset.k(j2);
    }

    public void o(int i2, int i3, int i4, int i5) {
        if (l()) {
            i4 = i5;
        }
        t(i2, i3, i4);
    }

    public final int p() {
        return !l() ? IntOffset.k(e()) : IntOffset.l(e());
    }

    public final int q() {
        return this.f5157m;
    }

    public final boolean r() {
        return this.f5156l;
    }

    public final void s(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, boolean z2) {
        GraphicsLayer graphicsLayer;
        int i2;
        int i3;
        if (!(this.f5160p != -1)) {
            InlineClassHelperKt.a("position() should be called first");
        }
        List list = this.f5147c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            int C0 = this.f5161q - (l() ? placeable.C0() : placeable.L0());
            int i5 = this.f5162r;
            long e2 = e();
            LazyLayoutItemAnimation e3 = this.f5154j.e(getKey(), i4);
            if (e3 != null) {
                if (z2) {
                    e3.F(e2);
                } else {
                    long o2 = IntOffset.o(!IntOffset.j(e3.q(), LazyLayoutItemAnimation.f4799s.a()) ? e3.q() : e2, e3.r());
                    if ((n(e2) <= C0 && n(o2) <= C0) || (n(e2) >= i5 && n(o2) >= i5)) {
                        e3.n();
                    }
                    e2 = o2;
                }
                graphicsLayer = e3.p();
            } else {
                graphicsLayer = null;
            }
            if (lazyStaggeredGridMeasureContext.q()) {
                if (l()) {
                    i2 = IntOffset.k(e2);
                } else {
                    i2 = (this.f5160p - IntOffset.k(e2)) - (l() ? placeable.C0() : placeable.L0());
                }
                if (l()) {
                    i3 = (this.f5160p - IntOffset.l(e2)) - (l() ? placeable.C0() : placeable.L0());
                } else {
                    i3 = IntOffset.l(e2);
                }
                e2 = IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
            }
            long o3 = IntOffset.o(e2, lazyStaggeredGridMeasureContext.e());
            if (!z2 && e3 != null) {
                e3.E(o3);
            }
            if (graphicsLayer != null) {
                Placeable.PlacementScope.v(placementScope, placeable, o3, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.u(placementScope, placeable, o3, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void t(int i2, int i3, int i4) {
        long j2;
        this.f5160p = i4;
        this.f5161q = -this.f5151g;
        this.f5162r = i4 + this.f5152h;
        if (l()) {
            j2 = IntOffset.f((((long) i3) << 32) | (4294967295L & ((long) i2)));
        } else {
            j2 = IntOffset.f((((long) i3) & 4294967295L) | (((long) i2) << 32));
        }
        this.f5165u = j2;
    }

    public String toString() {
        return super.toString();
    }

    public final void u(boolean z2) {
        this.f5156l = z2;
    }

    public final void v(int i2) {
        this.f5160p = i2;
        this.f5162r = i2 + this.f5152h;
    }

    public LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        int i8;
        long j3;
        this.f5145a = i2;
        this.f5146b = obj;
        this.f5147c = list;
        this.f5148d = z2;
        this.f5149e = i4;
        this.f5150f = i5;
        this.f5151g = i6;
        this.f5152h = i7;
        this.f5153i = obj2;
        this.f5154j = lazyLayoutItemAnimator;
        this.f5155k = j2;
        int i9 = 1;
        this.f5156l = true;
        int i10 = 0;
        if (list.isEmpty()) {
            i8 = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            i8 = l() ? placeable.C0() : placeable.L0();
            int o2 = CollectionsKt.o(list);
            if (1 <= o2) {
                int i11 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i11);
                    int C0 = l() ? placeable2.C0() : placeable2.L0();
                    i8 = C0 > i8 ? C0 : i8;
                    if (i11 == o2) {
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f5157m = i8;
        this.f5158n = RangesKt.e(i8 + i3, 0);
        List list2 = this.f5147c;
        if (!list2.isEmpty()) {
            Placeable placeable3 = (Placeable) list2.get(0);
            int L0 = l() ? placeable3.L0() : placeable3.C0();
            int o3 = CollectionsKt.o(list2);
            if (1 <= o3) {
                while (true) {
                    Placeable placeable4 = (Placeable) list2.get(i9);
                    int L02 = l() ? placeable4.L0() : placeable4.C0();
                    L0 = L02 > L0 ? L02 : L0;
                    if (i9 == o3) {
                        break;
                    }
                    i9++;
                }
            }
            i10 = L0;
        }
        this.f5159o = i10;
        this.f5160p = -1;
        if (l()) {
            j3 = IntSize.c((((long) this.f5157m) & 4294967295L) | (((long) i10) << 32));
        } else {
            j3 = IntSize.c((((long) i10) & 4294967295L) | (((long) this.f5157m) << 32));
        }
        this.f5164t = j3;
        this.f5165u = IntOffset.f19160b.b();
    }
}
