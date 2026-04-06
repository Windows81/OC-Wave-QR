package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class ApproachLayoutModifierNode$minApproachIntrinsicHeight$1 implements NodeMeasuringIntrinsics.ApproachMeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApproachLayoutModifierNode f17002a;

    public ApproachLayoutModifierNode$minApproachIntrinsicHeight$1(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f17002a = approachLayoutModifierNode;
    }

    public final MeasureResult a(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return this.f17002a.n2(approachMeasureScope, measurable, j2);
    }
}
