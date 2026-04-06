package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldBuffer$composingAnnotations$1 extends Lambda implements Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldCharSequence f6064z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldBuffer$composingAnnotations$1(TextFieldCharSequence textFieldCharSequence) {
        super(1);
        this.f6064z = textFieldCharSequence;
    }

    public final AnnotatedString.Range b(int i2) {
        return (AnnotatedString.Range) this.f6064z.c().get(i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).intValue());
    }
}
