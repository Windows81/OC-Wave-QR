package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DrawScope$record$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f16292A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DrawScope f16293z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawScope$record$1(DrawScope drawScope, Function1 function1) {
        super(1);
        this.f16293z = drawScope;
        this.f16292A = function1;
    }

    public final void b(DrawScope drawScope) {
        DrawScope drawScope2 = this.f16293z;
        Density density = drawScope.G1().getDensity();
        LayoutDirection layoutDirection = drawScope.G1().getLayoutDirection();
        Canvas j2 = drawScope.G1().j();
        long c2 = drawScope.G1().c();
        GraphicsLayer h2 = drawScope.G1().h();
        Function1 function1 = this.f16292A;
        Density density2 = drawScope2.G1().getDensity();
        LayoutDirection layoutDirection2 = drawScope2.G1().getLayoutDirection();
        Canvas j3 = drawScope2.G1().j();
        long c3 = drawScope2.G1().c();
        GraphicsLayer h3 = drawScope2.G1().h();
        DrawContext G1 = drawScope2.G1();
        G1.a(density);
        G1.d(layoutDirection);
        G1.i(j2);
        G1.f(c2);
        G1.g(h2);
        j2.o();
        try {
            function1.invoke(drawScope2);
        } finally {
            j2.t();
            DrawContext G12 = drawScope2.G1();
            G12.a(density2);
            G12.d(layoutDirection2);
            G12.i(j3);
            G12.f(c3);
            G12.g(h3);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
