package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public interface PointerInputModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    PointerInputFilter i1();
}
