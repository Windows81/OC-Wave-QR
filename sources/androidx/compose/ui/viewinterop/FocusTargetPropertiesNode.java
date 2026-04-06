package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import kotlin.Metadata;

@Metadata
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    public void E0(FocusProperties focusProperties) {
        focusProperties.B(M().F2() && FocusGroupNode_androidKt.g(this).hasFocusable());
    }
}
