package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class BlurKt$blur$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f15689A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f15690B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f15691z;

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        float B1 = graphicsLayerScope.B1(this.f15691z);
        float B12 = graphicsLayerScope.B1(this.f15689A);
        graphicsLayerScope.k((B1 <= 0.0f || B12 <= 0.0f) ? null : RenderEffectKt.a(B1, B12, this.f15690B));
        Shape shape = this.C;
        if (shape == null) {
            shape = RectangleShapeKt.a();
        }
        graphicsLayerScope.s1(shape);
        graphicsLayerScope.R(this.D);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
