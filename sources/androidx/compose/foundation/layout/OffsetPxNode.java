package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    public Function1 N;
    public boolean O;
    public final boolean P;

    public OffsetPxNode(Function1 function1, boolean z2) {
        this.N = function1;
        this.O = z2;
    }

    public boolean D2() {
        return this.P;
    }

    public final Function1 Z2() {
        return this.N;
    }

    public final boolean a3() {
        return this.O;
    }

    public final void b3(Function1 function1, boolean z2) {
        if (!(this.N == function1 && this.O == z2)) {
            LayoutModifierNodeKt.c(this);
        }
        this.N = function1;
        this.O = z2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new OffsetPxNode$measure$1(this, measureScope, c0), 4, (Object) null);
    }
}
