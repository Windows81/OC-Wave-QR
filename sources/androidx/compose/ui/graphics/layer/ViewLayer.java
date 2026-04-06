package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ViewLayer extends View {
    public static final Companion J = new Companion((DefaultConstructorMarker) null);
    public static final ViewOutlineProvider K = new ViewLayer$Companion$LayerOutlineProvider$1();

    /* renamed from: A  reason: collision with root package name */
    public final CanvasHolder f16450A;

    /* renamed from: B  reason: collision with root package name */
    public final CanvasDrawScope f16451B;
    public boolean C;
    public Outline D;
    public boolean E = true;
    public Density F = DrawContextKt.a();
    public LayoutDirection G = LayoutDirection.Ltr;
    public Function1 H = GraphicsLayerImpl.f16343a.a();
    public GraphicsLayer I;

    /* renamed from: z  reason: collision with root package name */
    public final View f16452z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ViewLayer(View view, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        super(view.getContext());
        this.f16452z = view;
        this.f16450A = canvasHolder;
        this.f16451B = canvasDrawScope;
        setOutlineProvider(K);
        setWillNotDraw(false);
        setClipBounds((Rect) null);
    }

    public final boolean b() {
        return this.C;
    }

    public final void c(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        this.F = density;
        this.G = layoutDirection;
        this.H = function1;
        this.I = graphicsLayer;
    }

    public final boolean d(Outline outline) {
        this.D = outline;
        return OutlineUtils.f16442a.a(this);
    }

    public void dispatchDraw(Canvas canvas) {
        CanvasHolder canvasHolder = this.f16450A;
        Canvas A2 = canvasHolder.a().A();
        canvasHolder.a().B(canvas);
        AndroidCanvas a2 = canvasHolder.a();
        CanvasDrawScope canvasDrawScope = this.f16451B;
        Density density = this.F;
        LayoutDirection layoutDirection = this.G;
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) getWidth());
        long d2 = Size.d((((long) Float.floatToRawIntBits((float) getHeight())) & 4294967295L) | (floatToRawIntBits << 32));
        GraphicsLayer graphicsLayer = this.I;
        Function1 function1 = this.H;
        Density density2 = canvasDrawScope.G1().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.G1().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas j2 = canvasDrawScope.G1().j();
        long c2 = canvasDrawScope.G1().c();
        GraphicsLayer h2 = canvasDrawScope.G1().h();
        Canvas canvas2 = A2;
        DrawContext G1 = canvasDrawScope.G1();
        G1.a(density);
        G1.d(layoutDirection);
        G1.i(a2);
        G1.f(d2);
        G1.g(graphicsLayer);
        a2.o();
        try {
            function1.invoke(canvasDrawScope);
            a2.t();
            DrawContext G12 = canvasDrawScope.G1();
            G12.a(density2);
            G12.d(layoutDirection2);
            G12.i(j2);
            G12.f(c2);
            G12.g(h2);
            canvasHolder.a().B(canvas2);
            this.C = false;
        } catch (Throwable th) {
            GraphicsLayer graphicsLayer2 = h2;
            Throwable th2 = th;
            a2.t();
            DrawContext G13 = canvasDrawScope.G1();
            G13.a(density2);
            G13.d(layoutDirection2);
            G13.i(j2);
            G13.f(c2);
            G13.g(graphicsLayer2);
            throw th2;
        }
    }

    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.E;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.f16450A;
    }

    public final View getOwnerView() {
        return this.f16452z;
    }

    public boolean hasOverlappingRendering() {
        return this.E;
    }

    public void invalidate() {
        if (!this.C) {
            this.C = true;
            super.invalidate();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z2) {
        this.C = z2;
    }
}
