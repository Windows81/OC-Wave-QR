package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public Function1 N;

    public BlockGraphicsLayerModifier(Function1 function1) {
        this.N = function1;
    }

    public boolean D2() {
        return false;
    }

    public final Function1 Z2() {
        return this.N;
    }

    public final void a3() {
        NodeCoordinator V2 = DelegatableNodeKt.j(this, NodeKind.a(2)).V2();
        if (V2 != null) {
            V2.P3(this.N, true);
        }
    }

    public final void b3(Function1 function1) {
        this.N = function1;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new BlockGraphicsLayerModifier$measure$1(c0, this), 4, (Object) null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.N + ')';
    }
}
