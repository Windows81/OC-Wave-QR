package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;

@Metadata
public final class NodeCoordinator$Companion$SemanticsSource$1 implements NodeCoordinator.HitTestSource {
    public int a() {
        return NodeKind.a(8);
    }

    public void b(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        layoutNode.M0(j2, hitTestResult, i2, z2);
    }

    public boolean c(Modifier.Node node) {
        return false;
    }

    public boolean d(LayoutNode layoutNode) {
        SemanticsConfiguration a0 = layoutNode.a0();
        boolean z2 = false;
        if (a0 != null && a0.s()) {
            z2 = true;
        }
        return !z2;
    }
}
