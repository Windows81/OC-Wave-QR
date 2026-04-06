package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;

@Metadata
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public CompositionLocalMap N;

    public CompositionLocalMapInjectionNode(CompositionLocalMap compositionLocalMap) {
        this.N = compositionLocalMap;
    }

    public void I2() {
        DelegatableNodeKt.o(this).l(this.N);
    }

    public final void Z2(CompositionLocalMap compositionLocalMap) {
        this.N = compositionLocalMap;
        DelegatableNodeKt.o(this).l(compositionLocalMap);
    }
}
