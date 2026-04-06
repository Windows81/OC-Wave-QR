package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$6 extends Lambda implements Function0<Boolean> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6314A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6315z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        super(0);
        this.f6315z = textFieldDecoratorModifierNode;
        this.f6314A = i2;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        this.f6315z.G3(this.f6314A);
        return Boolean.TRUE;
    }
}
