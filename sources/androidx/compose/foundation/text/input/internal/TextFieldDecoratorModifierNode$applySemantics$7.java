package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$7 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6316z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6316z = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        if (!this.f6316z.D3()) {
            FocusRequesterModifierNodeKt.c(this.f6316z);
        } else if (!this.f6316z.x3()) {
            this.f6316z.H3().b();
        }
        return Boolean.TRUE;
    }
}
