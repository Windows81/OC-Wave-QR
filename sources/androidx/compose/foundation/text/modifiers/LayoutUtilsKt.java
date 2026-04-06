package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class LayoutUtilsKt {
    public static final long a(long j2, boolean z2, int i2, float f2) {
        return Constraints.f19137b.b(0, c(j2, z2, i2, f2), 0, Constraints.k(j2));
    }

    public static final int b(boolean z2, int i2, int i3) {
        if (z2 || !d(i2)) {
            return RangesKt.e(i3, 1);
        }
        return 1;
    }

    public static final int c(long j2, boolean z2, int i2, float f2) {
        int l2 = ((z2 || d(i2)) && Constraints.h(j2)) ? Constraints.l(j2) : Integer.MAX_VALUE;
        return Constraints.n(j2) == l2 ? l2 : RangesKt.o(TextDelegateKt.a(f2), Constraints.n(j2), l2);
    }

    public static final boolean d(int i2) {
        TextOverflow.Companion companion = TextOverflow.f19125b;
        return TextOverflow.h(i2, companion.b()) || TextOverflow.h(i2, companion.d()) || TextOverflow.h(i2, companion.c());
    }
}
