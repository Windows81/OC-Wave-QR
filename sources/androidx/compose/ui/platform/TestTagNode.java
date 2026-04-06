package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata
final class TestTagNode extends Modifier.Node implements SemanticsModifierNode {
    public String N;

    public TestTagNode(String str) {
        this.N = str;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.y0(semanticsPropertyReceiver, this.N);
    }

    public final void Z2(String str) {
        this.N = str;
    }
}
