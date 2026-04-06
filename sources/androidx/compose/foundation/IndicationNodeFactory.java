package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;

@Metadata
public interface IndicationNodeFactory extends Indication {
    DelegatableNode b(InteractionSource interactionSource);

    int hashCode();
}
