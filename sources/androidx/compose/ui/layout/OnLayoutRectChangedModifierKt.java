package androidx.compose.ui.layout;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class OnLayoutRectChangedModifierKt {
    public static final DelegatableNode.RegistrationHandle a(DelegatableNode delegatableNode, long j2, long j3, Function1 function1) {
        LayoutNode o2 = DelegatableNodeKt.o(delegatableNode);
        return LayoutNodeKt.b(o2).getRectManager().p(o2.v(), j2, j3, delegatableNode, function1);
    }
}
