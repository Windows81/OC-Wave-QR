package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    public static final TraverseKey P = new TraverseKey((DefaultConstructorMarker) null);
    public static final int Q = 8;
    public Function1 N;
    public final Object O = P;

    @Metadata
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public TraverseKey() {
        }
    }

    public FocusedBoundsObserverNode(Function1 function1) {
        this.N = function1;
    }

    public final void Z2(LayoutCoordinates layoutCoordinates) {
        this.N.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.b(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.Z2(layoutCoordinates);
        }
    }

    public final void a3(Function1 function1) {
        this.N = function1;
    }

    public Object i0() {
        return this.O;
    }
}
