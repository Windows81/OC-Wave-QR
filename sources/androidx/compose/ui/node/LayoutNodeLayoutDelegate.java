package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f17304a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17305b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17306c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutNode.LayoutState f17307d = LayoutNode.LayoutState.Idle;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17308e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17309f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17310g;

    /* renamed from: h  reason: collision with root package name */
    public int f17311h;

    /* renamed from: i  reason: collision with root package name */
    public int f17312i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17313j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17314k;

    /* renamed from: l  reason: collision with root package name */
    public int f17315l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17316m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17317n;

    /* renamed from: o  reason: collision with root package name */
    public int f17318o;

    /* renamed from: p  reason: collision with root package name */
    public final MeasurePassDelegate f17319p = new MeasurePassDelegate(this);

    /* renamed from: q  reason: collision with root package name */
    public LookaheadPassDelegate f17320q;

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        this.f17304a = layoutNode;
    }

    public final NodeCoordinator A() {
        return this.f17304a.u0().n();
    }

    public final int B() {
        return this.f17319p.L0();
    }

    public final void C() {
        this.f17319p.M1();
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.H1();
        }
    }

    public final void D() {
        this.f17319p.y2(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.t2(true);
        }
    }

    public final void E() {
        this.f17319p.c2();
    }

    public final void F() {
        this.f17309f = true;
        this.f17310g = true;
    }

    public final void G() {
        this.f17308e = true;
    }

    public final void H() {
        this.f17319p.d2();
    }

    public final void I() {
        LayoutNode.LayoutState h0 = this.f17304a.h0();
        if (h0 == LayoutNode.LayoutState.LayingOut || h0 == LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.f17319p.i1()) {
                O(true);
            } else {
                N(true);
            }
        }
        if (h0 == LayoutNode.LayoutState.LookaheadLayingOut) {
            LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.g1()) {
                S(true);
            } else {
                T(true);
            }
        }
    }

    public final void J(long j2) {
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.i2(j2);
        }
    }

    public final void K() {
        AlignmentLines q2;
        this.f17319p.q().p();
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null && (q2 = lookaheadPassDelegate.q()) != null) {
            q2.p();
        }
    }

    public final void L(int i2) {
        int i3 = this.f17315l;
        this.f17315l = i2;
        boolean z2 = false;
        boolean z3 = i3 == 0;
        if (i2 == 0) {
            z2 = true;
        }
        if (z3 != z2) {
            LayoutNode C0 = this.f17304a.C0();
            LayoutNodeLayoutDelegate f0 = C0 != null ? C0.f0() : null;
            if (f0 == null) {
                return;
            }
            if (i2 == 0) {
                f0.L(f0.f17315l - 1);
            } else {
                f0.L(f0.f17315l + 1);
            }
        }
    }

    public final void M(int i2) {
        int i3 = this.f17318o;
        this.f17318o = i2;
        boolean z2 = false;
        boolean z3 = i3 == 0;
        if (i2 == 0) {
            z2 = true;
        }
        if (z3 != z2) {
            LayoutNode C0 = this.f17304a.C0();
            LayoutNodeLayoutDelegate f0 = C0 != null ? C0.f0() : null;
            if (f0 == null) {
                return;
            }
            if (i2 == 0) {
                f0.M(f0.f17318o - 1);
            } else {
                f0.M(f0.f17318o + 1);
            }
        }
    }

    public final void N(boolean z2) {
        if (this.f17314k != z2) {
            this.f17314k = z2;
            if (z2 && !this.f17313j) {
                L(this.f17315l + 1);
            } else if (!z2 && !this.f17313j) {
                L(this.f17315l - 1);
            }
        }
    }

    public final void O(boolean z2) {
        if (this.f17313j != z2) {
            this.f17313j = z2;
            if (z2 && !this.f17314k) {
                L(this.f17315l + 1);
            } else if (!z2 && !this.f17314k) {
                L(this.f17315l - 1);
            }
        }
    }

    public final void P(boolean z2) {
        this.f17305b = z2;
    }

    public final void Q(boolean z2) {
        this.f17306c = z2;
    }

    public final void R(LayoutNode.LayoutState layoutState) {
        this.f17307d = layoutState;
    }

    public final void S(boolean z2) {
        if (this.f17317n != z2) {
            this.f17317n = z2;
            if (z2 && !this.f17316m) {
                M(this.f17318o + 1);
            } else if (!z2 && !this.f17316m) {
                M(this.f17318o - 1);
            }
        }
    }

    public final void T(boolean z2) {
        if (this.f17316m != z2) {
            this.f17316m = z2;
            if (z2 && !this.f17317n) {
                M(this.f17318o + 1);
            } else if (!z2 && !this.f17317n) {
                M(this.f17318o - 1);
            }
        }
    }

    public final void U(boolean z2) {
        this.f17309f = z2;
    }

    public final void V(boolean z2) {
        this.f17310g = z2;
    }

    public final void W(boolean z2) {
        this.f17308e = z2;
    }

    public final void X(int i2) {
        this.f17311h = i2;
    }

    public final void Y(int i2) {
        this.f17312i = i2;
    }

    public final void Z() {
        LayoutNode C0;
        if (this.f17319p.E2() && (C0 = this.f17304a.C0()) != null) {
            LayoutNode.H1(C0, false, false, false, 7, (Object) null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.C2()) {
            if (LayoutNodeLayoutDelegateKt.a(this.f17304a)) {
                LayoutNode C02 = this.f17304a.C0();
                if (C02 != null) {
                    LayoutNode.H1(C02, false, false, false, 7, (Object) null);
                    return;
                }
                return;
            }
            LayoutNode C03 = this.f17304a.C0();
            if (C03 != null) {
                LayoutNode.D1(C03, false, false, false, 7, (Object) null);
            }
        }
    }

    public final void a() {
        this.f17320q = null;
    }

    public final void b() {
        if (this.f17320q == null) {
            this.f17320q = new LookaheadPassDelegate(this);
        }
    }

    public final AlignmentLinesOwner c() {
        return this.f17319p;
    }

    public final int d() {
        return this.f17315l;
    }

    public final int e() {
        return this.f17318o;
    }

    public final boolean f() {
        return this.f17314k;
    }

    public final boolean g() {
        return this.f17313j;
    }

    public final boolean h() {
        return this.f17305b;
    }

    public final boolean i() {
        return this.f17306c;
    }

    public final int j() {
        return this.f17319p.C0();
    }

    public final Constraints k() {
        return this.f17319p.g1();
    }

    public final Constraints l() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f17320q;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.f1();
        }
        return null;
    }

    public final LayoutNode m() {
        return this.f17304a;
    }

    public final boolean n() {
        return this.f17319p.j1();
    }

    public final LayoutNode.LayoutState o() {
        return this.f17307d;
    }

    public final AlignmentLinesOwner p() {
        return this.f17320q;
    }

    public final boolean q() {
        return this.f17317n;
    }

    public final boolean r() {
        return this.f17316m;
    }

    public final boolean s() {
        return this.f17309f;
    }

    public final boolean t() {
        return this.f17310g;
    }

    public final boolean u() {
        return this.f17308e;
    }

    public final LookaheadPassDelegate v() {
        return this.f17320q;
    }

    public final MeasurePassDelegate w() {
        return this.f17319p;
    }

    public final boolean x() {
        return this.f17319p.v1();
    }

    public final int y() {
        return this.f17311h;
    }

    public final int z() {
        return this.f17312i;
    }
}
