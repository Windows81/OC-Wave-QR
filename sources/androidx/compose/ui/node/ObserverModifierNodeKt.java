package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class ObserverModifierNodeKt {
    public static final void a(Modifier.Node node, Function0 function0) {
        ObserverNodeOwnerScope B2 = node.B2();
        if (B2 == null) {
            B2 = new ObserverNodeOwnerScope((ObserverModifierNode) node);
            node.U2(B2);
        }
        DelegatableNodeKt.p(node).getSnapshotObserver().i(B2, ObserverNodeOwnerScope.f17418A.a(), function0);
    }
}
