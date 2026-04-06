package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import kotlin.Metadata;

@Metadata
final class SurfaceVerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final SurfaceVerificationHelper f16449a = new SurfaceVerificationHelper();

    public final Canvas a(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
