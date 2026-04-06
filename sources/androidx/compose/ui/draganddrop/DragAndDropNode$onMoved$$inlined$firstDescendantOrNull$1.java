package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 extends Lambda implements Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DragAndDropNode f15666A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DragAndDropEvent f15667B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15668z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(Ref.ObjectRef objectRef, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.f15668z = objectRef;
        this.f15666A = dragAndDropNode;
        this.f15667B = dragAndDropEvent;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        DragAndDropNode dragAndDropNode = (DragAndDropNode) traversableNode;
        if (!this.f15666A.g3().K(dragAndDropNode) || !DragAndDropNodeKt.g(dragAndDropNode, DragAndDrop_androidKt.a(this.f15667B))) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.f15668z.f40908z = traversableNode;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
