package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {

    /* renamed from: A  reason: collision with root package name */
    public CompositionContext f17061A;

    /* renamed from: B  reason: collision with root package name */
    public SubcomposeSlotReusePolicy f17062B;
    public int C;
    public int D;
    public final MutableScatterMap E = ScatterMapKt.c();
    public final MutableScatterMap F = ScatterMapKt.c();
    public final Scope G = new Scope();
    public final ApproachMeasureScopeImpl H = new ApproachMeasureScopeImpl();
    public final MutableScatterMap I = ScatterMapKt.c();
    public final SubcomposeSlotReusePolicy.SlotIdsSet J = new SubcomposeSlotReusePolicy.SlotIdsSet((MutableOrderedScatterSet) null, 1, (DefaultConstructorMarker) null);
    public final MutableScatterMap K = ScatterMapKt.c();
    public final MutableVector L = new MutableVector(new Object[16], 0);
    public int M;
    public int N;
    public final String O = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* renamed from: z  reason: collision with root package name */
    public final LayoutNode f17063z;

    @Metadata
    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Scope f17073z;

        public ApproachMeasureScopeImpl() {
            this.f17073z = LayoutNodeSubcompositionsState.this.G;
        }

        public long A(float f2) {
            return this.f17073z.A(f2);
        }

        public float B1(float f2) {
            return this.f17073z.B1(f2);
        }

        public float D(int i2) {
            return this.f17073z.D(i2);
        }

        public float E(float f2) {
            return this.f17073z.E(f2);
        }

        public int K1(long j2) {
            return this.f17073z.K1(j2);
        }

        public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
            return this.f17073z.O1(i2, i3, map, function1, function12);
        }

        public int P1(float f2) {
            return this.f17073z.P1(f2);
        }

        public long V(long j2) {
            return this.f17073z.V(j2);
        }

        public float f2(long j2) {
            return this.f17073z.f2(j2);
        }

        public float getDensity() {
            return this.f17073z.getDensity();
        }

        public LayoutDirection getLayoutDirection() {
            return this.f17073z.getLayoutDirection();
        }

        public List j0(Object obj, Function2 function2) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.F.e(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.f17063z.R().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.C) ? LayoutNodeSubcompositionsState.this.t(obj, function2) : layoutNode.L();
        }

        public long r(float f2) {
            return this.f17073z.r(f2);
        }

        public long s(long j2) {
            return this.f17073z.s(j2);
        }

        public float u1() {
            return this.f17073z.u1();
        }

        public float v(long j2) {
            return this.f17073z.v(j2);
        }

        public boolean w1() {
            return this.f17073z.w1();
        }

        public MeasureResult y0(int i2, int i3, Map map, Function1 function1) {
            return this.f17073z.y0(i2, i3, map, function1);
        }
    }

    @Metadata
    public final class Scope implements SubcomposeMeasureScope {

        /* renamed from: A  reason: collision with root package name */
        public float f17080A;

        /* renamed from: B  reason: collision with root package name */
        public float f17081B;

        /* renamed from: z  reason: collision with root package name */
        public LayoutDirection f17082z = LayoutDirection.Rtl;

        public Scope() {
        }

        public MeasureResult O1(int i2, int i3, Map map, Function1 function1, Function1 function12) {
            if (!((i2 & -16777216) == 0 && (-16777216 & i3) == 0)) {
                InlineClassHelperKt.c("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new LayoutNodeSubcompositionsState$Scope$layout$1(i2, i3, map, function1, this, LayoutNodeSubcompositionsState.this, function12);
        }

        public void b(float f2) {
            this.f17080A = f2;
        }

        public void f(float f2) {
            this.f17081B = f2;
        }

        public float getDensity() {
            return this.f17080A;
        }

        public LayoutDirection getLayoutDirection() {
            return this.f17082z;
        }

        public List j0(Object obj, Function2 function2) {
            return LayoutNodeSubcompositionsState.this.J(obj, function2);
        }

        public void q(LayoutDirection layoutDirection) {
            this.f17082z = layoutDirection;
        }

        public float u1() {
            return this.f17081B;
        }

        public boolean w1() {
            return LayoutNodeSubcompositionsState.this.f17063z.h0() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.f17063z.h0() == LayoutNode.LayoutState.LookaheadMeasuring;
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f17063z = layoutNode;
        this.f17062B = subcomposeSlotReusePolicy;
    }

    public static /* synthetic */ void E(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        layoutNodeSubcompositionsState.D(i2, i3, i4);
    }

    public final Object A(List list, int i2) {
        Object e2 = this.E.e((LayoutNode) list.get(i2));
        Intrinsics.f(e2);
        return ((NodeState) e2).f();
    }

    public final void B() {
        int size = this.f17063z.R().size();
        boolean z2 = false;
        if (!(this.E.g() == size)) {
            InlineClassHelperKt.a("Inconsistency between the count of nodes tracked by the state (" + this.E.g() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.M) - this.N >= 0)) {
            InlineClassHelperKt.a("Incorrect state. Total children " + size + ". Reusable children " + this.M + ". Precomposed children " + this.N);
        }
        if (this.I.g() == this.N) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.a("Incorrect state. Precomposed children " + this.N + ". Map size " + this.I.g());
        }
    }

    public final void C(boolean z2) {
        this.N = 0;
        this.I.k();
        List R = this.f17063z.R();
        int size = R.size();
        if (this.M != size) {
            this.M = size;
            Snapshot.Companion companion = Snapshot.f15255e;
            Snapshot d2 = companion.d();
            Function1 g2 = d2 != null ? d2.g() : null;
            Snapshot f2 = companion.f(d2);
            int i2 = 0;
            while (i2 < size) {
                try {
                    LayoutNode layoutNode = (LayoutNode) R.get(i2);
                    NodeState nodeState = (NodeState) this.E.e(layoutNode);
                    if (nodeState != null && nodeState.a()) {
                        G(layoutNode);
                        if (z2) {
                            ReusableComposition b2 = nodeState.b();
                            if (b2 != null) {
                                b2.deactivate();
                            }
                            nodeState.h(SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null));
                        } else {
                            nodeState.g(false);
                        }
                        nodeState.m(SubcomposeLayoutKt.f17156a);
                    }
                    i2++;
                } catch (Throwable th) {
                    companion.m(d2, f2, g2);
                    throw th;
                }
            }
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
            this.F.k();
        }
        B();
    }

    public final void D(int i2, int i3, int i4) {
        LayoutNode layoutNode = this.f17063z;
        layoutNode.R = true;
        this.f17063z.o1(i2, i3, i4);
        layoutNode.R = false;
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle F(Object obj, Function2 function2) {
        if (!this.f17063z.b()) {
            return new LayoutNodeSubcompositionsState$precompose$1();
        }
        B();
        if (!this.F.c(obj)) {
            this.K.u(obj);
            MutableScatterMap mutableScatterMap = this.I;
            Object e2 = mutableScatterMap.e(obj);
            if (e2 == null) {
                e2 = N(obj);
                if (e2 != null) {
                    D(this.f17063z.R().indexOf(e2), this.f17063z.R().size(), 1);
                    this.N++;
                } else {
                    e2 = v(this.f17063z.R().size());
                    this.N++;
                }
                mutableScatterMap.x(obj, e2);
            }
            L((LayoutNode) e2, obj, function2);
        }
        return new LayoutNodeSubcompositionsState$precompose$2(this, obj);
    }

    public final void G(LayoutNode layoutNode) {
        MeasurePassDelegate n0 = layoutNode.n0();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        n0.A2(usageByParent);
        LookaheadPassDelegate k0 = layoutNode.k0();
        if (k0 != null) {
            k0.y2(usageByParent);
        }
    }

    public final void H(CompositionContext compositionContext) {
        this.f17061A = compositionContext;
    }

    public final void I(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.f17062B != subcomposeSlotReusePolicy) {
            this.f17062B = subcomposeSlotReusePolicy;
            C(false);
            LayoutNode.H1(this.f17063z, false, false, false, 7, (Object) null);
        }
    }

    public final List J(Object obj, Function2 function2) {
        B();
        LayoutNode.LayoutState h0 = this.f17063z.h0();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        boolean z2 = false;
        if (!(h0 == layoutState || h0 == LayoutNode.LayoutState.LayingOut || h0 == LayoutNode.LayoutState.LookaheadMeasuring || h0 == LayoutNode.LayoutState.LookaheadLayingOut)) {
            InlineClassHelperKt.c("subcompose can only be used inside the measure or layout blocks");
        }
        MutableScatterMap mutableScatterMap = this.F;
        Object e2 = mutableScatterMap.e(obj);
        if (e2 == null) {
            e2 = (LayoutNode) this.I.u(obj);
            if (e2 != null) {
                if (!(this.N > 0)) {
                    InlineClassHelperKt.c("Check failed.");
                }
                this.N--;
            } else {
                e2 = N(obj);
                if (e2 == null) {
                    e2 = v(this.C);
                }
            }
            mutableScatterMap.x(obj, e2);
        }
        LayoutNode layoutNode = (LayoutNode) e2;
        if (CollectionsKt.h0(this.f17063z.R(), this.C) != layoutNode) {
            int indexOf = this.f17063z.R().indexOf(layoutNode);
            if (indexOf >= this.C) {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = this.C;
            if (i2 != indexOf) {
                E(this, indexOf, i2, 0, 4, (Object) null);
            }
        }
        this.C++;
        L(layoutNode, obj, function2);
        return (h0 == layoutState || h0 == LayoutNode.LayoutState.LayingOut) ? layoutNode.L() : layoutNode.K();
    }

    public final void K(LayoutNode layoutNode, NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            LayoutNode layoutNode2 = this.f17063z;
            layoutNode2.R = true;
            Function2 c2 = nodeState.c();
            ReusableComposition b2 = nodeState.b();
            CompositionContext compositionContext = this.f17061A;
            if (compositionContext != null) {
                nodeState.i(M(b2, layoutNode, nodeState.e(), compositionContext, ComposableLambdaKt.c(-1750409193, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, c2))));
                nodeState.l(false);
                layoutNode2.R = false;
                Unit unit = Unit.f40552a;
                return;
            }
            InlineClassHelperKt.d("parent composition reference not set");
            throw new KotlinNothingValueException();
        } finally {
            companion.m(d2, f2, g2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(androidx.compose.ui.node.LayoutNode r9, java.lang.Object r10, kotlin.jvm.functions.Function2 r11) {
        /*
            r8 = this;
            androidx.collection.MutableScatterMap r0 = r8.E
            java.lang.Object r1 = r0.e(r9)
            if (r1 != 0) goto L_0x001b
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r1 = new androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState
            androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt r2 = androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.f17023a
            kotlin.jvm.functions.Function2 r4 = r2.a()
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.x(r9, r1)
        L_0x001b:
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r1 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r1
            androidx.compose.runtime.ReusableComposition r10 = r1.b()
            if (r10 == 0) goto L_0x0028
            boolean r10 = r10.v()
            goto L_0x0029
        L_0x0028:
            r10 = 1
        L_0x0029:
            kotlin.jvm.functions.Function2 r0 = r1.c()
            if (r0 != r11) goto L_0x0037
            if (r10 != 0) goto L_0x0037
            boolean r10 = r1.d()
            if (r10 == 0) goto L_0x0041
        L_0x0037:
            r1.j(r11)
            r8.K(r9, r1)
            r9 = 0
            r1.k(r9)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.L(androidx.compose.ui.node.LayoutNode, java.lang.Object, kotlin.jvm.functions.Function2):void");
    }

    public final ReusableComposition M(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z2, CompositionContext compositionContext, Function2 function2) {
        if (reusableComposition == null || reusableComposition.i()) {
            reusableComposition = SubcompositionKt.a(layoutNode, compositionContext);
        }
        if (!z2) {
            reusableComposition.p(function2);
        } else {
            reusableComposition.r(function2);
        }
        return reusableComposition;
    }

    public final LayoutNode N(Object obj) {
        int i2;
        if (this.M == 0) {
            return null;
        }
        List R = this.f17063z.R();
        int size = R.size() - this.N;
        int i3 = size - this.M;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i2 = -1;
                break;
            } else if (Intrinsics.d(A(R, i5), obj)) {
                i2 = i5;
                break;
            } else {
                i5--;
            }
        }
        if (i2 == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object e2 = this.E.e((LayoutNode) R.get(i4));
                Intrinsics.f(e2);
                NodeState nodeState = (NodeState) e2;
                if (nodeState.f() == SubcomposeLayoutKt.f17156a || this.f17062B.b(obj, nodeState.f())) {
                    nodeState.m(obj);
                    i5 = i4;
                    i2 = i5;
                } else {
                    i4--;
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        if (i5 != i3) {
            D(i5, i3, 1);
        }
        this.M--;
        LayoutNode layoutNode = (LayoutNode) R.get(i3);
        Object e3 = this.E.e(layoutNode);
        Intrinsics.f(e3);
        NodeState nodeState2 = (NodeState) e3;
        nodeState2.h(SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null));
        nodeState2.l(true);
        nodeState2.k(true);
        return layoutNode;
    }

    public void g() {
        w();
    }

    public void i() {
        C(true);
    }

    public void p() {
        C(false);
    }

    public final List t(Object obj, Function2 function2) {
        if (!(this.L.p() >= this.D)) {
            InlineClassHelperKt.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int p2 = this.L.p();
        int i2 = this.D;
        if (p2 == i2) {
            this.L.d(obj);
        } else {
            this.L.C(i2, obj);
        }
        this.D++;
        if (!this.I.b(obj)) {
            this.K.x(obj, F(obj, function2));
            if (this.f17063z.h0() == LayoutNode.LayoutState.LayingOut) {
                this.f17063z.A1(true);
            } else {
                LayoutNode.D1(this.f17063z, true, false, false, 6, (Object) null);
            }
        }
        LayoutNode layoutNode = (LayoutNode) this.I.e(obj);
        if (layoutNode != null) {
            List f1 = layoutNode.n0().f1();
            int size = f1.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((MeasurePassDelegate) f1.get(i3)).W1();
            }
            if (f1 != null) {
                return f1;
            }
        }
        return CollectionsKt.m();
    }

    public final MeasurePolicy u(Function2 function2) {
        return new LayoutNodeSubcompositionsState$createMeasurePolicy$1(this, function2, this.O);
    }

    public final LayoutNode v(int i2) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, (DefaultConstructorMarker) null);
        LayoutNode layoutNode2 = this.f17063z;
        layoutNode2.R = true;
        this.f17063z.O0(i2, layoutNode);
        layoutNode2.R = false;
        return layoutNode;
    }

    public final void w() {
        ReusableComposition b2;
        LayoutNode layoutNode = this.f17063z;
        layoutNode.R = true;
        MutableScatterMap mutableScatterMap = this.E;
        Object[] objArr = mutableScatterMap.f1961c;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128 && (b2 = ((NodeState) objArr[(i2 << 3) + i4]).b()) != null) {
                            b2.d();
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        this.f17063z.w1();
        layoutNode.R = false;
        this.E.k();
        this.F.k();
        this.N = 0;
        this.M = 0;
        this.I.k();
        B();
    }

    public final void x(int i2) {
        boolean z2 = false;
        this.M = 0;
        List R = this.f17063z.R();
        int size = (R.size() - this.N) - 1;
        if (i2 <= size) {
            this.J.clear();
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    this.J.add(A(R, i3));
                    if (i3 == size) {
                        break;
                    }
                    i3++;
                }
            }
            this.f17062B.a(this.J);
            Snapshot.Companion companion = Snapshot.f15255e;
            Snapshot d2 = companion.d();
            Function1 g2 = d2 != null ? d2.g() : null;
            Snapshot f2 = companion.f(d2);
            boolean z3 = false;
            while (size >= i2) {
                try {
                    LayoutNode layoutNode = (LayoutNode) R.get(size);
                    Object e2 = this.E.e(layoutNode);
                    Intrinsics.f(e2);
                    NodeState nodeState = (NodeState) e2;
                    Object f3 = nodeState.f();
                    if (this.J.contains(f3)) {
                        this.M++;
                        if (nodeState.a()) {
                            G(layoutNode);
                            nodeState.g(false);
                            z3 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.f17063z;
                        layoutNode2.R = true;
                        this.E.u(layoutNode);
                        ReusableComposition b2 = nodeState.b();
                        if (b2 != null) {
                            b2.d();
                        }
                        this.f17063z.x1(size, 1);
                        layoutNode2.R = false;
                    }
                    this.F.u(f3);
                    size--;
                } catch (Throwable th) {
                    companion.m(d2, f2, g2);
                    throw th;
                }
            }
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
            z2 = z3;
        }
        if (z2) {
            Snapshot.f15255e.n();
        }
        B();
    }

    public final void y() {
        MutableScatterMap mutableScatterMap = this.K;
        long[] jArr = mutableScatterMap.f1959a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = mutableScatterMap.f1960b[i5];
                            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.f1961c[i5];
                            int q2 = this.L.q(obj);
                            if (q2 < 0 || q2 >= this.D) {
                                precomposedSlotHandle.d();
                                mutableScatterMap.v(i5);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void z() {
        if (this.M != this.f17063z.R().size()) {
            MutableScatterMap mutableScatterMap = this.E;
            Object[] objArr = mutableScatterMap.f1961c;
            long[] jArr = mutableScatterMap.f1959a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                ((NodeState) objArr[(i2 << 3) + i4]).k(true);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            if (!this.f17063z.o0()) {
                LayoutNode.H1(this.f17063z, false, false, false, 7, (Object) null);
            }
        }
    }

    @Metadata
    public static final class NodeState {

        /* renamed from: a  reason: collision with root package name */
        public Object f17074a;

        /* renamed from: b  reason: collision with root package name */
        public Function2 f17075b;

        /* renamed from: c  reason: collision with root package name */
        public ReusableComposition f17076c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17077d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17078e;

        /* renamed from: f  reason: collision with root package name */
        public MutableState f17079f;

        public NodeState(Object obj, Function2 function2, ReusableComposition reusableComposition) {
            this.f17074a = obj;
            this.f17075b = function2;
            this.f17076c = reusableComposition;
            this.f17079f = SnapshotStateKt__SnapshotStateKt.e(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        }

        public final boolean a() {
            return ((Boolean) this.f17079f.getValue()).booleanValue();
        }

        public final ReusableComposition b() {
            return this.f17076c;
        }

        public final Function2 c() {
            return this.f17075b;
        }

        public final boolean d() {
            return this.f17077d;
        }

        public final boolean e() {
            return this.f17078e;
        }

        public final Object f() {
            return this.f17074a;
        }

        public final void g(boolean z2) {
            this.f17079f.setValue(Boolean.valueOf(z2));
        }

        public final void h(MutableState mutableState) {
            this.f17079f = mutableState;
        }

        public final void i(ReusableComposition reusableComposition) {
            this.f17076c = reusableComposition;
        }

        public final void j(Function2 function2) {
            this.f17075b = function2;
        }

        public final void k(boolean z2) {
            this.f17077d = z2;
        }

        public final void l(boolean z2) {
            this.f17078e = z2;
        }

        public final void m(Object obj) {
            this.f17074a = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NodeState(Object obj, Function2 function2, ReusableComposition reusableComposition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i2 & 4) != 0 ? null : reusableComposition);
        }
    }
}
