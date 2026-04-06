package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    public static final Companion M = new Companion((DefaultConstructorMarker) null);
    public static final int N = 8;
    public static final Function2 O = RenderNodeLayer$Companion$getMatrix$1.f17865z;

    /* renamed from: A  reason: collision with root package name */
    public Function2 f17862A;

    /* renamed from: B  reason: collision with root package name */
    public Function0 f17863B;
    public boolean C;
    public final OutlineResolver D = new OutlineResolver();
    public boolean E;
    public boolean F;
    public Paint G;
    public final LayerMatrixCache H = new LayerMatrixCache(O);
    public final CanvasHolder I = new CanvasHolder();
    public long J = TransformOrigin.f16150b.a();
    public final DeviceRenderNode K;
    public int L;

    /* renamed from: z  reason: collision with root package name */
    public final AndroidComposeView f17864z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class UniqueDrawingIdApi29 {

        /* renamed from: a  reason: collision with root package name */
        public static final UniqueDrawingIdApi29 f17866a = new UniqueDrawingIdApi29();
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.f17864z = androidComposeView;
        this.f17862A = function2;
        this.f17863B = function0;
        DeviceRenderNode renderNodeApi29 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView) : new RenderNodeApi23(androidComposeView);
        renderNodeApi29.J(true);
        renderNodeApi29.x(false);
        this.K = renderNodeApi29;
    }

    private final void n(boolean z2) {
        if (z2 != this.C) {
            this.C = z2;
            this.f17864z.O0(this, z2);
        }
    }

    private final void o() {
        WrapperRenderNodeLayerHelperMethods.f17954a.a(this.f17864z);
    }

    public void a(float[] fArr) {
        Matrix.m(fArr, this.H.b(this.K));
    }

    public void b() {
        if (this.K.r()) {
            this.K.q();
        }
        this.f17862A = null;
        this.f17863B = null;
        this.E = true;
        n(false);
        this.f17864z.Z0();
        this.f17864z.X0(this);
    }

    public boolean c(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j2));
        if (this.K.p()) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) this.K.b()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) this.K.a());
        }
        if (this.K.G()) {
            return this.D.f(j2);
        }
        return true;
    }

    public void d(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0 function0;
        int C2 = reusableGraphicsLayerScope.C() | this.L;
        int i2 = C2 & 4096;
        if (i2 != 0) {
            this.J = reusableGraphicsLayerScope.N1();
        }
        boolean z2 = false;
        boolean z3 = this.K.G() && !this.D.e();
        if ((C2 & 1) != 0) {
            this.K.j(reusableGraphicsLayerScope.o());
        }
        if ((C2 & 2) != 0) {
            this.K.i(reusableGraphicsLayerScope.Y());
        }
        if ((C2 & 4) != 0) {
            this.K.d(reusableGraphicsLayerScope.b());
        }
        if ((C2 & 8) != 0) {
            this.K.l(reusableGraphicsLayerScope.Q());
        }
        if ((C2 & 16) != 0) {
            this.K.h(reusableGraphicsLayerScope.K());
        }
        if ((C2 & 32) != 0) {
            this.K.B(reusableGraphicsLayerScope.H());
        }
        if ((C2 & 64) != 0) {
            this.K.F(ColorKt.j(reusableGraphicsLayerScope.f()));
        }
        if ((C2 & 128) != 0) {
            this.K.K(ColorKt.j(reusableGraphicsLayerScope.J()));
        }
        if ((C2 & 1024) != 0) {
            this.K.g(reusableGraphicsLayerScope.B());
        }
        if ((C2 & 256) != 0) {
            this.K.n(reusableGraphicsLayerScope.S());
        }
        if ((C2 & 512) != 0) {
            this.K.e(reusableGraphicsLayerScope.z());
        }
        if ((C2 & 2048) != 0) {
            this.K.m(reusableGraphicsLayerScope.O());
        }
        if (i2 != 0) {
            this.K.w(TransformOrigin.f(this.J) * ((float) this.K.b()));
            this.K.A(TransformOrigin.g(this.J) * ((float) this.K.a()));
        }
        boolean z4 = reusableGraphicsLayerScope.q() && reusableGraphicsLayerScope.I() != RectangleShapeKt.a();
        if ((C2 & 24576) != 0) {
            this.K.H(z4);
            this.K.x(reusableGraphicsLayerScope.q() && reusableGraphicsLayerScope.I() == RectangleShapeKt.a());
        }
        if ((131072 & C2) != 0) {
            this.K.k(reusableGraphicsLayerScope.G());
        }
        if ((32768 & C2) != 0) {
            this.K.y(reusableGraphicsLayerScope.t());
        }
        boolean h2 = this.D.h(reusableGraphicsLayerScope.F(), reusableGraphicsLayerScope.b(), z4, reusableGraphicsLayerScope.H(), reusableGraphicsLayerScope.c());
        if (this.D.c()) {
            this.K.D(this.D.b());
        }
        if (z4 && !this.D.e()) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && h2)) {
            invalidate();
        } else {
            o();
        }
        if (!this.F && this.K.M() > 0.0f && (function0 = this.f17863B) != null) {
            function0.invoke();
        }
        if ((C2 & 7963) != 0) {
            this.H.c();
        }
        this.L = reusableGraphicsLayerScope.C();
    }

    public long e(long j2, boolean z2) {
        return z2 ? this.H.g(this.K, j2) : this.H.e(this.K, j2);
    }

    public void f(Function2 function2, Function0 function0) {
        this.H.h();
        n(false);
        this.E = false;
        this.F = false;
        this.J = TransformOrigin.f16150b.a();
        this.f17862A = function2;
        this.f17863B = function0;
    }

    public void g(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.K.w(TransformOrigin.f(this.J) * ((float) i2));
        this.K.A(TransformOrigin.g(this.J) * ((float) i3));
        DeviceRenderNode deviceRenderNode = this.K;
        if (deviceRenderNode.z(deviceRenderNode.o(), this.K.E(), this.K.o() + i2, this.K.E() + i3)) {
            this.K.D(this.D.b());
            invalidate();
            this.H.c();
        }
    }

    /* renamed from: getUnderlyingMatrix-sQKQjiQ  reason: not valid java name */
    public float[] m4getUnderlyingMatrixsQKQjiQ() {
        return this.H.b(this.K);
    }

    public void h(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas d2 = AndroidCanvas_androidKt.d(canvas);
        boolean z2 = false;
        if (d2.isHardwareAccelerated()) {
            l();
            if (this.K.M() > 0.0f) {
                z2 = true;
            }
            this.F = z2;
            if (z2) {
                canvas.x();
            }
            this.K.v(d2);
            if (this.F) {
                canvas.p();
                return;
            }
            return;
        }
        float o2 = (float) this.K.o();
        float E2 = (float) this.K.E();
        float s2 = (float) this.K.s();
        float u2 = (float) this.K.u();
        if (this.K.c() < 1.0f) {
            Paint paint = this.G;
            if (paint == null) {
                paint = AndroidPaint_androidKt.a();
                this.G = paint;
            }
            paint.d(this.K.c());
            d2.saveLayer(o2, E2, s2, u2, paint.x());
        } else {
            canvas.o();
        }
        canvas.d(o2, E2);
        canvas.q(this.H.b(this.K));
        m(canvas);
        Function2 function2 = this.f17862A;
        if (function2 != null) {
            function2.m(canvas, (Object) null);
        }
        canvas.t();
        n(false);
    }

    public void i(float[] fArr) {
        float[] a2 = this.H.a(this.K);
        if (a2 != null) {
            Matrix.m(fArr, a2);
        }
    }

    public void invalidate() {
        if (!this.C && !this.E) {
            this.f17864z.invalidate();
            n(true);
        }
    }

    public void j(MutableRect mutableRect, boolean z2) {
        if (z2) {
            this.H.f(this.K, mutableRect);
        } else {
            this.H.d(this.K, mutableRect);
        }
    }

    public void k(long j2) {
        int o2 = this.K.o();
        int E2 = this.K.E();
        int k2 = IntOffset.k(j2);
        int l2 = IntOffset.l(j2);
        if (o2 != k2 || E2 != l2) {
            if (o2 != k2) {
                this.K.t(k2 - o2);
            }
            if (E2 != l2) {
                this.K.C(l2 - E2);
            }
            o();
            this.H.c();
        }
    }

    public void l() {
        if (this.C || !this.K.r()) {
            Path d2 = (!this.K.G() || this.D.e()) ? null : this.D.d();
            Function2 function2 = this.f17862A;
            if (function2 != null) {
                this.K.I(this.I, d2, new RenderNodeLayer$updateDisplayList$1$1(function2));
            }
            n(false);
        }
    }

    public final void m(Canvas canvas) {
        if (this.K.G() || this.K.p()) {
            this.D.a(canvas);
        }
    }
}
