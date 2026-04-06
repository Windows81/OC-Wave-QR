package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final Companion r0 = new Companion((DefaultConstructorMarker) null);
    public static final int s0 = 8;
    public static final NoIntrinsicsMeasurePolicy t0 = new LayoutNode$Companion$ErrorMeasurePolicy$1();
    public static final Function0 u0 = LayoutNode$Companion$Constructor$1.f17286z;
    public static final ViewConfiguration v0 = new LayoutNode$Companion$DummyViewConfiguration$1();
    public static final Comparator w0 = new a();

    /* renamed from: A  reason: collision with root package name */
    public int f17283A;

    /* renamed from: B  reason: collision with root package name */
    public long f17284B;
    public long C;
    public long D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public LayoutNode I;
    public int J;
    public final MutableVectorWithMutationTracking K;
    public MutableVector L;
    public boolean M;
    public LayoutNode N;
    public Owner O;
    public AndroidViewHolder P;
    public int Q;
    public boolean R;
    public boolean S;
    public SemanticsConfiguration T;
    public boolean U;
    public final MutableVector V;
    public boolean W;
    public MeasurePolicy X;
    public IntrinsicsPolicy Y;
    public Density Z;
    public LayoutDirection a0;
    public ViewConfiguration b0;
    public CompositionLocalMap c0;
    public UsageByParent d0;
    public UsageByParent e0;
    public boolean f0;
    public final NodeChain g0;
    public final LayoutNodeLayoutDelegate h0;
    public LayoutNodeSubcompositionsState i0;
    public NodeCoordinator j0;
    public boolean k0;
    public Modifier l0;
    public Modifier m0;
    public Function1 n0;
    public Function1 o0;
    public boolean p0;
    public boolean q0;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f17285z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0 a() {
            return LayoutNode.u0;
        }

        public final Comparator b() {
            return LayoutNode.w0;
        }

        public Companion() {
        }
    }

    @Metadata
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

        static {
            LayoutState[] d2;
            F = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        /* renamed from: a  reason: collision with root package name */
        public final String f17290a;

        public NoIntrinsicsMeasurePolicy(String str) {
            this.f17290a = str;
        }

        public Void a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f17290a.toString());
        }

        public /* bridge */ /* synthetic */ int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) d(intrinsicMeasureScope, list, i2)).intValue();
        }

        public Void d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f17290a.toString());
        }

        public Void e(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f17290a.toString());
        }

        public /* bridge */ /* synthetic */ int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) e(intrinsicMeasureScope, list, i2)).intValue();
        }

        public Void g(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            throw new IllegalStateException(this.f17290a.toString());
        }

        public /* bridge */ /* synthetic */ int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) g(intrinsicMeasureScope, list, i2)).intValue();
        }

        public /* bridge */ /* synthetic */ int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) a(intrinsicMeasureScope, list, i2)).intValue();
        }
    }

    @Metadata
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        static {
            UsageByParent[] d2;
            D = EnumEntriesKt.a(d2);
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17294a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17294a = iArr;
        }
    }

    public LayoutNode(boolean z2, int i2) {
        this.f17285z = z2;
        this.f17283A = i2;
        IntOffset.Companion companion = IntOffset.f19160b;
        this.f17284B = companion.a();
        this.C = IntSize.f19170b.a();
        this.D = companion.a();
        this.E = true;
        this.K = new MutableVectorWithMutationTracking(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this.V = new MutableVector(new LayoutNode[16], 0);
        this.W = true;
        this.X = t0;
        this.Z = LayoutNodeKt.f17303a;
        this.a0 = LayoutDirection.Ltr;
        this.b0 = v0;
        this.c0 = CompositionLocalMap.f14628a.a();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.d0 = usageByParent;
        this.e0 = usageByParent;
        this.g0 = new NodeChain(this);
        this.h0 = new LayoutNodeLayoutDelegate(this);
        this.k0 = true;
        this.l0 = Modifier.f15489d;
    }

    public static /* synthetic */ void B1(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        layoutNode.A1(z2);
    }

    public static /* synthetic */ String C(LayoutNode layoutNode, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return layoutNode.B(i2);
    }

    public static /* synthetic */ void D1(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        layoutNode.C1(z2, z3, z4);
    }

    public static /* synthetic */ void F1(LayoutNode layoutNode, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        layoutNode.E1(z2);
    }

    private final String G(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        String str = null;
        sb.append(C(this, 0, 1, (Object) null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode.N;
        if (layoutNode2 != null) {
            str = C(layoutNode2, 0, 1, (Object) null);
        }
        sb.append(str);
        return sb.toString();
    }

    private final float H0() {
        return n0().H1();
    }

    public static /* synthetic */ void H1(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = true;
        }
        if ((i2 & 4) != 0) {
            z4 = true;
        }
        layoutNode.G1(z2, z3, z4);
    }

    public static /* synthetic */ void L0(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = PointerType.f16933b.e();
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        layoutNode.K0(j2, hitTestResult, i4, z2);
    }

    public static /* synthetic */ void N0(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = PointerType.f16933b.d();
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        layoutNode.M0(j2, hitTestResult, i4, z2);
    }

    public static /* synthetic */ boolean a1(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.h0.l();
        }
        return layoutNode.Z0(constraints);
    }

    public static final int n(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.H0() == layoutNode2.H0() ? Intrinsics.k(layoutNode.D0(), layoutNode2.D0()) : Float.compare(layoutNode.H0(), layoutNode2.H0());
    }

    public static /* synthetic */ boolean v1(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.h0.k();
        }
        return layoutNode.u1(constraints);
    }

    public final void A() {
        this.e0 = this.d0;
        this.d0 = UsageByParent.NotUsed;
        MutableVector J0 = J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.d0 == UsageByParent.InLayoutBlock) {
                layoutNode.A();
            }
        }
    }

    public final boolean A0() {
        return this.E;
    }

    public final void A1(boolean z2) {
        Owner owner;
        if (!this.f17285z && (owner = this.O) != null) {
            owner.h(this, true, z2);
        }
    }

    public final String B(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        MutableVector J0 = J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i4 = 0; i4 < p2; i4++) {
            sb.append(((LayoutNode) objArr[i4]).B(i2 + 1));
        }
        String sb2 = sb.toString();
        if (i2 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Intrinsics.h(substring, "substring(...)");
        return substring;
    }

    public final Owner B0() {
        return this.O;
    }

    public final LayoutNode C0() {
        LayoutNode layoutNode = this.N;
        while (layoutNode != null && layoutNode.f17285z) {
            layoutNode = layoutNode.N;
        }
        return layoutNode;
    }

    public final void C1(boolean z2, boolean z3, boolean z4) {
        if (!(this.I != null)) {
            InlineClassHelperKt.c("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.O;
        if (owner != null && !this.R && !this.f17285z) {
            owner.r(this, true, z2, z3);
            if (z4) {
                LookaheadPassDelegate k02 = k0();
                Intrinsics.f(k02);
                k02.F1(z2);
            }
        }
    }

    public final void D() {
        Owner owner = this.O;
        String str = null;
        if (owner == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode C0 = C0();
            if (C0 != null) {
                str = C(C0, 0, 1, (Object) null);
            }
            sb.append(str);
            InlineClassHelperKt.d(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode C02 = C0();
        if (C02 != null) {
            C02.P0();
            C02.R0();
            MeasurePassDelegate n02 = n0();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            n02.A2(usageByParent);
            LookaheadPassDelegate k02 = k0();
            if (k02 != null) {
                k02.y2(usageByParent);
            }
        }
        this.h0.K();
        Function1 function1 = this.o0;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (!ComposeUiFlags.f15476d && this.g0.p(NodeKind.a(8))) {
            U0();
        }
        this.g0.z();
        this.R = true;
        MutableVector c2 = this.K.c();
        Object[] objArr = c2.f15005z;
        int p2 = c2.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((LayoutNode) objArr[i2]).D();
        }
        this.R = false;
        this.g0.t();
        owner.z(this);
        this.O = null;
        R1((LayoutNode) null);
        this.Q = 0;
        n0().r2();
        LookaheadPassDelegate k03 = k0();
        if (k03 != null) {
            k03.g2();
        }
        if (ComposeUiFlags.f15476d && this.g0.p(NodeKind.a(8))) {
            SemanticsConfiguration semanticsConfiguration = this.T;
            this.T = null;
            this.S = false;
            owner.getSemanticsOwner().e(this, semanticsConfiguration);
            owner.K();
        }
    }

    public final int D0() {
        return n0().F1();
    }

    public final void E() {
        if (h0() == LayoutState.Idle && !g0() && !o0() && !x() && u()) {
            NodeChain nodeChain = this.g0;
            int a2 = NodeKind.a(256);
            if ((nodeChain.i() & a2) != 0) {
                Modifier.Node k2 = nodeChain.k();
                while (k2 != null) {
                    if ((k2.A2() & a2) != 0) {
                        Modifier.Node node = k2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof GlobalPositionAwareModifierNode) {
                                GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) node;
                                globalPositionAwareModifierNode.J(DelegatableNodeKt.j(globalPositionAwareModifierNode, NodeKind.a(256)));
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.d(node);
                                                node = null;
                                            }
                                            mutableVector.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector);
                        }
                    }
                    if ((k2.v2() & a2) != 0) {
                        k2 = k2.w2();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final LayoutNodeSubcompositionsState E0() {
        return this.i0;
    }

    public final void E1(boolean z2) {
        Owner owner;
        this.E = true;
        if (!this.f17285z && (owner = this.O) != null) {
            Owner.i(owner, this, false, z2, 2, (Object) null);
        }
    }

    public final void F(Canvas canvas, GraphicsLayer graphicsLayer) {
        y0().C2(canvas, graphicsLayer);
    }

    public ViewConfiguration F0() {
        return this.b0;
    }

    public int G0() {
        return this.h0.B();
    }

    public final void G1(boolean z2, boolean z3, boolean z4) {
        Owner owner;
        if (!this.R && !this.f17285z && (owner = this.O) != null) {
            Owner.O(owner, this, false, z2, z3, 2, (Object) null);
            if (z4) {
                n0().L1(z2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r0.q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H() {
        /*
            r3 = this;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r3.h0
            androidx.compose.ui.node.AlignmentLinesOwner r1 = r0.c()
            androidx.compose.ui.node.AlignmentLines r1 = r1.q()
            boolean r1 = r1.k()
            r2 = 1
            if (r1 != 0) goto L_0x0025
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r0.p()
            if (r0 == 0) goto L_0x0024
            androidx.compose.ui.node.AlignmentLines r0 = r0.q()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.k()
            if (r0 != r2) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.H():boolean");
    }

    public final boolean I() {
        return this.m0 != null;
    }

    public final MutableVector I0() {
        if (this.W) {
            this.V.l();
            MutableVector mutableVector = this.V;
            mutableVector.e(mutableVector.p(), J0());
            this.V.E(w0);
            this.W = false;
        }
        return this.V;
    }

    public final void I1(LayoutNode layoutNode) {
        if (WhenMappings.f17294a[layoutNode.h0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.h0());
        } else if (layoutNode.j0()) {
            D1(layoutNode, true, false, false, 6, (Object) null);
        } else {
            if (layoutNode.i0()) {
                layoutNode.A1(true);
            }
            if (layoutNode.o0()) {
                H1(layoutNode, true, false, false, 6, (Object) null);
            } else if (layoutNode.g0()) {
                layoutNode.E1(true);
            }
        }
    }

    public final boolean J() {
        return this.f0;
    }

    public final MutableVector J0() {
        c2();
        if (this.J == 0) {
            return this.K.c();
        }
        MutableVector mutableVector = this.L;
        Intrinsics.f(mutableVector);
        return mutableVector;
    }

    public final void J1() {
        this.g0.x();
    }

    public final List K() {
        LookaheadPassDelegate k02 = k0();
        Intrinsics.f(k02);
        return k02.d1();
    }

    public final void K0(long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        y0().d3(NodeCoordinator.m0.a(), NodeCoordinator.I2(y0(), j2, false, 2, (Object) null), hitTestResult, i2, z2);
    }

    public final void K1() {
        MutableVector J0 = J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.e0;
            layoutNode.d0 = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.K1();
            }
        }
    }

    public final List L() {
        return n0().f1();
    }

    public final void L1(boolean z2) {
        this.f0 = z2;
    }

    public final List M() {
        return J0().k();
    }

    public final void M0(long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        y0().d3(NodeCoordinator.m0.b(), NodeCoordinator.I2(y0(), j2, false, 2, (Object) null), hitTestResult, PointerType.f16933b.d(), z2);
    }

    public final void M1(boolean z2) {
        this.F = z2;
    }

    public int N() {
        return this.G;
    }

    public final void N1(boolean z2) {
        this.k0 = z2;
    }

    public CompositionLocalMap O() {
        return this.c0;
    }

    public final void O0(int i2, LayoutNode layoutNode) {
        if (!(layoutNode.N == null || layoutNode.O == null)) {
            InlineClassHelperKt.c(G(layoutNode));
        }
        layoutNode.N = this;
        this.K.a(i2, layoutNode);
        r1();
        if (layoutNode.f17285z) {
            this.J++;
        }
        V0();
        Owner owner = this.O;
        if (owner != null) {
            layoutNode.t(owner);
        }
        if (layoutNode.h0.d() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.h0;
            layoutNodeLayoutDelegate.L(layoutNodeLayoutDelegate.d() + 1);
        }
    }

    public final void O1(AndroidViewHolder androidViewHolder) {
        this.P = androidViewHolder;
    }

    public Density P() {
        return this.Z;
    }

    public final void P0() {
        NodeCoordinator W2 = W();
        if (W2 != null) {
            W2.f3();
            return;
        }
        LayoutNode C0 = C0();
        if (C0 != null) {
            C0.P0();
        }
    }

    public final void P1(UsageByParent usageByParent) {
        this.d0 = usageByParent;
    }

    public final int Q() {
        return this.Q;
    }

    public final void Q0() {
        NodeCoordinator V2 = V();
        for (NodeCoordinator y0 = y0(); y0 != V2; y0 = y0.V2()) {
            Intrinsics.g(y0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer P2 = ((LayoutModifierNodeCoordinator) y0).P2();
            if (P2 != null) {
                P2.invalidate();
            }
        }
        OwnedLayer P22 = V().P2();
        if (P22 != null) {
            P22.invalidate();
        }
    }

    public final void Q1(long j2) {
        this.C = j2;
    }

    public final List R() {
        return this.K.c().k();
    }

    public final void R0() {
        this.E = true;
        if (this.I != null) {
            D1(this, false, false, false, 7, (Object) null);
        } else {
            H1(this, false, false, false, 7, (Object) null);
        }
    }

    public final void R1(LayoutNode layoutNode) {
        if (!Intrinsics.d(layoutNode, this.I)) {
            this.I = layoutNode;
            if (layoutNode != null) {
                this.h0.b();
                NodeCoordinator y0 = y0();
                NodeCoordinator V2 = V().V2();
                while (!Intrinsics.d(y0, V2) && y0 != null) {
                    y0.F2();
                    y0 = y0.V2();
                }
            } else {
                this.h0.a();
            }
            R0();
        }
    }

    public final boolean S() {
        return this.F;
    }

    public final void S0() {
        if (!g0() && !o0() && !this.p0) {
            LayoutNodeKt.b(this).n(this);
        }
    }

    public final void S1(boolean z2) {
        this.p0 = z2;
    }

    public final boolean T() {
        long O2 = V().O2();
        return Constraints.j(O2) && Constraints.i(O2);
    }

    public final void T0() {
        this.h0.C();
    }

    public final void T1(long j2) {
        this.f17284B = j2;
    }

    public int U() {
        return this.h0.j();
    }

    public final void U0() {
        if (!this.U) {
            if (!ComposeUiFlags.f15476d) {
                this.T = null;
                LayoutNodeKt.b(this).K();
            } else if (this.g0.r() || I()) {
                this.S = true;
            } else {
                SemanticsConfiguration semanticsConfiguration = this.T;
                this.T = y();
                this.S = false;
                Owner b2 = LayoutNodeKt.b(this);
                b2.getSemanticsOwner().e(this, semanticsConfiguration);
                b2.K();
            }
        }
    }

    public final void U1(Function1 function1) {
        this.n0 = function1;
    }

    public final NodeCoordinator V() {
        return this.g0.l();
    }

    public final void V0() {
        LayoutNode layoutNode;
        if (this.J > 0) {
            this.M = true;
        }
        if (this.f17285z && (layoutNode = this.N) != null) {
            layoutNode.V0();
        }
    }

    public final void V1(Function1 function1) {
        this.o0 = function1;
    }

    public final NodeCoordinator W() {
        if (this.k0) {
            NodeCoordinator V2 = V();
            NodeCoordinator W2 = y0().W2();
            this.j0 = null;
            while (true) {
                if (Intrinsics.d(V2, W2)) {
                    break;
                }
                if ((V2 != null ? V2.P2() : null) != null) {
                    this.j0 = V2;
                    break;
                }
                V2 = V2 != null ? V2.W2() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this.j0;
        if (nodeCoordinator == null || nodeCoordinator.P2() != null) {
            return nodeCoordinator;
        }
        InlineClassHelperKt.d("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final boolean W0() {
        return n0().V1();
    }

    public final void W1(long j2) {
        this.D = j2;
    }

    public View X() {
        AndroidViewHolder androidViewHolder = this.P;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final Boolean X0() {
        LookaheadPassDelegate k02 = k0();
        if (k02 != null) {
            return Boolean.valueOf(k02.u());
        }
        return null;
    }

    public final void X1(boolean z2) {
        this.E = z2;
    }

    public final AndroidViewHolder Y() {
        return this.P;
    }

    public final boolean Y0() {
        return this.H;
    }

    public void Y1(int i2) {
        this.f17283A = i2;
    }

    public final UsageByParent Z() {
        return this.d0;
    }

    public final boolean Z0(Constraints constraints) {
        if (constraints == null || this.I == null) {
            return false;
        }
        LookaheadPassDelegate k02 = k0();
        Intrinsics.f(k02);
        return k02.r2(constraints.r());
    }

    public final void Z1(boolean z2) {
        this.S = z2;
    }

    public void a(Density density) {
        if (!Intrinsics.d(this.Z, density)) {
            this.Z = density;
            q1();
            for (Modifier.Node k2 = this.g0.k(); k2 != null; k2 = k2.w2()) {
                k2.G();
            }
        }
    }

    public SemanticsConfiguration a0() {
        if (!b() || x() || !this.g0.p(NodeKind.a(8))) {
            return null;
        }
        if (!ComposeUiFlags.f15476d && this.T == null) {
            this.T = y();
        }
        return this.T;
    }

    public final void a2(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.i0 = layoutNodeSubcompositionsState;
    }

    public boolean b() {
        return this.O != null;
    }

    public SemanticsInfo b0() {
        return C0();
    }

    public final void b1() {
        if (this.d0 == UsageByParent.NotUsed) {
            A();
        }
        LookaheadPassDelegate k02 = k0();
        Intrinsics.f(k02);
        k02.s2();
    }

    public final void b2(boolean z2) {
        this.H = z2;
    }

    public void c() {
        NodeCoordinator V2 = V();
        int a2 = NodeKind.a(128);
        boolean i2 = NodeKindKt.i(a2);
        Modifier.Node U2 = V2.U2();
        if (i2 || (U2 = U2.C2()) != null) {
            Modifier.Node s2 = V2.a3(i2);
            while (s2 != null && (s2.v2() & a2) != 0) {
                if ((s2.A2() & a2) != 0) {
                    Modifier.Node node = s2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) node).u(V());
                        } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                            int i3 = 0;
                            for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                if ((a3.A2() & a2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        node = a3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.d(node);
                                            node = null;
                                        }
                                        mutableVector.d(a3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.h(mutableVector);
                    }
                }
                if (s2 != U2) {
                    s2 = s2.w2();
                } else {
                    return;
                }
            }
        }
    }

    public List c0() {
        return M();
    }

    public final void c1() {
        this.h0.E();
    }

    public final void c2() {
        if (this.J > 0) {
            t1();
        }
    }

    public void d(LayoutDirection layoutDirection) {
        if (this.a0 != layoutDirection) {
            this.a0 = layoutDirection;
            q1();
            for (Modifier.Node k2 = this.g0.k(); k2 != null; k2 = k2.w2()) {
                k2.j1();
            }
        }
    }

    public boolean d0() {
        return y0().i3();
    }

    public final void d1() {
        this.h0.F();
    }

    public void e(MeasurePolicy measurePolicy) {
        if (!Intrinsics.d(this.X, measurePolicy)) {
            this.X = measurePolicy;
            IntrinsicsPolicy intrinsicsPolicy = this.Y;
            if (intrinsicsPolicy != null) {
                intrinsicsPolicy.k(p0());
            }
            R0();
        }
    }

    public final long e0() {
        return this.C;
    }

    public final void e1() {
        this.h0.G();
    }

    public void f(int i2) {
        this.G = i2;
    }

    public final LayoutNodeLayoutDelegate f0() {
        return this.h0;
    }

    public final void f1() {
        this.h0.H();
    }

    public void g() {
        if (!ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder = this.P;
            if (androidViewHolder != null) {
                androidViewHolder.g();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.i0;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.g();
            }
        }
        NodeCoordinator y0 = y0();
        NodeCoordinator V2 = V().V2();
        while (!Intrinsics.d(y0, V2) && y0 != null) {
            y0.s3();
            y0 = y0.V2();
        }
        if (ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder2 = this.P;
            if (androidViewHolder2 != null) {
                androidViewHolder2.g();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.i0;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.g();
            }
        }
    }

    public final boolean g0() {
        return this.h0.n();
    }

    public final int g1(int i2) {
        return x0().b(i2);
    }

    public LayoutDirection getLayoutDirection() {
        return this.a0;
    }

    public void h(Modifier modifier) {
        if (!(!this.f17285z || s0() == Modifier.f15489d)) {
            InlineClassHelperKt.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (x()) {
            InlineClassHelperKt.a("modifier is updated when deactivated");
        }
        if (b()) {
            s(modifier);
            if (this.S) {
                U0();
                return;
            }
            return;
        }
        this.m0 = modifier;
    }

    public final LayoutState h0() {
        return this.h0.o();
    }

    public final int h1(int i2) {
        return x0().c(i2);
    }

    public void i() {
        if (!ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder = this.P;
            if (androidViewHolder != null) {
                androidViewHolder.i();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.i0;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.i();
            }
        }
        this.q0 = true;
        J1();
        if (b()) {
            if (!ComposeUiFlags.f15476d) {
                U0();
            } else {
                this.T = null;
                this.S = false;
            }
        }
        Owner owner = this.O;
        if (owner != null) {
            owner.L(this);
        }
        if (ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder2 = this.P;
            if (androidViewHolder2 != null) {
                androidViewHolder2.i();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.i0;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.i();
            }
        }
    }

    public final boolean i0() {
        return this.h0.s();
    }

    public final int i1(int i2) {
        return x0().d(i2);
    }

    public void j() {
        if (this.I != null) {
            D1(this, false, false, false, 5, (Object) null);
        } else {
            H1(this, false, false, false, 5, (Object) null);
        }
        Constraints k2 = this.h0.k();
        if (k2 != null) {
            Owner owner = this.O;
            if (owner != null) {
                owner.e(this, k2.r());
                return;
            }
            return;
        }
        Owner owner2 = this.O;
        if (owner2 != null) {
            Owner.d(owner2, false, 1, (Object) null);
        }
    }

    public final boolean j0() {
        return this.h0.u();
    }

    public final int j1(int i2) {
        return x0().e(i2);
    }

    public void k(ViewConfiguration viewConfiguration) {
        if (!Intrinsics.d(this.b0, viewConfiguration)) {
            this.b0 = viewConfiguration;
            NodeChain nodeChain = this.g0;
            int a2 = NodeKind.a(16);
            if ((nodeChain.i() & a2) != 0) {
                Modifier.Node k2 = nodeChain.k();
                while (k2 != null) {
                    if ((k2.A2() & a2) != 0) {
                        Modifier.Node node = k2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof PointerInputModifierNode) {
                                ((PointerInputModifierNode) node).e2();
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.d(node);
                                                node = null;
                                            }
                                            mutableVector.d(a3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector);
                        }
                    }
                    if ((k2.v2() & a2) != 0) {
                        k2 = k2.w2();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final LookaheadPassDelegate k0() {
        return this.h0.v();
    }

    public final int k1(int i2) {
        return x0().f(i2);
    }

    public void l(CompositionLocalMap compositionLocalMap) {
        this.c0 = compositionLocalMap;
        a((Density) compositionLocalMap.a(CompositionLocalsKt.g()));
        d((LayoutDirection) compositionLocalMap.a(CompositionLocalsKt.m()));
        k((ViewConfiguration) compositionLocalMap.a(CompositionLocalsKt.t()));
        NodeChain nodeChain = this.g0;
        int a2 = NodeKind.a(32768);
        if ((nodeChain.i() & a2) != 0) {
            Modifier.Node k2 = nodeChain.k();
            while (k2 != null) {
                if ((k2.A2() & a2) != 0) {
                    Modifier.Node node = k2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node M2 = ((CompositionLocalConsumerModifierNode) node).M();
                            if (M2.F2()) {
                                NodeKindKt.e(M2);
                            } else {
                                M2.W2(true);
                            }
                        } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                if ((a3.A2() & a2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node = a3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            mutableVector.d(node);
                                            node = null;
                                        }
                                        mutableVector.d(a3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.h(mutableVector);
                    }
                }
                if ((k2.v2() & a2) != 0) {
                    k2 = k2.w2();
                } else {
                    return;
                }
            }
        }
    }

    public final LayoutNode l0() {
        return this.I;
    }

    public final int l1(int i2) {
        return x0().g(i2);
    }

    public final LayoutNodeDrawScope m0() {
        return LayoutNodeKt.b(this).getSharedDrawScope();
    }

    public final int m1(int i2) {
        return x0().h(i2);
    }

    public final MeasurePassDelegate n0() {
        return this.h0.w();
    }

    public final int n1(int i2) {
        return x0().i(i2);
    }

    public final boolean o0() {
        return this.h0.x();
    }

    public final void o1(int i2, int i3, int i4) {
        if (i2 != i3) {
            for (int i5 = 0; i5 < i4; i5++) {
                this.K.a(i2 > i3 ? i3 + i5 : (i3 + i4) - 2, (LayoutNode) this.K.d(i2 > i3 ? i2 + i5 : i2));
            }
            r1();
            V0();
            R0();
        }
    }

    public void p() {
        if (!b()) {
            InlineClassHelperKt.a("onReuse is only expected on attached node");
        }
        if (!ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder = this.P;
            if (androidViewHolder != null) {
                androidViewHolder.p();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.i0;
            if (layoutNodeSubcompositionsState != null) {
                layoutNodeSubcompositionsState.p();
            }
        }
        this.U = false;
        if (x()) {
            this.q0 = false;
            if (!ComposeUiFlags.f15476d) {
                U0();
            }
        } else {
            J1();
        }
        int v2 = v();
        Y1(SemanticsModifierKt.b());
        Owner owner = this.O;
        if (owner != null) {
            owner.q(this, v2);
        }
        if (ComposeUiFlags.f15478f) {
            AndroidViewHolder androidViewHolder2 = this.P;
            if (androidViewHolder2 != null) {
                androidViewHolder2.p();
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.i0;
            if (layoutNodeSubcompositionsState2 != null) {
                layoutNodeSubcompositionsState2.p();
            }
        }
        this.g0.s();
        this.g0.y();
        if (ComposeUiFlags.f15476d && this.g0.p(NodeKind.a(8))) {
            U0();
        }
        I1(this);
        Owner owner2 = this.O;
        if (owner2 != null) {
            owner2.o(this, v2);
        }
    }

    public MeasurePolicy p0() {
        return this.X;
    }

    public final void p1(LayoutNode layoutNode) {
        if (layoutNode.h0.d() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.h0;
            layoutNodeLayoutDelegate.L(layoutNodeLayoutDelegate.d() - 1);
        }
        if (this.O != null) {
            layoutNode.D();
        }
        layoutNode.N = null;
        layoutNode.y0().G3((NodeCoordinator) null);
        if (layoutNode.f17285z) {
            this.J--;
            MutableVector c2 = layoutNode.K.c();
            Object[] objArr = c2.f15005z;
            int p2 = c2.p();
            for (int i2 = 0; i2 < p2; i2++) {
                ((LayoutNode) objArr[i2]).y0().G3((NodeCoordinator) null);
            }
        }
        V0();
        r1();
    }

    public final UsageByParent q0() {
        return n0().x1();
    }

    public final void q1() {
        R0();
        LayoutNode C0 = C0();
        if (C0 != null) {
            C0.P0();
        }
        Q0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.t1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.node.LayoutNode.UsageByParent r0() {
        /*
            r1 = this;
            androidx.compose.ui.node.LookaheadPassDelegate r0 = r1.k0()
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = r0.t1()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            androidx.compose.ui.node.LayoutNode$UsageByParent r0 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.r0():androidx.compose.ui.node.LayoutNode$UsageByParent");
    }

    public final void r1() {
        if (this.f17285z) {
            LayoutNode C0 = C0();
            if (C0 != null) {
                C0.r1();
                return;
            }
            return;
        }
        this.W = true;
    }

    public final void s(Modifier modifier) {
        this.l0 = modifier;
        this.g0.E(modifier);
        this.h0.Z();
        if (this.I == null && this.g0.p(NodeKind.a(512))) {
            R1(this);
        }
    }

    public Modifier s0() {
        return this.l0;
    }

    public final void s1(int i2, int i3) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator V2;
        if (this.d0 == UsageByParent.NotUsed) {
            A();
        }
        LayoutNode C0 = C0();
        if (C0 == null || (V2 = C0.V()) == null || (placementScope = V2.i1()) == null) {
            placementScope = LayoutNodeKt.b(this).getPlacementScope();
        }
        Placeable.PlacementScope.n(placementScope, n0(), i2, i3, 0.0f, 4, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011a A[LOOP:0: B:64:0x0118->B:65:0x011a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(androidx.compose.ui.node.Owner r7) {
        /*
            r6 = this;
            androidx.compose.ui.node.Owner r0 = r6.O
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            r3 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Cannot attach "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = " as it already is attached.  Tree: "
            r0.append(r4)
            java.lang.String r4 = C(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.compose.ui.internal.InlineClassHelperKt.c(r0)
        L_0x002c:
            androidx.compose.ui.node.LayoutNode r0 = r6.N
            if (r0 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0035
            androidx.compose.ui.node.Owner r0 = r0.O
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r7)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r1
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ") than the parent's owner("
            r0.append(r4)
            androidx.compose.ui.node.LayoutNode r4 = r6.C0()
            if (r4 == 0) goto L_0x005d
            androidx.compose.ui.node.Owner r4 = r4.O
            goto L_0x005e
        L_0x005d:
            r4 = r3
        L_0x005e:
            r0.append(r4)
            java.lang.String r4 = "). This tree: "
            r0.append(r4)
            java.lang.String r4 = C(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r4 = " Parent tree: "
            r0.append(r4)
            androidx.compose.ui.node.LayoutNode r4 = r6.N
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = C(r4, r1, r2, r3)
            goto L_0x007c
        L_0x007b:
            r4 = r3
        L_0x007c:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.compose.ui.internal.InlineClassHelperKt.c(r0)
        L_0x0086:
            androidx.compose.ui.node.LayoutNode r0 = r6.C0()
            if (r0 != 0) goto L_0x009c
            androidx.compose.ui.node.MeasurePassDelegate r4 = r6.n0()
            r4.B2(r2)
            androidx.compose.ui.node.LookaheadPassDelegate r4 = r6.k0()
            if (r4 == 0) goto L_0x009c
            r4.c2()
        L_0x009c:
            androidx.compose.ui.node.NodeCoordinator r4 = r6.y0()
            if (r0 == 0) goto L_0x00a7
            androidx.compose.ui.node.NodeCoordinator r5 = r0.V()
            goto L_0x00a8
        L_0x00a7:
            r5 = r3
        L_0x00a8:
            r4.G3(r5)
            r6.O = r7
            if (r0 == 0) goto L_0x00b2
            int r4 = r0.Q
            goto L_0x00b3
        L_0x00b2:
            r4 = -1
        L_0x00b3:
            int r4 = r4 + r2
            r6.Q = r4
            androidx.compose.ui.Modifier r2 = r6.m0
            if (r2 == 0) goto L_0x00bd
            r6.s(r2)
        L_0x00bd:
            r6.m0 = r3
            boolean r2 = androidx.compose.ui.ComposeUiFlags.f15476d
            r3 = 8
            if (r2 != 0) goto L_0x00d4
            androidx.compose.ui.node.NodeChain r2 = r6.g0
            int r4 = androidx.compose.ui.node.NodeKind.a(r3)
            boolean r2 = r2.p(r4)
            if (r2 == 0) goto L_0x00d4
            r6.U0()
        L_0x00d4:
            r7.I(r6)
            boolean r2 = r6.H
            if (r2 == 0) goto L_0x00df
            r6.R1(r6)
            goto L_0x0101
        L_0x00df:
            androidx.compose.ui.node.LayoutNode r2 = r6.N
            if (r2 == 0) goto L_0x00e7
            androidx.compose.ui.node.LayoutNode r2 = r2.I
            if (r2 != 0) goto L_0x00e9
        L_0x00e7:
            androidx.compose.ui.node.LayoutNode r2 = r6.I
        L_0x00e9:
            r6.R1(r2)
            androidx.compose.ui.node.LayoutNode r2 = r6.I
            if (r2 != 0) goto L_0x0101
            androidx.compose.ui.node.NodeChain r2 = r6.g0
            r4 = 512(0x200, float:7.175E-43)
            int r4 = androidx.compose.ui.node.NodeKind.a(r4)
            boolean r2 = r2.p(r4)
            if (r2 == 0) goto L_0x0101
            r6.R1(r6)
        L_0x0101:
            boolean r2 = r6.x()
            if (r2 != 0) goto L_0x010c
            androidx.compose.ui.node.NodeChain r2 = r6.g0
            r2.s()
        L_0x010c:
            androidx.compose.ui.node.MutableVectorWithMutationTracking r2 = r6.K
            androidx.compose.runtime.collection.MutableVector r2 = r2.c()
            java.lang.Object[] r4 = r2.f15005z
            int r2 = r2.p()
        L_0x0118:
            if (r1 >= r2) goto L_0x0124
            r5 = r4[r1]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            r5.t(r7)
            int r1 = r1 + 1
            goto L_0x0118
        L_0x0124:
            boolean r1 = r6.x()
            if (r1 != 0) goto L_0x012f
            androidx.compose.ui.node.NodeChain r1 = r6.g0
            r1.y()
        L_0x012f:
            r6.R0()
            if (r0 == 0) goto L_0x0137
            r0.R0()
        L_0x0137:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.y0()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.V()
            androidx.compose.ui.node.NodeCoordinator r1 = r1.V2()
        L_0x0143:
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r2 != 0) goto L_0x0153
            if (r0 == 0) goto L_0x0153
            r0.o3()
            androidx.compose.ui.node.NodeCoordinator r0 = r0.V2()
            goto L_0x0143
        L_0x0153:
            kotlin.jvm.functions.Function1 r0 = r6.n0
            if (r0 == 0) goto L_0x015a
            r0.invoke(r7)
        L_0x015a:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r0 = r6.h0
            r0.Z()
            boolean r0 = androidx.compose.ui.ComposeUiFlags.f15476d
            if (r0 == 0) goto L_0x0178
            boolean r0 = r6.x()
            if (r0 != 0) goto L_0x0178
            androidx.compose.ui.node.NodeChain r0 = r6.g0
            int r1 = androidx.compose.ui.node.NodeKind.a(r3)
            boolean r0 = r0.p(r1)
            if (r0 == 0) goto L_0x0178
            r6.U0()
        L_0x0178:
            r7.A(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.t(androidx.compose.ui.node.Owner):void");
    }

    public final boolean t0() {
        return this.p0;
    }

    public final void t1() {
        if (this.M) {
            this.M = false;
            MutableVector mutableVector = this.L;
            if (mutableVector == null) {
                mutableVector = new MutableVector(new LayoutNode[16], 0);
                this.L = mutableVector;
            }
            mutableVector.l();
            MutableVector c2 = this.K.c();
            Object[] objArr = c2.f15005z;
            int p2 = c2.p();
            for (int i2 = 0; i2 < p2; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.f17285z) {
                    mutableVector.e(mutableVector.p(), layoutNode.J0());
                } else {
                    mutableVector.d(layoutNode);
                }
            }
            this.h0.D();
        }
    }

    public String toString() {
        return JvmActuals_jvmKt.a(this, (String) null) + " children: " + M().size() + " measurePolicy: " + p0();
    }

    public boolean u() {
        return n0().u();
    }

    public final NodeChain u0() {
        return this.g0;
    }

    public final boolean u1(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.d0 == UsageByParent.NotUsed) {
            z();
        }
        return n0().w2(constraints.r());
    }

    public int v() {
        return this.f17283A;
    }

    public boolean v0() {
        return b();
    }

    public LayoutCoordinates w() {
        return V();
    }

    public final long w0() {
        return this.f17284B;
    }

    public final void w1() {
        int p2 = this.K.c().p();
        while (true) {
            p2--;
            if (-1 < p2) {
                p1((LayoutNode) this.K.c().f15005z[p2]);
            } else {
                this.K.b();
                return;
            }
        }
    }

    public boolean x() {
        return this.q0;
    }

    public final IntrinsicsPolicy x0() {
        IntrinsicsPolicy intrinsicsPolicy = this.Y;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, p0());
        this.Y = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final void x1(int i2, int i3) {
        if (!(i3 >= 0)) {
            InlineClassHelperKt.a("count (" + i3 + ") must be greater than 0");
        }
        int i4 = (i3 + i2) - 1;
        if (i2 <= i4) {
            while (true) {
                p1((LayoutNode) this.K.c().f15005z[i4]);
                LayoutNode layoutNode = (LayoutNode) this.K.d(i4);
                if (i4 != i2) {
                    i4--;
                } else {
                    return;
                }
            }
        }
    }

    public final SemanticsConfiguration y() {
        this.U = true;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = new SemanticsConfiguration();
        LayoutNodeKt.b(this).getSnapshotObserver().j(this, new LayoutNode$calculateSemanticsConfiguration$1(this, objectRef));
        this.U = false;
        return (SemanticsConfiguration) objectRef.f40908z;
    }

    public final NodeCoordinator y0() {
        return this.g0.n();
    }

    public final void y1() {
        if (this.d0 == UsageByParent.NotUsed) {
            A();
        }
        n0().x2();
    }

    public final void z() {
        this.e0 = this.d0;
        this.d0 = UsageByParent.NotUsed;
        MutableVector J0 = J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.d0 != UsageByParent.NotUsed) {
                layoutNode.z();
            }
        }
    }

    public final long z0() {
        return this.D;
    }

    public final void z1() {
        if (!this.U) {
            LayoutNodeKt.b(this).E(this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? SemanticsModifierKt.b() : i2);
    }
}
