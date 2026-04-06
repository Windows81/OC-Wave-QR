package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface SoftKeyboardInterceptionModifierNode extends DelegatableNode {
    boolean p0(KeyEvent keyEvent);

    boolean x1(KeyEvent keyEvent);
}
