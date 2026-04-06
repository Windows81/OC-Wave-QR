package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class CompositionLocalConsumerModifierNodeKt {
    public static final Object a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, CompositionLocal compositionLocal) {
        if (!compositionLocalConsumerModifierNode.M().F2()) {
            InlineClassHelperKt.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return DelegatableNodeKt.o(compositionLocalConsumerModifierNode).O().a(compositionLocal);
    }
}
