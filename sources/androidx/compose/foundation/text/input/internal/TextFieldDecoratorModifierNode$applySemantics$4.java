package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$4 extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6311A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f6312z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$4(boolean z2, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6312z = z2;
        this.f6311A = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke(AnnotatedString annotatedString) {
        if (!this.f6312z) {
            return Boolean.FALSE;
        }
        TransformedTextFieldState.x(this.f6311A.B3(), annotatedString, true, (TextFieldEditUndoBehavior) null, false, 12, (Object) null);
        return Boolean.TRUE;
    }
}
