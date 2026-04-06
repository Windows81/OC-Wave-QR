package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata
final class CanvasCompatO {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasCompatO f18512a = new CanvasCompatO();

    public final boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(Canvas canvas, float f2, float f3, float f4, float f5) {
        return canvas.clipOutRect(f2, f3, f4, f5);
    }

    public final boolean c(Canvas canvas, int i2, int i3, int i4, int i5) {
        return canvas.clipOutRect(i2, i3, i4, i5);
    }

    public final boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
