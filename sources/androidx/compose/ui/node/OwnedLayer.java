package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public interface OwnedLayer {
    void a(float[] fArr);

    void b();

    boolean c(long j2);

    void d(ReusableGraphicsLayerScope reusableGraphicsLayerScope);

    long e(long j2, boolean z2);

    void f(Function2 function2, Function0 function0);

    void g(long j2);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ  reason: not valid java name */
    float[] m2getUnderlyingMatrixsQKQjiQ();

    void h(Canvas canvas, GraphicsLayer graphicsLayer);

    void i(float[] fArr);

    void invalidate();

    void j(MutableRect mutableRect, boolean z2);

    void k(long j2);

    void l();
}
