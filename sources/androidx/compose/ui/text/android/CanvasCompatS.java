package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import kotlin.Metadata;

@Metadata
final class CanvasCompatS {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasCompatS f18515a = new CanvasCompatS();

    public final void a(Canvas canvas, int[] iArr, int i2, float[] fArr, int i3, int i4, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i2, fArr, i3, i4, font, paint);
    }

    public final void b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
