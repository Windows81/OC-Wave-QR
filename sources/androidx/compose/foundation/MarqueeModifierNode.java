package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    public int N;
    public int O;
    public int P;
    public float Q;
    public final MutableIntState R;
    public final MutableIntState S;
    public final MutableState T;
    public Job U;
    public GraphicsLayer V;
    public final MutableState W;
    public final MutableState X;
    public final Animatable Y;
    public final State Z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3116a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f3116a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ MarqueeModifierNode(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, i5, marqueeSpacing, f2);
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.a0(i2);
    }

    public void I2() {
        GraphicsLayer graphicsLayer = this.V;
        GraphicsContext l2 = DelegatableNodeKt.l(this);
        if (graphicsLayer != null) {
            l2.a(graphicsLayer);
        }
        this.V = l2.b();
        q3();
    }

    public void J2() {
        Job job = this.U;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.U = null;
        GraphicsLayer graphicsLayer = this.V;
        if (graphicsLayer != null) {
            DelegatableNodeKt.l(this).a(graphicsLayer);
            this.V = null;
        }
    }

    public void U(ContentDrawScope contentDrawScope) {
        float floatValue = ((Number) this.Y.m()).floatValue() * n3();
        boolean z2 = n3() != 1.0f ? ((Number) this.Y.m()).floatValue() < ((float) l3()) : ((Number) this.Y.m()).floatValue() < ((float) m3());
        boolean z3 = n3() != 1.0f ? ((Number) this.Y.m()).floatValue() > ((float) p3()) : ((Number) this.Y.m()).floatValue() > ((float) ((m3() + p3()) - l3()));
        float m3 = (float) (n3() == 1.0f ? m3() + p3() : (-m3()) - p3());
        float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.c() & 4294967295L));
        GraphicsLayer graphicsLayer = this.V;
        if (graphicsLayer != null) {
            contentDrawScope.l1(graphicsLayer, IntSize.c((((long) m3()) << 32) | (((long) MathKt.d(intBitsToFloat)) & 4294967295L)), new MarqueeModifierNode$draw$1$1(contentDrawScope));
        }
        float l3 = floatValue + ((float) l3());
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & contentDrawScope.c()));
        int b2 = ClipOp.f15971b.b();
        DrawContext G1 = contentDrawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().b(floatValue, 0.0f, l3, intBitsToFloat2, b2);
            GraphicsLayer graphicsLayer2 = this.V;
            if (graphicsLayer2 != null) {
                if (z2) {
                    GraphicsLayerKt.a(contentDrawScope, graphicsLayer2);
                }
                if (z3) {
                    contentDrawScope.G1().e().d(m3, 0.0f);
                    GraphicsLayerKt.a(contentDrawScope, graphicsLayer2);
                    contentDrawScope.G1().e().d(-m3, -0.0f);
                }
            } else {
                if (z2) {
                    contentDrawScope.q2();
                }
                if (z3) {
                    contentDrawScope.G1().e().d(m3, 0.0f);
                    contentDrawScope.q2();
                    contentDrawScope.G1().e().d(-m3, -0.0f);
                }
            }
            G1.j().t();
            G1.f(c2);
        } catch (Throwable th) {
            G1.j().t();
            G1.f(c2);
            throw th;
        }
    }

    public void X(FocusState focusState) {
        v3(focusState.d());
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.q0(Integer.MAX_VALUE);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(Constraints.d(j2, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        t3(ConstraintsKt.g(j2, c0.L0()));
        u3(c0.L0());
        return MeasureScope.R1(measureScope, l3(), c0.C0(), (Map) null, new MarqueeModifierNode$measure$1(c0, this), 4, (Object) null);
    }

    public final int k3() {
        return ((MarqueeAnimationMode) this.X.getValue()).h();
    }

    public final int l3() {
        return this.S.e();
    }

    public final int m3() {
        return this.R.e();
    }

    public final float n3() {
        float signum = Math.signum(this.Q);
        int i2 = WhenMappings.f3116a[DelegatableNodeKt.n(this).ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = -1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return signum * ((float) i3);
    }

    public final boolean o3() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    public final int p3() {
        return ((Number) this.Z.getValue()).intValue();
    }

    public final void q3() {
        Job job = this.U;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        if (F2()) {
            this.U = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new MarqueeModifierNode$restartAnimation$1(job, this, (Continuation) null), 3, (Object) null);
        }
    }

    public final Object r3(Continuation continuation) {
        if (this.N <= 0) {
            return Unit.f40552a;
        }
        Object g2 = BuildersKt.g(FixedMotionDurationScale.f3068z, new MarqueeModifierNode$runAnimation$2(this, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final void s3(int i2) {
        this.X.setValue(MarqueeAnimationMode.b(i2));
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.C(Integer.MAX_VALUE);
    }

    public final void t3(int i2) {
        this.S.k(i2);
    }

    public final void u3(int i2) {
        this.R.k(i2);
    }

    public final void v3(boolean z2) {
        this.T.setValue(Boolean.valueOf(z2));
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return 0;
    }

    public final void w3(MarqueeSpacing marqueeSpacing) {
        this.W.setValue(marqueeSpacing);
    }

    public final void x3(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        w3(marqueeSpacing);
        s3(i3);
        if (this.N != i2 || this.O != i4 || this.P != i5 || !Dp.o(this.Q, f2)) {
            this.N = i2;
            this.O = i4;
            this.P = i5;
            this.Q = f2;
            q3();
        }
    }

    public MarqueeModifierNode(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        this.N = i2;
        this.O = i4;
        this.P = i5;
        this.Q = f2;
        this.R = SnapshotIntStateKt.a(0);
        this.S = SnapshotIntStateKt.a(0);
        this.T = SnapshotStateKt__SnapshotStateKt.e(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.W = SnapshotStateKt__SnapshotStateKt.e(marqueeSpacing, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.X = SnapshotStateKt__SnapshotStateKt.e(MarqueeAnimationMode.b(i3), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.Y = AnimatableKt.b(0.0f, 0.0f, 2, (Object) null);
        this.Z = SnapshotStateKt.e(new MarqueeModifierNode$spacingPx$2(marqueeSpacing, this));
    }
}
