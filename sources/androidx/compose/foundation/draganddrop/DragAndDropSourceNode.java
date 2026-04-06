package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DragAndDropSourceNode extends DelegatingNode implements LayoutAwareModifierNode {
    public Function1 P;
    public Function2 Q;
    public Function1 R;
    public long S = IntSize.f19170b.a();
    public final DragAndDropSourceModifierNode T = ((DragAndDropSourceModifierNode) Z2(DragAndDropNodeKt.b(new DragAndDropSourceNode$dragAndDropModifierNode$1(this))));
    public PointerInputModifierNode U;

    public DragAndDropSourceNode(Function1 function1, Function2 function2, Function1 function12) {
        this.P = function1;
        this.Q = function2;
        this.R = function12;
    }

    public void I2() {
        if (this.T.H()) {
            this.U = (PointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new DragAndDropSourceNode$onAttach$1(this)));
        }
    }

    public void J2() {
        PointerInputModifierNode pointerInputModifierNode = this.U;
        if (pointerInputModifierNode != null) {
            c3(pointerInputModifierNode);
        }
    }

    public final Function2 h3() {
        return this.Q;
    }

    public final Function1 i3() {
        return this.P;
    }

    public final Function1 j3() {
        return this.R;
    }

    public final void k3(Function2 function2) {
        this.Q = function2;
    }

    public final void l3(Function1 function1) {
        this.P = function1;
    }

    public final void m3(Function1 function1) {
        this.R = function1;
    }

    public void q(long j2) {
        this.S = j2;
        this.T.q(j2);
    }

    public void u(LayoutCoordinates layoutCoordinates) {
        this.T.u(layoutCoordinates);
    }
}
