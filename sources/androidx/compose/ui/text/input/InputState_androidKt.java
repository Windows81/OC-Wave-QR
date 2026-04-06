package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata
public final class InputState_androidKt {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.l(textFieldValue.h());
        extractedText.selectionEnd = TextRange.k(textFieldValue.h());
        extractedText.flags = StringsKt.V(textFieldValue.i(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
