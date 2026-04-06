package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    public Function1 N;
    public Function1 O;

    public InterceptedKeyInputNode(Function1 function1, Function1 function12) {
        this.N = function1;
        this.O = function12;
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }

    public final void a3(Function1 function1) {
        this.O = function1;
    }

    public boolean p0(KeyEvent keyEvent) {
        Function1 function1 = this.O;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public boolean x1(KeyEvent keyEvent) {
        Function1 function1 = this.N;
        if (function1 != null) {
            return ((Boolean) function1.invoke(KeyEvent.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
