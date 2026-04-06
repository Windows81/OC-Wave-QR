package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorComponent$drawVectorBlock$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ VectorComponent f16622z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.f16622z = vectorComponent;
    }

    public final void b(DrawScope drawScope) {
        GroupComponent l2 = this.f16622z.l();
        VectorComponent vectorComponent = this.f16622z;
        float f2 = vectorComponent.f16618k;
        float g2 = vectorComponent.f16619l;
        long c2 = Offset.f15855b.c();
        DrawContext G1 = drawScope.G1();
        long c3 = G1.c();
        G1.j().o();
        try {
            G1.e().g(f2, g2, c2);
            l2.a(drawScope);
        } finally {
            G1.j().t();
            G1.f(c3);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
