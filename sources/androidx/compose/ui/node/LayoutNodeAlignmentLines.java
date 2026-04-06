package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, (DefaultConstructorMarker) null);
    }

    public long d(NodeCoordinator nodeCoordinator, long j2) {
        return NodeCoordinator.L3(nodeCoordinator, j2, false, 2, (Object) null);
    }

    public Map e(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.g1().q();
    }

    public int i(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.f0(alignmentLine);
    }
}
