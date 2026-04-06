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
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Metadata
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {
    public Direction N;
    public boolean O;
    public Function2 P;

    public WrapContentNode(Direction direction, boolean z2, Function2 function2) {
        this.N = direction;
        this.O = z2;
        this.P = function2;
    }

    public final Function2 Z2() {
        return this.P;
    }

    public final void a3(Function2 function2) {
        this.P = function2;
    }

    public final void b3(Direction direction) {
        this.N = direction;
    }

    public final void c3(boolean z2) {
        this.O = z2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Direction direction = this.N;
        Direction direction2 = Direction.Vertical;
        int i2 = 0;
        int n2 = direction != direction2 ? 0 : Constraints.n(j2);
        Direction direction3 = this.N;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i2 = Constraints.m(j2);
        }
        int i3 = Integer.MAX_VALUE;
        int l2 = (this.N == direction2 || !this.O) ? Constraints.l(j2) : Integer.MAX_VALUE;
        if (this.N == direction4 || !this.O) {
            i3 = Constraints.k(j2);
        }
        Placeable c0 = measurable.c0(ConstraintsKt.a(n2, l2, i2, i3));
        int o2 = RangesKt.o(c0.L0(), Constraints.n(j2), Constraints.l(j2));
        int o3 = RangesKt.o(c0.C0(), Constraints.m(j2), Constraints.k(j2));
        return MeasureScope.R1(measureScope, o2, o3, (Map) null, new WrapContentNode$measure$1(this, o2, c0, o3, measureScope), 4, (Object) null);
    }
}
