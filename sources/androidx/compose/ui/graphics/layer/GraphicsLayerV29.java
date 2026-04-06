package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.foundation.j;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class GraphicsLayerV29 implements GraphicsLayerImpl {

    /* renamed from: A  reason: collision with root package name */
    public boolean f16374A;

    /* renamed from: B  reason: collision with root package name */
    public RenderEffect f16375B;
    public int C;
    public boolean D;

    /* renamed from: b  reason: collision with root package name */
    public final long f16376b;

    /* renamed from: c  reason: collision with root package name */
    public final CanvasHolder f16377c;

    /* renamed from: d  reason: collision with root package name */
    public final CanvasDrawScope f16378d;

    /* renamed from: e  reason: collision with root package name */
    public final RenderNode f16379e;

    /* renamed from: f  reason: collision with root package name */
    public long f16380f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f16381g;

    /* renamed from: h  reason: collision with root package name */
    public Matrix f16382h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16383i;

    /* renamed from: j  reason: collision with root package name */
    public float f16384j;

    /* renamed from: k  reason: collision with root package name */
    public int f16385k;

    /* renamed from: l  reason: collision with root package name */
    public ColorFilter f16386l;

    /* renamed from: m  reason: collision with root package name */
    public long f16387m;

    /* renamed from: n  reason: collision with root package name */
    public float f16388n;

    /* renamed from: o  reason: collision with root package name */
    public float f16389o;

    /* renamed from: p  reason: collision with root package name */
    public float f16390p;

    /* renamed from: q  reason: collision with root package name */
    public float f16391q;

    /* renamed from: r  reason: collision with root package name */
    public float f16392r;

    /* renamed from: s  reason: collision with root package name */
    public long f16393s;

    /* renamed from: t  reason: collision with root package name */
    public long f16394t;

    /* renamed from: u  reason: collision with root package name */
    public float f16395u;

    /* renamed from: v  reason: collision with root package name */
    public float f16396v;

    /* renamed from: w  reason: collision with root package name */
    public float f16397w;

    /* renamed from: x  reason: collision with root package name */
    public float f16398x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16399y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16400z;

    public GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.f16376b = j2;
        this.f16377c = canvasHolder;
        this.f16378d = canvasDrawScope;
        RenderNode a2 = j.a("graphicsLayer");
        this.f16379e = a2;
        this.f16380f = Size.f15876b.b();
        boolean unused = a2.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.f16309b;
        b(a2, companion.a());
        this.f16384j = 1.0f;
        this.f16385k = BlendMode.f15926b.B();
        this.f16387m = Offset.f15855b.b();
        this.f16388n = 1.0f;
        this.f16389o = 1.0f;
        Color.Companion companion2 = Color.f15975b;
        this.f16393s = companion2.a();
        this.f16394t = companion2.a();
        this.f16398x = 8.0f;
        this.C = companion.a();
        this.D = true;
    }

    private final boolean M() {
        return CompositingStrategy.f(x(), CompositingStrategy.f16309b.c()) || N() || u() != null;
    }

    private final void P() {
        if (M()) {
            b(this.f16379e, CompositingStrategy.f16309b.c());
        } else {
            b(this.f16379e, x());
        }
    }

    private final void a() {
        boolean z2 = false;
        boolean z3 = J() && !this.f16383i;
        if (J() && this.f16383i) {
            z2 = true;
        }
        if (z3 != this.f16400z) {
            this.f16400z = z3;
            boolean unused = this.f16379e.setClipToBounds(z3);
        }
        if (z2 != this.f16374A) {
            this.f16374A = z2;
            boolean unused2 = this.f16379e.setClipToOutline(z2);
        }
    }

    public void A(long j2) {
        this.f16387m = j2;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            boolean unused = this.f16379e.resetPivot();
            return;
        }
        boolean unused2 = this.f16379e.setPivotX(Float.intBitsToFloat((int) (j2 >> 32)));
        boolean unused3 = this.f16379e.setPivotY(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public float B() {
        return this.f16397w;
    }

    public long C() {
        return this.f16393s;
    }

    public long D() {
        return this.f16394t;
    }

    public void E(int i2) {
        this.C = i2;
        P();
    }

    public Matrix F() {
        Matrix matrix = this.f16382h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f16382h = matrix;
        }
        this.f16379e.getMatrix(matrix);
        return matrix;
    }

    public float H() {
        return this.f16392r;
    }

    public void I(Canvas canvas) {
        AndroidCanvas_androidKt.d(canvas).drawRenderNode(this.f16379e);
    }

    public boolean J() {
        return this.f16399y;
    }

    public float K() {
        return this.f16391q;
    }

    public void L(long j2) {
        this.f16393s = j2;
        boolean unused = this.f16379e.setAmbientShadowColor(ColorKt.j(j2));
    }

    public final boolean N() {
        return !BlendMode.F(s(), BlendMode.f15926b.B()) || f() != null;
    }

    public float O() {
        return this.f16398x;
    }

    public float Q() {
        return this.f16390p;
    }

    public void R(boolean z2) {
        this.f16399y = z2;
        a();
    }

    public float S() {
        return this.f16395u;
    }

    public void T(long j2) {
        this.f16394t = j2;
        boolean unused = this.f16379e.setSpotShadowColor(ColorKt.j(j2));
    }

    public float Y() {
        return this.f16389o;
    }

    public final void b(RenderNode renderNode, int i2) {
        CompositingStrategy.Companion companion = CompositingStrategy.f16309b;
        if (CompositingStrategy.f(i2, companion.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, this.f16381g);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.f(i2, companion.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, this.f16381g);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, this.f16381g);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
    }

    public float c() {
        return this.f16384j;
    }

    public void d(float f2) {
        this.f16384j = f2;
        boolean unused = this.f16379e.setAlpha(f2);
    }

    public void e(float f2) {
        this.f16396v = f2;
        boolean unused = this.f16379e.setRotationY(f2);
    }

    public ColorFilter f() {
        return this.f16386l;
    }

    public void g(float f2) {
        this.f16397w = f2;
        boolean unused = this.f16379e.setRotationZ(f2);
    }

    public void h(float f2) {
        this.f16391q = f2;
        boolean unused = this.f16379e.setTranslationY(f2);
    }

    public void i(float f2) {
        this.f16389o = f2;
        boolean unused = this.f16379e.setScaleY(f2);
    }

    public void j(float f2) {
        this.f16388n = f2;
        boolean unused = this.f16379e.setScaleX(f2);
    }

    public void k(RenderEffect renderEffect) {
        this.f16375B = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.f16444a.a(this.f16379e, renderEffect);
        }
    }

    public void l(float f2) {
        this.f16390p = f2;
        boolean unused = this.f16379e.setTranslationX(f2);
    }

    public void m(float f2) {
        this.f16398x = f2;
        boolean unused = this.f16379e.setCameraDistance(f2);
    }

    public void n(float f2) {
        this.f16395u = f2;
        boolean unused = this.f16379e.setRotationX(f2);
    }

    public float o() {
        return this.f16388n;
    }

    public void p(float f2) {
        this.f16392r = f2;
        boolean unused = this.f16379e.setElevation(f2);
    }

    public void q() {
        this.f16379e.discardDisplayList();
    }

    public boolean r() {
        return this.f16379e.hasDisplayList();
    }

    public int s() {
        return this.f16385k;
    }

    public void t(boolean z2) {
        this.D = z2;
    }

    public RenderEffect u() {
        return this.f16375B;
    }

    /* JADX INFO: finally extract failed */
    public void v(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1 function1) {
        RecordingCanvas a2 = this.f16379e.beginRecording();
        try {
            CanvasHolder canvasHolder = this.f16377c;
            android.graphics.Canvas A2 = canvasHolder.a().A();
            canvasHolder.a().B(a2);
            AndroidCanvas a3 = canvasHolder.a();
            DrawContext G1 = this.f16378d.G1();
            G1.a(density);
            G1.d(layoutDirection);
            G1.g(graphicsLayer);
            G1.f(this.f16380f);
            G1.i(a3);
            function1.invoke(this.f16378d);
            canvasHolder.a().B(A2);
            this.f16379e.endRecording();
            t(false);
        } catch (Throwable th) {
            this.f16379e.endRecording();
            throw th;
        }
    }

    public void w(Outline outline, long j2) {
        boolean unused = this.f16379e.setOutline(outline);
        this.f16383i = outline != null;
        a();
    }

    public int x() {
        return this.C;
    }

    public void y(int i2, int i3, long j2) {
        boolean unused = this.f16379e.setPosition(i2, i3, ((int) (j2 >> 32)) + i2, ((int) (4294967295L & j2)) + i3);
        this.f16380f = IntSizeKt.e(j2);
    }

    public float z() {
        return this.f16396v;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i2 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i2 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
