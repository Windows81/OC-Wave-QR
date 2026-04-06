package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragAndDropNode$onEnded$1 extends Lambda implements Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f15676z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onEnded$1(DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.f15676z = dragAndDropEvent;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        if (!dragAndDropNode.M().F2()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        DragAndDropTarget d3 = dragAndDropNode.R;
        if (d3 != null) {
            d3.r2(this.f15676z);
        }
        dragAndDropNode.R = null;
        dragAndDropNode.Q = null;
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
