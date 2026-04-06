package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class LayoutModifierNode$minIntrinsicWidth$1 implements NodeMeasuringIntrinsics.MeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LayoutModifierNode f17279a;

    public LayoutModifierNode$minIntrinsicWidth$1(LayoutModifierNode layoutModifierNode) {
        this.f17279a = layoutModifierNode;
    }

    public final MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.f17279a.f(measureScope, measurable, j2);
    }
}
