package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public Function1 N;

    public OnPlacedNode(Function1 function1) {
        this.N = function1;
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }

    public void u(LayoutCoordinates layoutCoordinates) {
        this.N.invoke(layoutCoordinates);
    }
}
