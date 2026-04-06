package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    public final /* synthetic */ Function1 N;

    public SemanticsNode$fakeSemanticsNode$fakeNode$1(Function1 function1) {
        this.N = function1;
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.N.invoke(semanticsPropertyReceiver);
    }
}
