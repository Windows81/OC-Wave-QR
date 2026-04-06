package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

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

    public void J2() {
        this.Q = false;
    }

    public final Orientation Z2() {
        return this.P;
    }

    public final AnchoredDraggableState a3() {
        return this.N;
    }

    public final void b3(Function2 function2) {
        this.O = function2;
    }

    public final void c3(Orientation orientation) {
        this.P = orientation;
    }

    public final void d3(AnchoredDraggableState anchoredDraggableState) {
        this.N = anchoredDraggableState;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        if (!measureScope.w1() || !this.Q) {
            Pair pair = (Pair) this.O.m(IntSize.b(IntSizeKt.a(c0.L0(), c0.C0())), Constraints.a(j2));
            this.N.I((DraggableAnchors) pair.e(), pair.f());
        }
        this.Q = measureScope.w1() || this.Q;
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new DraggableAnchorsNode$measure$1(measureScope, this, c0), 4, (Object) null);
    }
}
