package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class AlignmentLineOffsetDpNode extends Modifier.Node implements LayoutModifierNode {
    public AlignmentLine N;
    public float O;
    public float P;

    public /* synthetic */ AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, f2, f3);
    }

    public final void Z2(float f2) {
        this.P = f2;
    }

    public final void a3(AlignmentLine alignmentLine) {
        this.N = alignmentLine;
    }

    public final void b3(float f2) {
        this.O = f2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return AlignmentLineKt.c(measureScope, this.N, this.O, this.P, measurable, j2);
    }

    public AlignmentLineOffsetDpNode(AlignmentLine alignmentLine, float f2, float f3) {
        this.N = alignmentLine;
        this.O = f2;
        this.P = f3;
    }
}
