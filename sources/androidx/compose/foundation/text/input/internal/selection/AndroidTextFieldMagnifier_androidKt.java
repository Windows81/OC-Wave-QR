package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.Metadata;

@Metadata
public final class AndroidTextFieldMagnifier_androidKt {
    public static final TextFieldMagnifierNode a(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2) {
        return Magnifier_androidKt.d(0, 1, (Object) null) ? new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z2) : new AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1();
    }
}
