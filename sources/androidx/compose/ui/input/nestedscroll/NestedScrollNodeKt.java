package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
public final class NestedScrollNodeKt {
    public static final TraversableNode b(TraversableNode traversableNode) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.d(traversableNode, new NestedScrollNodeKt$findNearestAttachedAncestor$1(objectRef));
        return (TraversableNode) objectRef.f40908z;
    }

    public static final DelegatableNode c(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
