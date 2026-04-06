package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
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
final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public State O;
    public State P;

    public ParentSizeNode(float f2, State state, State state2) {
        this.N = f2;
        this.O = state;
        this.P = state2;
    }

    public final void Z2(float f2) {
        this.N = f2;
    }

    public final void a3(State state) {
        this.P = state;
    }

    public final void b3(State state) {
        this.O = state;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        State state = this.O;
        int round = (state == null || ((Number) state.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state.getValue()).floatValue() * this.N);
        State state2 = this.P;
        int round2 = (state2 == null || ((Number) state2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) state2.getValue()).floatValue() * this.N);
        int n2 = round != Integer.MAX_VALUE ? round : Constraints.n(j2);
        int m2 = round2 != Integer.MAX_VALUE ? round2 : Constraints.m(j2);
        if (round == Integer.MAX_VALUE) {
            round = Constraints.l(j2);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = Constraints.k(j2);
        }
        Placeable c0 = measurable.c0(ConstraintsKt.a(n2, round, m2, round2));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new ParentSizeNode$measure$1(c0), 4, (Object) null);
    }
}
