package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {
    public int E = -1;
    public int F = -1;

    public AndroidExternalSurfaceState(CoroutineScope coroutineScope) {
        super(coroutineScope);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        if (this.E != i3 || this.F != i4) {
            this.E = i3;
            this.F = i4;
            c(surfaceHolder.getSurface(), i3, i4);
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.E = surfaceFrame.width();
        this.F = surfaceFrame.height();
        d(surfaceHolder.getSurface(), this.E, this.F);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e(surfaceHolder.getSurface());
    }
}
