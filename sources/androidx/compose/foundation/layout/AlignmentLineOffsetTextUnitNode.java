package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    public AlignmentLine N;
    public long O;
    public long P;

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j2, j3);
    }

    public final void Z2(long j2) {
        this.P = j2;
    }

    public final void a3(AlignmentLine alignmentLine) {
        this.N = alignmentLine;
    }

    public final void b3(long j2) {
        this.O = j2;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        return AlignmentLineKt.c(measureScope, this.N, TextUnit.f(this.O) == 0 ? Dp.f19144A.c() : measureScope.v(this.O), TextUnit.f(this.P) == 0 ? Dp.f19144A.c() : measureScope.v(this.P), measurable, j2);
    }

    public AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j2, long j3) {
        this.N = alignmentLine;
        this.O = j2;
        this.P = j3;
    }
}
