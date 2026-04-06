package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

@Metadata
public interface GlobalPositionAwareModifierNode extends DelegatableNode {
    void J(LayoutCoordinates layoutCoordinates);
}
