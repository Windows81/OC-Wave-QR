package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$3 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6309A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f6310z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$3(boolean z2, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6310z = z2;
        this.f6309A = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        if (!this.f6310z) {
            return Boolean.FALSE;
        }
        this.f6309A.B3().v(annotatedString);
        return Boolean.TRUE;
    }
}
