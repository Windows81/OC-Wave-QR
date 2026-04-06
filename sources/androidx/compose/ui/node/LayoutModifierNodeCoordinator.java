package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final Companion y0 = new Companion((DefaultConstructorMarker) null);
    public static final Paint z0;
    public LayoutModifierNode u0;
    public Constraints v0;
    public LookaheadDelegate w0;
    public ApproachMeasureScopeImpl x0;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        public int C(int i2) {
            LayoutModifierNode V3 = LayoutModifierNodeCoordinator.this.V3();
            LookaheadDelegate Q2 = LayoutModifierNodeCoordinator.this.X3().Q2();
            Intrinsics.f(Q2);
            return V3.t(this, Q2, i2);
        }

        public int X0(AlignmentLine alignmentLine) {
            int a2 = LayoutModifierNodeCoordinatorKt.b(this, alignmentLine);
            h2().u(alignmentLine, a2);
            return a2;
        }

        public int Z(int i2) {
            LayoutModifierNode V3 = LayoutModifierNodeCoordinator.this.V3();
            LookaheadDelegate Q2 = LayoutModifierNodeCoordinator.this.X3().Q2();
            Intrinsics.f(Q2);
            return V3.w(this, Q2, i2);
        }

        public int a0(int i2) {
            LayoutModifierNode V3 = LayoutModifierNodeCoordinator.this.V3();
            LookaheadDelegate Q2 = LayoutModifierNodeCoordinator.this.X3().Q2();
            Intrinsics.f(Q2);
            return V3.I(this, Q2, i2);
        }

        public Placeable c0(long j2) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            T0(j2);
            layoutModifierNodeCoordinator.a4(Constraints.a(j2));
            LayoutModifierNode V3 = layoutModifierNodeCoordinator.V3();
            LookaheadDelegate Q2 = layoutModifierNodeCoordinator.X3().Q2();
            Intrinsics.f(Q2);
            y2(V3.f(this, Q2, j2));
            return this;
        }

        public int q0(int i2) {
            LayoutModifierNode V3 = LayoutModifierNodeCoordinator.this.V3();
            LookaheadDelegate Q2 = LayoutModifierNodeCoordinator.this.X3().Q2();
            Intrinsics.f(Q2);
            return V3.Z(this, Q2, i2);
        }
    }

    static {
        Paint a2 = AndroidPaint_androidKt.a();
        a2.I(Color.f15975b.b());
        a2.K(1.0f);
        a2.H(PaintingStyle.f16061b.b());
        z0 = a2;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.u0 = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.w0 = layoutNode.l0() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        if ((layoutModifierNode.M().A2() & NodeKind.a(512)) != 0) {
            Intrinsics.g(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.x0 = approachMeasureScopeImpl;
    }

    private final void Y3() {
        boolean z2;
        if (!F1()) {
            r3();
            ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
            if (approachMeasureScopeImpl != null) {
                ApproachLayoutModifierNode C = approachMeasureScopeImpl.C();
                Placeable.PlacementScope i1 = i1();
                LookaheadDelegate Q2 = Q2();
                Intrinsics.f(Q2);
                if (!C.s2(i1, Q2.r2()) && !approachMeasureScopeImpl.w()) {
                    long a2 = a();
                    LookaheadDelegate Q22 = Q2();
                    IntSize intSize = null;
                    if (IntSize.d(a2, Q22 != null ? IntSize.b(Q22.s2()) : null)) {
                        long a3 = X3().a();
                        LookaheadDelegate Q23 = X3().Q2();
                        if (Q23 != null) {
                            intSize = IntSize.b(Q23.s2());
                        }
                        if (IntSize.d(a3, intSize)) {
                            z2 = true;
                            X3().C3(z2);
                        }
                    }
                }
                z2 = false;
                X3().C3(z2);
            }
            g1().r();
            X3().C3(false);
        }
    }

    public int C(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.C().J0(approachMeasureScopeImpl, X3(), i2) : this.u0.t(this, X3(), i2);
    }

    public void F2() {
        if (Q2() == null) {
            b4(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.Q0(j2, f2, graphicsLayer);
        Y3();
    }

    public LookaheadDelegate Q2() {
        return this.w0;
    }

    public void R0(long j2, float f2, Function1 function1) {
        super.R0(j2, f2, function1);
        Y3();
    }

    public Modifier.Node U2() {
        return this.u0.M();
    }

    public final LayoutModifierNode V3() {
        return this.u0;
    }

    public final Constraints W3() {
        return this.v0;
    }

    public int X0(AlignmentLine alignmentLine) {
        LookaheadDelegate Q2 = Q2();
        return Q2 != null ? Q2.g2(alignmentLine) : LayoutModifierNodeCoordinatorKt.b(this, alignmentLine);
    }

    public final NodeCoordinator X3() {
        NodeCoordinator V2 = V2();
        Intrinsics.f(V2);
        return V2;
    }

    public int Z(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.C().d2(approachMeasureScopeImpl, X3(), i2) : this.u0.w(this, X3(), i2);
    }

    public final void Z3(LayoutModifierNode layoutModifierNode) {
        if (!Intrinsics.d(layoutModifierNode, this.u0)) {
            Modifier.Node M = layoutModifierNode.M();
            if ((M.A2() & NodeKind.a(512)) != 0) {
                Intrinsics.g(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.H(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.x0 = approachMeasureScopeImpl;
            } else {
                this.x0 = null;
            }
        }
        this.u0 = layoutModifierNode;
    }

    public int a0(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.C().F0(approachMeasureScopeImpl, X3(), i2) : this.u0.I(this, X3(), i2);
    }

    public final void a4(Constraints constraints) {
        this.v0 = constraints;
    }

    public void b4(LookaheadDelegate lookaheadDelegate) {
        this.w0 = lookaheadDelegate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r8 == r1.C0()) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.layout.Placeable c0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.M2()
            if (r0 == 0) goto L_0x0017
            androidx.compose.ui.unit.Constraints r7 = r6.v0
            if (r7 == 0) goto L_0x000f
            long r7 = r7.r()
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L_0x0017:
            r6.T0(r7)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = r6.x0
            if (r0 == 0) goto L_0x00b2
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.C()
            long r2 = r0.b0()
            boolean r2 = r1.g0(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003d
            androidx.compose.ui.unit.Constraints r2 = r6.W3()
            boolean r2 = androidx.compose.ui.unit.Constraints.e(r7, r2)
            if (r2 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r4
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            r0.G(r2)
            boolean r2 = r0.w()
            if (r2 != 0) goto L_0x004e
            androidx.compose.ui.node.NodeCoordinator r2 = r6.X3()
            r2.B3(r3)
        L_0x004e:
            androidx.compose.ui.node.NodeCoordinator r2 = r6.X3()
            androidx.compose.ui.layout.MeasureResult r7 = r1.n2(r0, r2, r7)
            androidx.compose.ui.node.NodeCoordinator r8 = r6.X3()
            r8.B3(r4)
            int r8 = r7.b()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.Q2()
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r1 = r1.L0()
            if (r8 != r1) goto L_0x0080
            int r8 = r7.a()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.Q2()
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r1 = r1.C0()
            if (r8 != r1) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            boolean r8 = r0.w()
            if (r8 != 0) goto L_0x00be
            androidx.compose.ui.node.NodeCoordinator r8 = r6.X3()
            long r0 = r8.a()
            androidx.compose.ui.node.NodeCoordinator r8 = r6.X3()
            androidx.compose.ui.node.LookaheadDelegate r8 = r8.Q2()
            if (r8 == 0) goto L_0x00a2
            long r4 = r8.s2()
            androidx.compose.ui.unit.IntSize r8 = androidx.compose.ui.unit.IntSize.b(r4)
            goto L_0x00a3
        L_0x00a2:
            r8 = 0
        L_0x00a3:
            boolean r8 = androidx.compose.ui.unit.IntSize.d(r0, r8)
            if (r8 == 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r8 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r8.<init>(r7, r6)
            r7 = r8
            goto L_0x00be
        L_0x00b2:
            androidx.compose.ui.node.LayoutModifierNode r0 = r6.V3()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.X3()
            androidx.compose.ui.layout.MeasureResult r7 = r0.f(r6, r1, r7)
        L_0x00be:
            r6.D3(r7)
            r6.q3()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutModifierNodeCoordinator.c0(long):androidx.compose.ui.layout.Placeable");
    }

    public int q0(int i2) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.x0;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.C().g1(approachMeasureScopeImpl, X3(), i2) : this.u0.Z(this, X3(), i2);
    }

    public void v3(Canvas canvas, GraphicsLayer graphicsLayer) {
        X3().C2(canvas, graphicsLayer);
        if (LayoutNodeKt.b(X1()).getShowLayoutBounds()) {
            D2(canvas, z0);
        }
    }
}
