package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class LayoutNode$Companion$ErrorMeasurePolicy$1 extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public LayoutNode$Companion$ErrorMeasurePolicy$1() {
        super("Undefined intrinsics block and it is required");
    }

    public /* bridge */ /* synthetic */ MeasureResult b(MeasureScope measureScope, List list, long j2) {
        return (MeasureResult) j(measureScope, list, j2);
    }

    public Void j(MeasureScope measureScope, List list, long j2) {
        throw new IllegalStateException("Undefined measure and it is required");
    }
}
