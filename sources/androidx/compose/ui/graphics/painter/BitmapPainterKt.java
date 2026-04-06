package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BitmapPainterKt {
    public static final BitmapPainter a(ImageBitmap imageBitmap, long j2, long j3, int i2) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j2, j3, (DefaultConstructorMarker) null);
        bitmapPainter.n(i2);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(ImageBitmap imageBitmap, long j2, long j3, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j2 = IntOffset.f19160b.b();
        }
        long j4 = j2;
        if ((i3 & 4) != 0) {
            int b2 = imageBitmap.b();
            j3 = IntSize.c((((long) imageBitmap.a()) & 4294967295L) | (((long) b2) << 32));
        }
        long j5 = j3;
        if ((i3 & 8) != 0) {
            i2 = FilterQuality.f16003b.a();
        }
        return a(imageBitmap, j4, j5, i2);
    }
}
