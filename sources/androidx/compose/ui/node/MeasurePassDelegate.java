package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public final LayoutNodeLayoutDelegate E;
    public boolean F;
    public int G = Integer.MAX_VALUE;
    public int H = Integer.MAX_VALUE;
    public boolean I;
    public boolean J;
    public LayoutNode.UsageByParent K = LayoutNode.UsageByParent.NotUsed;
    public boolean L;
    public long M;
    public Function1 N;
    public GraphicsLayer O;
    public float P;
    public boolean Q;
    public Object R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final AlignmentLines X;
    public final MutableVector Y;
    public boolean Z;
    public boolean a0;
    public long b0;
    public final Function0 c0;
    public final Function0 d0;
    public float e0;
    public boolean f0;
    public Function1 g0;
    public GraphicsLayer h0;
    public long i0;
    public float j0;
    public final Function0 k0;
    public boolean l0;
    public boolean m0;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17363a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f17364b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f17363a = r0
                androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.ui.node.LayoutNode.UsageByParent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f17364b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasurePassDelegate.WhenMappings.<clinit>():void");
        }
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.E = layoutNodeLayoutDelegate;
        IntOffset.Companion companion = IntOffset.f19160b;
        this.M = companion.b();
        this.Q = true;
        this.X = new LayoutNodeAlignmentLines(this);
        this.Y = new MutableVector(new MeasurePassDelegate[16], 0);
        this.Z = true;
        this.b0 = ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null);
        this.c0 = new MeasurePassDelegate$performMeasureBlock$1(this);
        this.d0 = new MeasurePassDelegate$layoutChildrenBlock$1(this);
        this.i0 = companion.b();
        this.k0 = new MeasurePassDelegate$placeOuterCoordinatorBlock$1(this);
    }

    /* access modifiers changed from: private */
    public final void d1() {
        LayoutNode X1 = X1();
        MutableVector J0 = X1.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.n0().G != layoutNode.D0()) {
                X1.r1();
                X1.P0();
                if (layoutNode.D0() == Integer.MAX_VALUE) {
                    if (layoutNode.f0().i()) {
                        LookaheadPassDelegate k02 = layoutNode.k0();
                        Intrinsics.f(k02);
                        k02.M1(false);
                    }
                    layoutNode.n0().g2();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e1() {
        this.E.Y(0);
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            MeasurePassDelegate n0 = ((LayoutNode) objArr[i2]).n0();
            n0.G = n0.H;
            n0.H = Integer.MAX_VALUE;
            n0.T = false;
            if (n0.K == LayoutNode.UsageByParent.InLayoutBlock) {
                n0.K = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void e2() {
        boolean u2 = u();
        B2(true);
        LayoutNode X1 = X1();
        if (!u2) {
            X1.V().r3();
            if (X1.o0()) {
                LayoutNode.H1(X1, true, false, false, 6, (Object) null);
            } else if (X1.j0()) {
                LayoutNode.D1(X1, true, false, false, 6, (Object) null);
            }
        }
        NodeCoordinator y0 = X1.y0();
        NodeCoordinator V2 = X1.V().V2();
        while (!Intrinsics.d(y0, V2) && y0 != null) {
            if (y0.N2()) {
                y0.f3();
            }
            y0 = y0.V2();
        }
        MutableVector J0 = X1.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.D0() != Integer.MAX_VALUE) {
                layoutNode.n0().e2();
                X1.I1(layoutNode);
            }
        }
    }

    private final void i2() {
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.o0() && layoutNode.q0() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.v1(layoutNode, (Constraints) null, 1, (Object) null)) {
                LayoutNode.H1(X1(), false, false, false, 7, (Object) null);
            }
        }
    }

    private final void n2() {
        LayoutNode.H1(X1(), false, false, false, 7, (Object) null);
        LayoutNode C0 = X1().C0();
        if (C0 != null && X1().Z() == LayoutNode.UsageByParent.NotUsed) {
            LayoutNode X1 = X1();
            int i2 = WhenMappings.f17363a[C0.h0().ordinal()];
            X1.P1(i2 != 1 ? i2 != 2 ? C0.Z() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
        }
    }

    private final void v2(long j2, float f2, Function1 function1, GraphicsLayer graphicsLayer) {
        Placeable.PlacementScope placementScope;
        boolean z2 = true;
        this.T = true;
        if (!IntOffset.j(j2, this.M) || this.l0) {
            if (this.E.f() || this.E.g() || this.l0) {
                this.V = true;
                this.l0 = false;
            }
            h2();
        }
        LookaheadPassDelegate t1 = t1();
        if (t1 != null && t1.v1()) {
            NodeCoordinator W2 = C1().W2();
            if (W2 == null || (placementScope = W2.i1()) == null) {
                placementScope = LayoutNodeKt.b(X1()).getPlacementScope();
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            LookaheadPassDelegate t12 = t1();
            Intrinsics.f(t12);
            LayoutNode C0 = X1().C0();
            if (C0 != null) {
                C0.f0().X(0);
            }
            t12.z2(Integer.MAX_VALUE);
            Placeable.PlacementScope.j(placementScope2, t12, IntOffset.k(j2), IntOffset.l(j2), 0.0f, 4, (Object) null);
        }
        LookaheadPassDelegate t13 = t1();
        if (t13 == null || t13.C1()) {
            z2 = false;
        }
        if (z2) {
            InlineClassHelperKt.c("Error: Placement happened before lookahead.");
        }
        u2(j2, f2, function1, graphicsLayer);
    }

    public final void A2(LayoutNode.UsageByParent usageByParent) {
        this.K = usageByParent;
    }

    public void B2(boolean z2) {
        this.S = z2;
    }

    public int C(int i2) {
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            LookaheadPassDelegate t1 = t1();
            Intrinsics.f(t1);
            return t1.C(i2);
        }
        n2();
        return C1().C(i2);
    }

    public final NodeCoordinator C1() {
        return this.E.A();
    }

    public void C2(boolean z2) {
        this.m0 = z2;
    }

    public final void D2(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode C0 = layoutNode.C0();
        if (C0 != null) {
            if (!(this.K == LayoutNode.UsageByParent.NotUsed || layoutNode.J())) {
                InlineClassHelperKt.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i2 = WhenMappings.f17363a[C0.h0().ordinal()];
            if (i2 == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 == 2) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + C0.h0());
            }
            this.K = usageByParent;
            return;
        }
        this.K = LayoutNode.UsageByParent.NotUsed;
    }

    public int E0() {
        return C1().E0();
    }

    public final boolean E2() {
        if ((t() == null && C1().t() == null) || !this.Q) {
            return false;
        }
        this.Q = false;
        this.R = C1().t();
        return true;
    }

    public Map F() {
        if (!this.L) {
            if (q1() == LayoutNode.LayoutState.Measuring) {
                q().s(true);
                if (q().g()) {
                    c2();
                }
            } else {
                q().r(true);
            }
        }
        M().V1(true);
        i0();
        M().V1(false);
        return q().h();
    }

    public final int F1() {
        return this.H;
    }

    public int H0() {
        return C1().H0();
    }

    public final float H1() {
        return this.e0;
    }

    public final void L1(boolean z2) {
        LayoutNode layoutNode;
        LayoutNode C0 = X1().C0();
        LayoutNode.UsageByParent Z2 = X1().Z();
        if (C0 != null && Z2 != LayoutNode.UsageByParent.NotUsed) {
            do {
                layoutNode = C0;
                if (layoutNode.Z() != Z2 || (C0 = layoutNode.C0()) == null) {
                    int i2 = WhenMappings.f17364b[Z2.ordinal()];
                }
                layoutNode = C0;
                break;
            } while ((C0 = layoutNode.C0()) == null);
            int i22 = WhenMappings.f17364b[Z2.ordinal()];
            if (i22 == 1) {
                LayoutNode.H1(layoutNode, z2, false, false, 6, (Object) null);
            } else if (i22 == 2) {
                layoutNode.E1(z2);
            } else {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
        }
    }

    public NodeCoordinator M() {
        return X1().V();
    }

    public final void M1() {
        this.Q = true;
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        v2(j2, f2, (Function1) null, graphicsLayer);
    }

    public void R0(long j2, float f2, Function1 function1) {
        v2(j2, f2, function1, (GraphicsLayer) null);
    }

    public AlignmentLinesOwner U() {
        LayoutNodeLayoutDelegate f02;
        LayoutNode C0 = X1().C0();
        if (C0 == null || (f02 = C0.f0()) == null) {
            return null;
        }
        return f02.c();
    }

    public final boolean V1() {
        return this.T;
    }

    public final void W1() {
        this.E.P(true);
    }

    public final LayoutNode X1() {
        return this.E.m();
    }

    public int Z(int i2) {
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            LookaheadPassDelegate t1 = t1();
            Intrinsics.f(t1);
            return t1.Z(i2);
        }
        n2();
        return C1().Z(i2);
    }

    public int a0(int i2) {
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            LookaheadPassDelegate t1 = t1();
            Intrinsics.f(t1);
            return t1.a0(i2);
        }
        n2();
        return C1().a0(i2);
    }

    public Placeable c0(long j2) {
        LayoutNode.UsageByParent Z2 = X1().Z();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        if (Z2 == usageByParent) {
            X1().z();
        }
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            LookaheadPassDelegate t1 = t1();
            Intrinsics.f(t1);
            t1.y2(usageByParent);
            t1.c0(j2);
        }
        D2(X1());
        w2(j2);
        return this;
    }

    public final void c2() {
        this.V = true;
        this.W = true;
    }

    public final void d2() {
        this.U = true;
    }

    public int f0(AlignmentLine alignmentLine) {
        LayoutNode C0 = X1().C0();
        LayoutNode.LayoutState layoutState = null;
        if ((C0 != null ? C0.h0() : null) == LayoutNode.LayoutState.Measuring) {
            q().u(true);
        } else {
            LayoutNode C02 = X1().C0();
            if (C02 != null) {
                layoutState = C02.h0();
            }
            if (layoutState == LayoutNode.LayoutState.LayingOut) {
                q().t(true);
            }
        }
        this.L = true;
        int f02 = C1().f0(alignmentLine);
        this.L = false;
        return f02;
    }

    public final List f1() {
        X1().c2();
        if (!this.Z) {
            return this.Y.k();
        }
        LayoutNode X1 = X1();
        MutableVector mutableVector = this.Y;
        MutableVector J0 = X1.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (mutableVector.p() <= i2) {
                mutableVector.d(layoutNode.f0().w());
            } else {
                mutableVector.C(i2, layoutNode.f0().w());
            }
        }
        mutableVector.z(X1.M().size(), mutableVector.p());
        this.Z = false;
        return this.Y.k();
    }

    public final Constraints g1() {
        if (this.I) {
            return Constraints.a(J0());
        }
        return null;
    }

    public final void g2() {
        if (u()) {
            B2(false);
            LayoutNode X1 = X1();
            NodeCoordinator y0 = X1.y0();
            NodeCoordinator V2 = X1.V().V2();
            while (!Intrinsics.d(y0, V2) && y0 != null) {
                y0.t3();
                y0.A3();
                y0 = y0.V2();
            }
            MutableVector J0 = X1().J0();
            Object[] objArr = J0.f15005z;
            int p2 = J0.p();
            for (int i2 = 0; i2 < p2; i2++) {
                ((LayoutNode) objArr[i2]).n0().g2();
            }
        }
    }

    public void h0(boolean z2) {
        if (z2 != C1().x1()) {
            C1().M1(z2);
            this.l0 = true;
        }
        C2(z2);
    }

    public final long h1() {
        return this.M;
    }

    public final void h2() {
        if (this.E.d() > 0) {
            MutableVector J0 = X1().J0();
            Object[] objArr = J0.f15005z;
            int p2 = J0.p();
            for (int i2 = 0; i2 < p2; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate f02 = layoutNode.f0();
                if ((f02.g() || f02.f()) && !f02.n()) {
                    LayoutNode.F1(layoutNode, false, 1, (Object) null);
                }
                f02.w().h2();
            }
        }
    }

    public void i0() {
        this.a0 = true;
        q().o();
        if (this.V) {
            i2();
        }
        if (this.W || (!this.L && !M().C1() && this.V)) {
            this.V = false;
            LayoutNode.LayoutState q1 = q1();
            z2(LayoutNode.LayoutState.LayingOut);
            this.E.O(false);
            LayoutNode X1 = X1();
            LayoutNodeKt.b(X1).getSnapshotObserver().e(X1, false, this.d0);
            z2(q1);
            if (M().C1() && this.E.g()) {
                requestLayout();
            }
            this.W = false;
        }
        if (q().l()) {
            q().q(true);
        }
        if (q().g() && q().k()) {
            q().n();
        }
        this.a0 = false;
    }

    public final boolean i1() {
        return this.a0;
    }

    public final boolean j1() {
        return this.V;
    }

    public void n0(Function1 function1) {
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            function1.invoke(((LayoutNode) objArr[i2]).f0().c());
        }
    }

    public void p0() {
        LayoutNode.H1(X1(), false, false, false, 7, (Object) null);
    }

    public AlignmentLines q() {
        return this.X;
    }

    public int q0(int i2) {
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            LookaheadPassDelegate t1 = t1();
            Intrinsics.f(t1);
            return t1.q0(i2);
        }
        n2();
        return C1().q0(i2);
    }

    public final LayoutNode.LayoutState q1() {
        return this.E.o();
    }

    public final void r2() {
        this.H = Integer.MAX_VALUE;
        this.G = Integer.MAX_VALUE;
        B2(false);
    }

    public void requestLayout() {
        LayoutNode.F1(X1(), false, 1, (Object) null);
    }

    public final void s2() {
        this.f0 = true;
        LayoutNode C0 = X1().C0();
        float X2 = M().X2();
        LayoutNode X1 = X1();
        NodeCoordinator V2 = X1.V();
        for (NodeCoordinator y0 = X1.y0(); y0 != V2; y0 = y0.V2()) {
            Intrinsics.g(y0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            X2 += ((LayoutModifierNodeCoordinator) y0).X2();
        }
        if (X2 != this.e0) {
            this.e0 = X2;
            if (C0 != null) {
                C0.r1();
            }
            if (C0 != null) {
                C0.P0();
            }
        }
        boolean z2 = false;
        if (!u()) {
            if (C0 != null) {
                C0.P0();
            }
            e2();
            if (this.F && C0 != null) {
                LayoutNode.F1(C0, false, 1, (Object) null);
            }
        } else {
            X1().V().r3();
        }
        if (C0 == null) {
            this.H = 0;
        } else if (!this.F && C0.h0() == LayoutNode.LayoutState.LayingOut) {
            if (this.H == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.c("Place was called on a node which was placed already");
            }
            this.H = C0.f0().z();
            LayoutNodeLayoutDelegate f02 = C0.f0();
            f02.Y(f02.z() + 1);
        }
        i0();
    }

    public Object t() {
        return this.R;
    }

    public final LookaheadPassDelegate t1() {
        return this.E.v();
    }

    public final void t2(long j2) {
        LayoutNode.LayoutState q1 = q1();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Idle;
        if (!(q1 == layoutState)) {
            InlineClassHelperKt.c("layout state is not idle before measure starts");
        }
        this.b0 = j2;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Measuring;
        z2(layoutState2);
        this.U = false;
        LayoutNodeKt.b(X1()).getSnapshotObserver().g(X1(), false, this.c0);
        if (q1() == layoutState2) {
            c2();
            z2(layoutState);
        }
    }

    public boolean u() {
        return this.S;
    }

    public final void u2(long j2, float f2, Function1 function1, GraphicsLayer graphicsLayer) {
        if (X1().x()) {
            InlineClassHelperKt.a("place is called on a deactivated node");
        }
        z2(LayoutNode.LayoutState.LayingOut);
        this.M = j2;
        this.P = f2;
        this.N = function1;
        this.O = graphicsLayer;
        this.J = true;
        this.f0 = false;
        Owner b2 = LayoutNodeKt.b(X1());
        b2.getRectManager().l(X1(), j2, !this.J);
        if (this.V || !u()) {
            q().r(false);
            this.E.N(false);
            this.g0 = function1;
            this.i0 = j2;
            this.j0 = f2;
            this.h0 = graphicsLayer;
            b2.getSnapshotObserver().c(X1(), false, this.k0);
        } else {
            C1().x3(j2, f2, function1, graphicsLayer);
            s2();
        }
        z2(LayoutNode.LayoutState.Idle);
    }

    public final boolean v1() {
        return this.U;
    }

    public final boolean w2(long j2) {
        if (X1().x()) {
            InlineClassHelperKt.a("measure is called on a deactivated node");
        }
        Owner b2 = LayoutNodeKt.b(X1());
        LayoutNode C0 = X1().C0();
        boolean z2 = true;
        X1().L1(X1().J() || (C0 != null && C0.J()));
        if (X1().o0() || !Constraints.f(J0(), j2)) {
            q().s(false);
            n0(MeasurePassDelegate$remeasure$2.f17370z);
            this.I = true;
            long a2 = C1().a();
            T0(j2);
            t2(j2);
            if (IntSize.e(C1().a(), a2) && C1().L0() == L0() && C1().C0() == C0()) {
                z2 = false;
            }
            S0(IntSize.c((((long) C1().C0()) & 4294967295L) | (((long) C1().L0()) << 32)));
            return z2;
        }
        Owner.x(b2, X1(), false, 2, (Object) null);
        X1().K1();
        return false;
    }

    public final LayoutNode.UsageByParent x1() {
        return this.K;
    }

    public final void x2() {
        LayoutNode C0;
        try {
            this.F = true;
            if (!this.J) {
                InlineClassHelperKt.c("replace called on unplaced item");
            }
            boolean u2 = u();
            u2(this.M, this.P, this.N, this.O);
            if (u2 && !this.f0 && (C0 = X1().C0()) != null) {
                LayoutNode.F1(C0, false, 1, (Object) null);
            }
            this.F = false;
        } catch (Throwable th) {
            this.F = false;
            throw th;
        }
    }

    public final void y2(boolean z2) {
        this.Z = z2;
    }

    public final void z2(LayoutNode.LayoutState layoutState) {
        this.E.R(layoutState);
    }
}
