package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata
public final class OffsetMappingCalculator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f6259a = OpArray.a(10);

    /* renamed from: b  reason: collision with root package name */
    public int f6260b;

    public final long a(int i2, boolean z2) {
        int i3;
        int[] iArr = this.f6259a;
        int i4 = this.f6260b;
        if (i4 < 0) {
            i3 = i2;
        } else if (!z2) {
            int i5 = i4 - 1;
            int i6 = i2;
            while (-1 < i5) {
                int i7 = i5 * 3;
                int i8 = iArr[i7];
                int i9 = iArr[i7 + 1];
                int i10 = iArr[i7 + 2];
                long d2 = d(i6, i8, i9, i10, z2);
                long d3 = d(i2, i8, i9, i10, z2);
                i5--;
                i6 = Math.min(TextRange.n(d2), TextRange.n(d3));
                i2 = Math.max(TextRange.i(d2), TextRange.i(d3));
            }
            i3 = i2;
            i2 = i6;
        } else {
            int i11 = 0;
            int i12 = i2;
            while (i11 < i4) {
                int i13 = i11 * 3;
                int i14 = iArr[i13];
                int i15 = iArr[i13 + 1];
                int i16 = iArr[i13 + 2];
                long d4 = d(i12, i14, i15, i16, z2);
                long d5 = d(i2, i14, i15, i16, z2);
                i11++;
                i12 = Math.min(TextRange.n(d4), TextRange.n(d5));
                i2 = Math.max(TextRange.i(d4), TextRange.i(d5));
            }
            i3 = i2;
            i2 = i12;
        }
        return TextRangeKt.b(i2, i3);
    }

    public final long b(int i2) {
        return a(i2, false);
    }

    public final long c(int i2) {
        return a(i2, true);
    }

    public final long d(int i2, int i3, int i4, int i5, boolean z2) {
        int i6 = z2 ? i4 : i5;
        if (z2) {
            i4 = i5;
        }
        return i2 < i3 ? TextRangeKt.a(i2) : i2 == i3 ? i6 == 0 ? TextRangeKt.b(i3, i4 + i3) : TextRangeKt.a(i3) : i2 < i3 + i6 ? i4 == 0 ? TextRangeKt.a(i3) : TextRangeKt.b(i3, i4 + i3) : TextRangeKt.a((i2 - i6) + i4);
    }

    public final void e(int i2, int i3, int i4) {
        if (!(i4 >= 0)) {
            InlineClassHelperKt.a("Expected newLen to be ≥ 0, was " + i4);
        }
        int min = Math.min(i2, i3);
        int max = Math.max(min, i3) - min;
        if (max >= 2 || max != i4) {
            int i5 = this.f6260b + 1;
            if (i5 > OpArray.e(this.f6259a)) {
                this.f6259a = OpArray.c(this.f6259a, Math.max(i5 * 2, OpArray.e(this.f6259a) * 2));
            }
            OpArray.g(this.f6259a, this.f6260b, min, max, i4);
            this.f6260b = i5;
        }
    }
}
