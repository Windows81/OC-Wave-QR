package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

@Metadata
public final class TextFieldCharSequenceKt {
    public static final CharSequence a(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.l(textFieldCharSequence.g()), TextRange.k(textFieldCharSequence.g()));
    }

    public static final CharSequence b(TextFieldCharSequence textFieldCharSequence, int i2) {
        return textFieldCharSequence.subSequence(TextRange.k(textFieldCharSequence.g()), Math.min(TextRange.k(textFieldCharSequence.g()) + i2, textFieldCharSequence.length()));
    }

    public static final CharSequence c(TextFieldCharSequence textFieldCharSequence, int i2) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.l(textFieldCharSequence.g()) - i2), TextRange.l(textFieldCharSequence.g()));
    }
}
