package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        Z2(FocusTargetModifierNodeKt.b(Focusability.f15833b.b(), (Function2) null, 2, (Object) null));
    }
}
