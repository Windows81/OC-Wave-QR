package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class RowScopeInstance implements RowScope {

    /* renamed from: a  reason: collision with root package name */
    public static final RowScopeInstance f4150a = new RowScopeInstance();

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        if (!(((double) f2) > 0.0d)) {
            InlineClassHelperKt.a("invalid weight; must be greater than zero");
        }
        return modifier.o0(new LayoutWeightElement(RangesKt.i(f2, Float.MAX_VALUE), z2));
    }

    public Modifier b(Modifier modifier) {
        return e(modifier, AlignmentLineKt.a());
    }

    public Modifier d(Modifier modifier, Alignment.Vertical vertical) {
        return modifier.o0(new VerticalAlignElement(vertical));
    }

    public Modifier e(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.o0(new WithAlignmentLineElement(horizontalAlignmentLine));
    }
}
