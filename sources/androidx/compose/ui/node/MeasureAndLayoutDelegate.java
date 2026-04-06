package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MeasureAndLayoutDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f17349a;

    /* renamed from: b  reason: collision with root package name */
    public final DepthSortedSetsForDifferentPasses f17350b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17351c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17352d;

    /* renamed from: e  reason: collision with root package name */
    public final OnPositionedDispatcher f17353e = new OnPositionedDispatcher();

    /* renamed from: f  reason: collision with root package name */
    public final MutableVector f17354f = new MutableVector(new Owner.OnLayoutCompletedListener[16], 0);

    /* renamed from: g  reason: collision with root package name */
    public long f17355g = 1;

    /* renamed from: h  reason: collision with root package name */
    public final MutableVector f17356h;

    /* renamed from: i  reason: collision with root package name */
    public Constraints f17357i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutTreeConsistencyChecker f17358j;

    @Metadata
    public static final class PostponedRequest {

        /* renamed from: a  reason: collision with root package name */
        public final LayoutNode f17359a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17360b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17361c;

        public PostponedRequest(LayoutNode layoutNode, boolean z2, boolean z3) {
            this.f17359a = layoutNode;
            this.f17360b = z2;
            this.f17361c = z3;
        }

        public final LayoutNode a() {
            return this.f17359a;
        }

        public final boolean b() {
            return this.f17361c;
        }

        public final boolean c() {
            return this.f17360b;
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f17362a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.<clinit>():void");
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.f17349a = layoutNode;
        Owner.Companion companion = Owner.f17427i;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.a());
        this.f17350b = depthSortedSetsForDifferentPasses;
        MutableVector mutableVector = new MutableVector(new PostponedRequest[16], 0);
        this.f17356h = mutableVector;
        this.f17358j = companion.a() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.k()) : null;
    }

    public static /* synthetic */ boolean B(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        return measureAndLayoutDelegate.A(layoutNode, z2, z3);
    }

    public static /* synthetic */ boolean J(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return measureAndLayoutDelegate.I(layoutNode, z2);
    }

    public static /* synthetic */ void d(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        measureAndLayoutDelegate.c(z2);
    }

    public final boolean A(LayoutNode layoutNode, boolean z2, boolean z3) {
        Constraints constraints;
        LayoutNode C0;
        boolean z4 = false;
        if (layoutNode.x()) {
            return false;
        }
        if (layoutNode.u() || layoutNode.W0() || l(layoutNode) || Intrinsics.d(layoutNode.X0(), Boolean.TRUE) || k(layoutNode) || layoutNode.H()) {
            if (layoutNode == this.f17349a) {
                constraints = this.f17357i;
                Intrinsics.f(constraints);
            } else {
                constraints = null;
            }
            if (z2) {
                if (layoutNode.j0()) {
                    z4 = e(layoutNode, constraints);
                }
                if (z3 && ((z4 || layoutNode.i0()) && Intrinsics.d(layoutNode.X0(), Boolean.TRUE))) {
                    layoutNode.b1();
                }
            } else {
                boolean f2 = layoutNode.o0() ? f(layoutNode, constraints) : false;
                if (z3 && layoutNode.g0() && (layoutNode == this.f17349a || ((C0 = layoutNode.C0()) != null && C0.u() && layoutNode.W0()))) {
                    if (layoutNode == this.f17349a) {
                        layoutNode.s1(0, 0);
                    } else {
                        layoutNode.y1();
                    }
                    this.f17353e.d(layoutNode);
                    LayoutNodeKt.b(layoutNode).getRectManager().j(layoutNode);
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.a();
                    }
                }
                z4 = f2;
            }
            g();
        }
        return z4;
    }

    public final void C(LayoutNode layoutNode) {
        MutableVector J0 = layoutNode.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (p(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.a(layoutNode2)) {
                    D(layoutNode2, true);
                } else {
                    C(layoutNode2);
                }
            }
        }
    }

    public final void D(LayoutNode layoutNode, boolean z2) {
        Constraints constraints;
        if (!layoutNode.x()) {
            if (layoutNode == this.f17349a) {
                constraints = this.f17357i;
                Intrinsics.f(constraints);
            } else {
                constraints = null;
            }
            if (z2) {
                e(layoutNode, constraints);
            } else {
                f(layoutNode, constraints);
            }
        }
    }

    public final boolean E(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.f17362a[layoutNode.h0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!(i2 == 4 || i2 == 5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.j0() || layoutNode.i0()) && !z2) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.a();
                return false;
            }
            layoutNode.d1();
            layoutNode.c1();
            if (layoutNode.x()) {
                return false;
            }
            LayoutNode C0 = layoutNode.C0();
            if (Intrinsics.d(layoutNode.X0(), Boolean.TRUE) && ((C0 == null || !C0.j0()) && (C0 == null || !C0.i0()))) {
                this.f17350b.c(layoutNode, true);
            } else if (layoutNode.u() && ((C0 == null || !C0.g0()) && (C0 == null || !C0.o0()))) {
                this.f17350b.c(layoutNode, false);
            }
            return !this.f17352d;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.f17358j;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.a();
        return false;
    }

    public final boolean F(LayoutNode layoutNode, boolean z2) {
        LayoutNode C0;
        LayoutNode C02;
        if (!(layoutNode.l0() != null)) {
            InlineClassHelperKt.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i2 = WhenMappings.f17362a[layoutNode.h0().ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            this.f17356h.d(new PostponedRequest(layoutNode, true, z2));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.a();
            return false;
        } else if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        } else if (layoutNode.j0() && !z2) {
            return false;
        } else {
            layoutNode.e1();
            layoutNode.f1();
            if (layoutNode.x()) {
                return false;
            }
            if ((Intrinsics.d(layoutNode.X0(), Boolean.TRUE) || k(layoutNode)) && ((C02 = layoutNode.C0()) == null || !C02.j0())) {
                this.f17350b.c(layoutNode, true);
            } else if ((layoutNode.u() || l(layoutNode)) && ((C0 = layoutNode.C0()) == null || !C0.o0())) {
                this.f17350b.c(layoutNode, false);
            }
            return !this.f17352d;
        }
    }

    public final void G(LayoutNode layoutNode) {
        this.f17353e.d(layoutNode);
    }

    public final boolean H(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.f17362a[layoutNode.h0().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.a();
            }
        } else if (i2 == 5) {
            LayoutNode C0 = layoutNode.C0();
            boolean z3 = C0 == null || C0.u();
            if (z2 || (!layoutNode.o0() && !(layoutNode.g0() && layoutNode.u() == z3 && layoutNode.u() == layoutNode.W0()))) {
                layoutNode.c1();
                if (!layoutNode.x() && layoutNode.W0() && z3) {
                    if ((C0 == null || !C0.g0()) && (C0 == null || !C0.o0())) {
                        this.f17350b.c(layoutNode, false);
                    }
                    if (!this.f17352d) {
                        return true;
                    }
                }
            } else {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.f17358j;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.a();
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public final boolean I(LayoutNode layoutNode, boolean z2) {
        int i2 = WhenMappings.f17362a[layoutNode.h0().ordinal()];
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3 || i2 == 4) {
                this.f17356h.d(new PostponedRequest(layoutNode, false, z2));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.a();
                }
            } else if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (!layoutNode.o0() || z2) {
                layoutNode.f1();
                if (!layoutNode.x() && (layoutNode.u() || l(layoutNode))) {
                    LayoutNode C0 = layoutNode.C0();
                    if (C0 == null || !C0.o0()) {
                        this.f17350b.c(layoutNode, false);
                    }
                    if (!this.f17352d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K(long j2) {
        Constraints constraints = this.f17357i;
        boolean z2 = false;
        if (!(constraints == null ? false : Constraints.f(constraints.r(), j2))) {
            if (this.f17351c) {
                InlineClassHelperKt.a("updateRootConstraints called while measuring");
            }
            this.f17357i = Constraints.a(j2);
            if (this.f17349a.l0() != null) {
                this.f17349a.e1();
            }
            this.f17349a.f1();
            DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f17350b;
            LayoutNode layoutNode = this.f17349a;
            if (layoutNode.l0() != null) {
                z2 = true;
            }
            depthSortedSetsForDifferentPasses.c(layoutNode, z2);
        }
    }

    public final void b() {
        MutableVector mutableVector = this.f17354f;
        Object[] objArr = mutableVector.f15005z;
        int p2 = mutableVector.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((Owner.OnLayoutCompletedListener) objArr[i2]).c();
        }
        this.f17354f.l();
    }

    public final void c(boolean z2) {
        if (z2) {
            this.f17353e.e(this.f17349a);
        }
        this.f17353e.a();
    }

    public final boolean e(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.l0() == null) {
            return false;
        }
        boolean Z0 = constraints != null ? layoutNode.Z0(constraints) : LayoutNode.a1(layoutNode, (Constraints) null, 1, (Object) null);
        LayoutNode C0 = layoutNode.C0();
        if (Z0 && C0 != null) {
            if (C0.l0() == null) {
                LayoutNode.H1(C0, false, false, false, 3, (Object) null);
            } else if (layoutNode.r0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.D1(C0, false, false, false, 3, (Object) null);
            } else if (layoutNode.r0() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.B1(C0, false, 1, (Object) null);
            }
        }
        return Z0;
    }

    public final boolean f(LayoutNode layoutNode, Constraints constraints) {
        boolean u1 = constraints != null ? layoutNode.u1(constraints) : LayoutNode.v1(layoutNode, (Constraints) null, 1, (Object) null);
        LayoutNode C0 = layoutNode.C0();
        if (u1 && C0 != null) {
            if (layoutNode.q0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.H1(C0, false, false, false, 3, (Object) null);
            } else if (layoutNode.q0() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.F1(C0, false, 1, (Object) null);
            }
        }
        return u1;
    }

    public final void g() {
        if (this.f17356h.p() != 0) {
            MutableVector mutableVector = this.f17356h;
            Object[] objArr = mutableVector.f15005z;
            int p2 = mutableVector.p();
            for (int i2 = 0; i2 < p2; i2++) {
                PostponedRequest postponedRequest = (PostponedRequest) objArr[i2];
                if (postponedRequest.a().b()) {
                    if (!postponedRequest.c()) {
                        LayoutNode.H1(postponedRequest.a(), postponedRequest.b(), false, false, 2, (Object) null);
                    } else {
                        LayoutNode.D1(postponedRequest.a(), postponedRequest.b(), false, false, 2, (Object) null);
                    }
                }
            }
            this.f17356h.l();
        }
    }

    public final void h(LayoutNode layoutNode) {
        MutableVector J0 = layoutNode.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (Intrinsics.d(layoutNode2.X0(), Boolean.TRUE) && !layoutNode2.x()) {
                if (this.f17350b.e(layoutNode2, true)) {
                    layoutNode2.b1();
                }
                h(layoutNode2);
            }
        }
    }

    public final void i(LayoutNode layoutNode, boolean z2) {
        if (!this.f17351c) {
            InlineClassHelperKt.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (w(layoutNode, z2)) {
            InlineClassHelperKt.a("node not yet measured");
        }
        j(layoutNode, z2);
    }

    public final void j(LayoutNode layoutNode, boolean z2) {
        MutableVector J0 = layoutNode.J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if ((!z2 && p(layoutNode2)) || (z2 && q(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.a(layoutNode2) && !z2) {
                    if (!layoutNode2.j0() || !this.f17350b.e(layoutNode2, true)) {
                        i(layoutNode2, true);
                    } else {
                        A(layoutNode2, true, false);
                    }
                }
                y(layoutNode2, z2);
                if (!w(layoutNode2, z2)) {
                    j(layoutNode2, z2);
                }
            }
        }
        y(layoutNode, z2);
    }

    public final boolean k(LayoutNode layoutNode) {
        return layoutNode.j0() && q(layoutNode);
    }

    public final boolean l(LayoutNode layoutNode) {
        return layoutNode.o0() && r(layoutNode);
    }

    public final boolean m() {
        return this.f17351c;
    }

    public final boolean n() {
        return this.f17350b.h();
    }

    public final boolean o() {
        return this.f17353e.c();
    }

    public final boolean p(LayoutNode layoutNode) {
        return layoutNode.q0() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.f0().c().q().k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r4 = r4.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(androidx.compose.ui.node.LayoutNode r4) {
        /*
            r3 = this;
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r4.r0()
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock
            r2 = 1
            if (r0 == r1) goto L_0x0021
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r4 = r4.f0()
            androidx.compose.ui.node.AlignmentLinesOwner r4 = r4.p()
            if (r4 == 0) goto L_0x0020
            androidx.compose.ui.node.AlignmentLines r4 = r4.q()
            if (r4 == 0) goto L_0x0020
            boolean r4 = r4.k()
            if (r4 != r2) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.q(androidx.compose.ui.node.LayoutNode):boolean");
    }

    public final boolean r(LayoutNode layoutNode) {
        do {
            if (!p(layoutNode)) {
                LayoutNode C0 = layoutNode.C0();
                if ((C0 != null ? C0.h0() : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.C0();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.u());
        return true;
    }

    public final long s() {
        if (!this.f17351c) {
            InlineClassHelperKt.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f17355g;
    }

    public final boolean t(Function0 function0) {
        boolean z2;
        if (!this.f17349a.b()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f17349a.u()) {
            InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f17351c) {
            InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
        }
        boolean z3 = false;
        if (this.f17357i != null) {
            this.f17351c = true;
            this.f17352d = true;
            try {
                if (this.f17350b.h()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.f17350b;
                    z2 = false;
                    while (depthSortedSetsForDifferentPasses.h()) {
                        boolean c2 = depthSortedSetsForDifferentPasses.f17245a.c();
                        boolean z4 = !c2;
                        LayoutNode d2 = (!c2 ? depthSortedSetsForDifferentPasses.f17245a : depthSortedSetsForDifferentPasses.f17246b).d();
                        boolean B2 = B(this, d2, z4, false, 4, (Object) null);
                        if (d2 == this.f17349a && B2) {
                            z2 = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z2 = false;
                }
                this.f17351c = false;
                this.f17352d = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.a();
                }
                z3 = z2;
            } catch (Throwable th) {
                this.f17351c = false;
                this.f17352d = false;
                throw th;
            }
        }
        b();
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.compose.ui.node.LayoutNode r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r4.x()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            androidx.compose.ui.node.LayoutNode r0 = r3.f17349a
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "measureAndLayout called on root"
            androidx.compose.ui.internal.InlineClassHelperKt.a(r0)
        L_0x0014:
            androidx.compose.ui.node.LayoutNode r0 = r3.f17349a
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "performMeasureAndLayout called with unattached root"
            androidx.compose.ui.internal.InlineClassHelperKt.a(r0)
        L_0x0021:
            androidx.compose.ui.node.LayoutNode r0 = r3.f17349a
            boolean r0 = r0.u()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            androidx.compose.ui.internal.InlineClassHelperKt.a(r0)
        L_0x002e:
            boolean r0 = r3.f17351c
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            androidx.compose.ui.internal.InlineClassHelperKt.a(r0)
        L_0x0037:
            androidx.compose.ui.unit.Constraints r0 = r3.f17357i
            if (r0 == 0) goto L_0x009a
            r0 = 1
            r3.f17351c = r0
            r0 = 0
            r3.f17352d = r0
            androidx.compose.ui.node.DepthSortedSetsForDifferentPasses r1 = r3.f17350b     // Catch:{ all -> 0x0057 }
            r1.i(r4)     // Catch:{ all -> 0x0057 }
            androidx.compose.ui.unit.Constraints r1 = androidx.compose.ui.unit.Constraints.a(r5)     // Catch:{ all -> 0x0057 }
            boolean r1 = r3.e(r4, r1)     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0059
            boolean r1 = r4.i0()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            goto L_0x0059
        L_0x0057:
            r4 = move-exception
            goto L_0x0095
        L_0x0059:
            java.lang.Boolean r1 = r4.X0()     // Catch:{ all -> 0x0057 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0057 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            r4.b1()     // Catch:{ all -> 0x0057 }
        L_0x0068:
            r3.h(r4)     // Catch:{ all -> 0x0057 }
            androidx.compose.ui.unit.Constraints r5 = androidx.compose.ui.unit.Constraints.a(r5)     // Catch:{ all -> 0x0057 }
            r3.f(r4, r5)     // Catch:{ all -> 0x0057 }
            boolean r5 = r4.g0()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            boolean r5 = r4.u()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            r4.y1()     // Catch:{ all -> 0x0057 }
            androidx.compose.ui.node.OnPositionedDispatcher r5 = r3.f17353e     // Catch:{ all -> 0x0057 }
            r5.d(r4)     // Catch:{ all -> 0x0057 }
        L_0x0086:
            r3.g()     // Catch:{ all -> 0x0057 }
            r3.f17351c = r0
            r3.f17352d = r0
            androidx.compose.ui.node.LayoutTreeConsistencyChecker r4 = r3.f17358j
            if (r4 == 0) goto L_0x009a
            r4.a()
            goto L_0x009a
        L_0x0095:
            r3.f17351c = r0
            r3.f17352d = r0
            throw r4
        L_0x009a:
            r3.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MeasureAndLayoutDelegate.u(androidx.compose.ui.node.LayoutNode, long):void");
    }

    public final void v() {
        if (this.f17350b.h()) {
            if (!this.f17349a.b()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f17349a.u()) {
                InlineClassHelperKt.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f17351c) {
                InlineClassHelperKt.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f17357i != null) {
                this.f17351c = true;
                this.f17352d = false;
                try {
                    if (!this.f17350b.g(true)) {
                        if (this.f17349a.l0() != null) {
                            D(this.f17349a, true);
                        } else {
                            C(this.f17349a);
                        }
                    }
                    D(this.f17349a, false);
                    this.f17351c = false;
                    this.f17352d = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.f17358j;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.a();
                    }
                } catch (Throwable th) {
                    this.f17351c = false;
                    this.f17352d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean w(LayoutNode layoutNode, boolean z2) {
        return z2 ? layoutNode.j0() : layoutNode.o0();
    }

    public final void x(LayoutNode layoutNode) {
        this.f17350b.i(layoutNode);
        this.f17353e.f(layoutNode);
    }

    public final void y(LayoutNode layoutNode, boolean z2) {
        if (w(layoutNode, z2)) {
            A(layoutNode, z2, false);
        }
    }

    public final void z(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.f17354f.d(onLayoutCompletedListener);
    }
}
