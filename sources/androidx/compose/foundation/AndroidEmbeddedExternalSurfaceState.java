package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    public long E = IntSize.f19170b.a();
    public final Matrix F = new Matrix();
    public Surface G;

    public AndroidEmbeddedExternalSurfaceState(CoroutineScope coroutineScope) {
        super(coroutineScope);
    }

    public final Matrix f() {
        return this.F;
    }

    public final void g(long j2) {
        this.E = j2;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.e(this.E, IntSize.f19170b.a())) {
            long j2 = this.E;
            int i4 = (int) (j2 >> 32);
            i3 = (int) (j2 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i4, i3);
            i2 = i4;
        }
        Surface surface = new Surface(surfaceTexture);
        this.G = surface;
        d(surface, i2, i3);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.G;
        Intrinsics.f(surface);
        e(surface);
        this.G = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.e(this.E, IntSize.f19170b.a())) {
            long j2 = this.E;
            int i4 = (int) (j2 >> 32);
            i3 = (int) (j2 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i4, i3);
            i2 = i4;
        }
        Surface surface = this.G;
        Intrinsics.f(surface);
        c(surface, i2, i3);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
