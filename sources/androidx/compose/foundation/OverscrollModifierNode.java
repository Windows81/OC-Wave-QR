package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OverscrollModifierNode extends DelegatingNode {
    public DelegatableNode P;

    public OverscrollModifierNode(DelegatableNode delegatableNode) {
        this.P = delegatableNode;
    }

    public void I2() {
        f3();
    }

    public void J2() {
        DelegatableNode delegatableNode = this.P;
        if (delegatableNode != null) {
            c3(delegatableNode);
        }
    }

    public final void f3() {
        DelegatableNode delegatableNode;
        Modifier.Node M;
        DelegatableNode delegatableNode2 = this.P;
        if (delegatableNode2 == null || (M = delegatableNode2.M()) == null || M.F2()) {
            delegatableNode = null;
        } else {
            DelegatableNode delegatableNode3 = this.P;
            Intrinsics.f(delegatableNode3);
            delegatableNode = Z2(delegatableNode3);
        }
        this.P = delegatableNode;
    }

    public final void g3(DelegatableNode delegatableNode) {
        DelegatableNode delegatableNode2 = this.P;
        if (delegatableNode2 != null) {
            c3(delegatableNode2);
        }
        this.P = delegatableNode;
        f3();
    }
}
