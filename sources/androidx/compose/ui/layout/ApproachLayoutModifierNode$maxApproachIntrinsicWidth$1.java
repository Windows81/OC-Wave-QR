package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1 implements NodeMeasuringIntrinsics.ApproachMeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApproachLayoutModifierNode f17000a;

    public ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f17000a = approachLayoutModifierNode;
    }

    public final MeasureResult a(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return this.f17000a.n2(approachMeasureScope, measurable, j2);
    }
}
