package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransformedTextFieldState$codepointTransformedText$1$1 extends Lambda implements Function0<TransformedTextFieldState.TransformedText> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CodepointTransformation f6407A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6408z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$codepointTransformedText$1$1(TransformedTextFieldState transformedTextFieldState, CodepointTransformation codepointTransformation) {
        super(0);
        this.f6408z = transformedTextFieldState;
        this.f6407A = codepointTransformation;
    }

    /* renamed from: b */
    public final TransformedTextFieldState.TransformedText invoke() {
        TextFieldCharSequence textFieldCharSequence;
        TransformedTextFieldState.TransformedText transformedText;
        TransformedTextFieldState.Companion b2 = TransformedTextFieldState.f6396h;
        State d2 = this.f6408z.f6401e;
        if (d2 == null || (transformedText = (TransformedTextFieldState.TransformedText) d2.getValue()) == null || (textFieldCharSequence = transformedText.b()) == null) {
            textFieldCharSequence = this.f6408z.f6397a.l();
        }
        return b2.f(textFieldCharSequence, this.f6407A, this.f6408z.m());
    }
}
