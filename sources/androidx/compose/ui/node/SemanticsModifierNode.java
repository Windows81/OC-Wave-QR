package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata
public interface SemanticsModifierNode extends DelegatableNode {
    void W(SemanticsPropertyReceiver semanticsPropertyReceiver);

    boolean Z0() {
        return false;
    }

    boolean i2() {
        return false;
    }
}
