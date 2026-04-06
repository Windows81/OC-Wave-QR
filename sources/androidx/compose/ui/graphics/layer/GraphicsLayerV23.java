package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.CompositingStrategy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final Companion G = new Companion((DefaultConstructorMarker) null);
    public static boolean H;
    public static final AtomicBoolean I = new AtomicBoolean(true);

    /* renamed from: A  reason: collision with root package name */
    public float f16347A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f16348B;
    public boolean C;
    public boolean D;
    public RenderEffect E;
    public boolean F;

    /* renamed from: b  reason: collision with root package name */
    public final long f16349b;

    /* renamed from: c  reason: collision with root package name */
    public final CanvasHolder f16350c;

    /* renamed from: d  reason: collision with root package name */
    public final CanvasDrawScope f16351d;

    /* renamed from: e  reason: collision with root package name */
    public final RenderNode f16352e;

    /* renamed from: f  reason: collision with root package name */
    public long f16353f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f16354g;

    /* renamed from: h  reason: collision with root package name */
    public Matrix f16355h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16356i;

    /* renamed from: j  reason: collision with root package name */
    public long f16357j;

    /* renamed from: k  reason: collision with root package name */
    public int f16358k;

    /* renamed from: l  reason: collision with root package name */
    public int f16359l;

    /* renamed from: m  reason: collision with root package name */
    public ColorFilter f16360m;

    /* renamed from: n  reason: collision with root package name */
    public float f16361n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16362o;

    /* renamed from: p  reason: collision with root package name */
    public long f16363p;

    /* renamed from: q  reason: collision with root package name */
    public float f16364q;

    /* renamed from: r  reason: collision with root package name */
    public float f16365r;

    /* renamed from: s  reason: collision with root package name */
    public float f16366s;

    /* renamed from: t  reason: collision with root package name */
    public float f16367t;

    /* renamed from: u  reason: collision with root package name */
    public float f16368u;

    /* renamed from: v  reason: collision with root package name */
    public long f16369v;

    /* renamed from: w  reason: collision with root package name */
    public long f16370w;

    /* renamed from: x  reason: collision with root package name */
    public float f16371x;

    /* renamed from: y  reason: collision with root package name */
    public float f16372y;

    /* renamed from: z  reason: collision with root package name */
    public float f16373z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.f16349b = j2;
        this.f16350c = canvasHolder;
        this.f16351d = canvasDrawScope;
        RenderNode create = RenderNode.create("Compose", view);
        this.f16352e = create;
        IntSize.Companion companion = IntSize.f19170b;
        this.f16353f = companion.a();
        this.f16357j = companion.a();
        if (I.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            U(create);
            J();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (!H) {
            create.setClipToBounds(false);
            CompositingStrategy.Companion companion2 = CompositingStrategy.f16309b;
            b(companion2.a());
            this.f16358k = companion2.a();
            this.f16359l = BlendMode.f15926b.B();
            this.f16361n = 1.0f;
            this.f16363p = Offset.f15855b.b();
            this.f16364q = 1.0f;
            this.f16365r = 1.0f;
            Color.Companion companion3 = Color.f15975b;
            this.f16369v = companion3.a();
            this.f16370w = companion3.a();
            this.f16347A = 8.0f;
            this.F = true;
            return;
        }
        throw new NoClassDefFoundError();
    }

    public void A(long j2) {
        this.f16363p = j2;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            this.f16362o = true;
            this.f16352e.setPivotX(((float) ((int) (this.f16353f >> 32))) / 2.0f);
            this.f16352e.setPivotY(((float) ((int) (4294967295L & this.f16353f))) / 2.0f);
            return;
        }
        this.f16362o = false;
        this.f16352e.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
        this.f16352e.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public float B() {
        return this.f16373z;
    }

    public long C() {
        return this.f16369v;
    }

    public long D() {
        return this.f16370w;
    }

    public void E(int i2) {
        this.f16358k = i2;
        P();
    }

    public Matrix F() {
        Matrix matrix = this.f16355h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f16355h = matrix;
        }
        this.f16352e.getMatrix(matrix);
        return matrix;
    }

    public float H() {
        return this.f16368u;
    }

    public void I(Canvas canvas) {
        DisplayListCanvas d2 = AndroidCanvas_androidKt.d(canvas);
        Intrinsics.g(d2, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        d2.drawRenderNode(this.f16352e);
    }

    public final void J() {
        RenderNodeVerificationHelper24.f16446a.a(this.f16352e);
    }

    public float K() {
        return this.f16367t;
    }

    public void L(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16369v = j2;
            RenderNodeVerificationHelper28.f16447a.c(this.f16352e, ColorKt.j(j2));
        }
    }

    public boolean M() {
        return this.f16348B;
    }

    public final boolean N() {
        return CompositingStrategy.f(x(), CompositingStrategy.f16309b.c()) || !BlendMode.F(s(), BlendMode.f15926b.B()) || f() != null;
    }

    public float O() {
        return this.f16347A;
    }

    public final void P() {
        if (N()) {
            b(CompositingStrategy.f16309b.c());
        } else {
            b(x());
        }
    }

    public float Q() {
        return this.f16366s;
    }

    public void R(boolean z2) {
        this.f16348B = z2;
        a();
    }

    public float S() {
        return this.f16371x;
    }

    public void T(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16370w = j2;
            RenderNodeVerificationHelper28.f16447a.d(this.f16352e, ColorKt.j(j2));
        }
    }

    public final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f16447a;
            renderNodeVerificationHelper28.c(renderNode, renderNodeVerificationHelper28.a(renderNode));
            renderNodeVerificationHelper28.d(renderNode, renderNodeVerificationHelper28.b(renderNode));
        }
    }

    public float Y() {
        return this.f16365r;
    }

    public final void a() {
        boolean z2 = false;
        boolean z3 = M() && !this.f16356i;
        if (M() && this.f16356i) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.f16352e.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.f16352e.setClipToOutline(z2);
        }
    }

    public final void b(int i2) {
        RenderNode renderNode = this.f16352e;
        CompositingStrategy.Companion companion = CompositingStrategy.f16309b;
        if (CompositingStrategy.f(i2, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f16354g);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.f(i2, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f16354g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f16354g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public float c() {
        return this.f16361n;
    }

    public void d(float f2) {
        this.f16361n = f2;
        this.f16352e.setAlpha(f2);
    }

    public void e(float f2) {
        this.f16372y = f2;
        this.f16352e.setRotationY(f2);
    }

    public ColorFilter f() {
        return this.f16360m;
    }

    public void g(float f2) {
        this.f16373z = f2;
        this.f16352e.setRotation(f2);
    }

    public void h(float f2) {
        this.f16367t = f2;
        this.f16352e.setTranslationY(f2);
    }

    public void i(float f2) {
        this.f16365r = f2;
        this.f16352e.setScaleY(f2);
    }

    public void j(float f2) {
        this.f16364q = f2;
        this.f16352e.setScaleX(f2);
    }

    public void k(RenderEffect renderEffect) {
        this.E = renderEffect;
    }

    public void l(float f2) {
        this.f16366s = f2;
        this.f16352e.setTranslationX(f2);
    }

    public void m(float f2) {
        this.f16347A = f2;
        this.f16352e.setCameraDistance(-f2);
    }

    public void n(float f2) {
        this.f16371x = f2;
        this.f16352e.setRotationX(f2);
    }

    public float o() {
        return this.f16364q;
    }

    public void p(float f2) {
        this.f16368u = f2;
        this.f16352e.setElevation(f2);
    }

    public void q() {
        J();
    }

    public boolean r() {
        return this.f16352e.isValid();
    }

    public int s() {
        return this.f16359l;
    }

    public void t(boolean z2) {
        this.F = z2;
    }

    public RenderEffect u() {
        return this.E;
    }

    public void v(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        AndroidCanvas a2;
        CanvasDrawScope canvasDrawScope;
        Density density2;
        LayoutDirection layoutDirection2;
        Canvas j2;
        long c2;
        GraphicsLayer h2;
        android.graphics.Canvas start = this.f16352e.start(Math.max((int) (this.f16353f >> 32), (int) (this.f16357j >> 32)), Math.max((int) (this.f16353f & 4294967295L), (int) (this.f16357j & 4294967295L)));
        try {
            CanvasHolder canvasHolder = this.f16350c;
            android.graphics.Canvas A2 = canvasHolder.a().A();
            canvasHolder.a().B(start);
            a2 = canvasHolder.a();
            canvasDrawScope = this.f16351d;
            long e2 = IntSizeKt.e(this.f16353f);
            density2 = canvasDrawScope.G1().getDensity();
            layoutDirection2 = canvasDrawScope.G1().getLayoutDirection();
            j2 = canvasDrawScope.G1().j();
            c2 = canvasDrawScope.G1().c();
            h2 = canvasDrawScope.G1().h();
            DrawContext G1 = canvasDrawScope.G1();
            G1.a(density);
            G1.d(layoutDirection);
            G1.i(a2);
            G1.f(e2);
            G1.g(graphicsLayer);
            a2.o();
            function1.invoke(canvasDrawScope);
            a2.t();
            DrawContext G12 = canvasDrawScope.G1();
            G12.a(density2);
            G12.d(layoutDirection2);
            G12.i(j2);
            G12.f(c2);
            G12.g(h2);
            canvasHolder.a().B(A2);
            this.f16352e.end(start);
            t(false);
        } catch (Throwable th) {
            this.f16352e.end(start);
            throw th;
        }
    }

    public void w(Outline outline, long j2) {
        this.f16357j = j2;
        this.f16352e.setOutline(outline);
        this.f16356i = outline != null;
        a();
    }

    public int x() {
        return this.f16358k;
    }

    public void y(int i2, int i3, long j2) {
        int i4 = (int) (j2 >> 32);
        int i5 = (int) (4294967295L & j2);
        this.f16352e.setLeftTopRightBottom(i2, i3, i2 + i4, i3 + i5);
        if (!IntSize.e(this.f16353f, j2)) {
            if (this.f16362o) {
                this.f16352e.setPivotX(((float) i4) / 2.0f);
                this.f16352e.setPivotY(((float) i5) / 2.0f);
            }
            this.f16353f = j2;
        }
    }

    public float z() {
        return this.f16372y;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j2, (i2 & 4) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
