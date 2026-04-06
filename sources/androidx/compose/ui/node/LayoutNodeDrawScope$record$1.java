package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LayoutNodeDrawScope$record$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DrawModifierNode f17300A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f17301B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeDrawScope f17302z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeDrawScope$record$1(LayoutNodeDrawScope layoutNodeDrawScope, DrawModifierNode drawModifierNode, Function1 function1) {
        super(1);
        this.f17302z = layoutNodeDrawScope;
        this.f17300A = drawModifierNode;
        this.f17301B = function1;
    }

    public final void b(DrawScope drawScope) {
        LayoutNodeDrawScope layoutNodeDrawScope;
        Canvas j2;
        Density density;
        LayoutDirection layoutDirection;
        Canvas j3;
        long c2;
        GraphicsLayer h2;
        DrawModifierNode drawModifierNode;
        DrawModifierNode b2 = this.f17302z.f17298A;
        this.f17302z.f17298A = this.f17300A;
        try {
            layoutNodeDrawScope = this.f17302z;
            Density density2 = drawScope.G1().getDensity();
            LayoutDirection layoutDirection2 = drawScope.G1().getLayoutDirection();
            j2 = drawScope.G1().j();
            long c3 = drawScope.G1().c();
            GraphicsLayer h3 = drawScope.G1().h();
            Function1 function1 = this.f17301B;
            density = layoutNodeDrawScope.G1().getDensity();
            layoutDirection = layoutNodeDrawScope.G1().getLayoutDirection();
            j3 = layoutNodeDrawScope.G1().j();
            c2 = layoutNodeDrawScope.G1().c();
            h2 = layoutNodeDrawScope.G1().h();
            drawModifierNode = b2;
            try {
                DrawContext G1 = layoutNodeDrawScope.G1();
                G1.a(density2);
                G1.d(layoutDirection2);
                G1.i(j2);
                G1.f(c3);
                G1.g(h3);
                j2.o();
                function1.invoke(layoutNodeDrawScope);
                j2.t();
                DrawContext G12 = layoutNodeDrawScope.G1();
                G12.a(density);
                G12.d(layoutDirection);
                G12.i(j3);
                G12.f(c2);
                G12.g(h2);
                this.f17302z.f17298A = drawModifierNode;
            } catch (Throwable th) {
                th = th;
                b2 = drawModifierNode;
                this.f17302z.f17298A = b2;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            this.f17302z.f17298A = b2;
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
