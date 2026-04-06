package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {
    public Function3 N;
    public Function1 O;
    public Function2 P;

    public ApproachLayoutModifierNodeImpl(Function3 function3, Function1 function1, Function2 function2) {
        this.N = function3;
        this.O = function1;
        this.P = function2;
    }

    public final void Z2(Function3 function3) {
        this.N = function3;
    }

    public final void a3(Function1 function1) {
        this.O = function1;
    }

    public final void b3(Function2 function2) {
        this.P = function2;
    }

    public boolean g0(long j2) {
        return ((Boolean) this.O.invoke(IntSize.b(j2))).booleanValue();
    }

    public MeasureResult n2(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return (MeasureResult) this.N.d(approachMeasureScope, measurable, Constraints.a(j2));
    }

    public boolean s2(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return ((Boolean) this.P.m(placementScope, layoutCoordinates)).booleanValue();
    }
}
