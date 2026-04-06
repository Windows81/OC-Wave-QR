package androidx.compose.foundation.layout;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public float O;

    public /* synthetic */ UnspecifiedConstraintsNode(float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3);
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int a0 = intrinsicMeasurable.a0(i2);
        int P1 = !Float.isNaN(this.N) ? intrinsicMeasureScope.P1(this.N) : 0;
        return a0 < P1 ? P1 : a0;
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int q0 = intrinsicMeasurable.q0(i2);
        int P1 = !Float.isNaN(this.O) ? intrinsicMeasureScope.P1(this.O) : 0;
        return q0 < P1 ? P1 : q0;
    }

    public final void Z2(float f2) {
        this.O = f2;
    }

    public final void a3(float f2) {
        this.N = f2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.N) || Constraints.n(j2) != 0) {
            i2 = Constraints.n(j2);
        } else {
            int P1 = measureScope.P1(this.N);
            i2 = Constraints.l(j2);
            if (P1 < 0) {
                P1 = 0;
            }
            if (P1 <= i2) {
                i2 = P1;
            }
        }
        int l2 = Constraints.l(j2);
        if (Float.isNaN(this.O) || Constraints.m(j2) != 0) {
            i3 = Constraints.m(j2);
        } else {
            int P12 = measureScope.P1(this.O);
            i3 = Constraints.k(j2);
            if (P12 >= 0) {
                i4 = P12;
            }
            if (i4 <= i3) {
                i3 = i4;
            }
        }
        Placeable c0 = measurable.c0(ConstraintsKt.a(i2, l2, i3, Constraints.k(j2)));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new UnspecifiedConstraintsNode$measure$1(c0), 4, (Object) null);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int C = intrinsicMeasurable.C(i2);
        int P1 = !Float.isNaN(this.O) ? intrinsicMeasureScope.P1(this.O) : 0;
        return C < P1 ? P1 : C;
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        int Z = intrinsicMeasurable.Z(i2);
        int P1 = !Float.isNaN(this.N) ? intrinsicMeasureScope.P1(this.N) : 0;
        return Z < P1 ? P1 : Z;
    }

    public UnspecifiedConstraintsNode(float f2, float f3) {
        this.N = f2;
        this.O = f3;
    }
}
