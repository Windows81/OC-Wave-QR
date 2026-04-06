package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;

@Metadata
public final class SemanticsModifierNodeKt {
    public static final boolean a(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.f18056a.l()) != null;
    }

    public static final void b(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.o(semanticsModifierNode).U0();
    }

    public static final Rect c(Modifier.Node node, boolean z2) {
        return !node.M().F2() ? Rect.f15860e.a() : !z2 ? LayoutCoordinatesKt.b(DelegatableNodeKt.j(node, NodeKind.a(8))) : DelegatableNodeKt.j(node, NodeKind.a(8)).M3();
    }
}
