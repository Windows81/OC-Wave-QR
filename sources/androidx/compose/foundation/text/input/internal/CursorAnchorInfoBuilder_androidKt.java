package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class CursorAnchorInfoBuilder_androidKt {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i2, int i3, TextLayoutResult textLayoutResult, Rect rect) {
        int i4 = i3;
        Rect rect2 = rect;
        float[] fArr = new float[((i4 - i2) * 4)];
        textLayoutResult.w().a(TextRangeKt.b(i2, i3), fArr, 0);
        for (int i5 = i2; i5 < i4; i5++) {
            int i6 = (i5 - i2) * 4;
            Rect rect3 = new Rect(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3]);
            boolean z2 = rect2.z(rect3);
            if (!LegacyCursorAnchorInfoBuilder_androidKt.c(rect2, rect3.o(), rect3.r()) || !LegacyCursorAnchorInfoBuilder_androidKt.c(rect2, rect3.p(), rect3.i())) {
                z2 |= true;
            }
            if (textLayoutResult.c(i5) == ResolvedTextDirection.Rtl) {
                z2 |= true;
            }
            builder.addCharacterBounds(i5, rect3.o(), rect3.r(), rect3.p(), rect3.i(), z2 ? 1 : 0);
        }
        return builder;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j2, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        builder.reset();
        builder.setMatrix(matrix);
        int l2 = TextRange.l(j2);
        builder.setSelectionRange(l2, TextRange.k(j2));
        if (z2) {
            c(builder, l2, textLayoutResult, rect);
        }
        if (z3) {
            int i2 = -1;
            int l3 = textRange != null ? TextRange.l(textRange.r()) : -1;
            if (textRange != null) {
                i2 = TextRange.k(textRange.r());
            }
            if (l3 >= 0 && l3 < i2) {
                builder.setComposingText(l3, charSequence.subSequence(l3, i2));
                a(builder, l3, i2, textLayoutResult, rect);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 && z4) {
            CursorAnchorInfoApi33Helper.a(builder, rect2);
        }
        if (i3 >= 34 && z5) {
            CursorAnchorInfoApi34Helper.a(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static final CursorAnchorInfo.Builder c(CursorAnchorInfo.Builder builder, int i2, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        Rect e2 = textLayoutResult.e(i2);
        float n2 = RangesKt.n(e2.o(), 0.0f, (float) ((int) (textLayoutResult.B() >> 32)));
        boolean c2 = LegacyCursorAnchorInfoBuilder_androidKt.c(rect, n2, e2.r());
        boolean c3 = LegacyCursorAnchorInfoBuilder_androidKt.c(rect, n2, e2.i());
        int i3 = 0;
        boolean z2 = textLayoutResult.c(i2) == ResolvedTextDirection.Rtl;
        if (c2 || c3) {
            i3 = 1;
        }
        if (!c2 || !c3) {
            i3 |= 2;
        }
        builder.setInsertionMarkerLocation(n2, e2.r(), e2.i(), e2.i(), z2 ? i3 | 4 : i3);
        return builder;
    }
}
