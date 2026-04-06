package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldBufferKt {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r0 == r1) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long a(long r2, int r4, int r5, int r6) {
        /*
            int r0 = androidx.compose.ui.text.TextRange.l(r2)
            int r1 = androidx.compose.ui.text.TextRange.k(r2)
            if (r1 >= r4) goto L_0x000b
            return r2
        L_0x000b:
            if (r0 > r4) goto L_0x0017
            if (r5 > r1) goto L_0x0017
            int r5 = r5 - r4
            int r6 = r6 - r5
            if (r0 != r1) goto L_0x0014
            goto L_0x0022
        L_0x0014:
            int r4 = r1 + r6
            goto L_0x002b
        L_0x0017:
            if (r0 <= r4) goto L_0x001e
            if (r1 >= r5) goto L_0x001e
            int r4 = r4 + r6
            r0 = r4
            goto L_0x002b
        L_0x001e:
            if (r0 < r5) goto L_0x0024
            int r5 = r5 - r4
            int r6 = r6 - r5
        L_0x0022:
            int r0 = r0 + r6
            goto L_0x0014
        L_0x0024:
            if (r4 >= r0) goto L_0x002b
            int r0 = r4 + r6
            int r5 = r5 - r4
            int r6 = r6 - r5
            goto L_0x0014
        L_0x002b:
            long r2 = androidx.compose.ui.text.TextRangeKt.b(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldBufferKt.a(long, int, int, int):long");
    }

    public static final void b(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.p(i2, i3, "");
    }

    public static final void c(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.x(TextRangeKt.b(RangesKt.o(i2, 0, textFieldBuffer.j()), RangesKt.o(i3, 0, textFieldBuffer.j())));
    }

    public static /* synthetic */ void d(TextFieldBuffer textFieldBuffer, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = i2;
        }
        c(textFieldBuffer, i2, i3);
    }
}
