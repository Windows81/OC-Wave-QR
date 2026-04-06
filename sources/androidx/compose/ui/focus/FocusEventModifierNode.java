package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface FocusEventModifierNode extends DelegatableNode {
    void X(FocusState focusState);
}
