package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2 extends Lambda implements Function0<String> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6329z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6329z = textFieldDecoratorModifierNode;
    }

    public final String invoke() {
        return this.f6329z.B3().n().toString();
    }
}
