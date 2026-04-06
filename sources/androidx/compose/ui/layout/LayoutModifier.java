package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata
public interface LayoutModifier extends Modifier.Element {

    @Metadata
    public static final class DefaultImpls {
    }

    int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return MeasuringIntrinsics.f17116a.b(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return MeasuringIntrinsics.f17116a.c(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2);

    int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return MeasuringIntrinsics.f17116a.a(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return MeasuringIntrinsics.f17116a.d(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }
}
