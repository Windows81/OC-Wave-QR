package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import java.util.Map;
import kotlin.Metadata;

@Metadata
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {
    public float N;

    public ZIndexNode(float f2) {
        this.N = f2;
    }

    public final float Z2() {
        return this.N;
    }

    public final void a3(float f2) {
        this.N = f2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new ZIndexNode$measure$1(c0, this), 4, (Object) null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.N + ')';
    }
}
