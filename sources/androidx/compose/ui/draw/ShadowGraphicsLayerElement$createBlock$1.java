package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ShadowGraphicsLayerElement$createBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ShadowGraphicsLayerElement f15722z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.f15722z = shadowGraphicsLayerElement;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.p(graphicsLayerScope.B1(this.f15722z.h()));
        graphicsLayerScope.s1(this.f15722z.i());
        graphicsLayerScope.R(this.f15722z.g());
        graphicsLayerScope.L(this.f15722z.e());
        graphicsLayerScope.T(this.f15722z.j());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
