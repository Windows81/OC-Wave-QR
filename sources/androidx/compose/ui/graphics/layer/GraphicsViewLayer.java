package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    public static final Companion L = new Companion((DefaultConstructorMarker) null);
    public static final boolean M = (!SurfaceUtils.f16448a.a());
    public static final Canvas N = new GraphicsViewLayer$Companion$PlaceholderCanvas$1();

    /* renamed from: A  reason: collision with root package name */
    public float f16401A;

    /* renamed from: B  reason: collision with root package name */
    public float f16402B;
    public float C;
    public float D;
    public long E;
    public long F;
    public float G;
    public float H;
    public float I;
    public RenderEffect J;
    public final boolean K;

    /* renamed from: b  reason: collision with root package name */
    public final DrawChildContainer f16403b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16404c;

    /* renamed from: d  reason: collision with root package name */
    public final CanvasHolder f16405d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewLayer f16406e;

    /* renamed from: f  reason: collision with root package name */
    public final Resources f16407f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f16408g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f16409h;

    /* renamed from: i  reason: collision with root package name */
    public final Picture f16410i;

    /* renamed from: j  reason: collision with root package name */
    public final CanvasDrawScope f16411j;

    /* renamed from: k  reason: collision with root package name */
    public final CanvasHolder f16412k;

    /* renamed from: l  reason: collision with root package name */
    public int f16413l;

    /* renamed from: m  reason: collision with root package name */
    public int f16414m;

    /* renamed from: n  reason: collision with root package name */
    public long f16415n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16416o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16417p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16418q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16419r;

    /* renamed from: s  reason: collision with root package name */
    public final long f16420s;

    /* renamed from: t  reason: collision with root package name */
    public int f16421t;

    /* renamed from: u  reason: collision with root package name */
    public ColorFilter f16422u;

    /* renamed from: v  reason: collision with root package name */
    public int f16423v;

    /* renamed from: w  reason: collision with root package name */
    public float f16424w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16425x;

    /* renamed from: y  reason: collision with root package name */
    public long f16426y;

    /* renamed from: z  reason: collision with root package name */
    public float f16427z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.f16403b = drawChildContainer;
        this.f16404c = j2;
        this.f16405d = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.f16406e = viewLayer;
        this.f16407f = drawChildContainer.getResources();
        this.f16408g = new Rect();
        boolean z2 = M;
        this.f16410i = z2 ? new Picture() : null;
        this.f16411j = z2 ? new CanvasDrawScope() : null;
        this.f16412k = z2 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds((Rect) null);
        this.f16415n = IntSize.f19170b.a();
        this.f16417p = true;
        this.f16420s = (long) View.generateViewId();
        this.f16421t = BlendMode.f15926b.B();
        this.f16423v = CompositingStrategy.f16309b.a();
        this.f16424w = 1.0f;
        this.f16426y = Offset.f15855b.c();
        this.f16427z = 1.0f;
        this.f16401A = 1.0f;
        Color.Companion companion = Color.f15975b;
        this.E = companion.a();
        this.F = companion.a();
        this.K = z2;
    }

    private final boolean M() {
        return CompositingStrategy.f(x(), CompositingStrategy.f16309b.c()) || N();
    }

    private final boolean N() {
        return !BlendMode.F(s(), BlendMode.f15926b.B()) || f() != null;
    }

    private final void U() {
        if (M()) {
            a(CompositingStrategy.f16309b.c());
        } else {
            a(x());
        }
    }

    public void A(long j2) {
        this.f16426y = j2;
        if ((9223372034707292159L & j2) != 9205357640488583168L) {
            this.f16425x = false;
            this.f16406e.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
            this.f16406e.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else if (Build.VERSION.SDK_INT >= 28) {
            ViewLayerVerificationHelper28.f16453a.a(this.f16406e);
        } else {
            this.f16425x = true;
            this.f16406e.setPivotX(((float) ((int) (this.f16415n >> 32))) / 2.0f);
            this.f16406e.setPivotY(((float) ((int) (4294967295L & this.f16415n))) / 2.0f);
        }
    }

    public float B() {
        return this.I;
    }

    public long C() {
        return this.E;
    }

    public long D() {
        return this.F;
    }

    public void E(int i2) {
        this.f16423v = i2;
        U();
    }

    public Matrix F() {
        return this.f16406e.getMatrix();
    }

    public boolean G() {
        return this.K;
    }

    public float H() {
        return this.D;
    }

    public void I(androidx.compose.ui.graphics.Canvas canvas) {
        P();
        Canvas d2 = AndroidCanvas_androidKt.d(canvas);
        if (d2.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.f16403b;
            ViewLayer viewLayer = this.f16406e;
            drawChildContainer.a(canvas, viewLayer, viewLayer.getDrawingTime());
            return;
        }
        Picture picture = this.f16410i;
        if (picture != null) {
            d2.drawPicture(picture);
        }
    }

    public final void J() {
        try {
            CanvasHolder canvasHolder = this.f16405d;
            Canvas canvas = N;
            Canvas A2 = canvasHolder.a().A();
            canvasHolder.a().B(canvas);
            AndroidCanvas a2 = canvasHolder.a();
            DrawChildContainer drawChildContainer = this.f16403b;
            ViewLayer viewLayer = this.f16406e;
            drawChildContainer.a(a2, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.a().B(A2);
        } catch (Throwable unused) {
        }
    }

    public float K() {
        return this.C;
    }

    public void L(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.E = j2;
            ViewLayerVerificationHelper28.f16453a.b(this.f16406e, ColorKt.j(j2));
        }
    }

    public float O() {
        return this.f16406e.getCameraDistance() / ((float) this.f16407f.getDisplayMetrics().densityDpi);
    }

    public final void P() {
        Rect rect;
        if (this.f16416o) {
            ViewLayer viewLayer = this.f16406e;
            if (!b() || this.f16418q) {
                rect = null;
            } else {
                rect = this.f16408g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f16406e.getWidth();
                rect.bottom = this.f16406e.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    public float Q() {
        return this.f16402B;
    }

    public void R(boolean z2) {
        boolean z3 = false;
        this.f16419r = z2 && !this.f16418q;
        this.f16416o = true;
        ViewLayer viewLayer = this.f16406e;
        if (z2 && this.f16418q) {
            z3 = true;
        }
        viewLayer.setClipToOutline(z3);
    }

    public float S() {
        return this.G;
    }

    public void T(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.F = j2;
            ViewLayerVerificationHelper28.f16453a.c(this.f16406e, ColorKt.j(j2));
        }
    }

    public float Y() {
        return this.f16401A;
    }

    public final void a(int i2) {
        ViewLayer viewLayer = this.f16406e;
        CompositingStrategy.Companion companion = CompositingStrategy.f16309b;
        boolean z2 = true;
        if (CompositingStrategy.f(i2, companion.c())) {
            this.f16406e.setLayerType(2, this.f16409h);
        } else if (CompositingStrategy.f(i2, companion.b())) {
            this.f16406e.setLayerType(0, this.f16409h);
            z2 = false;
        } else {
            this.f16406e.setLayerType(0, this.f16409h);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    public boolean b() {
        return this.f16419r || this.f16406e.getClipToOutline();
    }

    public float c() {
        return this.f16424w;
    }

    public void d(float f2) {
        this.f16424w = f2;
        this.f16406e.setAlpha(f2);
    }

    public void e(float f2) {
        this.H = f2;
        this.f16406e.setRotationY(f2);
    }

    public ColorFilter f() {
        return this.f16422u;
    }

    public void g(float f2) {
        this.I = f2;
        this.f16406e.setRotation(f2);
    }

    public void h(float f2) {
        this.C = f2;
        this.f16406e.setTranslationY(f2);
    }

    public void i(float f2) {
        this.f16401A = f2;
        this.f16406e.setScaleY(f2);
    }

    public void j(float f2) {
        this.f16427z = f2;
        this.f16406e.setScaleX(f2);
    }

    public void k(RenderEffect renderEffect) {
        this.J = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.f16454a.a(this.f16406e, renderEffect);
        }
    }

    public void l(float f2) {
        this.f16402B = f2;
        this.f16406e.setTranslationX(f2);
    }

    public void m(float f2) {
        this.f16406e.setCameraDistance(f2 * ((float) this.f16407f.getDisplayMetrics().densityDpi));
    }

    public void n(float f2) {
        this.G = f2;
        this.f16406e.setRotationX(f2);
    }

    public float o() {
        return this.f16427z;
    }

    public void p(float f2) {
        this.D = f2;
        this.f16406e.setElevation(f2);
    }

    public void q() {
        this.f16403b.removeViewInLayout(this.f16406e);
    }

    public int s() {
        return this.f16421t;
    }

    public void t(boolean z2) {
        this.f16417p = z2;
    }

    public RenderEffect u() {
        return this.J;
    }

    public void v(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        AndroidCanvas a2;
        CanvasDrawScope canvasDrawScope;
        Canvas canvas;
        CanvasHolder canvasHolder;
        Density density2;
        LayoutDirection layoutDirection2;
        androidx.compose.ui.graphics.Canvas j2;
        long c2;
        GraphicsLayer h2;
        Density density3 = density;
        LayoutDirection layoutDirection3 = layoutDirection;
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        Function1 function12 = function1;
        if (this.f16406e.getParent() == null) {
            this.f16403b.addView(this.f16406e);
        }
        this.f16406e.c(density3, layoutDirection3, graphicsLayer2, function12);
        if (this.f16406e.isAttachedToWindow()) {
            this.f16406e.setVisibility(4);
            this.f16406e.setVisibility(0);
            J();
            Picture picture = this.f16410i;
            if (picture != null) {
                long j3 = this.f16415n;
                Canvas beginRecording = picture.beginRecording((int) (j3 >> 32), (int) (j3 & 4294967295L));
                try {
                    CanvasHolder canvasHolder2 = this.f16412k;
                    if (canvasHolder2 != null) {
                        Canvas A2 = canvasHolder2.a().A();
                        canvasHolder2.a().B(beginRecording);
                        a2 = canvasHolder2.a();
                        canvasDrawScope = this.f16411j;
                        if (canvasDrawScope != null) {
                            long e2 = IntSizeKt.e(this.f16415n);
                            density2 = canvasDrawScope.G1().getDensity();
                            layoutDirection2 = canvasDrawScope.G1().getLayoutDirection();
                            j2 = canvasDrawScope.G1().j();
                            canvasHolder = canvasHolder2;
                            canvas = A2;
                            c2 = canvasDrawScope.G1().c();
                            h2 = canvasDrawScope.G1().h();
                            DrawContext G1 = canvasDrawScope.G1();
                            G1.a(density3);
                            G1.d(layoutDirection3);
                            G1.i(a2);
                            G1.f(e2);
                            G1.g(graphicsLayer2);
                            a2.o();
                            function12.invoke(canvasDrawScope);
                            a2.t();
                            DrawContext G12 = canvasDrawScope.G1();
                            G12.a(density2);
                            G12.d(layoutDirection2);
                            G12.i(j2);
                            G12.f(c2);
                            G12.g(h2);
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = A2;
                        }
                        canvasHolder.a().B(canvas);
                        Unit unit = Unit.f40552a;
                    }
                    picture.endRecording();
                } catch (Throwable th) {
                    picture.endRecording();
                    throw th;
                }
            }
        }
    }

    public void w(Outline outline, long j2) {
        boolean d2 = this.f16406e.d(outline);
        boolean z2 = false;
        if (b() && outline != null) {
            this.f16406e.setClipToOutline(true);
            if (this.f16419r) {
                this.f16419r = false;
                this.f16416o = true;
            }
        }
        if (outline != null) {
            z2 = true;
        }
        this.f16418q = z2;
        if (!d2) {
            this.f16406e.invalidate();
            J();
        }
    }

    public int x() {
        return this.f16423v;
    }

    public void y(int i2, int i3, long j2) {
        if (!IntSize.e(this.f16415n, j2)) {
            if (b()) {
                this.f16416o = true;
            }
            int i4 = (int) (j2 >> 32);
            int i5 = (int) (4294967295L & j2);
            this.f16406e.layout(i2, i3, i2 + i4, i3 + i5);
            this.f16415n = j2;
            if (this.f16425x) {
                this.f16406e.setPivotX(((float) i4) / 2.0f);
                this.f16406e.setPivotY(((float) i5) / 2.0f);
            }
        } else {
            int i6 = this.f16413l;
            if (i6 != i2) {
                this.f16406e.offsetLeftAndRight(i2 - i6);
            }
            int i7 = this.f16414m;
            if (i7 != i3) {
                this.f16406e.offsetTopAndBottom(i3 - i7);
            }
        }
        this.f16413l = i2;
        this.f16414m = i3;
    }

    public float z() {
        return this.H;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
