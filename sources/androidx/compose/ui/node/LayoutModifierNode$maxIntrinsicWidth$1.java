package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class LayoutModifierNode$maxIntrinsicWidth$1 implements NodeMeasuringIntrinsics.MeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LayoutModifierNode f17277a;

    public LayoutModifierNode$maxIntrinsicWidth$1(LayoutModifierNode layoutModifierNode) {
        this.f17277a = layoutModifierNode;
    }

    public final MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.f17277a.f(measureScope, measurable, j2);
    }
}
