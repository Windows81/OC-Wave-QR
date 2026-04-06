package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public Function3 N;

    public LayoutModifierImpl(Function3 function3) {
        this.N = function3;
    }

    public final void Z2(Function3 function3) {
        this.N = function3;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return (MeasureResult) this.N.d(measureScope, measurable, Constraints.a(j2));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.N + ')';
    }
}
