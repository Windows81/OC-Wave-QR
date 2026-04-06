package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldMagnifierKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6444a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.foundation.text.Handle[] r0 = androidx.compose.foundation.text.Handle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.Cursor     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionStart     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.foundation.text.Handle r1 = androidx.compose.foundation.text.Handle.SelectionEnd     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f6444a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierKt.WhenMappings.<clinit>():void");
        }
    }

    public static final long a(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j2) {
        int i2;
        long a0 = textFieldSelectionState.a0();
        if ((9223372034707292159L & a0) == 9205357640488583168L || transformedTextFieldState.o().length() == 0) {
            return Offset.f15855b.b();
        }
        long g2 = transformedTextFieldState.o().g();
        Handle Y = textFieldSelectionState.Y();
        int i3 = Y == null ? -1 : WhenMappings.f6444a[Y.ordinal()];
        if (i3 == -1) {
            return Offset.f15855b.b();
        }
        if (i3 == 1 || i3 == 2) {
            i2 = TextRange.n(g2);
        } else if (i3 == 3) {
            i2 = TextRange.i(g2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        TextLayoutResult f2 = textLayoutState.f();
        if (f2 == null) {
            return Offset.f15855b.b();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (a0 >> 32));
        int q2 = f2.q(i2);
        float s2 = f2.s(q2);
        float t2 = f2.t(q2);
        float n2 = RangesKt.n(intBitsToFloat, Math.min(s2, t2), Math.max(s2, t2));
        if (!IntSize.e(j2, IntSize.f19170b.a()) && Math.abs(intBitsToFloat - n2) > ((float) (((int) (j2 >> 32)) / 2))) {
            return Offset.f15855b.b();
        }
        float v2 = f2.v(q2);
        long e2 = Offset.e((((long) Float.floatToRawIntBits(((f2.m(q2) - v2) / ((float) 2)) + v2)) & 4294967295L) | (((long) Float.floatToRawIntBits(n2)) << 32));
        LayoutCoordinates j3 = textLayoutState.j();
        if (j3 != null) {
            if (!j3.b()) {
                j3 = null;
            }
            if (j3 != null) {
                e2 = TextLayoutStateKt.a(e2, SelectionManagerKt.i(j3));
            }
        }
        return TextLayoutStateKt.c(textLayoutState, e2);
    }
}
