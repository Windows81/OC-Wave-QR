package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;

@Metadata
final class CanvasZHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final CanvasZHelper f15970a = new CanvasZHelper();

    public final void a(Canvas canvas, boolean z2) {
        if (z2) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
