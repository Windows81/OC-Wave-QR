package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SimpleGraphicsLayerModifier$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SimpleGraphicsLayerModifier f16121z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f16121z = simpleGraphicsLayerModifier;
    }

    public final void b(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.j(this.f16121z.o());
        graphicsLayerScope.i(this.f16121z.Y());
        graphicsLayerScope.d(this.f16121z.a3());
        graphicsLayerScope.l(this.f16121z.Q());
        graphicsLayerScope.h(this.f16121z.K());
        graphicsLayerScope.p(this.f16121z.f3());
        graphicsLayerScope.n(this.f16121z.S());
        graphicsLayerScope.e(this.f16121z.z());
        graphicsLayerScope.g(this.f16121z.B());
        graphicsLayerScope.m(this.f16121z.O());
        graphicsLayerScope.Q1(this.f16121z.N1());
        graphicsLayerScope.s1(this.f16121z.g3());
        graphicsLayerScope.R(this.f16121z.c3());
        graphicsLayerScope.k(this.f16121z.e3());
        graphicsLayerScope.L(this.f16121z.b3());
        graphicsLayerScope.T(this.f16121z.h3());
        graphicsLayerScope.y(this.f16121z.d3());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((GraphicsLayerScope) obj);
        return Unit.f40552a;
    }
}
