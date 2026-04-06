package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NodeCoordinator$drawBlock$1 extends Lambda implements Function2<Canvas, GraphicsLayer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f17394A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f17395z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator, Function0 function0) {
        super(2);
        this.f17395z = nodeCoordinator;
        this.f17394A = function0;
    }

    public final void b(Canvas canvas, GraphicsLayer graphicsLayer) {
        if (this.f17395z.X1().u()) {
            this.f17395z.g0 = canvas;
            this.f17395z.f0 = graphicsLayer;
            this.f17395z.T2().i(this.f17395z, NodeCoordinator.o0, this.f17394A);
            this.f17395z.j0 = false;
            return;
        }
        this.f17395z.j0 = true;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Canvas) obj, (GraphicsLayer) obj2);
        return Unit.f40552a;
    }
}
