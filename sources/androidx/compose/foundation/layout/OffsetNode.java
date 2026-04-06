package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public float O;
    public boolean P;
    public final boolean Q;

    public /* synthetic */ OffsetNode(float f2, float f3, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, z2);
    }

    public boolean D2() {
        return this.Q;
    }

    public final boolean Z2() {
        return this.P;
    }

    public final float a3() {
        return this.N;
    }

    public final float b3() {
        return this.O;
    }

    public final void c3(float f2, float f3, boolean z2) {
        if (!Dp.o(this.N, f2) || !Dp.o(this.O, f3) || this.P != z2) {
            LayoutModifierNodeKt.c(this);
        }
        this.N = f2;
        this.O = f3;
        this.P = z2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new OffsetNode$measure$1(this, c0, measureScope), 4, (Object) null);
    }

    public OffsetNode(float f2, float f3, boolean z2) {
        this.N = f2;
        this.O = f3;
        this.P = z2;
    }
}
