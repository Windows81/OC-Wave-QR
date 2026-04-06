package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$applySemantics$8 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6317z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$8(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6317z = textFieldDecoratorModifierNode;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        if (!this.f6317z.D3()) {
            FocusRequesterModifierNodeKt.c(this.f6317z);
        }
        this.f6317z.A3().L0(TextToolbarState.Selection);
        return Boolean.TRUE;
    }
}
