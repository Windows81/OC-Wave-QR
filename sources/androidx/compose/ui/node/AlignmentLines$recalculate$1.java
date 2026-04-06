package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlignmentLines$recalculate$1 extends Lambda implements Function1<AlignmentLinesOwner, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AlignmentLines f17208z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.f17208z = alignmentLines;
    }

    public final void b(AlignmentLinesOwner alignmentLinesOwner) {
        if (alignmentLinesOwner.u()) {
            if (alignmentLinesOwner.q().g()) {
                alignmentLinesOwner.i0();
            }
            Map b2 = alignmentLinesOwner.q().f17207i;
            AlignmentLines alignmentLines = this.f17208z;
            for (Map.Entry entry : b2.entrySet()) {
                alignmentLines.c((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.M());
            }
            NodeCoordinator W2 = alignmentLinesOwner.M().W2();
            Intrinsics.f(W2);
            while (!Intrinsics.d(W2, this.f17208z.f().M())) {
                AlignmentLines alignmentLines2 = this.f17208z;
                for (AlignmentLine alignmentLine : this.f17208z.e(W2).keySet()) {
                    alignmentLines2.c(alignmentLine, alignmentLines2.i(W2, alignmentLine), W2);
                }
                W2 = W2.W2();
                Intrinsics.f(W2);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AlignmentLinesOwner) obj);
        return Unit.f40552a;
    }
}
