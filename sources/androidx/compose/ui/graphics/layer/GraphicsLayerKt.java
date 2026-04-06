package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;

@Metadata
public final class GraphicsLayerKt {
    public static final void a(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.h(drawScope.G1().j(), drawScope.G1().h());
    }

    public static final void b(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float o2 = rectangle.b().o();
            float r2 = rectangle.b().r();
            long e2 = Offset.e((((long) Float.floatToRawIntBits(o2)) << 32) | (((long) Float.floatToRawIntBits(r2)) & 4294967295L));
            Rect b2 = rectangle.b();
            float p2 = b2.p() - b2.o();
            Rect b3 = rectangle.b();
            float i2 = b3.i() - b3.r();
            long floatToRawIntBits = (long) Float.floatToRawIntBits(p2);
            graphicsLayer.T(e2, Size.d((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (floatToRawIntBits << 32)));
        } else if (outline instanceof Outline.Generic) {
            graphicsLayer.Q(((Outline.Generic) outline).b());
        } else if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            if (rounded.c() != null) {
                graphicsLayer.Q(rounded.c());
                return;
            }
            RoundRect b4 = rounded.b();
            float e3 = b4.e();
            float g2 = b4.g();
            long e4 = Offset.e((((long) Float.floatToRawIntBits(e3)) << 32) | (((long) Float.floatToRawIntBits(g2)) & 4294967295L));
            float j2 = b4.j();
            float d2 = b4.d();
            long floatToRawIntBits2 = (long) Float.floatToRawIntBits(j2);
            GraphicsLayer graphicsLayer2 = graphicsLayer;
            graphicsLayer2.Y(e4, Size.d((((long) Float.floatToRawIntBits(d2)) & 4294967295L) | (floatToRawIntBits2 << 32)), Float.intBitsToFloat((int) (b4.b() >> 32)));
        }
    }
}
