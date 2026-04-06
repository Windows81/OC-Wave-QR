package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GraphicsLayer {

    /* renamed from: A  reason: collision with root package name */
    public static final LayerSnapshotImpl f16314A = (LayerManager.f16428g.a() ? LayerSnapshotV21.f16436a : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.f16439a : SurfaceUtils.f16448a.a() ? LayerSnapshotV22.f16437a : LayerSnapshotV21.f16436a);

    /* renamed from: z  reason: collision with root package name */
    public static final Companion f16315z = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final GraphicsLayerImpl f16316a;

    /* renamed from: b  reason: collision with root package name */
    public final LayerManager f16317b;

    /* renamed from: c  reason: collision with root package name */
    public Density f16318c = DrawContextKt.a();

    /* renamed from: d  reason: collision with root package name */
    public LayoutDirection f16319d = LayoutDirection.Ltr;

    /* renamed from: e  reason: collision with root package name */
    public Function1 f16320e = GraphicsLayer$drawBlock$1.f16342z;

    /* renamed from: f  reason: collision with root package name */
    public final Function1 f16321f = new GraphicsLayer$clipDrawBlock$1(this);

    /* renamed from: g  reason: collision with root package name */
    public Outline f16322g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16323h = true;

    /* renamed from: i  reason: collision with root package name */
    public long f16324i;

    /* renamed from: j  reason: collision with root package name */
    public long f16325j;

    /* renamed from: k  reason: collision with root package name */
    public float f16326k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.compose.ui.graphics.Outline f16327l;

    /* renamed from: m  reason: collision with root package name */
    public Path f16328m;

    /* renamed from: n  reason: collision with root package name */
    public Path f16329n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16330o;

    /* renamed from: p  reason: collision with root package name */
    public CanvasDrawScope f16331p;

    /* renamed from: q  reason: collision with root package name */
    public Paint f16332q;

    /* renamed from: r  reason: collision with root package name */
    public int f16333r;

    /* renamed from: s  reason: collision with root package name */
    public final ChildLayerDependenciesTracker f16334s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16335t;

    /* renamed from: u  reason: collision with root package name */
    public long f16336u;

    /* renamed from: v  reason: collision with root package name */
    public long f16337v;

    /* renamed from: w  reason: collision with root package name */
    public long f16338w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f16339x;

    /* renamed from: y  reason: collision with root package name */
    public RectF f16340y;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.f16316a = graphicsLayerImpl;
        this.f16317b = layerManager;
        Offset.Companion companion = Offset.f15855b;
        this.f16324i = companion.c();
        this.f16325j = Size.f15876b.a();
        this.f16334s = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.R(false);
        this.f16336u = IntOffset.f19160b.b();
        this.f16337v = IntSize.f19170b.a();
        this.f16338w = companion.b();
    }

    public final float A() {
        return this.f16316a.K();
    }

    public final boolean B() {
        return this.f16335t;
    }

    public final Outline C() {
        Outline outline = this.f16322g;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f16322g = outline2;
        return outline2;
    }

    public final RectF D() {
        RectF rectF = this.f16340y;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f16340y = rectF2;
        return rectF2;
    }

    public final void E() {
        this.f16333r++;
    }

    public final void F() {
        this.f16333r--;
        f();
    }

    public final void G(Density density, LayoutDirection layoutDirection, long j2, Function1 function1) {
        c0(j2);
        this.f16318c = density;
        this.f16319d = layoutDirection;
        this.f16320e = function1;
        this.f16316a.t(true);
        H();
    }

    public final void H() {
        this.f16316a.v(this.f16318c, this.f16319d, this, this.f16321f);
    }

    public final void I() {
        if (!this.f16316a.r()) {
            try {
                H();
            } catch (Throwable unused) {
            }
        }
    }

    public final void J() {
        if (!this.f16335t) {
            this.f16335t = true;
            f();
        }
    }

    public final void K() {
        this.f16327l = null;
        this.f16328m = null;
        this.f16325j = Size.f15876b.a();
        this.f16324i = Offset.f15855b.c();
        this.f16326k = 0.0f;
        this.f16323h = true;
        this.f16330o = false;
    }

    public final void L(float f2) {
        if (this.f16316a.c() != f2) {
            this.f16316a.d(f2);
        }
    }

    public final void M(long j2) {
        if (!Color.n(j2, this.f16316a.C())) {
            this.f16316a.L(j2);
        }
    }

    public final void N(float f2) {
        if (this.f16316a.O() != f2) {
            this.f16316a.m(f2);
        }
    }

    public final void O(boolean z2) {
        if (this.f16339x != z2) {
            this.f16339x = z2;
            this.f16323h = true;
            e();
        }
    }

    public final void P(int i2) {
        if (!CompositingStrategy.f(this.f16316a.x(), i2)) {
            this.f16316a.E(i2);
        }
    }

    public final void Q(Path path) {
        K();
        this.f16328m = path;
        e();
    }

    public final void R(long j2) {
        if (!Offset.j(this.f16338w, j2)) {
            this.f16338w = j2;
            this.f16316a.A(j2);
        }
    }

    public final void S(long j2, long j3) {
        this.f16316a.y(IntOffset.k(j2), IntOffset.l(j2), j3);
    }

    public final void T(long j2, long j3) {
        Y(j2, j3, 0.0f);
    }

    public final void U(RenderEffect renderEffect) {
        if (!Intrinsics.d(this.f16316a.u(), renderEffect)) {
            this.f16316a.k(renderEffect);
        }
    }

    public final void V(float f2) {
        if (this.f16316a.S() != f2) {
            this.f16316a.n(f2);
        }
    }

    public final void W(float f2) {
        if (this.f16316a.z() != f2) {
            this.f16316a.e(f2);
        }
    }

    public final void X(float f2) {
        if (this.f16316a.B() != f2) {
            this.f16316a.g(f2);
        }
    }

    public final void Y(long j2, long j3, float f2) {
        if (!Offset.j(this.f16324i, j2) || !Size.f(this.f16325j, j3) || this.f16326k != f2 || this.f16328m != null) {
            K();
            this.f16324i = j2;
            this.f16325j = j3;
            this.f16326k = f2;
            e();
        }
    }

    public final void Z(float f2) {
        if (this.f16316a.o() != f2) {
            this.f16316a.j(f2);
        }
    }

    public final void a0(float f2) {
        if (this.f16316a.Y() != f2) {
            this.f16316a.i(f2);
        }
    }

    public final void b0(float f2) {
        if (this.f16316a.H() != f2) {
            this.f16316a.p(f2);
            this.f16323h = true;
            e();
        }
    }

    public final void c0(long j2) {
        if (!IntSize.e(this.f16337v, j2)) {
            this.f16337v = j2;
            S(this.f16336u, j2);
            if (this.f16325j == 9205357640488583168L) {
                this.f16323h = true;
                e();
            }
        }
    }

    public final void d(GraphicsLayer graphicsLayer) {
        if (this.f16334s.i(graphicsLayer)) {
            graphicsLayer.E();
        }
    }

    public final void d0(long j2) {
        if (!Color.n(j2, this.f16316a.D())) {
            this.f16316a.T(j2);
        }
    }

    public final void e() {
        if (this.f16323h) {
            Outline outline = null;
            if (this.f16339x || w() > 0.0f) {
                Path path = this.f16328m;
                if (path != null) {
                    RectF D = D();
                    if (path instanceof AndroidPath) {
                        ((AndroidPath) path).B().computeBounds(D, false);
                        Outline j0 = j0(path);
                        if (j0 != null) {
                            j0.setAlpha(k());
                            outline = j0;
                        }
                        this.f16316a.w(outline, IntSize.c((4294967295L & ((long) Math.round(D.height()))) | (((long) Math.round(D.width())) << 32)));
                        if (!this.f16330o || !this.f16339x) {
                            this.f16316a.R(this.f16339x);
                        } else {
                            this.f16316a.R(false);
                            this.f16316a.q();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.f16316a.R(this.f16339x);
                    Size.f15876b.b();
                    Outline C = C();
                    long e2 = IntSizeKt.e(this.f16337v);
                    long j2 = this.f16324i;
                    long j3 = this.f16325j;
                    long j4 = j3 == 9205357640488583168L ? e2 : j3;
                    int i2 = (int) (j2 >> 32);
                    int i3 = (int) (j2 & 4294967295L);
                    C.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j4 >> 32))), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (4294967295L & j4))), this.f16326k);
                    C.setAlpha(k());
                    this.f16316a.w(C, IntSizeKt.c(j4));
                }
            } else {
                this.f16316a.R(false);
                this.f16316a.w((Outline) null, IntSize.f19170b.a());
            }
        }
        this.f16323h = false;
    }

    public final void e0(long j2) {
        if (!IntOffset.j(this.f16336u, j2)) {
            this.f16336u = j2;
            S(j2, this.f16337v);
        }
    }

    public final void f() {
        if (this.f16335t && this.f16333r == 0) {
            LayerManager layerManager = this.f16317b;
            if (layerManager != null) {
                layerManager.f(this);
            } else {
                g();
            }
        }
    }

    public final void f0(float f2) {
        if (this.f16316a.Q() != f2) {
            this.f16316a.l(f2);
        }
    }

    public final void g() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f16334s;
        GraphicsLayer b2 = childLayerDependenciesTracker.f16304a;
        if (b2 != null) {
            b2.F();
            childLayerDependenciesTracker.f16304a = null;
        }
        MutableScatterSet a2 = childLayerDependenciesTracker.f16306c;
        if (a2 != null) {
            Object[] objArr = a2.f1967b;
            long[] jArr = a2.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                ((GraphicsLayer) objArr[(i2 << 3) + i4]).F();
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            a2.m();
        }
        this.f16316a.q();
    }

    public final void g0(float f2) {
        if (this.f16316a.K() != f2) {
            this.f16316a.h(f2);
        }
    }

    public final void h(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas canvas2;
        boolean z2;
        Canvas canvas3 = canvas;
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        if (!this.f16335t) {
            e();
            I();
            boolean z3 = true;
            boolean z4 = w() > 0.0f;
            if (z4) {
                canvas.x();
            }
            android.graphics.Canvas d2 = AndroidCanvas_androidKt.d(canvas);
            boolean isHardwareAccelerated = d2.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                i0(d2);
            }
            if (isHardwareAccelerated || !this.f16339x) {
                z3 = false;
            }
            if (z3) {
                canvas.o();
                androidx.compose.ui.graphics.Outline p2 = p();
                if (p2 instanceof Outline.Rectangle) {
                    Canvas.n(canvas3, p2.a(), 0, 2, (Object) null);
                } else if (p2 instanceof Outline.Rounded) {
                    Path path = this.f16329n;
                    if (path != null) {
                        path.t();
                    } else {
                        path = AndroidPath_androidKt.a();
                        this.f16329n = path;
                    }
                    Path.l(path, ((Outline.Rounded) p2).b(), (Path.Direction) null, 2, (Object) null);
                    Canvas.v(canvas3, path, 0, 2, (Object) null);
                } else if (p2 instanceof Outline.Generic) {
                    Canvas.v(canvas3, ((Outline.Generic) p2).b(), 0, 2, (Object) null);
                }
            }
            if (graphicsLayer2 != null) {
                graphicsLayer2.d(this);
            }
            if (AndroidCanvas_androidKt.d(canvas).isHardwareAccelerated() || this.f16316a.G()) {
                canvas2 = d2;
                z2 = isHardwareAccelerated;
                this.f16316a.I(canvas3);
            } else {
                CanvasDrawScope canvasDrawScope = this.f16331p;
                if (canvasDrawScope == null) {
                    canvasDrawScope = new CanvasDrawScope();
                    this.f16331p = canvasDrawScope;
                }
                CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
                Density density = this.f16318c;
                LayoutDirection layoutDirection = this.f16319d;
                long e2 = IntSizeKt.e(this.f16337v);
                Density density2 = canvasDrawScope2.G1().getDensity();
                LayoutDirection layoutDirection2 = canvasDrawScope2.G1().getLayoutDirection();
                Canvas j2 = canvasDrawScope2.G1().j();
                long c2 = canvasDrawScope2.G1().c();
                canvas2 = d2;
                GraphicsLayer h2 = canvasDrawScope2.G1().h();
                z2 = isHardwareAccelerated;
                DrawContext G1 = canvasDrawScope2.G1();
                G1.a(density);
                G1.d(layoutDirection);
                G1.i(canvas3);
                G1.f(e2);
                G1.g(this);
                canvas.o();
                try {
                    j(canvasDrawScope2);
                    canvas.t();
                    DrawContext G12 = canvasDrawScope2.G1();
                    G12.a(density2);
                    G12.d(layoutDirection2);
                    G12.i(j2);
                    G12.f(c2);
                    G12.g(h2);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    canvas.t();
                    DrawContext G13 = canvasDrawScope2.G1();
                    G13.a(density2);
                    G13.d(layoutDirection2);
                    G13.i(j2);
                    G13.f(c2);
                    G13.g(h2);
                    throw th2;
                }
            }
            if (z3) {
                canvas.t();
            }
            if (z4) {
                canvas.p();
            }
            if (!z2) {
                canvas2.restore();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h0(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = f16314A
            r0.E = r3
            java.lang.Object r5 = r5.a(r4, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.h0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i(Canvas canvas) {
        if (AndroidCanvas_androidKt.d(canvas).isHardwareAccelerated() || this.f16316a.G()) {
            I();
            this.f16316a.I(canvas);
        }
    }

    public final void i0(android.graphics.Canvas canvas) {
        float k2 = (float) IntOffset.k(this.f16336u);
        float l2 = (float) IntOffset.l(this.f16336u);
        float k3 = ((float) IntOffset.k(this.f16336u)) + ((float) ((int) (this.f16337v >> 32)));
        float l3 = ((float) IntOffset.l(this.f16336u)) + ((float) ((int) (this.f16337v & 4294967295L)));
        float k4 = k();
        ColorFilter n2 = n();
        int l4 = l();
        if (k4 < 1.0f || !BlendMode.F(l4, BlendMode.f15926b.B()) || n2 != null || CompositingStrategy.f(o(), CompositingStrategy.f16309b.c())) {
            Paint paint = this.f16332q;
            if (paint == null) {
                paint = AndroidPaint_androidKt.a();
                this.f16332q = paint;
            }
            paint.d(k4);
            paint.v(l4);
            paint.A(n2);
            canvas.saveLayer(k2, l2, k3, l3, paint.x());
        } else {
            canvas.save();
        }
        canvas.translate(k2, l2);
        canvas.concat(this.f16316a.F());
    }

    public final void j(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f16334s;
        childLayerDependenciesTracker.f16305b = childLayerDependenciesTracker.f16304a;
        MutableScatterSet a2 = childLayerDependenciesTracker.f16306c;
        if (a2 != null && a2.e()) {
            MutableScatterSet c2 = childLayerDependenciesTracker.f16307d;
            if (c2 == null) {
                c2 = ScatterSetKt.a();
                childLayerDependenciesTracker.f16307d = c2;
            }
            c2.i(a2);
            a2.m();
        }
        childLayerDependenciesTracker.f16308e = true;
        this.f16320e.invoke(drawScope);
        childLayerDependenciesTracker.f16308e = false;
        GraphicsLayer d2 = childLayerDependenciesTracker.f16305b;
        if (d2 != null) {
            d2.F();
        }
        MutableScatterSet c3 = childLayerDependenciesTracker.f16307d;
        if (c3 != null && c3.e()) {
            Object[] objArr = c3.f1967b;
            long[] jArr = c3.f1966a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                ((GraphicsLayer) objArr[(i2 << 3) + i4]).F();
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            c3.m();
        }
    }

    public final android.graphics.Outline j0(Path path) {
        android.graphics.Outline outline;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28 || path.e()) {
            android.graphics.Outline C = C();
            if (i2 >= 30) {
                OutlineVerificationHelper.f16443a.a(C, path);
            } else if (path instanceof AndroidPath) {
                C.setConvexPath(((AndroidPath) path).B());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.f16330o = !C.canClip();
            outline = C;
        } else {
            android.graphics.Outline outline2 = this.f16322g;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f16330o = true;
            this.f16316a.t(true);
            outline = null;
        }
        this.f16328m = path;
        return outline;
    }

    public final float k() {
        return this.f16316a.c();
    }

    public final int l() {
        return this.f16316a.s();
    }

    public final boolean m() {
        return this.f16339x;
    }

    public final ColorFilter n() {
        return this.f16316a.f();
    }

    public final int o() {
        return this.f16316a.x();
    }

    public final androidx.compose.ui.graphics.Outline p() {
        androidx.compose.ui.graphics.Outline outline;
        androidx.compose.ui.graphics.Outline outline2 = this.f16327l;
        Path path = this.f16328m;
        if (outline2 != null) {
            return outline2;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.f16327l = generic;
            return generic;
        }
        long e2 = IntSizeKt.e(this.f16337v);
        long j2 = this.f16324i;
        long j3 = this.f16325j;
        if (j3 != 9205357640488583168L) {
            e2 = j3;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e2 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = intBitsToFloat2 + Float.intBitsToFloat((int) (e2 & 4294967295L));
        float f2 = this.f16326k;
        if (f2 > 0.0f) {
            outline = new Outline.Rounded(RoundRectKt.d(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, CornerRadius.b((((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2))))));
        } else {
            outline = new Outline.Rectangle(new Rect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.f16327l = outline;
        return outline;
    }

    public final long q() {
        return this.f16338w;
    }

    public final float r() {
        return this.f16316a.S();
    }

    public final float s() {
        return this.f16316a.z();
    }

    public final float t() {
        return this.f16316a.B();
    }

    public final float u() {
        return this.f16316a.o();
    }

    public final float v() {
        return this.f16316a.Y();
    }

    public final float w() {
        return this.f16316a.H();
    }

    public final long x() {
        return this.f16337v;
    }

    public final long y() {
        return this.f16336u;
    }

    public final float z() {
        return this.f16316a.Q();
    }
}
