package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DragAndDropTargetNode extends DelegatingNode {
    public Function1 P;
    public DragAndDropTarget Q;
    public DragAndDropTargetModifierNode R;

    public DragAndDropTargetNode(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        this.P = function1;
        this.Q = dragAndDropTarget;
    }

    public void I2() {
        g3();
    }

    public void J2() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.R;
        Intrinsics.f(dragAndDropTargetModifierNode);
        c3(dragAndDropTargetModifierNode);
    }

    public final void g3() {
        this.R = (DragAndDropTargetModifierNode) Z2(DragAndDropNodeKt.c(new DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(this), this.Q));
    }

    public final void h3(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        this.P = function1;
        if (!Intrinsics.d(dragAndDropTarget, this.Q)) {
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.R;
            if (dragAndDropTargetModifierNode != null) {
                c3(dragAndDropTargetModifierNode);
            }
            this.Q = dragAndDropTarget;
            g3();
        }
    }
}
