package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldPressGestureFilterKt {
    public static final Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, Function1 function1) {
        return z2 ? ComposedModifierKt.c(modifier, (Function1) null, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(function1, mutableInteractionSource), 1, (Object) null) : modifier;
    }
}
