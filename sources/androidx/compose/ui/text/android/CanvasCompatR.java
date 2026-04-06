package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata
final class CanvasCompatR {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasCompatR f18514a = new CanvasCompatR();

    public final boolean a(Canvas canvas, float f2, float f3, float f4, float f5) {
        return canvas.quickReject(f2, f3, f4, f5);
    }

    public final boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
