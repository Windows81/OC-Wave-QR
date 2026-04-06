package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final Companion w0 = new Companion((DefaultConstructorMarker) null);
    public static final Paint x0;
    public final TailModifierNode u0 = new TailModifierNode();
    public LookaheadDelegate v0;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        public int C(int i2) {
            return X1().i1(i2);
        }

        public int X0(AlignmentLine alignmentLine) {
            Integer num = (Integer) e2().F().get(alignmentLine);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            h2().u(alignmentLine, intValue);
            return intValue;
        }

        public int Z(int i2) {
            return X1().n1(i2);
        }

        public int a0(int i2) {
            return X1().j1(i2);
        }

        public Placeable c0(long j2) {
            T0(j2);
            MutableVector J0 = X1().J0();
            Object[] objArr = J0.f15005z;
            int p2 = J0.p();
            for (int i2 = 0; i2 < p2; i2++) {
                LookaheadPassDelegate k0 = ((LayoutNode) objArr[i2]).k0();
                Intrinsics.f(k0);
                k0.y2(LayoutNode.UsageByParent.NotUsed);
            }
            y2(X1().p0().b(this, X1().K(), j2));
            return this;
        }

        public int q0(int i2) {
            return X1().m1(i2);
        }

        public void t2() {
            LookaheadPassDelegate k0 = X1().k0();
            Intrinsics.f(k0);
            k0.h2();
        }
    }

    static {
        Paint a2 = AndroidPaint_androidKt.a();
        a2.I(Color.f15975b.d());
        a2.K(1.0f);
        a2.H(PaintingStyle.f16061b.b());
        x0 = a2;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        U2().Y2(this);
        this.v0 = layoutNode.l0() != null ? new LookaheadDelegateImpl() : null;
    }

    public int C(int i2) {
        return X1().g1(i2);
    }

    public void F2() {
        if (Q2() == null) {
            W3(new LookaheadDelegateImpl());
        }
    }

    public void Q0(long j2, float f2, GraphicsLayer graphicsLayer) {
        super.Q0(j2, f2, graphicsLayer);
        V3();
    }

    public LookaheadDelegate Q2() {
        return this.v0;
    }

    public void R0(long j2, float f2, Function1 function1) {
        super.R0(j2, f2, function1);
        V3();
    }

    /* renamed from: U3 */
    public TailModifierNode U2() {
        return this.u0;
    }

    public final void V3() {
        if (!F1()) {
            X1().n0().s2();
        }
    }

    public void W3(LookaheadDelegate lookaheadDelegate) {
        this.v0 = lookaheadDelegate;
    }

    public int X0(AlignmentLine alignmentLine) {
        LookaheadDelegate Q2 = Q2();
        if (Q2 != null) {
            return Q2.X0(alignmentLine);
        }
        Integer num = (Integer) K2().F().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public int Z(int i2) {
        return X1().l1(i2);
    }

    public int a0(int i2) {
        return X1().h1(i2);
    }

    public Placeable c0(long j2) {
        if (M2()) {
            LookaheadDelegate Q2 = Q2();
            Intrinsics.f(Q2);
            j2 = Q2.i2();
        }
        T0(j2);
        MutableVector J0 = X1().J0();
        Object[] objArr = J0.f15005z;
        int p2 = J0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            ((LayoutNode) objArr[i2]).n0().A2(LayoutNode.UsageByParent.NotUsed);
        }
        D3(X1().p0().b(this, X1().L(), j2));
        q3();
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e3(androidx.compose.ui.node.NodeCoordinator.HitTestSource r18, long r19, androidx.compose.ui.node.HitTestResult r21, int r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r19
            androidx.compose.ui.node.LayoutNode r1 = r17.X1()
            r10 = r18
            boolean r1 = r10.d(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0042
            boolean r1 = r0.T3(r8)
            if (r1 == 0) goto L_0x001e
            r11 = r22
            r12 = r23
        L_0x001c:
            r3 = r2
            goto L_0x0046
        L_0x001e:
            androidx.compose.ui.input.pointer.PointerType$Companion r1 = androidx.compose.ui.input.pointer.PointerType.f16933b
            int r1 = r1.d()
            r11 = r22
            boolean r1 = androidx.compose.ui.input.pointer.PointerType.h(r11, r1)
            if (r1 == 0) goto L_0x0044
            long r4 = r17.R2()
            float r1 = r0.B2(r8, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L_0x0044
            r12 = r3
            goto L_0x001c
        L_0x0042:
            r11 = r22
        L_0x0044:
            r12 = r23
        L_0x0046:
            if (r3 == 0) goto L_0x0096
            int r13 = r21.f17255B
            androidx.compose.ui.node.LayoutNode r1 = r17.X1()
            androidx.compose.runtime.collection.MutableVector r1 = r1.I0()
            java.lang.Object[] r14 = r1.f15005z
            int r1 = r1.p()
            int r1 = r1 - r2
            r15 = r1
        L_0x005c:
            if (r15 < 0) goto L_0x008d
            r1 = r14[r15]
            r16 = r1
            androidx.compose.ui.node.LayoutNode r16 = (androidx.compose.ui.node.LayoutNode) r16
            boolean r1 = r16.u()
            if (r1 == 0) goto L_0x0090
            r1 = r18
            r2 = r16
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r12
            r1.b(r2, r3, r5, r6, r7)
            boolean r1 = r21.u()
            if (r1 != 0) goto L_0x007f
            goto L_0x0090
        L_0x007f:
            androidx.compose.ui.node.NodeCoordinator r1 = r16.y0()
            boolean r1 = r1.H3()
            if (r1 == 0) goto L_0x008d
            r21.e()
            goto L_0x0090
        L_0x008d:
            r1 = r21
            goto L_0x0093
        L_0x0090:
            int r15 = r15 + -1
            goto L_0x005c
        L_0x0093:
            r1.f17255B = r13
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerNodeCoordinator.e3(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, int, boolean):void");
    }

    public int q0(int i2) {
        return X1().k1(i2);
    }

    public void v3(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner b2 = LayoutNodeKt.b(X1());
        MutableVector I0 = X1().I0();
        Object[] objArr = I0.f15005z;
        int p2 = I0.p();
        for (int i2 = 0; i2 < p2; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.u()) {
                layoutNode.F(canvas, graphicsLayer);
            }
        }
        if (b2.getShowLayoutBounds()) {
            D2(canvas, x0);
        }
    }
}
