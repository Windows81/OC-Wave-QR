package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TextIndentKt {
    public static final TextIndent a(TextIndent textIndent, TextIndent textIndent2, float f2) {
        return new TextIndent(SpanStyleKt.f(textIndent.b(), textIndent2.b(), f2), SpanStyleKt.f(textIndent.c(), textIndent2.c(), f2), (DefaultConstructorMarker) null);
    }
}
