package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldCursorKt {
    public static final Modifier a(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Brush brush, boolean z2) {
        return z2 ? ComposedModifierKt.c(modifier, (Function1) null, new TextFieldCursorKt$cursor$1(brush, legacyTextFieldState, textFieldValue, offsetMapping), 1, (Object) null) : modifier;
    }
}
