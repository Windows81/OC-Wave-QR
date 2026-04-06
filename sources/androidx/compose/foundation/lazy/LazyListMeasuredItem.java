package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a  reason: collision with root package name */
    public final int f4423a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4424b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4425c;

    /* renamed from: d  reason: collision with root package name */
    public final Alignment.Horizontal f4426d;

    /* renamed from: e  reason: collision with root package name */
    public final Alignment.Vertical f4427e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutDirection f4428f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4429g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4430h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4431i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4432j;

    /* renamed from: k  reason: collision with root package name */
    public final long f4433k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f4434l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f4435m;

    /* renamed from: n  reason: collision with root package name */
    public final LazyLayoutItemAnimator f4436n;

    /* renamed from: o  reason: collision with root package name */
    public final long f4437o;

    /* renamed from: p  reason: collision with root package name */
    public int f4438p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4439q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4440r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4441s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4442t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4443u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4444v;

    /* renamed from: w  reason: collision with root package name */
    public int f4445w;

    /* renamed from: x  reason: collision with root package name */
    public int f4446x;

    /* renamed from: y  reason: collision with root package name */
    public int f4447y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f4448z;

    public /* synthetic */ LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, list, z2, horizontal, vertical, layoutDirection, z3, i3, i4, i5, j2, obj, obj2, lazyLayoutItemAnimator, j3);
    }

    private final int p(long j2) {
        return l() ? IntOffset.l(j2) : IntOffset.k(j2);
    }

    public final void a(int i2, boolean z2) {
        int intValue;
        int l2;
        if (!i()) {
            this.f4438p = f() + i2;
            int length = this.f4448z.length;
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = i3 & 1;
                if ((l() && i4 != 0) || (!l() && i4 == 0)) {
                    int[] iArr = this.f4448z;
                    iArr[i3] = iArr[i3] + i2;
                }
            }
            if (z2) {
                int b2 = b();
                for (int i5 = 0; i5 < b2; i5++) {
                    LazyLayoutItemAnimation e2 = this.f4436n.e(getKey(), i5);
                    if (e2 != null) {
                        long s2 = e2.s();
                        if (l()) {
                            intValue = IntOffset.k(s2);
                            l2 = Integer.valueOf(IntOffset.l(s2) + i2).intValue();
                        } else {
                            intValue = Integer.valueOf(IntOffset.k(s2) + i2).intValue();
                            l2 = IntOffset.l(s2);
                        }
                        e2.J(IntOffset.f((((long) intValue) << 32) | (4294967295L & ((long) l2))));
                    }
                }
            }
        }
    }

    public int b() {
        return this.f4424b.size();
    }

    public int c() {
        return this.f4440r;
    }

    public long d() {
        return this.f4437o;
    }

    public int e() {
        return this.f4439q;
    }

    public int f() {
        return this.f4438p;
    }

    public void g(boolean z2) {
        this.f4444v = z2;
    }

    public int getIndex() {
        return this.f4423a;
    }

    public Object getKey() {
        return this.f4434l;
    }

    public int h() {
        return this.f4442t;
    }

    public boolean i() {
        return this.f4444v;
    }

    public int j() {
        return this.f4441s;
    }

    public Object k(int i2) {
        return ((Placeable) this.f4424b.get(i2)).t();
    }

    public boolean l() {
        return this.f4425c;
    }

    public long m(int i2) {
        int[] iArr = this.f4448z;
        int i3 = i2 * 2;
        return IntOffset.f((((long) iArr[i3]) << 32) | (((long) iArr[i3 + 1]) & 4294967295L));
    }

    public final int n() {
        return this.f4443u;
    }

    public void o(int i2, int i3, int i4, int i5) {
        s(i2, i4, i5);
    }

    public final int q(Placeable placeable) {
        return l() ? placeable.C0() : placeable.L0();
    }

    public final void r(Placeable.PlacementScope placementScope, boolean z2) {
        GraphicsLayer graphicsLayer;
        long k2;
        if (!(this.f4445w != Integer.MIN_VALUE)) {
            InlineClassHelperKt.a("position() should be called first");
        }
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            Placeable placeable = (Placeable) this.f4424b.get(i2);
            int q2 = this.f4446x - q(placeable);
            int i3 = this.f4447y;
            long m2 = m(i2);
            LazyLayoutItemAnimation e2 = this.f4436n.e(getKey(), i2);
            if (e2 != null) {
                if (z2) {
                    e2.F(m2);
                } else {
                    if (!IntOffset.j(e2.q(), LazyLayoutItemAnimation.f4799s.a())) {
                        m2 = e2.q();
                    }
                    long o2 = IntOffset.o(m2, e2.r());
                    if ((p(m2) <= q2 && p(o2) <= q2) || (p(m2) >= i3 && p(o2) >= i3)) {
                        e2.n();
                    }
                    m2 = o2;
                }
                graphicsLayer = e2.p();
            } else {
                graphicsLayer = null;
            }
            if (this.f4429g) {
                if (l()) {
                    k2 = (((long) ((this.f4445w - IntOffset.l(m2)) - q(placeable))) & 4294967295L) | (((long) IntOffset.k(m2)) << 32);
                } else {
                    k2 = (((long) ((this.f4445w - IntOffset.k(m2)) - q(placeable))) << 32) | (4294967295L & ((long) IntOffset.l(m2)));
                }
                m2 = IntOffset.f(k2);
            }
            long o3 = IntOffset.o(m2, this.f4433k);
            if (!z2 && e2 != null) {
                e2.E(o3);
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

    public final void s(int i2, int i3, int i4) {
        int L0;
        this.f4438p = i2;
        this.f4445w = l() ? i4 : i3;
        List list = this.f4424b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = (Placeable) list.get(i5);
            int i6 = i5 * 2;
            if (l()) {
                int[] iArr = this.f4448z;
                Alignment.Horizontal horizontal = this.f4426d;
                if (horizontal != null) {
                    iArr[i6] = horizontal.a(placeable.L0(), i3, this.f4428f);
                    this.f4448z[i6 + 1] = i2;
                    L0 = placeable.C0();
                } else {
                    InlineClassHelperKt.b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
            } else {
                int[] iArr2 = this.f4448z;
                iArr2[i6] = i2;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.f4427e;
                if (vertical != null) {
                    iArr2[i7] = vertical.a(placeable.C0(), i4);
                    L0 = placeable.L0();
                } else {
                    InlineClassHelperKt.b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
            }
            i2 += L0;
        }
        this.f4446x = -this.f4430h;
        this.f4447y = this.f4445w + this.f4431i;
    }

    public final void t(int i2) {
        this.f4445w = i2;
        this.f4447y = i2 + this.f4431i;
    }

    public LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3) {
        List list2 = list;
        this.f4423a = i2;
        this.f4424b = list2;
        this.f4425c = z2;
        this.f4426d = horizontal;
        this.f4427e = vertical;
        this.f4428f = layoutDirection;
        this.f4429g = z3;
        this.f4430h = i3;
        this.f4431i = i4;
        this.f4432j = i5;
        this.f4433k = j2;
        this.f4434l = obj;
        this.f4435m = obj2;
        this.f4436n = lazyLayoutItemAnimator;
        this.f4437o = j3;
        this.f4441s = 1;
        this.f4445w = Integer.MIN_VALUE;
        int size = list2.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            i6 += l() ? placeable.C0() : placeable.L0();
            i7 = Math.max(i7, !l() ? placeable.C0() : placeable.L0());
        }
        this.f4439q = i6;
        this.f4442t = RangesKt.e(e() + this.f4432j, 0);
        this.f4443u = i7;
        this.f4448z = new int[(this.f4424b.size() * 2)];
    }
}
