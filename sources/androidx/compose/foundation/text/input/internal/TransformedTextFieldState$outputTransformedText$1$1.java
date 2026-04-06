package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransformedTextFieldState$outputTransformedText$1$1 extends Lambda implements Function0<TransformedTextFieldState.TransformedText> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f6411A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6412z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$outputTransformedText$1$1(TransformedTextFieldState transformedTextFieldState, OutputTransformation outputTransformation) {
        super(0);
        this.f6412z = transformedTextFieldState;
        this.f6411A = outputTransformation;
    }

    /* renamed from: b */
    public final TransformedTextFieldState.TransformedText invoke() {
        return TransformedTextFieldState.f6396h.e(this.f6412z.f6397a.l(), this.f6411A, this.f6412z.m());
    }
}
