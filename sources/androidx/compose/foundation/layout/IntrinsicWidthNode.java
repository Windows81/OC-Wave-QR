package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    public IntrinsicSize N;
    public boolean O;

    public IntrinsicWidthNode(IntrinsicSize intrinsicSize, boolean z2) {
        this.N = intrinsicSize;
        this.O = z2;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.N == IntrinsicSize.Min ? intrinsicMeasurable.Z(i2) : intrinsicMeasurable.a0(i2);
    }

    public long Z2(MeasureScope measureScope, Measurable measurable, long j2) {
        int Z = this.N == IntrinsicSize.Min ? measurable.Z(Constraints.k(j2)) : measurable.a0(Constraints.k(j2));
        if (Z < 0) {
            Z = 0;
        }
        return Constraints.f19137b.e(Z);
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

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return this.N == IntrinsicSize.Min ? intrinsicMeasurable.Z(i2) : intrinsicMeasurable.a0(i2);
    }
}
