package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public interface OnGloballyPositionedModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    void J(LayoutCoordinates layoutCoordinates);
}
