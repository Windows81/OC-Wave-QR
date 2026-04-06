package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public Function1 N;
    public final boolean O = true;
    public long P;

    public OnSizeChangedNode(Function1 function1) {
        this.N = function1;
        long j2 = (long) Integer.MIN_VALUE;
        this.P = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public boolean D2() {
        return this.O;
    }

    public final void Z2(Function1 function1) {
        this.N = function1;
        long j2 = (long) Integer.MIN_VALUE;
        this.P = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public void q(long j2) {
        if (!IntSize.e(this.P, j2)) {
            this.N.invoke(IntSize.b(j2));
            this.P = j2;
        }
    }
}
