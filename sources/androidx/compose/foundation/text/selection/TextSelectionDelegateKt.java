package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextSelectionDelegateKt {
    public static final float a(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (textLayoutResult.c(((!z2 || z3) && (z2 || !z3)) ? Math.max(i2 - 1, 0) : i2) == textLayoutResult.y(i2)) {
            z4 = true;
        }
        return textLayoutResult.j(i2, z4);
    }

    public static final long b(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        int q2 = textLayoutResult.q(i2);
        if (q2 >= textLayoutResult.n()) {
            return Offset.f15855b.b();
        }
        return Offset.e((((long) Float.floatToRawIntBits(RangesKt.n(a(textLayoutResult, i2, z2, z3), 0.0f, (float) ((int) (textLayoutResult.B() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(RangesKt.n(textLayoutResult.m(q2), 0.0f, (float) ((int) (textLayoutResult.B() & 4294967295L))))) & 4294967295L));
    }
}
