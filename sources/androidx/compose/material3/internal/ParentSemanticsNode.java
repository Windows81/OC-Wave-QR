package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ParentSemanticsNode extends Modifier.Node implements TraversableNode, SemanticsModifierNode {
    public Function1 N;
    public boolean O;
    public final Object P = ParentSemanticsNodeKey.f12313a;

    public ParentSemanticsNode(Function1 function1) {
        this.N = function1;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (!this.O) {
            this.N.invoke(semanticsPropertyReceiver);
        }
    }

    public final void Z2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.O = true;
        this.N.invoke(semanticsPropertyReceiver);
        SemanticsModifierNodeKt.b(this);
    }

    public final void a3() {
        this.O = false;
        SemanticsModifierNodeKt.b(this);
    }

    public final void b3(Function1 function1) {
        this.N = function1;
    }

    public Object i0() {
        return this.P;
    }

    public boolean i2() {
        return true;
    }
}
