package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Density f15662a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15663b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f15664c;

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j2, function1);
    }

    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.f15662a;
        long j2 = this.f15663b;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas b2 = AndroidCanvas_androidKt.b(canvas);
        Function1 function1 = this.f15664c;
        CanvasDrawScope.DrawParams G = canvasDrawScope.G();
        Density a2 = G.a();
        LayoutDirection b3 = G.b();
        androidx.compose.ui.graphics.Canvas c2 = G.c();
        long d2 = G.d();
        CanvasDrawScope.DrawParams G2 = canvasDrawScope.G();
        G2.j(density);
        G2.k(layoutDirection);
        G2.i(b2);
        G2.l(j2);
        b2.o();
        function1.invoke(canvasDrawScope);
        b2.t();
        CanvasDrawScope.DrawParams G3 = canvasDrawScope.G();
        G3.j(a2);
        G3.k(b3);
        G3.i(c2);
        G3.l(d2);
    }

    public void onProvideShadowMetrics(Point point, Point point2) {
        Density density = this.f15662a;
        point.set(density.P1(density.E(Float.intBitsToFloat((int) (this.f15663b >> 32)))), density.P1(density.E(Float.intBitsToFloat((int) (this.f15663b & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    public ComposeDragShadowBuilder(Density density, long j2, Function1 function1) {
        this.f15662a = density;
        this.f15663b = j2;
        this.f15664c = function1;
    }
}
