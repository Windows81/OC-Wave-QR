package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public FocusRequester N;
    public PinnableContainer.PinnedHandle O;
    public final Function1 P = new FocusRestorerNode$onExit$1(this);
    public final Function1 Q = new FocusRestorerNode$onEnter$1(this);

    public FocusRestorerNode(FocusRequester focusRequester) {
        this.N = focusRequester;
    }

    public void E0(FocusProperties focusProperties) {
        focusProperties.C(this.Q);
        focusProperties.z(this.P);
    }

    public void J2() {
        PinnableContainer.PinnedHandle pinnedHandle = this.O;
        if (pinnedHandle != null) {
            pinnedHandle.g();
        }
        this.O = null;
        super.J2();
    }

    public final FocusRequester b3() {
        return this.N;
    }

    public final void c3(FocusRequester focusRequester) {
        this.N = focusRequester;
    }
}
