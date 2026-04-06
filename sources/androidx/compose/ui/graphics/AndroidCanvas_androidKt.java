package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidCanvas_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Canvas f15884a = new Canvas();

    public static final Canvas a(ImageBitmap imageBitmap) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.B(new Canvas(AndroidImageBitmap_androidKt.b(imageBitmap)));
        return androidCanvas;
    }

    public static final Canvas b(Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.B(canvas);
        return androidCanvas;
    }

    public static final Canvas d(Canvas canvas) {
        Intrinsics.g(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).A();
    }
}
