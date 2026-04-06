package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

@Metadata
public final class AndroidScrollable_androidKt {
    public static final ScrollConfig a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new AndroidConfig(ViewConfiguration.get(DelegatableNode_androidKt.a(compositionLocalConsumerModifierNode).getContext()));
    }
}
