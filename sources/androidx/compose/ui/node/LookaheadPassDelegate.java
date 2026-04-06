package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public final LayoutNodeLayoutDelegate E;
    public boolean F;
    public int G = Integer.MAX_VALUE;
    public int H = Integer.MAX_VALUE;
    public LayoutNode.UsageByParent I = LayoutNode.UsageByParent.NotUsed;
    public boolean J;
    public boolean K;
    public boolean L;
    public Constraints M;
    public long N = IntOffset.f19160b.b();
    public float O;
    public Function1 P;
    public GraphicsLayer Q;
    public PlacedState R = PlacedState.IsNotPlaced;
    public final AlignmentLines S = new LookaheadAlignmentLines(this);
    public final MutableVector T = new MutableVector(new LookaheadPassDelegate[16], 0);
    public boolean U = true;
    public boolean V;
    public boolean W = true;
    public Object X = q1().t();
    public boolean Y;
    public boolean Z;

    @Metadata
    public enum PlacedState {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced;

        static {
            PlacedState[] d2;
            D = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17337a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f17338b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f17337a = r0
                androidx.compose.ui.node.LayoutNode$UsageByParent[] r0 = androidx.compose.ui.node.LayoutNode.UsageByParent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$UsageByParent r3 = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f17338b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.WhenMappings.<clinit>():void");
        }
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.E = layoutNodeLayoutDelegate;
    }

    /* access modifiers changed from: private */
    public final LayoutNode X1() {
        return this.E.m();
    }

    private final LayoutNode.LayoutState j1() {
        return this.E.o();
    }

    private final void n2(long j2, float f2, Function1 function1, GraphicsLayer graphicsLayer) {
        LayoutNode C0 = X1().C0();
        LayoutNode.LayoutState h0 = C0 != null ? C0.h0() : null;
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.LookaheadLayingOut;
        if (h0 == layoutState) {
            this.E.Q(false);
        }
        if (X1().x()) {
            InlineClassHelperKt.a("place is called on a deactivated node");
        }
        w2(layoutState);
        this.K = true;
        this.Z = false;
        if (!IntOffset.j(j2, this.N)) {
            if (this.E.q() || this.E.r()) {
                u2(true);
            }
            W1();
        }
        Owner b2 = LayoutNodeKt.b(X1());
        if (h1() || !u()) {
            this.E.S(false);
            q().r(false);
            OwnerSnapshotObserver.d(b2.getSnapshotObserver(), X1(), false, new LookaheadPassDelegate$placeSelf$2(this, b2, j2), 2, (Object) null);
        } else {
            LookaheadDelegate Q2 = x1().Q2();
            Intrinsics.f(Q2);
            Q2.v2(j2);
            h2();
        }
        this.N = j2;
        this.O = f2;
        this.P = function1;
        this.Q = graphicsLayer;
        w2(LayoutNode.LayoutState.Idle);
    }

    private final void w2(LayoutNode.LayoutState layoutState) {
        this.E.R(layoutState);
    }

    /* access modifiers changed from: private */
    public final NodeCoordinator x1() {
        return this.E.A();
    }

    public void A2(boolean z2) {
        this.Y = z2;
    }

    public final void B2(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode C0 = layoutNode.C0();
        if (C0 != null) {
            if (!(this.I == LayoutNode.UsageByParent.NotUsed || layoutNode.J())) {
                InlineClassHelperKt.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i2 = WhenMappings.f17337a[C0.h0().ordinal()];
            if (i2 == 1 || i2 == 2) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 == 3 || i2 == 4) {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + C0.h0());
            }
            this.I = usageByParent;
            return;
        }
        this.I = LayoutNode.UsageByParent.NotUsed;
    }

    public int C(int i2) {
        e2();
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.C(i2);
    }

    public final boolean C1() {
        return this.K;
    }

    public final boolean C2() {
        if (t() == null) {
            LookaheadDelegate Q2 = x1().Q2();
            Intrinsics.f(Q2);
            if (Q2.t() == null) {
                return false;
            }
        }
        if (!this.W) {
            return false;
        }
        this.W = false;
        LookaheadDelegate Q22 = x1().Q2();
        Intrinsics.f(Q22);
        this.X = Q22.t();
        return true;
    }

    public int E0() {
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.E0();
    }

    public Map F() {
        if (!this.J) {
            if (j1() == LayoutNode.LayoutState.LookaheadMeasuring) {
                q().s(true);
                if (q().g()) {
                    this.E.F();
                }
            } else {
                q().r(true);
            }
        }
        LookaheadDelegate Q2 = M().Q2();
        if (Q2 != null) {
            Q2.V1(true);
        }
        i0();
        LookaheadDelegate Q22 = M().Q2();
        if (Q22 != null) {
            Q22.V1(false);
        }
        return q().h();
    }

    public final void F1(boolean z2) {
        LayoutNode layoutNode;
        LayoutNode C0 = X1().C0();
        LayoutNode.UsageByParent Z2 = X1().Z();
        if (C0 != null && Z2 != LayoutNode.UsageByParent.NotUsed) {
            do {
                layoutNode = C0;
                if (layoutNode.Z() != Z2 || (C0 = layoutNode.C0()) == null) {
                    int i2 = WhenMappings.f17338b[Z2.ordinal()];
                }
                layoutNode = C0;
                break;
            } while ((C0 = layoutNode.C0()) == null);
            int i22 = WhenMappings.f17338b[Z2.ordinal()];
            if (i22 != 1) {
                if (i22 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                } else if (layoutNode.l0() != null) {
                    layoutNode.A1(z2);
                } else {
                    layoutNode.E1(z2);
                }
            } else if (layoutNode.l0() != null) {
                LayoutNode.D1(layoutNode, z2, false, false, 6, (Object) null);
            } else {
                LayoutNode.H1(layoutNode, z2, false, false, 6, (Object) null);
            }
        }
    }

    public int H0() {
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.H0();
    }

    public final void H1() {
        this.W = true;
    }

    public final void L1() {
        u2(true);
        v2(true);
    }

    public NodeCoordinator M() {
        return X1().V();
    }

    public final void M1(boolean z2) {
        if (z2 && e1()) {
            return;
        }
        if (z2 || e1()) {
            this.R = PlacedState.IsNotPlaced;
            MutableVector J0 = X1().J0();
            Object[] objArr = J0.f15005z;
            int p2 = J0.p();
            for (int i2 = 0; i2 < p2; i2++) {
                LookaheadPassDelegate v2 = ((LayoutNode) objArr[i2]).f0().v();
                Intrinsics.f(v2);
                v2.M1(true);
            }
        }
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        n2(j2, f2, (Function1) null, graphicsLayer);
    }

    public void R0(long j2, float f2, Function1 function1) {
        n2(j2, f2, function1, (GraphicsLayer) null);
    }

    public AlignmentLinesOwner U() {
        LayoutNodeLayoutDelegate f0;
        LayoutNode C0 = X1().C0();
        if (C0 == null || (f0 = C0.f0()) == null) {
            return null;
        }
        return f0.p();
    }

    public final void V1() {
        PlacedState placedState = this.R;
        if (e1()) {
            this.R = PlacedState.IsPlacedInApproach;
        } else {
            this.R = PlacedState.IsPlacedInLookahead;
        }
        if (placedState != PlacedState.IsPlacedInLookahead && this.E.u()) {
            LayoutNode.D1(X1(), true, false, false, 6, (Object) null);
        }
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        int i2 = 0;
        while (i2 < p2) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            LookaheadPassDelegate k0 = layoutNode.k0();
            if (k0 != null) {
                if (k0.H != Integer.MAX_VALUE) {
                    k0.V1();
                    layoutNode.I1(layoutNode);
                }
                i2++;
            } else {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
        }
    }

    public final void W1() {
        if (this.E.e() > 0) {
            MutableVector J0 = X1().J0();
            Object[] objArr = J0.f15005z;
            int p2 = J0.p();
            for (int i2 = 0; i2 < p2; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate f0 = layoutNode.f0();
                if ((f0.r() || f0.q()) && !f0.s()) {
                    LayoutNode.B1(layoutNode, false, 1, (Object) null);
                }
                LookaheadPassDelegate v2 = f0.v();
                if (v2 != null) {
                    v2.W1();
                }
            }
        }
    }

    public int Z(int i2) {
        e2();
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.Z(i2);
    }

    public int a0(int i2) {
        e2();
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.a0(i2);
    }

    public final void b1() {
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LookaheadPassDelegate v2 = ((LayoutNode) objArr[i2]).f0().v();
            Intrinsics.f(v2);
            int i3 = v2.G;
            int i4 = v2.H;
            if (i3 != i4 && i4 == Integer.MAX_VALUE) {
                v2.M1(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.Placeable c0(long r4) {
        /*
            r3 = this;
            androidx.compose.ui.node.LayoutNode r0 = r3.X1()
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.h0()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r0 == r2) goto L_0x0027
            androidx.compose.ui.node.LayoutNode r0 = r3.X1()
            androidx.compose.ui.node.LayoutNode r0 = r0.C0()
            if (r0 == 0) goto L_0x0023
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.h0()
        L_0x0023:
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r1 != r0) goto L_0x002d
        L_0x0027:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r3.E
            r1 = 0
            r0.P(r1)
        L_0x002d:
            androidx.compose.ui.node.LayoutNode r0 = r3.X1()
            r3.B2(r0)
            androidx.compose.ui.node.LayoutNode r0 = r3.X1()
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.Z()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
            if (r0 != r1) goto L_0x0047
            androidx.compose.ui.node.LayoutNode r0 = r3.X1()
            r0.z()
        L_0x0047:
            r3.r2(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadPassDelegate.c0(long):androidx.compose.ui.layout.Placeable");
    }

    public final void c1() {
        this.E.X(0);
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LookaheadPassDelegate v2 = ((LayoutNode) objArr[i2]).f0().v();
            Intrinsics.f(v2);
            v2.G = v2.H;
            v2.H = Integer.MAX_VALUE;
            if (v2.I == LayoutNode.UsageByParent.InLayoutBlock) {
                v2.I = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    public final void c2() {
        this.R = PlacedState.IsPlacedInLookahead;
    }

    public final List d1() {
        X1().M();
        if (!this.U) {
            return this.T.k();
        }
        LayoutNode X1 = X1();
        MutableVector mutableVector = this.T;
        MutableVector J0 = X1.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (mutableVector.p() <= i2) {
                LookaheadPassDelegate v2 = layoutNode.f0().v();
                Intrinsics.f(v2);
                mutableVector.d(v2);
            } else {
                LookaheadPassDelegate v3 = layoutNode.f0().v();
                Intrinsics.f(v3);
                mutableVector.C(i2, v3);
            }
        }
        mutableVector.z(X1.M().size(), mutableVector.p());
        this.U = false;
        return this.T.k();
    }

    public final void d2() {
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.j0() && layoutNode.r0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LookaheadPassDelegate v2 = layoutNode.f0().v();
                Intrinsics.f(v2);
                Constraints l2 = layoutNode.f0().l();
                Intrinsics.f(l2);
                if (v2.r2(l2.r())) {
                    LayoutNode.D1(X1(), false, false, false, 7, (Object) null);
                }
            }
        }
    }

    public final boolean e1() {
        return this.E.i();
    }

    public final void e2() {
        LayoutNode.D1(X1(), false, false, false, 7, (Object) null);
        LayoutNode C0 = X1().C0();
        if (C0 != null && X1().Z() == LayoutNode.UsageByParent.NotUsed) {
            LayoutNode X1 = X1();
            int i2 = WhenMappings.f17337a[C0.h0().ordinal()];
            X1.P1(i2 != 2 ? i2 != 3 ? C0.Z() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
        }
    }

    public int f0(AlignmentLine alignmentLine) {
        LayoutNode C0 = X1().C0();
        LayoutNode.LayoutState layoutState = null;
        if ((C0 != null ? C0.h0() : null) == LayoutNode.LayoutState.LookaheadMeasuring) {
            q().u(true);
        } else {
            LayoutNode C02 = X1().C0();
            if (C02 != null) {
                layoutState = C02.h0();
            }
            if (layoutState == LayoutNode.LayoutState.LookaheadLayingOut) {
                q().t(true);
            }
        }
        this.J = true;
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        int f0 = Q2.f0(alignmentLine);
        this.J = false;
        return f0;
    }

    public final Constraints f1() {
        return this.M;
    }

    public final boolean g1() {
        return this.V;
    }

    public final void g2() {
        this.H = Integer.MAX_VALUE;
        this.G = Integer.MAX_VALUE;
        this.R = PlacedState.IsNotPlaced;
    }

    public void h0(boolean z2) {
        LookaheadDelegate Q2;
        LookaheadDelegate Q22 = x1().Q2();
        if (!Intrinsics.d(Boolean.valueOf(z2), Q22 != null ? Boolean.valueOf(Q22.x1()) : null) && (Q2 = x1().Q2()) != null) {
            Q2.M1(z2);
        }
        A2(z2);
    }

    public final boolean h1() {
        return this.E.s();
    }

    public final void h2() {
        this.Z = true;
        LayoutNode C0 = X1().C0();
        boolean z2 = false;
        if ((this.R != PlacedState.IsPlacedInLookahead && !e1()) || (this.R != PlacedState.IsPlacedInApproach && e1())) {
            V1();
            if (this.F && C0 != null) {
                LayoutNode.B1(C0, false, 1, (Object) null);
            }
        }
        if (C0 == null) {
            this.H = 0;
        } else if (!this.F && (C0.h0() == LayoutNode.LayoutState.LayingOut || C0.h0() == LayoutNode.LayoutState.LookaheadLayingOut)) {
            if (this.H == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.c("Place was called on a node which was placed already");
            }
            this.H = C0.f0().y();
            LayoutNodeLayoutDelegate f0 = C0.f0();
            f0.X(f0.y() + 1);
        }
        i0();
    }

    public void i0() {
        this.V = true;
        q().o();
        if (h1()) {
            d2();
        }
        LookaheadDelegate Q2 = M().Q2();
        Intrinsics.f(Q2);
        if (i1() || (!this.J && !Q2.C1() && h1())) {
            u2(false);
            LayoutNode.LayoutState j1 = j1();
            w2(LayoutNode.LayoutState.LookaheadLayingOut);
            Owner b2 = LayoutNodeKt.b(X1());
            this.E.T(false);
            OwnerSnapshotObserver.f(b2.getSnapshotObserver(), X1(), false, new LookaheadPassDelegate$layoutChildren$1(this, Q2), 2, (Object) null);
            w2(j1);
            if (this.E.r() && Q2.C1()) {
                requestLayout();
            }
            v2(false);
        }
        if (q().l()) {
            q().q(true);
        }
        if (q().g() && q().k()) {
            q().n();
        }
        this.V = false;
    }

    public final boolean i1() {
        return this.E.t();
    }

    public final void i2(long j2) {
        w2(LayoutNode.LayoutState.LookaheadMeasuring);
        x2(false);
        OwnerSnapshotObserver.h(LayoutNodeKt.b(X1()).getSnapshotObserver(), X1(), false, new LookaheadPassDelegate$performMeasure$1(this, j2), 2, (Object) null);
        L1();
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            q1().c2();
        } else {
            q1().d2();
        }
        w2(LayoutNode.LayoutState.Idle);
    }

    public void n0(Function1 function1) {
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            AlignmentLinesOwner p3 = ((LayoutNode) objArr[i2]).f0().p();
            Intrinsics.f(p3);
            function1.invoke(p3);
        }
    }

    public void p0() {
        LayoutNode.D1(X1(), false, false, false, 7, (Object) null);
    }

    public AlignmentLines q() {
        return this.S;
    }

    public int q0(int i2) {
        e2();
        LookaheadDelegate Q2 = x1().Q2();
        Intrinsics.f(Q2);
        return Q2.q0(i2);
    }

    public final MeasurePassDelegate q1() {
        return this.E.w();
    }

    public final boolean r2(long j2) {
        long j3;
        if (X1().x()) {
            InlineClassHelperKt.a("measure is called on a deactivated node");
        }
        LayoutNode C0 = X1().C0();
        X1().L1(X1().J() || (C0 != null && C0.J()));
        if (!X1().j0()) {
            Constraints constraints = this.M;
            if (constraints == null ? false : Constraints.f(constraints.r(), j2)) {
                Owner B0 = X1().B0();
                if (B0 != null) {
                    B0.u(X1(), true);
                }
                X1().K1();
                return false;
            }
        }
        this.M = Constraints.a(j2);
        T0(j2);
        q().s(false);
        n0(LookaheadPassDelegate$remeasure$2.f17348z);
        if (this.L) {
            j3 = F0();
        } else {
            long j4 = (long) Integer.MIN_VALUE;
            j3 = IntSize.c((j4 & 4294967295L) | (j4 << 32));
        }
        this.L = true;
        LookaheadDelegate Q2 = x1().Q2();
        if (!(Q2 != null)) {
            InlineClassHelperKt.c("Lookahead result from lookaheadRemeasure cannot be null");
        }
        this.E.J(j2);
        S0(IntSize.c((((long) Q2.C0()) & 4294967295L) | (((long) Q2.L0()) << 32)));
        return (((int) (j3 >> 32)) == Q2.L0() && ((int) (j3 & 4294967295L)) == Q2.C0()) ? false : true;
    }

    public void requestLayout() {
        LayoutNode.B1(X1(), false, 1, (Object) null);
    }

    public final void s2() {
        LayoutNode C0;
        try {
            this.F = true;
            if (!this.K) {
                InlineClassHelperKt.c("replace() called on item that was not placed");
            }
            this.Z = false;
            boolean u2 = u();
            n2(this.N, 0.0f, this.P, this.Q);
            if (u2 && !this.Z && (C0 = X1().C0()) != null) {
                LayoutNode.B1(C0, false, 1, (Object) null);
            }
            this.F = false;
        } catch (Throwable th) {
            this.F = false;
            throw th;
        }
    }

    public Object t() {
        return this.X;
    }

    public final LayoutNode.UsageByParent t1() {
        return this.I;
    }

    public final void t2(boolean z2) {
        this.U = z2;
    }

    public boolean u() {
        return this.R != PlacedState.IsNotPlaced;
    }

    public final void u2(boolean z2) {
        this.E.U(z2);
    }

    public final boolean v1() {
        if (LayoutNodeLayoutDelegateKt.a(X1())) {
            return true;
        }
        if (this.R == PlacedState.IsNotPlaced && !this.E.h()) {
            this.E.Q(true);
        }
        return e1();
    }

    public final void v2(boolean z2) {
        this.E.V(z2);
    }

    public final void x2(boolean z2) {
        this.E.W(z2);
    }

    public final void y2(LayoutNode.UsageByParent usageByParent) {
        this.I = usageByParent;
    }

    public final void z2(int i2) {
        this.H = i2;
    }
}
