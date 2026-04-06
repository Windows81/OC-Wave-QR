package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata
public final class EditingBufferKt {
    public static final long a(long j2, long j3) {
        int j4;
        int l2 = TextRange.l(j2);
        int k2 = TextRange.k(j2);
        if (TextRange.p(j3, j2)) {
            if (TextRange.d(j3, j2)) {
                l2 = TextRange.l(j3);
                k2 = l2;
            } else if (TextRange.d(j2, j3)) {
                j4 = TextRange.j(j3);
            } else if (TextRange.e(j3, l2)) {
                l2 = TextRange.l(j3);
                j4 = TextRange.j(j3);
            } else {
                k2 = TextRange.l(j3);
            }
            return TextRangeKt.b(l2, k2);
        }
        if (k2 > TextRange.l(j3)) {
            l2 -= TextRange.j(j3);
            j4 = TextRange.j(j3);
        }
        return TextRangeKt.b(l2, k2);
        k2 -= j4;
        return TextRangeKt.b(l2, k2);
    }
}
