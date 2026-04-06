package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public float O;
    public float P;
    public float Q;
    public boolean R;

    public /* synthetic */ PaddingNode(float f2, float f3, float f4, float f5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2);
    }

    public final boolean Z2() {
        return this.R;
    }

    public final float a3() {
        return this.N;
    }

    public final float b3() {
        return this.O;
    }

    public final void c3(float f2) {
        this.Q = f2;
    }

    public final void d3(float f2) {
        this.P = f2;
    }

    public final void e3(boolean z2) {
        this.R = z2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        int P1 = measureScope.P1(this.N) + measureScope.P1(this.P);
        int P12 = measureScope.P1(this.O) + measureScope.P1(this.Q);
        Placeable c0 = measurable.c0(ConstraintsKt.i(j2, -P1, -P12));
        return MeasureScope.R1(measureScope, ConstraintsKt.g(j2, c0.L0() + P1), ConstraintsKt.f(j2, c0.C0() + P12), (Map) null, new PaddingNode$measure$1(this, c0, measureScope), 4, (Object) null);
    }

    public final void f3(float f2) {
        this.N = f2;
    }

    public final void g3(float f2) {
        this.O = f2;
    }

    public PaddingNode(float f2, float f3, float f4, float f5, boolean z2) {
        this.N = f2;
        this.O = f3;
        this.P = f4;
        this.Q = f5;
        this.R = z2;
    }
}
