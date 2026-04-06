package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

@Metadata
public final class ProgressSemanticsKt {
    public static final Modifier a(Modifier modifier) {
        return SemanticsModifierKt.c(modifier, true, ProgressSemanticsKt$progressSemantics$2.f3151z);
    }

    public static final Modifier b(Modifier modifier, float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2) {
        return SemanticsModifierKt.c(modifier, true, new ProgressSemanticsKt$progressSemantics$1(f2, closedFloatingPointRange, i2));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f2, ClosedFloatingPointRange closedFloatingPointRange, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            closedFloatingPointRange = RangesKt.b(0.0f, 1.0f);
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return b(modifier, f2, closedFloatingPointRange, i2);
    }
}
