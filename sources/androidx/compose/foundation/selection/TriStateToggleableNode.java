package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class TriStateToggleableNode extends ClickableNode {
    public ToggleableState i0;

    public /* synthetic */ TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z2, role, function0);
    }

    public final void F3(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0) {
        if (this.i0 != toggleableState) {
            this.i0 = toggleableState;
            SemanticsModifierNodeKt.b(this);
        }
        super.E3(mutableInteractionSource, indicationNodeFactory, z2, (String) null, role, function0);
    }

    public void m3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.G0(semanticsPropertyReceiver, this.i0);
    }

    public TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, Function0 function0) {
        super(mutableInteractionSource, indicationNodeFactory, z2, (String) null, role, function0, (DefaultConstructorMarker) null);
        this.i0 = toggleableState;
    }
}
