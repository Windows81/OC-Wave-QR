package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldSizeKt {
    public static final Modifier a(Modifier modifier, TextStyle textStyle) {
        return ComposedModifierKt.c(modifier, (Function1) null, new TextFieldSizeKt$textFieldMinSize$1(textStyle), 1, (Object) null);
    }
}
