package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class LayerSnapshotV28 implements LayerSnapshotImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final LayerSnapshotV28 f16439a = new LayerSnapshotV28();

    @Metadata
    public static final class GraphicsLayerPicture extends Picture {

        /* renamed from: a  reason: collision with root package name */
        public final GraphicsLayer f16440a;

        public GraphicsLayerPicture(GraphicsLayer graphicsLayer) {
            this.f16440a = graphicsLayer;
        }

        public Canvas beginRecording(int i2, int i3) {
            return new Canvas();
        }

        public void draw(Canvas canvas) {
            this.f16440a.h(AndroidCanvas_androidKt.b(canvas), (GraphicsLayer) null);
        }

        public void endRecording() {
        }

        public int getHeight() {
            return (int) (this.f16440a.x() & 4294967295L);
        }

        public int getWidth() {
            return (int) (this.f16440a.x() >> 32);
        }

        public boolean requiresHardwareAcceleration() {
            return true;
        }
    }

    public Object a(GraphicsLayer graphicsLayer, Continuation continuation) {
        return Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
    }
}
