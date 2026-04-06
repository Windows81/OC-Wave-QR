package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata
public final class LayoutModifierNodeKt {
    public static final void a(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.j(layoutModifierNode, NodeKind.a(2)).f3();
    }

    public static final void b(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.o(layoutModifierNode).R0();
    }

    public static final void c(LayoutModifierNode layoutModifierNode) {
        LayoutNode.F1(DelegatableNodeKt.o(layoutModifierNode), false, 1, (Object) null);
    }

    public static final void d(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.o(layoutModifierNode).j();
    }
}
