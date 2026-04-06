package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;

@Metadata
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6328a;

    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.f6328a = textFieldDecoratorModifierNode;
    }

    private final FocusManager b() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.a(this.f6328a, CompositionLocalsKt.h());
    }

    public void a(int i2) {
        ImeAction.Companion companion = ImeAction.f18821b;
        if (ImeAction.m(i2, companion.d())) {
            b().p(FocusDirection.f15729b.e());
        } else if (ImeAction.m(i2, companion.f())) {
            b().p(FocusDirection.f15729b.f());
        } else if (ImeAction.m(i2, companion.b())) {
            this.f6328a.H3().a();
        }
    }
}
