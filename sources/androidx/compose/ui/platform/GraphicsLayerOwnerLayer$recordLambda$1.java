package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class GraphicsLayerOwnerLayer$recordLambda$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GraphicsLayerOwnerLayer f17785z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.f17785z = graphicsLayerOwnerLayer;
    }

    public final void b(DrawScope drawScope) {
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.f17785z;
        Canvas j2 = drawScope.G1().j();
        Function2 m2 = graphicsLayerOwnerLayer.C;
        if (m2 != null) {
            m2.m(j2, drawScope.G1().h());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
