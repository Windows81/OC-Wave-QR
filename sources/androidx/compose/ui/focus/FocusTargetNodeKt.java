package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;

@Metadata
public final class FocusTargetNodeKt {
    public static final FocusTransactionManager a(FocusTargetNode focusTargetNode) {
        LayoutNode X1;
        Owner B0;
        FocusOwner focusOwner;
        NodeCoordinator x2 = focusTargetNode.M().x2();
        if (x2 == null || (X1 = x2.X1()) == null || (B0 = X1.B0()) == null || (focusOwner = B0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.l();
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.p(focusTargetNode).getFocusOwner().b(focusTargetNode);
    }

    public static final FocusTransactionManager c(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.p(focusTargetNode).getFocusOwner().l();
    }
}
