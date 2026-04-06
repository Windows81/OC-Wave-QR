package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    public FocusPropertiesScope N;

    public FocusPropertiesNode(FocusPropertiesScope focusPropertiesScope) {
        this.N = focusPropertiesScope;
    }

    public void E0(FocusProperties focusProperties) {
        this.N.a(focusProperties);
    }

    public final void Z2(FocusPropertiesScope focusPropertiesScope) {
        this.N = focusPropertiesScope;
    }
}
