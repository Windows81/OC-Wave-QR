package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

@Metadata
public final class TextFieldValueKt {
    public static final AnnotatedString a(TextFieldValue textFieldValue) {
        return textFieldValue.f().t(textFieldValue.h());
    }

    public static final AnnotatedString b(TextFieldValue textFieldValue, int i2) {
        return textFieldValue.f().subSequence(TextRange.k(textFieldValue.h()), Math.min(TextRange.k(textFieldValue.h()) + i2, textFieldValue.i().length()));
    }

    public static final AnnotatedString c(TextFieldValue textFieldValue, int i2) {
        return textFieldValue.f().subSequence(Math.max(0, TextRange.l(textFieldValue.h()) - i2), TextRange.l(textFieldValue.h()));
    }
}
