package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class ToggleableNode extends ClickableNode {
    public boolean i0;
    public Function1 j0;
    public final Function0 k0;

    public /* synthetic */ ToggleableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, mutableInteractionSource, indicationNodeFactory, z3, role, function1);
    }

    public final void H3(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1) {
        if (this.i0 != z2) {
            this.i0 = z2;
            SemanticsModifierNodeKt.b(this);
        }
        this.j0 = function1;
        super.E3(mutableInteractionSource, indicationNodeFactory, z3, (String) null, role, this.k0);
    }

    public void m3(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.G0(semanticsPropertyReceiver, ToggleableStateKt.a(this.i0));
    }

    public ToggleableNode(final boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, final Function1 function1) {
        super(mutableInteractionSource, indicationNodeFactory, z3, (String) null, role, new Function0<Unit>() {
            public final void invoke() {
                function1.invoke(Boolean.valueOf(!z2));
            }
        }, (DefaultConstructorMarker) null);
        this.i0 = z2;
        this.j0 = function1;
        this.k0 = new ToggleableNode$_onClick$1(this);
    }
}
