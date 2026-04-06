package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

@Metadata
public final class FocusPropertiesModifierNodeKt {
    public static final void a(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        DelegatableNodeKt.p(focusPropertiesModifierNode).getFocusOwner().m(focusPropertiesModifierNode);
    }
}
