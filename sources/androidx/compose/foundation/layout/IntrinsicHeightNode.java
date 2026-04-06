package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata
final class IntrinsicHeightNode extends IntrinsicSizeModifier {
    public IntrinsicSize N;
    public boolean O;

    public IntrinsicHeightNode(IntrinsicSize intrinsicSize, boolean z2) {
        this.N = intrinsicSize;
        this.O = z2;
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.N == IntrinsicSize.Min ? intrinsicMeasurable.q0(i2) : intrinsicMeasurable.C(i2);
    }

    public long Z2(MeasureScope measureScope, Measurable measurable, long j2) {
        int q0 = this.N == IntrinsicSize.Min ? measurable.q0(Constraints.l(j2)) : measurable.C(Constraints.l(j2));
        if (q0 < 0) {
            q0 = 0;
        }
        return Constraints.f19137b.d(q0);
    }

    public boolean a3() {
        return this.O;
    }

    public void b3(boolean z2) {
        this.O = z2;
    }

    public final void c3(IntrinsicSize intrinsicSize) {
        this.N = intrinsicSize;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.N == IntrinsicSize.Min ? intrinsicMeasurable.q0(i2) : intrinsicMeasurable.C(i2);
    }
}
