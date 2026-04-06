package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.TraversableNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {
    public static final TraverseKey P = new TraverseKey((DefaultConstructorMarker) null);
    public static final int Q = 8;
    public final Object N = P;
    public boolean O;

    @Metadata
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public TraverseKey() {
        }
    }

    public ScrollableContainerNode(boolean z2) {
        this.O = z2;
    }

    public final boolean Z2() {
        return this.O;
    }

    public final void a3(boolean z2) {
        this.O = z2;
    }

    public Object i0() {
        return this.N;
    }
}
