package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

@Metadata
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {
    public AnchoredDraggableState N;
    public Function2 O;
    public Orientation P;
    public boolean Q;

    public DraggableAnchorsNode(AnchoredDraggableState anchoredDraggableState, Function2 function2, Orientation orientation) {
        this.N = anchoredDraggableState;
        this.O = function2;
        this.P = orientation;
    }

    public static final Unit b3(MeasureScope measureScope, DraggableAnchorsNode draggableAnchorsNode, Placeable placeable, Placeable.PlacementScope placementScope) {
        float c2 = measureScope.w1() ? draggableAnchorsNode.N.p().c(draggableAnchorsNode.N.y()) : draggableAnchorsNode.N.C();
        Orientation orientation = draggableAnchorsNode.P;
        float f2 = orientation == Orientation.Horizontal ? c2 : 0.0f;
        if (orientation != Orientation.Vertical) {
            c2 = 0.0f;
        }
        placementScope.C(new M(placeable, f2, c2));
        return Unit.f40552a;
    }

    public static final Unit c3(Placeable placeable, float f2, float f3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, MathKt.d(f2), MathKt.d(f3), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public void J2() {
        this.Q = false;
    }

    public final void d3(Function2 function2) {
        this.O = function2;
    }

    public final void e3(Orientation orientation) {
        this.P = orientation;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        if (!measureScope.w1() || !this.Q) {
            Pair pair = (Pair) this.O.m(IntSize.b(IntSize.c((((long) c0.C0()) & 4294967295L) | (((long) c0.L0()) << 32))), Constraints.a(j2));
            this.N.M((DraggableAnchors) pair.e(), pair.f());
        }
        this.Q = measureScope.w1() || this.Q;
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new L(measureScope, this, c0), 4, (Object) null);
    }

    public final void f3(AnchoredDraggableState anchoredDraggableState) {
        this.N = anchoredDraggableState;
    }
}
