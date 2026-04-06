package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public final class FocusRequesterModifierKt {
    public static final Modifier a(Modifier modifier, FocusRequester focusRequester) {
        return modifier.o0(new FocusRequesterElement(focusRequester));
    }
}
