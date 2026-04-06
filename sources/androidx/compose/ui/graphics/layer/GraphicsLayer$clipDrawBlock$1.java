package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GraphicsLayer f16341z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(GraphicsLayer graphicsLayer) {
        super(1);
        this.f16341z = graphicsLayer;
    }

    public final void b(DrawScope drawScope) {
        Path b2 = this.f16341z.f16328m;
        if (!this.f16341z.f16330o || !this.f16341z.m() || b2 == null) {
            this.f16341z.j(drawScope);
            return;
        }
        GraphicsLayer graphicsLayer = this.f16341z;
        int b3 = ClipOp.f15971b.b();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().c(b2, b3);
            graphicsLayer.j(drawScope);
        } finally {
            G1.j().t();
            G1.f(c2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
