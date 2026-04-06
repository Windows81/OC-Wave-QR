package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class ApproachLayoutModifierNode$minApproachIntrinsicWidth$1 implements NodeMeasuringIntrinsics.ApproachMeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApproachLayoutModifierNode f17003a;

    public ApproachLayoutModifierNode$minApproachIntrinsicWidth$1(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f17003a = approachLayoutModifierNode;
    }

    public final MeasureResult a(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return this.f17003a.n2(approachMeasureScope, measurable, j2);
    }
}
