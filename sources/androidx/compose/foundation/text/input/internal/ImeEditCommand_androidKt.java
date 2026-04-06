package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class ImeEditCommand_androidKt {
    public static final void b(ImeEditCommandScope imeEditCommandScope, String str, int i2) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$commitText$1(str, i2));
    }

    public static final void c(ImeEditCommandScope imeEditCommandScope, int i2, int i3) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$deleteSurroundingText$1(i2, i3));
    }

    public static final void d(ImeEditCommandScope imeEditCommandScope, int i2, int i3) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$deleteSurroundingTextInCodePoints$1(i2, i3));
    }

    public static final void e(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.e(ImeEditCommand_androidKt$finishComposingText$1.f6202z);
    }

    public static final void f(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        TextRange h2 = textFieldBuffer.h();
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        TextFieldBufferKt.b(textFieldBuffer, min, max);
        if (h2 != null) {
            h2.r();
            long a2 = TextFieldBufferKt.a(h2.r(), min, max, 0);
            if (TextRange.h(a2)) {
                textFieldBuffer.d();
                return;
            }
            TextFieldBuffer.u(textFieldBuffer, TextRange.l(a2), TextRange.k(a2), (List) null, 4, (Object) null);
        }
    }

    public static final void g(TextFieldBuffer textFieldBuffer, int i2, int i3, CharSequence charSequence) {
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int i4 = 0;
        int i5 = min;
        while (i5 < max && i4 < charSequence.length() && charSequence.charAt(i4) == textFieldBuffer.a().charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        while (max > i5 && length > i4 && charSequence.charAt(length - 1) == textFieldBuffer.a().charAt(max - 1)) {
            length--;
            max--;
        }
        if (i5 == max && i4 == length) {
            textFieldBuffer.d();
            textFieldBuffer.c();
        } else {
            textFieldBuffer.p(i5, max, charSequence.subSequence(i4, length));
        }
        textFieldBuffer.x(TextRangeKt.a(min + charSequence.length()));
    }

    public static final boolean h(char c2, char c3) {
        return Character.isHighSurrogate(c2) && Character.isLowSurrogate(c3);
    }

    public static final void i(ImeEditCommandScope imeEditCommandScope, int i2, int i3) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$setComposingRegion$1(i2, i3));
    }

    public static final void j(ImeEditCommandScope imeEditCommandScope, String str, int i2, List list) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$setComposingText$1(str, list, i2));
    }

    public static final void k(ImeEditCommandScope imeEditCommandScope, int i2, int i3) {
        imeEditCommandScope.e(new ImeEditCommand_androidKt$setSelection$1(imeEditCommandScope, i2, i3));
    }
}
