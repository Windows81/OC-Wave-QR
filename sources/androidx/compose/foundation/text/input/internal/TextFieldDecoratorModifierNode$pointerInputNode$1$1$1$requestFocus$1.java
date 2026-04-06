package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6337A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6338z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1(TextFieldSelectionState textFieldSelectionState, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6338z = textFieldSelectionState;
        this.f6337A = textFieldDecoratorModifierNode;
    }

    public final void invoke() {
        if (!this.f6338z.l0()) {
            FocusRequesterModifierNodeKt.c(this.f6337A);
        }
    }
}
