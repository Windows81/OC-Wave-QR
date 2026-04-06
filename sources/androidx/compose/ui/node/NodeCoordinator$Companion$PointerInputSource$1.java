package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;

@Metadata
public final class NodeCoordinator$Companion$PointerInputSource$1 implements NodeCoordinator.HitTestSource {
    public int a() {
        return NodeKind.a(16);
    }

    public void b(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        layoutNode.K0(j2, hitTestResult, i2, z2);
    }

    public boolean c(Modifier.Node node) {
        int a2 = NodeKind.a(16);
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof PointerInputModifierNode) {
                if (((PointerInputModifierNode) node).h1()) {
                    return true;
                }
            } else if ((node.A2() & a2) != 0 && (node instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) node).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.d(node);
                                node = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            node = DelegatableNodeKt.h(mutableVector);
        }
        return false;
    }

    public boolean d(LayoutNode layoutNode) {
        return true;
    }
}
