package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragAndDropNodeKt$firstDescendantOrNull$1 extends Lambda implements Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f15684A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15685z;

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
        if (!((Boolean) this.f15685z.invoke(traversableNode)).booleanValue()) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.f15684A.f40908z = traversableNode;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
