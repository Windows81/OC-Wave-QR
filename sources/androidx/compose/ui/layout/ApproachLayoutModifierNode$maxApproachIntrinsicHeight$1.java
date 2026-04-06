package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.Metadata;

@Metadata
public final class ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1 implements NodeMeasuringIntrinsics.ApproachMeasureBlock {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApproachLayoutModifierNode f16999a;

    public ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.f16999a = approachLayoutModifierNode;
    }

    public final MeasureResult a(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        return this.f16999a.n2(approachMeasureScope, measurable, j2);
    }
}
