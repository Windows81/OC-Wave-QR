package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata
public final class PointerInputModifierNodeKt {
    public static final LayoutCoordinates a(PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.j(pointerInputModifierNode, NodeKind.a(16));
    }
}
