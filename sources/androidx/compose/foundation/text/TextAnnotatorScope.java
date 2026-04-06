package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata
final class TextAnnotatorScope {

    /* renamed from: a  reason: collision with root package name */
    public final AnnotatedString f5868a;

    /* renamed from: b  reason: collision with root package name */
    public AnnotatedString f5869b;

    public TextAnnotatorScope(AnnotatedString annotatedString) {
        this.f5868a = annotatedString;
        this.f5869b = annotatedString;
    }

    public final AnnotatedString a() {
        return this.f5869b;
    }

    public final void b(AnnotatedString.Range range, SpanStyle spanStyle) {
        this.f5869b = this.f5868a.q(new TextAnnotatorScope$replaceStyle$1(new Ref.BooleanRef(), range, spanStyle));
    }
}
