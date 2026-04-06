package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.DpSize;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        boolean z2 = F2() && ((Boolean) CompositionLocalConsumerModifierNodeKt.a(this, InteractiveComponentSizeKt.b())).booleanValue();
        long a2 = InteractiveComponentSizeKt.f7907c;
        Placeable c0 = measurable.c0(j2);
        int max = z2 ? Math.max(c0.L0(), measureScope.P1(DpSize.j(a2))) : c0.L0();
        int max2 = z2 ? Math.max(c0.C0(), measureScope.P1(DpSize.i(a2))) : c0.C0();
        return MeasureScope.R1(measureScope, max, max2, (Map) null, new MinimumInteractiveModifierNode$measure$1(max, c0, max2), 4, (Object) null);
    }
}
