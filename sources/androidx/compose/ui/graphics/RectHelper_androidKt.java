package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata
public final class RectHelper_androidKt {
    public static final Rect a(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.o(), (int) rect.r(), (int) rect.p(), (int) rect.i());
    }

    public static final Rect b(IntRect intRect) {
        return new Rect(intRect.g(), intRect.j(), intRect.h(), intRect.d());
    }

    public static final RectF c(androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.o(), rect.r(), rect.p(), rect.i());
    }

    public static final IntRect d(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect e(Rect rect) {
        return new androidx.compose.ui.geometry.Rect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect f(RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
