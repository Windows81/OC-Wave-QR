package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;

@Metadata
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {
    public final ValueInsets N;
    public long O = IntOffset.f19160b.b();
    public final ModifierLocalMap P;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.N = valueInsets;
        this.P = ModifierLocalModifierNodeKt.b(TuplesKt.a(WindowInsetsPaddingKt.c(), valueInsets));
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.a0(i2);
    }

    public void J(LayoutCoordinates layoutCoordinates) {
        long d2 = IntOffsetKt.d(LayoutCoordinatesKt.f(layoutCoordinates));
        boolean j2 = IntOffset.j(this.O, d2);
        this.O = d2;
        if (!j2) {
            LayoutModifierNodeKt.c(this);
        }
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.q0(i2);
    }

    public final ValueInsets Z2() {
        return this.N;
    }

    public final void a3(long j2) {
        this.O = j2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        if (!Constraints.j(j2) || !Constraints.i(j2)) {
            T0(WindowInsetsPaddingKt.c(), b(WindowInsetsPaddingKt.c()));
            Placeable c0 = measurable.c0(j2);
            return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new RecalculateWindowInsetsModifierNode$measure$1(c0), 4, (Object) null);
        }
        int l2 = Constraints.l(j2);
        int k2 = Constraints.k(j2);
        return MeasureScope.R1(measureScope, l2, k2, (Map) null, new RecalculateWindowInsetsModifierNode$measure$2(this, measurable, l2, k2), 4, (Object) null);
    }

    public ModifierLocalMap q1() {
        return this.P;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.C(i2);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Z(i2);
    }
}
