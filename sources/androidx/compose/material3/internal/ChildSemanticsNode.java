package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChildSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    public Function1 N;

    public ChildSemanticsNode(Function1 function1) {
        this.N = function1;
    }

    public static final boolean b3(SemanticsPropertyReceiver semanticsPropertyReceiver, TraversableNode traversableNode) {
        Intrinsics.g(traversableNode, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((ParentSemanticsNode) traversableNode).Z2(semanticsPropertyReceiver);
        return false;
    }

    public static final boolean c3(TraversableNode traversableNode) {
        Intrinsics.g(traversableNode, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((ParentSemanticsNode) traversableNode).a3();
        return false;
    }

    public void J2() {
        super.J2();
        TraversableNodeKt.c(this, ParentSemanticsNodeKey.f12313a, new J());
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TraversableNodeKt.c(this, ParentSemanticsNodeKey.f12313a, new I(semanticsPropertyReceiver));
        this.N.invoke(semanticsPropertyReceiver);
    }

    public final void d3(Function1 function1) {
        this.N = function1;
    }
}
