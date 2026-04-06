package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldGestureModifiersKt {
    public static final Modifier a(Modifier modifier, boolean z2, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, Function1 function1) {
        return FocusableKt.a(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(modifier, focusRequester), function1), z2, mutableInteractionSource);
    }
}
