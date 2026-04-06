package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import kotlin.Metadata;

@Metadata
final class InvalidateSemantics {

    /* renamed from: a  reason: collision with root package name */
    public static final InvalidateSemantics f15839a = new InvalidateSemantics();

    public final void a(FocusTargetNode focusTargetNode) {
        Modifier.Node M = focusTargetNode.M();
        SemanticsModifierNode semanticsModifierNode = M instanceof SemanticsModifierNode ? (SemanticsModifierNode) M : null;
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.b(semanticsModifierNode);
        }
    }
}
