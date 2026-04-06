package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    public PaddingValues N;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.N = paddingValues;
    }

    public final void Z2(PaddingValues paddingValues) {
        this.N = paddingValues;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        MeasureScope measureScope2 = measureScope;
        long j3 = j2;
        float b2 = this.N.b(measureScope.getLayoutDirection());
        float d2 = this.N.d();
        float c2 = this.N.c(measureScope.getLayoutDirection());
        float a2 = this.N.a();
        boolean z2 = false;
        float f2 = (float) 0;
        boolean z3 = (Dp.l(b2, Dp.m(f2)) >= 0) & (Dp.l(d2, Dp.m(f2)) >= 0) & (Dp.l(c2, Dp.m(f2)) >= 0);
        if (Dp.l(a2, Dp.m(f2)) >= 0) {
            z2 = true;
        }
        if (!z2 || !z3) {
            InlineClassHelperKt.a("Padding must be non-negative");
        }
        int P1 = measureScope.P1(b2);
        int P12 = measureScope.P1(c2) + P1;
        int P13 = measureScope.P1(d2);
        int P14 = measureScope.P1(a2) + P13;
        Measurable measurable2 = measurable;
        Placeable c0 = measurable.c0(ConstraintsKt.i(j3, -P12, -P14));
        return MeasureScope.R1(measureScope, ConstraintsKt.g(j3, c0.L0() + P12), ConstraintsKt.f(j3, c0.C0() + P14), (Map) null, new PaddingValuesModifier$measure$2(c0, P1, P13), 4, (Object) null);
    }
}
