package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

@Metadata
public final class LayoutModifierNodeCoordinatorKt {
    public static final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable d1 = lookaheadCapablePlaceable.d1();
        if (!(d1 != null)) {
            InlineClassHelperKt.c("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.g1().q().containsKey(alignmentLine)) {
            Integer num = (Integer) lookaheadCapablePlaceable.g1().q().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int f0 = d1.f0(alignmentLine);
        if (f0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        d1.W1(true);
        lookaheadCapablePlaceable.V1(true);
        lookaheadCapablePlaceable.L1();
        d1.W1(false);
        lookaheadCapablePlaceable.V1(false);
        return f0 + (alignmentLine instanceof HorizontalAlignmentLine ? IntOffset.l(d1.j1()) : IntOffset.k(d1.j1()));
    }
}
