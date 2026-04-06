package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class LayoutModifierNode$minIntrinsicHeight$1 implements NodeMeasuringIntrinsics.MeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LayoutModifierNode f17278a;

    public LayoutModifierNode$minIntrinsicHeight$1(LayoutModifierNode layoutModifierNode) {
        this.f17278a = layoutModifierNode;
    }

    public final MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return this.f17278a.f(measureScope, measurable, j2);
    }
}
