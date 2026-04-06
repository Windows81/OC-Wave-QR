package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final Companion m0 = new Companion((DefaultConstructorMarker) null);
    public static final Function1 n0 = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.f17393z;
    public static final Function1 o0 = NodeCoordinator$Companion$onCommitAffectingLayer$1.f17392z;
    public static final ReusableGraphicsLayerScope p0 = new ReusableGraphicsLayerScope();
    public static final LayerPositionalProperties q0 = new LayerPositionalProperties();
    public static final float[] r0 = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
    public static final HitTestSource s0 = new NodeCoordinator$Companion$PointerInputSource$1();
    public static final HitTestSource t0 = new NodeCoordinator$Companion$SemanticsSource$1();
    public final LayoutNode O;
    public boolean P;
    public boolean Q;
    public NodeCoordinator R;
    public NodeCoordinator S;
    public boolean T;
    public boolean U;
    public Function1 V;
    public Density W = X1().P();
    public LayoutDirection X = X1().getLayoutDirection();
    public float Y = 0.8f;
    public MeasureResult Z;
    public MutableObjectIntMap a0;
    public long b0 = IntOffset.f19160b.b();
    public float c0;
    public MutableRect d0;
    public LayerPositionalProperties e0;
    public GraphicsLayer f0;
    public Canvas g0;
    public Function2 h0;
    public final Function0 i0 = new NodeCoordinator$invalidateParentLayer$1(this);
    public boolean j0;
    public OwnedLayer k0;
    public GraphicsLayer l0;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HitTestSource a() {
            return NodeCoordinator.s0;
        }

        public final HitTestSource b() {
            return NodeCoordinator.t0;
        }

        public Companion() {
        }
    }

    @Metadata
    public interface HitTestSource {
        int a();

        void b(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2);

        boolean c(Modifier.Node node);

        boolean d(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.O = layoutNode;
    }

    public static /* synthetic */ long I2(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return nodeCoordinator.H2(j2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
    }

    public static /* synthetic */ long L3(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = true;
            }
            return nodeCoordinator.K3(j2, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
    }

    public static /* synthetic */ void Q3(NodeCoordinator nodeCoordinator, Function1 function1, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            nodeCoordinator.P3(function1, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    public static /* synthetic */ boolean S3(NodeCoordinator nodeCoordinator, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            return nodeCoordinator.R3(z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    /* access modifiers changed from: private */
    public final OwnerSnapshotObserver T2() {
        return LayoutNodeKt.b(X1()).getSnapshotObserver();
    }

    public static /* synthetic */ void z3(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            nodeCoordinator.y3(mutableRect, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    public final long A2(long j2) {
        float max = Math.max(0.0f, (Float.intBitsToFloat((int) (j2 >> 32)) - ((float) H0())) / 2.0f);
        return Size.d((((long) Float.floatToRawIntBits(Math.max(0.0f, (Float.intBitsToFloat((int) (j2 & 4294967295L)) - ((float) E0())) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(max)) << 32));
    }

    public final void A3() {
        if (this.k0 != null) {
            if (this.l0 != null) {
                this.l0 = null;
            }
            Q3(this, (Function1) null, false, 2, (Object) null);
            LayoutNode.F1(X1(), false, 1, (Object) null);
        }
    }

    public final float B2(long j2, long j3) {
        if (((float) H0()) >= Float.intBitsToFloat((int) (j3 >> 32)) && ((float) E0()) >= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long A2 = A2(j3);
        float intBitsToFloat = Float.intBitsToFloat((int) (A2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (A2 & 4294967295L));
        long j32 = j3(j2);
        if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (j32 >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (j32 & 4294967295L)) <= intBitsToFloat2) {
            return Offset.l(j32);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void B3(boolean z2) {
        this.Q = z2;
    }

    public final void C2(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.h(canvas, graphicsLayer);
            return;
        }
        float k2 = (float) IntOffset.k(j1());
        float l2 = (float) IntOffset.l(j1());
        canvas.d(k2, l2);
        E2(canvas, graphicsLayer);
        canvas.d(-k2, -l2);
    }

    public final void C3(boolean z2) {
        this.P = z2;
    }

    public final void D2(Canvas canvas, Paint paint) {
        canvas.j(0.5f, 0.5f, ((float) ((int) (F0() >> 32))) - 0.5f, ((float) ((int) (F0() & 4294967295L))) - 0.5f, paint);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0.h() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D3(androidx.compose.ui.layout.MeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.MeasureResult r0 = r3.Z
            if (r4 == r0) goto L_0x008c
            r3.Z = r4
            if (r0 == 0) goto L_0x001c
            int r1 = r4.b()
            int r2 = r0.b()
            if (r1 != r2) goto L_0x001c
            int r1 = r4.a()
            int r0 = r0.a()
            if (r1 == r0) goto L_0x0027
        L_0x001c:
            int r0 = r4.b()
            int r1 = r4.a()
            r3.p3(r0, r1)
        L_0x0027:
            androidx.collection.MutableObjectIntMap r0 = r3.a0
            if (r0 == 0) goto L_0x0034
            kotlin.jvm.internal.Intrinsics.f(r0)
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x003e
        L_0x0034:
            java.util.Map r0 = r4.q()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x008c
        L_0x003e:
            androidx.collection.MutableObjectIntMap r0 = r3.a0
            java.util.Map r1 = r4.q()
            boolean r0 = androidx.compose.ui.node.NodeCoordinatorKt.c(r0, r1)
            if (r0 != 0) goto L_0x008c
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r3.K2()
            androidx.compose.ui.node.AlignmentLines r0 = r0.q()
            r0.m()
            androidx.collection.MutableObjectIntMap r0 = r3.a0
            if (r0 != 0) goto L_0x005f
            androidx.collection.MutableObjectIntMap r0 = androidx.collection.ObjectIntMapKt.b()
            r3.a0 = r0
        L_0x005f:
            r0.j()
            java.util.Map r4 = r4.q()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x006e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.u(r2, r1)
            goto L_0x006e
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.D3(androidx.compose.ui.layout.MeasureResult):void");
    }

    public final void E2(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node Z2 = Z2(NodeKind.a(4));
        if (Z2 == null) {
            v3(canvas, graphicsLayer);
            return;
        }
        X1().m0().q(canvas, IntSizeKt.e(a()), this, Z2, graphicsLayer);
    }

    public void E3(long j2) {
        this.b0 = j2;
    }

    public abstract void F2();

    public final void F3(NodeCoordinator nodeCoordinator) {
        this.R = nodeCoordinator;
    }

    public long G(long j2) {
        return LayoutNodeKt.b(X1()).m(o0(j2));
    }

    public final NodeCoordinator G2(NodeCoordinator nodeCoordinator) {
        LayoutNode X1 = nodeCoordinator.X1();
        LayoutNode X12 = X1();
        if (X1 == X12) {
            Modifier.Node U2 = nodeCoordinator.U2();
            Modifier.Node U22 = U2();
            int a2 = NodeKind.a(2);
            if (!U22.M().F2()) {
                InlineClassHelperKt.c("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node C2 = U22.M().C2(); C2 != null; C2 = C2.C2()) {
                if ((C2.A2() & a2) != 0 && C2 == U2) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (X1.Q() > X12.Q()) {
            X1 = X1.C0();
            Intrinsics.f(X1);
        }
        while (X12.Q() > X1.Q()) {
            X12 = X12.C0();
            Intrinsics.f(X12);
        }
        while (X1 != X12) {
            X1 = X1.C0();
            X12 = X12.C0();
            if (X1 != null) {
                if (X12 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return X12 == X1() ? this : X1 == nodeCoordinator.X1() ? nodeCoordinator : X1.V();
    }

    public final void G3(NodeCoordinator nodeCoordinator) {
        this.S = nodeCoordinator;
    }

    public boolean H() {
        return x1();
    }

    public long H2(long j2, boolean z2) {
        if (z2 || !x1()) {
            j2 = IntOffsetKt.b(j2, j1());
        }
        OwnedLayer ownedLayer = this.k0;
        return ownedLayer != null ? ownedLayer.e(j2, true) : j2;
    }

    public final boolean H3() {
        Modifier.Node a3 = a3(NodeKindKt.i(NodeKind.a(16)));
        if (a3 != null && a3.F2()) {
            int a2 = NodeKind.a(16);
            if (!a3.M().F2()) {
                InlineClassHelperKt.c("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node M = a3.M();
            if ((M.v2() & a2) != 0) {
                while (M != null) {
                    if ((M.A2() & a2) != 0) {
                        Modifier.Node node = M;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) node).V1()) {
                                    return true;
                                }
                            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node a32 = ((DelegatingNode) node).a3(); a32 != null; a32 = a32.w2()) {
                                    if ((a32.A2() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = a32;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.d(node);
                                                node = null;
                                            }
                                            mutableVector.d(a32);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.h(mutableVector);
                        }
                        continue;
                    }
                    M = M.w2();
                }
            }
        }
        return false;
    }

    public long I(LayoutCoordinates layoutCoordinates, long j2, boolean z2) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) layoutCoordinates).c().l3();
            return Offset.e(layoutCoordinates.I(this, Offset.e(j2 ^ -9223372034707292160L), z2) ^ -9223372034707292160L);
        }
        NodeCoordinator J3 = J3(layoutCoordinates);
        J3.l3();
        NodeCoordinator G2 = G2(J3);
        while (J3 != G2) {
            j2 = J3.K3(j2, z2);
            J3 = J3.S;
            Intrinsics.f(J3);
        }
        return z2(G2, j2, z2);
    }

    public final void I3(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f2) {
        if (node == null) {
            e3(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        HitTestSource hitTestSource2 = hitTestSource;
        if (hitTestSource.c(node)) {
            boolean z3 = z2;
            float f3 = f2;
            hitTestResult.D(node, f3, z3, new NodeCoordinator$speculativeHit$1(this, node, hitTestSource, j2, hitTestResult, i2, z3, f3));
            return;
        }
        HitTestResult hitTestResult2 = hitTestResult;
        u3(NodeCoordinatorKt.d(node, hitTestSource.a(), NodeKind.a(2)), hitTestSource, j2, hitTestResult, i2, z2, f2, false);
    }

    public final void J2(MutableRect mutableRect, boolean z2) {
        float k2 = (float) IntOffset.k(j1());
        mutableRect.i(mutableRect.b() - k2);
        mutableRect.j(mutableRect.c() - k2);
        float l2 = (float) IntOffset.l(j1());
        mutableRect.k(mutableRect.d() - l2);
        mutableRect.h(mutableRect.a() - l2);
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.j(mutableRect, true);
            if (this.U && z2) {
                mutableRect.e(0.0f, 0.0f, (float) ((int) (a() >> 32)), (float) ((int) (a() & 4294967295L)));
                mutableRect.f();
            }
        }
    }

    public final NodeCoordinator J3(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator c2;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (c2 = lookaheadLayoutCoordinates.c()) != null) {
            return c2;
        }
        Intrinsics.g(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    public AlignmentLinesOwner K2() {
        return X1().f0().c();
    }

    public long K3(long j2, boolean z2) {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            j2 = ownedLayer.e(j2, false);
        }
        return (z2 || !x1()) ? IntOffsetKt.c(j2, j1()) : j2;
    }

    public void L1() {
        GraphicsLayer graphicsLayer = this.l0;
        if (graphicsLayer != null) {
            Q0(j1(), this.c0, graphicsLayer);
        } else {
            R0(j1(), this.c0, this.V);
        }
    }

    public final Function2 L2() {
        Function2 function2 = this.h0;
        if (function2 != null) {
            return function2;
        }
        NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(this, new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this));
        this.h0 = nodeCoordinator$drawBlock$1;
        return nodeCoordinator$drawBlock$1;
    }

    public final boolean M2() {
        return this.Q;
    }

    public final Rect M3() {
        if (!b()) {
            return Rect.f15860e.a();
        }
        LayoutCoordinates d2 = LayoutCoordinatesKt.d(this);
        MutableRect S2 = S2();
        long A2 = A2(R2());
        int i2 = (int) (A2 >> 32);
        S2.i(-Float.intBitsToFloat(i2));
        int i3 = (int) (A2 & 4294967295L);
        S2.k(-Float.intBitsToFloat(i3));
        S2.j(((float) H0()) + Float.intBitsToFloat(i2));
        S2.h(((float) E0()) + Float.intBitsToFloat(i3));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != d2) {
            nodeCoordinator.y3(S2, false, true);
            if (S2.f()) {
                return Rect.f15860e.a();
            }
            nodeCoordinator = nodeCoordinator.S;
            Intrinsics.f(nodeCoordinator);
        }
        return MutableRectKt.a(S2);
    }

    public long N(LayoutCoordinates layoutCoordinates, long j2) {
        return I(layoutCoordinates, j2, true);
    }

    public final boolean N2() {
        return this.j0;
    }

    public final void N3(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (!Intrinsics.d(nodeCoordinator, this)) {
            NodeCoordinator nodeCoordinator2 = this.S;
            Intrinsics.f(nodeCoordinator2);
            nodeCoordinator2.N3(nodeCoordinator, fArr);
            if (!IntOffset.j(j1(), IntOffset.f19160b.b())) {
                float[] fArr2 = r0;
                Matrix.h(fArr2);
                Matrix.p(fArr2, -((float) IntOffset.k(j1())), -((float) IntOffset.l(j1())), 0.0f, 4, (Object) null);
                Matrix.m(fArr, fArr2);
            }
            OwnedLayer ownedLayer = this.k0;
            if (ownedLayer != null) {
                ownedLayer.i(fArr);
            }
        }
    }

    public final long O2() {
        return J0();
    }

    public final void O3(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!Intrinsics.d(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.k0;
            if (ownedLayer != null) {
                ownedLayer.a(fArr);
            }
            long j1 = nodeCoordinator2.j1();
            if (!IntOffset.j(j1, IntOffset.f19160b.b())) {
                float[] fArr2 = r0;
                Matrix.h(fArr2);
                Matrix.p(fArr2, (float) IntOffset.k(j1), (float) IntOffset.l(j1), 0.0f, 4, (Object) null);
                Matrix.m(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.S;
            Intrinsics.f(nodeCoordinator2);
        }
    }

    public final LayoutCoordinates P() {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l3();
        return this.S;
    }

    public final OwnedLayer P2() {
        return this.k0;
    }

    public final void P3(Function1 function1, boolean z2) {
        Owner B0;
        if (!(function1 == null || this.l0 == null)) {
            InlineClassHelperKt.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode X1 = X1();
        boolean z3 = z2 || this.V != function1 || !Intrinsics.d(this.W, X1.P()) || this.X != X1.getLayoutDirection();
        this.W = X1.P();
        this.X = X1.getLayoutDirection();
        if (!X1.b() || function1 == null) {
            this.V = null;
            OwnedLayer ownedLayer = this.k0;
            if (ownedLayer != null) {
                ownedLayer.b();
                X1.N1(true);
                this.i0.invoke();
                if (b() && X1.u() && (B0 = X1.B0()) != null) {
                    B0.s(X1);
                }
            }
            this.k0 = null;
            this.j0 = false;
            return;
        }
        this.V = function1;
        if (this.k0 == null) {
            OwnedLayer v2 = Owner.v(LayoutNodeKt.b(X1), L2(), this.i0, (GraphicsLayer) null, X1.S(), 4, (Object) null);
            v2.g(F0());
            v2.k(j1());
            this.k0 = v2;
            S3(this, false, 1, (Object) null);
            X1.N1(true);
            this.i0.invoke();
        } else if (z3 && S3(this, false, 1, (Object) null)) {
            LayoutNodeKt.b(X1).getRectManager().k(X1);
        }
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        if (this.P) {
            LookaheadDelegate Q2 = Q2();
            Intrinsics.f(Q2);
            w3(Q2.j1(), f2, (Function1) null, graphicsLayer);
            return;
        }
        w3(j2, f2, (Function1) null, graphicsLayer);
    }

    public abstract LookaheadDelegate Q2();

    public void R0(long j2, float f2, Function1 function1) {
        if (this.P) {
            LookaheadDelegate Q2 = Q2();
            Intrinsics.f(Q2);
            w3(Q2.j1(), f2, function1, (GraphicsLayer) null);
            return;
        }
        w3(j2, f2, function1, (GraphicsLayer) null);
    }

    public final long R2() {
        return this.W.V(X1().F0().e());
    }

    public final boolean R3(boolean z2) {
        Owner B0;
        if (this.l0 != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            Function1 function1 = this.V;
            if (function1 != null) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = p0;
                reusableGraphicsLayerScope.M();
                reusableGraphicsLayerScope.N(X1().P());
                reusableGraphicsLayerScope.P(X1().getLayoutDirection());
                reusableGraphicsLayerScope.U(IntSizeKt.e(a()));
                T2().i(this, n0, new NodeCoordinator$updateLayerParameters$1(function1));
                LayerPositionalProperties layerPositionalProperties = this.e0;
                if (layerPositionalProperties == null) {
                    layerPositionalProperties = new LayerPositionalProperties();
                    this.e0 = layerPositionalProperties;
                }
                LayerPositionalProperties layerPositionalProperties2 = q0;
                layerPositionalProperties2.b(layerPositionalProperties);
                layerPositionalProperties.a(reusableGraphicsLayerScope);
                ownedLayer.d(reusableGraphicsLayerScope);
                boolean z3 = this.U;
                this.U = reusableGraphicsLayerScope.q();
                this.Y = reusableGraphicsLayerScope.b();
                boolean c2 = layerPositionalProperties2.c(layerPositionalProperties);
                boolean z4 = !c2;
                if (z2 && ((!c2 || z3 != this.U) && (B0 = X1().B0()) != null)) {
                    B0.s(X1());
                }
                return z4;
            }
            InlineClassHelperKt.d("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        if (!(this.V == null)) {
            InlineClassHelperKt.c("null layer with a non-null layerBlock");
        }
        return false;
    }

    public final MutableRect S2() {
        MutableRect mutableRect = this.d0;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.d0 = mutableRect2;
        return mutableRect2;
    }

    public final boolean T3(long j2) {
        if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & -9223372034707292160L) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.k0;
        return ownedLayer == null || !this.U || ownedLayer.c(j2);
    }

    public abstract Modifier.Node U2();

    public final NodeCoordinator V2() {
        return this.R;
    }

    public void W(float[] fArr) {
        Owner b2 = LayoutNodeKt.b(X1());
        NodeCoordinator J3 = J3(LayoutCoordinatesKt.d(this));
        O3(J3, fArr);
        if (b2 instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) b2).B(fArr);
            return;
        }
        long h2 = LayoutCoordinatesKt.h(J3);
        if ((9223372034707292159L & h2) != 9205357640488583168L) {
            Matrix.o(fArr, Float.intBitsToFloat((int) (h2 >> 32)), Float.intBitsToFloat((int) (h2 & 4294967295L)), 0.0f);
        }
    }

    public final NodeCoordinator W2() {
        return this.S;
    }

    public Rect X(LayoutCoordinates layoutCoordinates, boolean z2) {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!layoutCoordinates.b()) {
            InlineClassHelperKt.c("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator J3 = J3(layoutCoordinates);
        J3.l3();
        NodeCoordinator G2 = G2(J3);
        MutableRect S2 = S2();
        S2.i(0.0f);
        S2.k(0.0f);
        S2.j((float) ((int) (layoutCoordinates.a() >> 32)));
        S2.h((float) ((int) (layoutCoordinates.a() & 4294967295L)));
        while (J3 != G2) {
            z3(J3, S2, z2, false, 4, (Object) null);
            if (S2.f()) {
                return Rect.f15860e.a();
            }
            J3 = J3.S;
            Intrinsics.f(J3);
        }
        y2(G2, S2, z2);
        return MutableRectKt.a(S2);
    }

    public LayoutNode X1() {
        return this.O;
    }

    public final float X2() {
        return this.c0;
    }

    public final boolean Y2(int i2) {
        Modifier.Node a3 = a3(NodeKindKt.i(i2));
        return a3 != null && DelegatableNodeKt.f(a3, i2);
    }

    public final Modifier.Node Z2(int i2) {
        boolean i3 = NodeKindKt.i(i2);
        Modifier.Node U2 = U2();
        if (!i3 && (U2 = U2.C2()) == null) {
            return null;
        }
        Modifier.Node s2 = a3(i3);
        while (s2 != null && (s2.v2() & i2) != 0) {
            if ((s2.A2() & i2) != 0) {
                return s2;
            }
            if (s2 == U2) {
                return null;
            }
            s2 = s2.w2();
        }
        return null;
    }

    public final long a() {
        return F0();
    }

    public final Modifier.Node a3(boolean z2) {
        Modifier.Node U2;
        if (X1().y0() == this) {
            return X1().u0().k();
        }
        if (z2) {
            NodeCoordinator nodeCoordinator = this.S;
            if (!(nodeCoordinator == null || (U2 = nodeCoordinator.U2()) == null)) {
                return U2.w2();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.S;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.U2();
            }
        }
        return null;
    }

    public boolean b() {
        return U2().F2();
    }

    public final void b3(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        HitTestResult hitTestResult2 = hitTestResult;
        if (node == null) {
            e3(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        int h2 = hitTestResult.f17255B;
        hitTestResult.C(hitTestResult.f17255B + 1, hitTestResult.size());
        hitTestResult.f17255B = hitTestResult.f17255B + 1;
        hitTestResult.f17256z.n(node);
        boolean z3 = z2;
        hitTestResult.f17254A.d(HitTestResultKt.a(-1.0f, z3, false));
        b3(NodeCoordinatorKt.d(node, hitTestSource.a(), NodeKind.a(2)), hitTestSource, j2, hitTestResult, i2, z3);
        hitTestResult.f17255B = h2;
    }

    public final void c3(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f2) {
        HitTestResult hitTestResult2 = hitTestResult;
        if (node == null) {
            e3(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        int h2 = hitTestResult.f17255B;
        hitTestResult2.C(hitTestResult.f17255B + 1, hitTestResult.size());
        hitTestResult2.f17255B = hitTestResult.f17255B + 1;
        hitTestResult.f17256z.n(node);
        boolean z3 = z2;
        float f3 = f2;
        hitTestResult.f17254A.d(HitTestResultKt.a(f3, z3, false));
        u3(NodeCoordinatorKt.d(node, hitTestSource.a(), NodeKind.a(2)), hitTestSource, j2, hitTestResult, i2, z3, f3, true);
        hitTestResult2.f17255B = h2;
    }

    public long d0(long j2) {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates d2 = LayoutCoordinatesKt.d(this);
        return N(d2, Offset.p(LayoutNodeKt.b(X1()).p(j2), LayoutCoordinatesKt.f(d2)));
    }

    public LookaheadCapablePlaceable d1() {
        return this.R;
    }

    public final void d3(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        boolean z3;
        long j3 = j2;
        HitTestResult hitTestResult2 = hitTestResult;
        int i3 = i2;
        Modifier.Node Z2 = Z2(hitTestSource.a());
        if (!T3(j3)) {
            if (PointerType.h(i3, PointerType.f16933b.d())) {
                float B2 = B2(j3, R2());
                if ((Float.floatToRawIntBits(B2) & Integer.MAX_VALUE) < 2139095040 && hitTestResult2.z(B2, false)) {
                    c3(Z2, hitTestSource, j2, hitTestResult, i2, false, B2);
                }
            }
        } else if (Z2 == null) {
            e3(hitTestSource, j2, hitTestResult, i2, z2);
        } else if (h3(j3)) {
            b3(Z2, hitTestSource, j2, hitTestResult, i2, z2);
        } else {
            float B22 = !PointerType.h(i3, PointerType.f16933b.d()) ? Float.POSITIVE_INFINITY : B2(j3, R2());
            if ((Float.floatToRawIntBits(B22) & Integer.MAX_VALUE) >= 2139095040) {
                boolean z4 = z2;
            } else if (hitTestResult2.z(B22, z2)) {
                z3 = true;
                u3(Z2, hitTestSource, j2, hitTestResult, i2, z2, B22, z3);
            }
            z3 = false;
            u3(Z2, hitTestSource, j2, hitTestResult, i2, z2, B22, z3);
        }
    }

    public void e0(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator J3 = J3(layoutCoordinates);
        J3.l3();
        NodeCoordinator G2 = G2(J3);
        Matrix.h(fArr);
        J3.O3(G2, fArr);
        N3(G2, fArr);
    }

    public LayoutCoordinates e1() {
        return this;
    }

    public void e3(HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        NodeCoordinator nodeCoordinator = this.R;
        if (nodeCoordinator != null) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator;
            nodeCoordinator2.d3(hitTestSource, I2(nodeCoordinator2, j2, false, 2, (Object) null), hitTestResult, i2, z2);
        }
    }

    public long f(long j2) {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return LayoutNodeKt.b(X1()).f(o0(j2));
    }

    public boolean f1() {
        return this.Z != null;
    }

    public void f3() {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.S;
        if (nodeCoordinator != null) {
            nodeCoordinator.f3();
        }
    }

    public final LayoutCoordinates g0() {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l3();
        return X1().y0().S;
    }

    public MeasureResult g1() {
        MeasureResult measureResult = this.Z;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final boolean g3(Modifier.Node node, long j2, int i2) {
        if (node == null) {
            return false;
        }
        PointerType.Companion companion = PointerType.f16933b;
        if (!PointerType.h(i2, companion.c()) && !PointerType.h(i2, companion.a())) {
            return false;
        }
        int a2 = NodeKind.a(16);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof PointerInputModifierNode) {
                long n02 = ((PointerInputModifierNode) node).n0();
                int i3 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i3) < ((float) (-TouchBoundsExpansion.b(n02, getLayoutDirection()))) || Float.intBitsToFloat(i3) >= ((float) (H0() + TouchBoundsExpansion.c(n02, getLayoutDirection())))) {
                    return false;
                }
                int i4 = (int) (j2 & 4294967295L);
                return Float.intBitsToFloat(i4) >= ((float) (-TouchBoundsExpansion.i(n02))) && Float.intBitsToFloat(i4) < ((float) (E0() + TouchBoundsExpansion.f(n02)));
            }
            if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                int i5 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i5++;
                        if (i5 == 1) {
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
                if (i5 == 1) {
                }
            }
            node = DelegatableNodeKt.h(mutableVector);
        }
        return false;
    }

    public float getDensity() {
        return X1().P().getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return X1().getLayoutDirection();
    }

    public LookaheadCapablePlaceable h1() {
        return this.S;
    }

    public final boolean h3(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < ((float) H0()) && intBitsToFloat2 < ((float) E0());
    }

    public final boolean i3() {
        if (this.k0 != null && this.Y <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.S;
        if (nodeCoordinator != null) {
            return nodeCoordinator.i3();
        }
        return false;
    }

    public long j1() {
        return this.b0;
    }

    public final long j3(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float max = Math.max(0.0f, intBitsToFloat < 0.0f ? -intBitsToFloat : intBitsToFloat - ((float) H0()));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Offset.e((((long) Float.floatToRawIntBits(Math.max(0.0f, intBitsToFloat2 < 0.0f ? -intBitsToFloat2 : intBitsToFloat2 - ((float) E0())))) & 4294967295L) | (((long) Float.floatToRawIntBits(max)) << 32));
    }

    public final void k3() {
        if (this.k0 == null && this.V != null) {
            OwnedLayer v2 = Owner.v(LayoutNodeKt.b(X1()), L2(), this.i0, this.l0, false, 8, (Object) null);
            v2.g(F0());
            v2.k(j1());
            v2.invalidate();
            this.k0 = v2;
        }
    }

    public final void l3() {
        X1().f0().I();
    }

    public final void m3() {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.b();
        }
        this.k0 = null;
    }

    public void n3() {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public long o0(long j2) {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        l3();
        long j3 = j2;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.S) {
            j3 = L3(nodeCoordinator, j3, false, 2, (Object) null);
        }
        return j3;
    }

    public final void o3() {
        P3(this.V, true);
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public void p3(int i2, int i3) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            ownedLayer.g(IntSize.c((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        } else if (X1().u() && (nodeCoordinator = this.S) != null) {
            nodeCoordinator.f3();
        }
        S0(IntSize.c((((long) i3) & 4294967295L) | (((long) i2) << 32)));
        if (this.V != null) {
            R3(false);
        }
        int a2 = NodeKind.a(4);
        boolean i4 = NodeKindKt.i(a2);
        Modifier.Node U2 = U2();
        if (i4 || (U2 = U2.C2()) != null) {
            Modifier.Node s2 = a3(i4);
            while (s2 != null && (s2.v2() & a2) != 0) {
                if ((s2.A2() & a2) != 0) {
                    Modifier.Node node = s2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof DrawModifierNode) {
                            ((DrawModifierNode) node).e1();
                        } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                            int i5 = 0;
                            for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                                if ((a3.A2() & a2) != 0) {
                                    i5++;
                                    if (i5 == 1) {
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
                            if (i5 == 1) {
                            }
                        }
                        node = DelegatableNodeKt.h(mutableVector);
                    }
                }
                if (s2 == U2) {
                    break;
                }
                s2 = s2.w2();
            }
        }
        Owner B0 = X1().B0();
        if (B0 != null) {
            B0.s(X1());
        }
    }

    public final void q3() {
        Modifier.Node node;
        if (Y2(NodeKind.a(128))) {
            Snapshot.Companion companion = Snapshot.f15255e;
            Snapshot d2 = companion.d();
            Function1 g2 = d2 != null ? d2.g() : null;
            Snapshot f2 = companion.f(d2);
            try {
                int a2 = NodeKind.a(128);
                boolean i2 = NodeKindKt.i(a2);
                if (i2) {
                    node = U2();
                } else {
                    node = U2().C2();
                    if (node == null) {
                        Unit unit = Unit.f40552a;
                        companion.m(d2, f2, g2);
                    }
                }
                Modifier.Node s2 = a3(i2);
                while (s2 != null && (s2.v2() & a2) != 0) {
                    if ((s2.A2() & a2) != 0) {
                        MutableVector mutableVector = null;
                        Modifier.Node node2 = s2;
                        while (node2 != null) {
                            if (node2 instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) node2).q(F0());
                            } else if ((node2.A2() & a2) != 0 && (node2 instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node a3 = ((DelegatingNode) node2).a3(); a3 != null; a3 = a3.w2()) {
                                    if ((a3.A2() & a2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node2 = a3;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.d(node2);
                                                node2 = null;
                                            }
                                            mutableVector.d(a3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.h(mutableVector);
                        }
                    }
                    if (s2 == node) {
                        break;
                    }
                    s2 = s2.w2();
                }
                Unit unit2 = Unit.f40552a;
                companion.m(d2, f2, g2);
            } catch (Throwable th) {
                companion.m(d2, f2, g2);
                throw th;
            }
        }
    }

    public final void r3() {
        int a2 = NodeKind.a(128);
        boolean i2 = NodeKindKt.i(a2);
        Modifier.Node U2 = U2();
        if (i2 || (U2 = U2.C2()) != null) {
            Modifier.Node s2 = a3(i2);
            while (s2 != null && (s2.v2() & a2) != 0) {
                if ((s2.A2() & a2) != 0) {
                    Modifier.Node node = s2;
                    MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof LayoutAwareModifierNode) {
                            ((LayoutAwareModifierNode) node).u(this);
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

    public final void s3() {
        this.T = true;
        this.i0.invoke();
        A3();
    }

    public Object t() {
        if (!X1().u0().p(NodeKind.a(64))) {
            return null;
        }
        U2();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node o2 = X1().u0().o(); o2 != null; o2 = o2.C2()) {
            if ((NodeKind.a(64) & o2.A2()) != 0) {
                int a2 = NodeKind.a(64);
                MutableVector mutableVector = null;
                Modifier.Node node = o2;
                while (node != null) {
                    if (node instanceof ParentDataModifierNode) {
                        objectRef.f40908z = ((ParentDataModifierNode) node).F(X1().P(), objectRef.f40908z);
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
        }
        return objectRef.f40908z;
    }

    public final void t3() {
        if (Y2(NodeKind.a(1048576))) {
            int a2 = NodeKind.a(1048576);
            boolean i2 = NodeKindKt.i(a2);
            Modifier.Node U2 = U2();
            if (i2 || (U2 = U2.C2()) != null) {
                Modifier.Node s2 = a3(i2);
                while (s2 != null && (s2.v2() & a2) != 0) {
                    if ((s2.A2() & a2) != 0) {
                        Modifier.Node node = s2;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof OnUnplacedModifierNode) {
                                ((OnUnplacedModifierNode) node).t2();
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
    }

    public float u1() {
        return X1().P().u1();
    }

    public final void u3(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f2, boolean z3) {
        if (node == null) {
            e3(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        if (g3(node, j2, i2)) {
            hitTestResult.v(node, z2, new NodeCoordinator$outOfBoundsHit$1(this, node, hitTestSource, j2, hitTestResult, i2, z2, f2, z3));
            return;
        }
        HitTestResult hitTestResult2 = hitTestResult;
        boolean z4 = z2;
        if (z3) {
            c3(node, hitTestSource, j2, hitTestResult, i2, z2, f2);
        } else {
            I3(node, hitTestSource, j2, hitTestResult, i2, z2, f2);
        }
    }

    public boolean v0() {
        return this.k0 != null && !this.T && X1().b();
    }

    public void v3(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.R;
        if (nodeCoordinator != null) {
            nodeCoordinator.C2(canvas, graphicsLayer);
        }
    }

    public long w(long j2) {
        if (!b()) {
            InlineClassHelperKt.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return N(LayoutCoordinatesKt.d(this), LayoutNodeKt.b(X1()).w(j2));
    }

    public final void w3(long j2, float f2, Function1 function1, GraphicsLayer graphicsLayer) {
        long j3 = j2;
        Function1 function12 = function1;
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        if (graphicsLayer2 != null) {
            if (!(function12 == null)) {
                InlineClassHelperKt.a("both ways to create layers shouldn't be used together");
            }
            if (this.l0 != graphicsLayer2) {
                this.l0 = null;
                Q3(this, (Function1) null, false, 2, (Object) null);
                this.l0 = graphicsLayer2;
            }
            if (this.k0 == null) {
                OwnedLayer v2 = Owner.v(LayoutNodeKt.b(X1()), L2(), this.i0, graphicsLayer, false, 8, (Object) null);
                v2.g(F0());
                v2.k(j2);
                this.k0 = v2;
                X1().N1(true);
                this.i0.invoke();
            }
        } else {
            if (this.l0 != null) {
                this.l0 = null;
                Q3(this, (Function1) null, false, 2, (Object) null);
            }
            Q3(this, function1, false, 2, (Object) null);
        }
        if (!IntOffset.j(j1(), j2)) {
            E3(j2);
            X1().f0().w().h2();
            OwnedLayer ownedLayer = this.k0;
            if (ownedLayer != null) {
                ownedLayer.k(j2);
            } else {
                NodeCoordinator nodeCoordinator = this.S;
                if (nodeCoordinator != null) {
                    nodeCoordinator.f3();
                }
            }
            t1(this);
            Owner B0 = X1().B0();
            if (B0 != null) {
                B0.s(X1());
            }
        }
        this.c0 = f2;
        if (!C1()) {
            Z0(g1());
        }
    }

    public final void x3(long j2, float f2, Function1 function1, GraphicsLayer graphicsLayer) {
        w3(IntOffset.o(j2, A0()), f2, function1, graphicsLayer);
    }

    public final void y2(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2) {
        if (nodeCoordinator != this) {
            NodeCoordinator nodeCoordinator2 = this.S;
            if (nodeCoordinator2 != null) {
                nodeCoordinator2.y2(nodeCoordinator, mutableRect, z2);
            }
            J2(mutableRect, z2);
        }
    }

    public final void y3(MutableRect mutableRect, boolean z2, boolean z3) {
        OwnedLayer ownedLayer = this.k0;
        if (ownedLayer != null) {
            if (this.U) {
                if (z3) {
                    long R2 = R2();
                    float intBitsToFloat = Float.intBitsToFloat((int) (R2 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (R2 & 4294967295L)) / 2.0f;
                    mutableRect.e(-intBitsToFloat, -intBitsToFloat2, ((float) ((int) (a() >> 32))) + intBitsToFloat, ((float) ((int) (4294967295L & a()))) + intBitsToFloat2);
                } else if (z2) {
                    mutableRect.e(0.0f, 0.0f, (float) ((int) (a() >> 32)), (float) ((int) (4294967295L & a())));
                }
                if (mutableRect.f()) {
                    return;
                }
            }
            ownedLayer.j(mutableRect, false);
        }
        float k2 = (float) IntOffset.k(j1());
        mutableRect.i(mutableRect.b() + k2);
        mutableRect.j(mutableRect.c() + k2);
        float l2 = (float) IntOffset.l(j1());
        mutableRect.k(mutableRect.d() + l2);
        mutableRect.h(mutableRect.a() + l2);
    }

    public final long z2(NodeCoordinator nodeCoordinator, long j2, boolean z2) {
        if (nodeCoordinator == this) {
            return j2;
        }
        NodeCoordinator nodeCoordinator2 = this.S;
        return (nodeCoordinator2 == null || Intrinsics.d(nodeCoordinator, nodeCoordinator2)) ? H2(j2, z2) : H2(nodeCoordinator2.z2(nodeCoordinator, j2, z2), z2);
    }
}
