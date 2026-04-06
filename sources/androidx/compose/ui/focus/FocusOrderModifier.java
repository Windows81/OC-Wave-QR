package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface FocusOrderModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    void f1(FocusOrder focusOrder);
}
