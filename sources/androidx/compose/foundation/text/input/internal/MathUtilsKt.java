package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public final class MathUtilsKt {
    public static final float a(long j2, Rect rect) {
        if (SelectionManagerKt.d(rect, j2)) {
            return 0.0f;
        }
        float l2 = Offset.l(Offset.p(rect.t(), j2));
        if (l2 >= Float.MAX_VALUE) {
            l2 = Float.MAX_VALUE;
        }
        float l3 = Offset.l(Offset.p(rect.u(), j2));
        if (l3 < l2) {
            l2 = l3;
        }
        float l4 = Offset.l(Offset.p(rect.k(), j2));
        if (l4 < l2) {
            l2 = l4;
        }
        float l5 = Offset.l(Offset.p(rect.l(), j2));
        return l5 < l2 ? l5 : l2;
    }

    public static final int b(long j2, Rect rect, Rect rect2) {
        int i2 = (a(j2, rect) > a(j2, rect2) ? 1 : (a(j2, rect) == a(j2, rect2) ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        return i2 < 0 ? -1 : 1;
    }
}
