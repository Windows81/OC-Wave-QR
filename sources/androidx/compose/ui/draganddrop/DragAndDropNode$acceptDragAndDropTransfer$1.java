package androidx.compose.ui.draganddrop;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragAndDropNode$acceptDragAndDropTransfer$1 extends Lambda implements Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DragAndDropNode f15670A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f15671B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f15672z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$acceptDragAndDropTransfer$1(DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode, Ref.BooleanRef booleanRef) {
        super(1);
        this.f15672z = dragAndDropEvent;
        this.f15670A = dragAndDropNode;
        this.f15671B = booleanRef;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        if (!dragAndDropNode.F2()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        boolean z2 = false;
        if (!(dragAndDropNode.R == null)) {
            InlineClassHelperKt.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        Function1 b3 = dragAndDropNode.O;
        dragAndDropNode.R = b3 != null ? (DragAndDropTarget) b3.invoke(this.f15672z) : null;
        boolean z3 = dragAndDropNode.R != null;
        if (z3) {
            this.f15670A.g3().J(dragAndDropNode);
        }
        Ref.BooleanRef booleanRef = this.f15671B;
        if (booleanRef.f40901z || z3) {
            z2 = true;
        }
        booleanRef.f40901z = z2;
        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
