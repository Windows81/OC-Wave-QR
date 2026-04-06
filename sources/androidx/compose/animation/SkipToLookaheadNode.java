package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public final MutableState N;
    public final MutableState O;
    public Constraints P;
    public long Q = AnimationModifierKt.a();

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        this.N = SnapshotStateKt__SnapshotStateKt.e(scaleToBoundsImpl, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.O = SnapshotStateKt__SnapshotStateKt.e(function0, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return (intrinsicMeasureScope.w1() || !AnimationModifierKt.b(this.Q)) ? intrinsicMeasurable.a0(i2) : (int) (this.Q >> 32);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return (intrinsicMeasureScope.w1() || !AnimationModifierKt.b(this.Q)) ? intrinsicMeasurable.q0(i2) : (int) (this.Q & 4294967295L);
    }

    public final ScaleToBoundsImpl a3() {
        return (ScaleToBoundsImpl) this.N.getValue();
    }

    public final Function0 b3() {
        return (Function0) this.O.getValue();
    }

    public final void c3(Function0 function0) {
        this.O.setValue(function0);
    }

    public final void d3(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.N.setValue(scaleToBoundsImpl);
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        if (measureScope.w1()) {
            this.P = Constraints.a(j2);
        }
        Constraints constraints = this.P;
        Intrinsics.f(constraints);
        Placeable c0 = measurable.c0(constraints.r());
        long c2 = IntSize.c((((long) c0.L0()) << 32) | (((long) c0.C0()) & 4294967295L));
        this.Q = c2;
        long d2 = ConstraintsKt.d(j2, c2);
        return MeasureScope.R1(measureScope, (int) (d2 >> 32), (int) (d2 & 4294967295L), (Map) null, new SkipToLookaheadNode$measure$1(this, c0, d2, measureScope), 4, (Object) null);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return (intrinsicMeasureScope.w1() || !AnimationModifierKt.b(this.Q)) ? intrinsicMeasurable.C(i2) : (int) (this.Q & 4294967295L);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return (intrinsicMeasureScope.w1() || !AnimationModifierKt.b(this.Q)) ? intrinsicMeasurable.Z(i2) : (int) (this.Q >> 32);
    }
}
