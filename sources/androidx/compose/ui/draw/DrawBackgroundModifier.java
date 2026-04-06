package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {
    public Function1 N;

    public DrawBackgroundModifier(Function1 function1) {
        this.N = function1;
    }

    public void U(ContentDrawScope contentDrawScope) {
        this.N.invoke(contentDrawScope);
        contentDrawScope.q2();
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
    }
}
