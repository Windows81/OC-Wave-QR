package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextStringSimpleNode$applySemantics$2 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f6693z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$2(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.f6693z = textStringSimpleNode;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        boolean unused = this.f6693z.m3(annotatedString.k());
        this.f6693z.l3();
        return Boolean.TRUE;
    }
}
