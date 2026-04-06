package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;

public final /* synthetic */ class x implements ImageReader.OnImageAvailableListener {
    public final void onImageAvailable(ImageReader imageReader) {
        LayerManager.e(imageReader);
    }
}
