package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;

@Metadata
public final class ValidatingOffsetMappingKt {

    /* renamed from: a  reason: collision with root package name */
    public static final OffsetMapping f6031a = new ValidatingOffsetMapping(OffsetMapping.f18867a.a(), 0, 0);

    public static final TransformedText c(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        TransformedText a2 = visualTransformation.a(annotatedString);
        f(a2, annotatedString.length(), 0, 2, (Object) null);
        return new TransformedText(a2.b(), new ValidatingOffsetMapping(a2.a(), annotatedString.length(), a2.b().length()));
    }

    public static final OffsetMapping d() {
        return f6031a;
    }

    public static final void e(TransformedText transformedText, int i2, int i3) {
        int length = transformedText.b().length();
        int min = Math.min(i2, i3);
        for (int i4 = 0; i4 < min; i4++) {
            g(transformedText.a().b(i4), length, i4);
        }
        g(transformedText.a().b(i2), length, i2);
        int min2 = Math.min(length, i3);
        for (int i5 = 0; i5 < min2; i5++) {
            h(transformedText.a().a(i5), i2, i5);
        }
        h(transformedText.a().a(length), i2, length);
    }

    public static /* synthetic */ void f(TransformedText transformedText, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 100;
        }
        e(transformedText, i2, i3);
    }

    public static final void g(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of transformed text [0, " + i3 + ']');
        }
    }

    public static final void h(int i2, int i3, int i4) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i4 + " -> " + i2 + " is not in range of original text [0, " + i3 + ']');
        }
    }
}
