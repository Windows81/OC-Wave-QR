package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DelegatableNode_androidKt {
    public static final View a(DelegatableNode delegatableNode) {
        if (!delegatableNode.M().F2()) {
            InlineClassHelperKt.c("Cannot get View because the Modifier node is not currently attached.");
        }
        Owner b2 = LayoutNodeKt.b(DelegatableNodeKt.o(delegatableNode));
        Intrinsics.g(b2, "null cannot be cast to non-null type android.view.View");
        return (View) b2;
    }
}
