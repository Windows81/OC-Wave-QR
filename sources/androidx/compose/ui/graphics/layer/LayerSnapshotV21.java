package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class LayerSnapshotV21 implements LayerSnapshotImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final LayerSnapshotV21 f16436a = new LayerSnapshotV21();

    public Object a(GraphicsLayer graphicsLayer, Continuation continuation) {
        long x2 = graphicsLayer.x();
        Bitmap createBitmap = Bitmap.createBitmap((int) (x2 >> 32), (int) (x2 & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.h(AndroidCanvas_androidKt.b(new Canvas(createBitmap)), (GraphicsLayer) null);
        return createBitmap;
    }
}
