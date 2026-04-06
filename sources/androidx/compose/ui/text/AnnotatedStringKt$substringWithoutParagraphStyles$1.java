package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnnotatedStringKt$substringWithoutParagraphStyles$1 extends Lambda implements Function1<AnnotatedString.Annotation, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnnotatedStringKt$substringWithoutParagraphStyles$1 f18240z = new AnnotatedStringKt$substringWithoutParagraphStyles$1();

    public AnnotatedStringKt$substringWithoutParagraphStyles$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString.Annotation annotation) {
        return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
    }
}
