package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class LayoutNodeDrawScopeKt {
    public static final Modifier.Node b(DelegatableNode delegatableNode) {
        int a2 = NodeKind.a(4);
        int a3 = NodeKind.a(2);
        Modifier.Node w2 = delegatableNode.M().w2();
        if (w2 == null || (w2.v2() & a2) == 0) {
            return null;
        }
        while (w2 != null && (w2.A2() & a3) == 0) {
            if ((w2.A2() & a2) != 0) {
                return w2;
            }
            w2 = w2.w2();
        }
        return null;
    }
}
