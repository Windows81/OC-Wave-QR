package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DragAndDropNodeKt {
    public static final DragAndDropModifierNode a() {
        return new DragAndDropNode((Function2) null, (Function1) null, 2, (DefaultConstructorMarker) null);
    }

    public static final DragAndDropSourceModifierNode b(Function2 function2) {
        return new DragAndDropNode(function2, (Function1) null, 2, (DefaultConstructorMarker) null);
    }

    public static final DragAndDropTargetModifierNode c(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode((Function2) null, new DragAndDropNodeKt$DragAndDropTargetModifierNode$1(function1, dragAndDropTarget), 1, (DefaultConstructorMarker) null);
    }

    public static final boolean g(DragAndDropNode dragAndDropNode, long j2) {
        if (!dragAndDropNode.M().F2()) {
            return false;
        }
        LayoutCoordinates w2 = DelegatableNodeKt.o(dragAndDropNode).w();
        if (!w2.b()) {
            return false;
        }
        long f2 = LayoutCoordinatesKt.f(w2);
        float intBitsToFloat = Float.intBitsToFloat((int) (f2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f2 & 4294967295L));
        float h3 = ((float) ((int) (dragAndDropNode.h3() >> 32))) + intBitsToFloat;
        float h32 = ((float) ((int) (dragAndDropNode.h3() & 4294967295L))) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > h3) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= h32;
    }

    public static final void h(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.M1(dragAndDropEvent);
        dragAndDropTarget.h0(dragAndDropEvent);
    }

    public static final void i(TraversableNode traversableNode, Function1 function1) {
        if (function1.invoke(traversableNode) == TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            TraversableNodeKt.f(traversableNode, function1);
        }
    }
}
