package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LookaheadAlignmentLines extends AlignmentLines {
    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, (DefaultConstructorMarker) null);
    }

    public long d(NodeCoordinator nodeCoordinator, long j2) {
        LookaheadDelegate Q2 = nodeCoordinator.Q2();
        Intrinsics.f(Q2);
        long j1 = Q2.j1();
        return Offset.q(Offset.e((((long) Float.floatToRawIntBits((float) IntOffset.k(j1))) << 32) | (((long) Float.floatToRawIntBits((float) IntOffset.l(j1))) & 4294967295L)), j2);
    }

    public Map e(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate Q2 = nodeCoordinator.Q2();
        Intrinsics.f(Q2);
        return Q2.g1().q();
    }

    public int i(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate Q2 = nodeCoordinator.Q2();
        Intrinsics.f(Q2);
        return Q2.f0(alignmentLine);
    }
}
