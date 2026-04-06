package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

@Metadata
public final class TextRangeKt {
    public static final long a(int i2) {
        return b(i2, i2);
    }

    public static final long b(int i2, int i3) {
        return TextRange.c(d(i2, i3));
    }

    public static final long c(long j2, int i2, int i3) {
        int n2 = TextRange.n(j2);
        if (n2 < i2) {
            n2 = i2;
        }
        if (n2 > i3) {
            n2 = i3;
        }
        int i4 = TextRange.i(j2);
        if (i4 >= i2) {
            i2 = i4;
        }
        if (i2 <= i3) {
            i3 = i2;
        }
        return (n2 == TextRange.n(j2) && i3 == TextRange.i(j2)) ? j2 : b(n2, i3);
    }

    public static final long d(int i2, int i3) {
        if (!(i2 >= 0 && i3 >= 0)) {
            InlineClassHelperKt.a("start and end cannot be negative. [start: " + i2 + ", end: " + i3 + ']');
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final String e(CharSequence charSequence, long j2) {
        return charSequence.subSequence(TextRange.l(j2), TextRange.k(j2)).toString();
    }
}
