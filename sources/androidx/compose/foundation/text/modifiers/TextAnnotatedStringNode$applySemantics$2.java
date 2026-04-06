package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextAnnotatedStringNode$applySemantics$2 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6681z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$2(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(1);
        this.f6681z = textAnnotatedStringNode;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        boolean unused = this.f6681z.r3(annotatedString);
        this.f6681z.l3();
        return Boolean.TRUE;
    }
}
