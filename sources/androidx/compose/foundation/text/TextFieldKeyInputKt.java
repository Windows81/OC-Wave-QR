package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldKeyInputKt {
    public static final Modifier a(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1 function1, boolean z2, boolean z3, OffsetMapping offsetMapping, UndoManager undoManager, int i2) {
        Modifier modifier2 = modifier;
        return ComposedModifierKt.c(modifier, (Function1) null, new TextFieldKeyInputKt$textFieldKeyInput$2(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z2, z3, offsetMapping, undoManager, function1, i2), 1, (Object) null);
    }
}
