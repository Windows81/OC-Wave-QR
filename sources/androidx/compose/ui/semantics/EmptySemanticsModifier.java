package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;

@Metadata
public final class EmptySemanticsModifier extends Modifier.Node implements SemanticsModifierNode {
    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
