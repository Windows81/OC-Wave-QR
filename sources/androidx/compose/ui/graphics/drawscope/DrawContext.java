package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public interface DrawContext {
    void a(Density density) {
    }

    long c();

    void d(LayoutDirection layoutDirection) {
    }

    DrawTransform e();

    void f(long j2);

    void g(GraphicsLayer graphicsLayer) {
    }

    Density getDensity() {
        return DrawContextKt.a();
    }

    LayoutDirection getLayoutDirection() {
        return LayoutDirection.Ltr;
    }

    GraphicsLayer h() {
        return null;
    }

    void i(Canvas canvas) {
    }

    Canvas j() {
        return EmptyCanvas.f16294a;
    }
}
