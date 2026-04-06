package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    public Function1 N;
    public Function1 O;

    public RotaryInputNode(Function1 function1, Function1 function12) {
        this.N = function1;
        this.O = function12;
    }

    public boolean Q0(RotaryScrollEvent rotaryScrollEvent) {
        Function1 function1 = this.N;
        if (function1 != null) {
            return ((Boolean) function1.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public boolean R0(RotaryScrollEvent rotaryScrollEvent) {
        Function1 function1 = this.O;
        if (function1 != null) {
            return ((Boolean) function1.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }

    public final void a3(Function1 function1) {
        this.O = function1;
    }
}
