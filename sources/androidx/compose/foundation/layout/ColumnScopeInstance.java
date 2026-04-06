package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class ColumnScopeInstance implements ColumnScope {

    /* renamed from: a  reason: collision with root package name */
    public static final ColumnScopeInstance f3815a = new ColumnScopeInstance();

    public Modifier a(Modifier modifier, float f2, boolean z2) {
        if (!(((double) f2) > 0.0d)) {
            InlineClassHelperKt.a("invalid weight; must be greater than zero");
        }
        return modifier.o0(new LayoutWeightElement(RangesKt.i(f2, Float.MAX_VALUE), z2));
    }

    public Modifier b(Modifier modifier, Alignment.Horizontal horizontal) {
        return modifier.o0(new HorizontalAlignElement(horizontal));
    }
}
