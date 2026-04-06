package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public Function1 N;

    public OnGloballyPositionedNode(Function1 function1) {
        this.N = function1;
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        this.N.invoke(layoutCoordinates);
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }
}
