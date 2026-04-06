package androidx.compose.ui.relocation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata
public interface BringIntoViewModifierNode extends DelegatableNode {
    Object W1(LayoutCoordinates layoutCoordinates, Function0 function0, Continuation continuation);
}
