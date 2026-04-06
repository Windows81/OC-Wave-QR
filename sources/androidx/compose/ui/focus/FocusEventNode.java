package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    public Function1 N;

    public FocusEventNode(Function1 function1) {
        this.N = function1;
    }

    public void X(FocusState focusState) {
        this.N.invoke(focusState);
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }
}
