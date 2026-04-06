package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.Metadata;

@Metadata
public interface LayoutModifierNode extends DelegatableNode {
    int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.f17407a.d(new LayoutModifierNode$maxIntrinsicWidth$1(this), intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.f17407a.f(new LayoutModifierNode$minIntrinsicHeight$1(this), intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2);

    int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.f17407a.b(new LayoutModifierNode$maxIntrinsicHeight$1(this), intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return NodeMeasuringIntrinsics.f17407a.h(new LayoutModifierNode$minIntrinsicWidth$1(this), intrinsicMeasureScope, intrinsicMeasurable, i2);
    }
}
