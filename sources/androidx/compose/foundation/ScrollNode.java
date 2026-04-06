package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public ScrollState N;
    public boolean O;
    public boolean P;

    public ScrollNode(ScrollState scrollState, boolean z2, boolean z3) {
        this.N = scrollState;
        this.O = z2;
        this.P = z3;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.P) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.a0(i2);
    }

    public void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new ScrollNode$applySemantics$accessibilityScrollState$1(this), new ScrollNode$applySemantics$accessibilityScrollState$2(this), this.O);
        if (this.P) {
            SemanticsPropertiesKt.J0(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.k0(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!this.P) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.q0(i2);
    }

    public final boolean Z2() {
        return this.O;
    }

    public final ScrollState a3() {
        return this.N;
    }

    public final boolean b3() {
        return this.P;
    }

    public final void c3(boolean z2) {
        this.O = z2;
    }

    public final void d3(ScrollState scrollState) {
        this.N = scrollState;
    }

    public final void e3(boolean z2) {
        this.P = z2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        CheckScrollableContainerConstraintsKt.a(j2, this.P ? Orientation.Vertical : Orientation.Horizontal);
        int i2 = Integer.MAX_VALUE;
        int k2 = this.P ? Integer.MAX_VALUE : Constraints.k(j2);
        if (this.P) {
            i2 = Constraints.l(j2);
        }
        Placeable c0 = measurable.c0(Constraints.d(j2, 0, i2, 0, k2, 5, (Object) null));
        int j3 = RangesKt.j(c0.L0(), Constraints.l(j2));
        int j4 = RangesKt.j(c0.C0(), Constraints.k(j2));
        int C0 = c0.C0() - j4;
        int L0 = c0.L0() - j3;
        if (!this.P) {
            C0 = L0;
        }
        this.N.o(C0);
        this.N.q(this.P ? j4 : j3);
        return MeasureScope.R1(measureScope, j3, j4, (Map) null, new ScrollNode$measure$1(this, C0, c0), 4, (Object) null);
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!this.P) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.C(i2);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.P) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.Z(i2);
    }
}
