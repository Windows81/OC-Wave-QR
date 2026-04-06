package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$onImeActionPerformed$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f6331A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6332z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onImeActionPerformed$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        super(0);
        this.f6332z = textFieldDecoratorModifierNode;
        this.f6331A = i2;
    }

    public final void invoke() {
        this.f6332z.i0.a(this.f6331A);
    }
}
