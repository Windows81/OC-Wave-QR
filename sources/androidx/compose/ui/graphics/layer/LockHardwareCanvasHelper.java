package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import kotlin.Metadata;

@Metadata
final class LockHardwareCanvasHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final LockHardwareCanvasHelper f16441a = new LockHardwareCanvasHelper();

    public final Canvas a(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
