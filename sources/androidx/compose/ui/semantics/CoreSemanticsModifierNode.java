package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public boolean N;
    public boolean O;
    public Function1 P;

    public CoreSemanticsModifierNode(boolean z2, boolean z3, Function1 function1) {
        this.N = z2;
        this.O = z3;
        this.P = function1;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.P.invoke(semanticsPropertyReceiver);
    }

    public boolean Z0() {
        return this.O;
    }

    public final void Z2(boolean z2) {
        this.N = z2;
    }

    public final void a3(Function1 function1) {
        this.P = function1;
    }

    public boolean i2() {
        return this.N;
    }
}
