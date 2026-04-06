package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface KeyInputModifierNode extends DelegatableNode {
    boolean L0(KeyEvent keyEvent);

    boolean e0(KeyEvent keyEvent);
}
