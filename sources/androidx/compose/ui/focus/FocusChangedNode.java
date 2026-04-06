package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    public Function1 N;
    public FocusState O;

    public FocusChangedNode(Function1 function1) {
        this.N = function1;
    }

    public void X(FocusState focusState) {
        if (!Intrinsics.d(this.O, focusState)) {
            this.O = focusState;
            this.N.invoke(focusState);
        }
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }
}
