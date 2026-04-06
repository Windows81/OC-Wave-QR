package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata
public final class MultiWidgetSelectionDelegateKt {
    public static final void a(SelectionLayoutBuilder selectionLayoutBuilder, TextLayoutResult textLayoutResult, long j2, long j3, long j4) {
        Direction direction;
        Direction direction2;
        Direction direction3;
        Direction direction4;
        Direction direction5;
        int i2;
        int i3;
        Selection.AnchorInfo e2;
        Selection.AnchorInfo c2;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        Rect rect = new Rect(0.0f, 0.0f, (float) ((int) (textLayoutResult.B() >> 32)), (float) ((int) (textLayoutResult.B() & 4294967295L)));
        Direction f2 = f(j5, rect);
        Direction g2 = g(j5, rect);
        if (selectionLayoutBuilder.h()) {
            Selection f3 = selectionLayoutBuilder.f();
            direction5 = b(f2, g2, selectionLayoutBuilder, j4, f3 != null ? f3.c() : null);
            direction2 = direction5;
            direction = direction2;
            direction4 = f2;
            direction3 = g2;
        } else {
            Selection f4 = selectionLayoutBuilder.f();
            direction5 = b(f2, g2, selectionLayoutBuilder, j4, f4 != null ? f4.e() : null);
            direction4 = direction5;
            direction3 = direction4;
            direction2 = f2;
            direction = g2;
        }
        if (h(SelectionLayoutKt.f(f2, g2), direction5)) {
            int length = textLayoutResult.l().j().length();
            if (selectionLayoutBuilder.h()) {
                int d2 = d(j5, textLayoutResult2);
                Selection f5 = selectionLayoutBuilder.f();
                int e3 = (f5 == null || (c2 = f5.c()) == null) ? d2 : e(c2, selectionLayoutBuilder.g(), j7, length);
                i3 = d2;
                i2 = e3;
            } else {
                int d3 = d(j5, textLayoutResult2);
                Selection f6 = selectionLayoutBuilder.f();
                i2 = d3;
                i3 = (f6 == null || (e2 = f6.e()) == null) ? d3 : e(e2, selectionLayoutBuilder.g(), j7, length);
            }
            selectionLayoutBuilder.a(j4, i3, direction4, direction3, i2, direction2, direction, (9223372034707292159L & j6) == 9205357640488583168L ? -1 : d(j6, textLayoutResult2), textLayoutResult);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = c(r4, r7.e(), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.Direction b(androidx.compose.foundation.text.selection.Direction r2, androidx.compose.foundation.text.selection.Direction r3, androidx.compose.foundation.text.selection.SelectionLayoutBuilder r4, long r5, androidx.compose.foundation.text.selection.Selection.AnchorInfo r7) {
        /*
            if (r7 == 0) goto L_0x000c
            long r0 = r7.e()
            androidx.compose.foundation.text.selection.Direction r4 = c(r4, r0, r5)
            if (r4 != 0) goto L_0x0010
        L_0x000c:
            androidx.compose.foundation.text.selection.Direction r4 = androidx.compose.foundation.text.selection.SelectionLayoutKt.f(r2, r3)
        L_0x0010:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegateKt.b(androidx.compose.foundation.text.selection.Direction, androidx.compose.foundation.text.selection.Direction, androidx.compose.foundation.text.selection.SelectionLayoutBuilder, long, androidx.compose.foundation.text.selection.Selection$AnchorInfo):androidx.compose.foundation.text.selection.Direction");
    }

    public static final Direction c(SelectionLayoutBuilder selectionLayoutBuilder, long j2, long j3) {
        int compare = selectionLayoutBuilder.g().compare(Long.valueOf(j2), Long.valueOf(j3));
        return compare < 0 ? Direction.BEFORE : compare > 0 ? Direction.AFTER : Direction.ON;
    }

    public static final int d(long j2, TextLayoutResult textLayoutResult) {
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i2) >= textLayoutResult.w().h() ? textLayoutResult.l().j().length() : textLayoutResult.x(j2);
    }

    public static final int e(Selection.AnchorInfo anchorInfo, Comparator comparator, long j2, int i2) {
        int compare = comparator.compare(Long.valueOf(anchorInfo.e()), Long.valueOf(j2));
        if (compare < 0) {
            return 0;
        }
        return compare > 0 ? i2 : anchorInfo.d();
    }

    public static final Direction f(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        return Float.intBitsToFloat(i2) < rect.o() ? Direction.BEFORE : Float.intBitsToFloat(i2) > rect.p() ? Direction.AFTER : Direction.ON;
    }

    public static final Direction g(long j2, Rect rect) {
        int i2 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) < rect.r() ? Direction.BEFORE : Float.intBitsToFloat(i2) > rect.i() ? Direction.AFTER : Direction.ON;
    }

    public static final boolean h(Direction direction, Direction direction2) {
        return direction == Direction.ON || direction != direction2;
    }
}
