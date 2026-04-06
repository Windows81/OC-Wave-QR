package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import kotlin.Metadata;

@Metadata
public final class SurfaceUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final SurfaceUtils f16448a = new SurfaceUtils();

    public final boolean a() {
        return true;
    }

    public final Canvas b(Surface surface) {
        return SurfaceVerificationHelper.f16449a.a(surface);
    }
}
