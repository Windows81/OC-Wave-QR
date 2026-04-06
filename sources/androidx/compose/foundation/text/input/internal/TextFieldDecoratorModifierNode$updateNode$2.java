package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$updateNode$2 extends Lambda implements Function0<Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6341z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$updateNode$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6341z = textFieldDecoratorModifierNode;
    }

    public final void invoke() {
        DelegatableNodeKt.i(this.f6341z);
    }
}
