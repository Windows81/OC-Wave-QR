package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class CanvasDrawScope$drawContext$1 implements DrawContext {

    /* renamed from: a  reason: collision with root package name */
    public final DrawTransform f16283a = CanvasDrawScopeKt.b(this);

    /* renamed from: b  reason: collision with root package name */
    public GraphicsLayer f16284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CanvasDrawScope f16285c;

    public CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.f16285c = canvasDrawScope;
    }

    public void a(Density density) {
        this.f16285c.G().j(density);
    }

    public long c() {
        return this.f16285c.G().h();
    }

    public void d(LayoutDirection layoutDirection) {
        this.f16285c.G().k(layoutDirection);
    }

    public DrawTransform e() {
        return this.f16283a;
    }

    public void f(long j2) {
        this.f16285c.G().l(j2);
    }

    public void g(GraphicsLayer graphicsLayer) {
        this.f16284b = graphicsLayer;
    }

    public Density getDensity() {
        return this.f16285c.G().f();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f16285c.G().g();
    }

    public GraphicsLayer h() {
        return this.f16284b;
    }

    public void i(Canvas canvas) {
        this.f16285c.G().i(canvas);
    }

    public Canvas j() {
        return this.f16285c.G().e();
    }
}
