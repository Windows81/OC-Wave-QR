package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class StringAnnotationKt {
    public static final AnnotatedString.Range a(AnnotatedString.Range range) {
        Object g2 = range.g();
        Intrinsics.g(g2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range(((StringAnnotation) g2).f(), range.h(), range.f(), range.i());
    }
}
