package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import kotlin.Metadata;

@Metadata
final class HandleImageCache {

    /* renamed from: a  reason: collision with root package name */
    public static final HandleImageCache f6746a = new HandleImageCache();

    /* renamed from: b  reason: collision with root package name */
    public static ImageBitmap f6747b;

    /* renamed from: c  reason: collision with root package name */
    public static Canvas f6748c;

    /* renamed from: d  reason: collision with root package name */
    public static CanvasDrawScope f6749d;

    public final Canvas a() {
        return f6748c;
    }

    public final CanvasDrawScope b() {
        return f6749d;
    }

    public final ImageBitmap c() {
        return f6747b;
    }

    public final void d(Canvas canvas) {
        f6748c = canvas;
    }

    public final void e(CanvasDrawScope canvasDrawScope) {
        f6749d = canvasDrawScope;
    }

    public final void f(ImageBitmap imageBitmap) {
        f6747b = imageBitmap;
    }
}
