package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class RangeSliderState {

    /* renamed from: s  reason: collision with root package name */
    public static final Companion f10709s = new Companion((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f10710t = 8;

    /* renamed from: a  reason: collision with root package name */
    public final int f10711a;

    /* renamed from: b  reason: collision with root package name */
    public final ClosedFloatingPointRange f10712b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f10713c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableFloatState f10714d;

    /* renamed from: e  reason: collision with root package name */
    public Function1 f10715e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f10716f;

    /* renamed from: g  reason: collision with root package name */
    public final MutableFloatState f10717g;

    /* renamed from: h  reason: collision with root package name */
    public final MutableFloatState f10718h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableFloatState f10719i;

    /* renamed from: j  reason: collision with root package name */
    public final MutableFloatState f10720j;

    /* renamed from: k  reason: collision with root package name */
    public final MutableIntState f10721k;

    /* renamed from: l  reason: collision with root package name */
    public final MutableFloatState f10722l;

    /* renamed from: m  reason: collision with root package name */
    public final MutableFloatState f10723m;

    /* renamed from: n  reason: collision with root package name */
    public final MutableState f10724n;

    /* renamed from: o  reason: collision with root package name */
    public final MutableState f10725o;

    /* renamed from: p  reason: collision with root package name */
    public final Function1 f10726p;

    /* renamed from: q  reason: collision with root package name */
    public final MutableFloatState f10727q;

    /* renamed from: r  reason: collision with root package name */
    public final MutableFloatState f10728r;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final void A(float f2) {
        this.f10713c.j(f2);
    }

    public final void B(boolean z2) {
        this.f10724n.setValue(Boolean.valueOf(z2));
    }

    public final void C(float f2) {
        this.f10727q.j(f2);
    }

    public final void D(float f2) {
        this.f10728r.j(f2);
    }

    public final void E(float f2) {
        this.f10723m.j(f2);
    }

    public final void F(float f2) {
        this.f10722l.j(f2);
    }

    public final void G(int i2) {
        this.f10721k.k(i2);
    }

    public final void H() {
        float f2 = (float) 2;
        float max = Math.max(((float) r()) - (h() / f2), 0.0f);
        float min = Math.min(o() / f2, max);
        if (s()) {
            return;
        }
        if (k() != min || j() != max || c() != a()) {
            D(min);
            C(max);
            F(v(k(), j(), c()));
            E(v(k(), j(), a()));
        }
    }

    public final float a() {
        return b();
    }

    public final float b() {
        return this.f10714d.c();
    }

    public final float c() {
        return d();
    }

    public final float d() {
        return this.f10713c.c();
    }

    public final float e() {
        return SliderKt.n(((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue(), a());
    }

    public final float f() {
        return SliderKt.n(((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue(), c());
    }

    public final float g() {
        return this.f10720j.c();
    }

    public final float h() {
        return this.f10719i.c();
    }

    public final Function1 i() {
        return this.f10726p;
    }

    public final float j() {
        return this.f10727q.c();
    }

    public final float k() {
        return this.f10728r.c();
    }

    public final float l() {
        return this.f10723m.c();
    }

    public final float m() {
        return this.f10722l.c();
    }

    public final float n() {
        return this.f10718h.c();
    }

    public final float o() {
        return this.f10717g.c();
    }

    public final int p() {
        return this.f10711a;
    }

    public final float[] q() {
        return this.f10716f;
    }

    public final int r() {
        return this.f10721k.e();
    }

    public final boolean s() {
        return ((Boolean) this.f10724n.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.f10725o.getValue()).booleanValue();
    }

    public final void u(boolean z2, float f2) {
        long b2;
        if (z2) {
            F(m() + f2);
            E(v(k(), j(), a()));
            float l2 = l();
            b2 = SliderKt.b(RangesKt.i(SliderKt.t(RangesKt.n(m(), k(), l2), this.f10716f, k(), j()), l2), l2);
        } else {
            E(l() + f2);
            F(v(k(), j(), c()));
            float m2 = m();
            b2 = SliderKt.b(m2, RangesKt.d(SliderKt.t(RangesKt.n(l(), m2, j()), this.f10716f, k(), j()), m2));
        }
        long w2 = w(z2, k(), j(), b2);
        if (!SliderRange.e(w2, SliderKt.b(c(), a()))) {
            Function1 function1 = this.f10715e;
            if (function1 == null) {
                z(SliderRange.g(w2));
                x(SliderRange.f(w2));
            } else if (function1 != null) {
                function1.invoke(SliderRange.b(w2));
            }
        }
    }

    public final float v(float f2, float f3, float f4) {
        return SliderKt.r(((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue(), f4, f2, f3);
    }

    public final long w(boolean z2, float f2, float f3, long j2) {
        return SliderKt.s(z2, f2, f3, j2, ((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue());
    }

    public final void x(float f2) {
        y(SliderKt.t(RangesKt.n(f2, c(), ((Number) this.f10712b.m()).floatValue()), this.f10716f, ((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue()));
    }

    public final void y(float f2) {
        this.f10714d.j(f2);
    }

    public final void z(float f2) {
        A(SliderKt.t(RangesKt.n(f2, ((Number) this.f10712b.e()).floatValue(), a()), this.f10716f, ((Number) this.f10712b.e()).floatValue(), ((Number) this.f10712b.m()).floatValue()));
    }
}
