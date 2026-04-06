package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    int F0(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator x2 = M().x2();
        Intrinsics.f(x2);
        LookaheadDelegate Q2 = x2.Q2();
        Intrinsics.f(Q2);
        return Q2.f1() ? NodeMeasuringIntrinsics.f17407a.c(new ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1(this), approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.a0(i2);
    }

    int J0(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator x2 = M().x2();
        Intrinsics.f(x2);
        LookaheadDelegate Q2 = x2.Q2();
        Intrinsics.f(Q2);
        return Q2.f1() ? NodeMeasuringIntrinsics.f17407a.a(new ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1(this), approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.C(i2);
    }

    int d2(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator x2 = M().x2();
        Intrinsics.f(x2);
        LookaheadDelegate Q2 = x2.Q2();
        Intrinsics.f(Q2);
        return Q2.f1() ? NodeMeasuringIntrinsics.f17407a.g(new ApproachLayoutModifierNode$minApproachIntrinsicWidth$1(this), approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.Z(i2);
    }

    MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new ApproachLayoutModifierNode$measure$1$1(c0), 4, (Object) null);
    }

    boolean g0(long j2);

    int g1(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        NodeCoordinator x2 = M().x2();
        Intrinsics.f(x2);
        LookaheadDelegate Q2 = x2.Q2();
        Intrinsics.f(Q2);
        return Q2.f1() ? NodeMeasuringIntrinsics.f17407a.e(new ApproachLayoutModifierNode$minApproachIntrinsicHeight$1(this), approachIntrinsicMeasureScope, intrinsicMeasurable, i2) : intrinsicMeasurable.q0(i2);
    }

    MeasureResult n2(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);

    boolean s2(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        return false;
    }
}
