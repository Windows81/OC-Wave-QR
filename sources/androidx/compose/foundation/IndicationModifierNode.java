package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;

@Metadata
final class IndicationModifierNode extends DelegatingNode {
    public DelegatableNode P;

    public IndicationModifierNode(DelegatableNode delegatableNode) {
        this.P = delegatableNode;
        Z2(delegatableNode);
    }

    public final void f3(DelegatableNode delegatableNode) {
        c3(this.P);
        this.P = delegatableNode;
        Z2(delegatableNode);
    }
}
