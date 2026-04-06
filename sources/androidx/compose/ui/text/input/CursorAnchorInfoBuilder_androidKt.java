package androidx.compose.ui.text.input;

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
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, int i2, int i3, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        int i4 = i3;
        OffsetMapping offsetMapping2 = offsetMapping;
        int i5 = i2;
        Rect rect2 = rect;
        int b2 = offsetMapping2.b(i5);
        int b3 = offsetMapping2.b(i4);
        float[] fArr = new float[((b3 - b2) * 4)];
        textLayoutResult.w().a(TextRangeKt.b(b2, b3), fArr, 0);
        while (i5 < i4) {
            int b4 = offsetMapping2.b(i5);
            int i6 = (b4 - b2) * 4;
            Rect rect3 = new Rect(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3]);
            boolean z2 = rect2.z(rect3);
            if (!c(rect2, rect3.o(), rect3.r()) || !c(rect2, rect3.p(), rect3.i())) {
                z2 |= true;
            }
            builder.addCharacterBounds(i5, rect3.o(), rect3.r(), rect3.p(), rect3.i(), textLayoutResult.c(b4) == ResolvedTextDirection.Rtl ? z2 | true : z2 ? 1 : 0);
            i5++;
        }
        return builder;
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z2, boolean z3, boolean z4, boolean z5) {
        CursorAnchorInfo.Builder builder2 = builder;
        TextLayoutResult textLayoutResult2 = textLayoutResult;
        Rect rect3 = rect;
        builder.reset();
        Matrix matrix2 = matrix;
        builder.setMatrix(matrix);
        int l2 = TextRange.l(textFieldValue.h());
        builder.setSelectionRange(l2, TextRange.k(textFieldValue.h()));
        OffsetMapping offsetMapping2 = offsetMapping;
        if (z2) {
            d(builder, l2, offsetMapping, textLayoutResult, rect);
        }
        if (z3) {
            TextRange g2 = textFieldValue.g();
            int l3 = g2 != null ? TextRange.l(g2.r()) : -1;
            TextRange g3 = textFieldValue.g();
            int k2 = g3 != null ? TextRange.k(g3.r()) : -1;
            if (l3 >= 0 && l3 < k2) {
                builder.setComposingText(l3, textFieldValue.i().subSequence(l3, k2));
                a(builder, l3, k2, offsetMapping, textLayoutResult, rect);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && z4) {
            Rect rect4 = rect2;
            CursorAnchorInfoApi33Helper.a(builder, rect2);
        }
        if (i2 >= 34 && z5) {
            CursorAnchorInfoApi34Helper.a(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static final boolean c(Rect rect, float f2, float f3) {
        float o2 = rect.o();
        if (f2 <= rect.p() && o2 <= f2) {
            return f3 <= rect.i() && rect.r() <= f3;
        }
    }

    public static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        int b2 = offsetMapping.b(i2);
        Rect e2 = textLayoutResult.e(b2);
        float n2 = RangesKt.n(e2.o(), 0.0f, (float) ((int) (textLayoutResult.B() >> 32)));
        boolean c2 = c(rect, n2, e2.r());
        boolean c3 = c(rect, n2, e2.i());
        int i3 = 0;
        boolean z2 = textLayoutResult.c(b2) == ResolvedTextDirection.Rtl;
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
