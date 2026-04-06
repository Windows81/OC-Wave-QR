package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SelectableNode extends ClickableNode {
    public boolean i0;

    public /* synthetic */ SelectableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, mutableInteractionSource, indicationNodeFactory, z3, role, function0);
    }

    public final void F3(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function0 function0) {
        if (this.i0 != z2) {
            this.i0 = z2;
            SemanticsModifierNodeKt.b(this);
        }
        super.E3(mutableInteractionSource, indicationNodeFactory, z3, (String) null, role, function0);
    }

    public void m3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.t0(semanticsPropertyReceiver, this.i0);
    }

    public SelectableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function0 function0) {
        super(mutableInteractionSource, indicationNodeFactory, z3, (String) null, role, function0, (DefaultConstructorMarker) null);
        this.i0 = z2;
    }
}
