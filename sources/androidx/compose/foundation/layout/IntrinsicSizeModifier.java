package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;

@Metadata
abstract class IntrinsicSizeModifier extends Modifier.Node implements LayoutModifierNode {
    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.a0(i2);
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.q0(i2);
    }

    public abstract long Z2(MeasureScope measureScope, Measurable measurable, long j2);

    public abstract boolean a3();

    public final MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        long Z2 = Z2(measureScope, measurable, j2);
        if (a3()) {
            Z2 = ConstraintsKt.e(j2, Z2);
        }
        Placeable c0 = measurable.c0(Z2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new IntrinsicSizeModifier$measure$1(c0), 4, (Object) null);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.C(i2);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Z(i2);
    }
}
