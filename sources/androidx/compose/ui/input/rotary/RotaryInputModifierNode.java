package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface RotaryInputModifierNode extends DelegatableNode {
    boolean Q0(RotaryScrollEvent rotaryScrollEvent);

    boolean R0(RotaryScrollEvent rotaryScrollEvent);
}
