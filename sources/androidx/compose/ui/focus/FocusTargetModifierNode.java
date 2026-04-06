package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface FocusTargetModifierNode extends DelegatableNode {
    static /* synthetic */ boolean v1(FocusTargetModifierNode focusTargetModifierNode, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = FocusDirection.f15729b.b();
            }
            return focusTargetModifierNode.c0(i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
    }

    FocusState A0();

    boolean c0(int i2);
}
