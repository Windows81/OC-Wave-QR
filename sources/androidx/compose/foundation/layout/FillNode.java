package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    public Direction N;
    public float O;

    public FillNode(Direction direction, float f2) {
        this.N = direction;
        this.O = f2;
    }

    public final void Z2(Direction direction) {
        this.N = direction;
    }

    public final void a3(float f2) {
        this.O = f2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!Constraints.h(j2) || this.N == Direction.Vertical) {
            i2 = Constraints.n(j2);
            i3 = Constraints.l(j2);
        } else {
            int round = Math.round(((float) Constraints.l(j2)) * this.O);
            int n2 = Constraints.n(j2);
            i2 = Constraints.l(j2);
            if (round < n2) {
                round = n2;
            }
            if (round <= i2) {
                i2 = round;
            }
            i3 = i2;
        }
        if (!Constraints.g(j2) || this.N == Direction.Horizontal) {
            int m2 = Constraints.m(j2);
            i4 = Constraints.k(j2);
            i5 = m2;
        } else {
            int round2 = Math.round(((float) Constraints.k(j2)) * this.O);
            int m3 = Constraints.m(j2);
            i5 = Constraints.k(j2);
            if (round2 < m3) {
                round2 = m3;
            }
            if (round2 <= i5) {
                i5 = round2;
            }
            i4 = i5;
        }
        Placeable c0 = measurable.c0(ConstraintsKt.a(i2, i3, i5, i4));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new FillNode$measure$1(c0), 4, (Object) null);
    }
}
