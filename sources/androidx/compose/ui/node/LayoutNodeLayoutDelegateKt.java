package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata
public final class LayoutNodeLayoutDelegateKt {
    public static final boolean a(LayoutNode layoutNode) {
        if (layoutNode.l0() != null) {
            LayoutNode C0 = layoutNode.C0();
            if ((C0 != null ? C0.l0() : null) == null || layoutNode.f0().h()) {
                return true;
            }
        }
        return false;
    }
}
