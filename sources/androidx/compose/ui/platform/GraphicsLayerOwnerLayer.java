package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {

    /* renamed from: A  reason: collision with root package name */
    public final GraphicsContext f17782A;

    /* renamed from: B  reason: collision with root package name */
    public final AndroidComposeView f17783B;
    public Function2 C;
    public Function0 D;
    public long E;
    public boolean F;
    public final float[] G = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
    public float[] H;
    public boolean I;
    public Density J = DensityKt.b(1.0f, 0.0f, 2, (Object) null);
    public LayoutDirection K = LayoutDirection.Ltr;
    public final CanvasDrawScope L = new CanvasDrawScope();
    public int M;
    public long N = TransformOrigin.f16150b.a();
    public Outline O;
    public boolean P;
    public boolean Q;
    public boolean R = true;
    public boolean S;
    public final Function1 T = new GraphicsLayerOwnerLayer$recordLambda$1(this);

    /* renamed from: z  reason: collision with root package name */
    public GraphicsLayer f17784z;

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.f17784z = graphicsLayer;
        this.f17782A = graphicsContext;
        this.f17783B = androidComposeView;
        this.C = function2;
        this.D = function0;
        long j2 = (long) Integer.MAX_VALUE;
        this.E = IntSize.c((j2 & 4294967295L) | (j2 << 32));
    }

    public void a(float[] fArr) {
        Matrix.m(fArr, o());
    }

    public void b() {
        this.C = null;
        this.D = null;
        this.F = true;
        p(false);
        GraphicsContext graphicsContext = this.f17782A;
        if (graphicsContext != null) {
            graphicsContext.a(this.f17784z);
            this.f17783B.X0(this);
        }
    }

    public boolean c(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (this.f17784z.m()) {
            return ShapeContainingUtilKt.c(this.f17784z.p(), intBitsToFloat, intBitsToFloat2, (Path) null, (Path) null, 24, (Object) null);
        }
        return true;
    }

    public void d(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int i2;
        Function0 function0;
        int C2 = reusableGraphicsLayerScope.C() | this.M;
        this.K = reusableGraphicsLayerScope.w();
        this.J = reusableGraphicsLayerScope.u();
        int i3 = C2 & 4096;
        if (i3 != 0) {
            this.N = reusableGraphicsLayerScope.N1();
        }
        if ((C2 & 1) != 0) {
            this.f17784z.Z(reusableGraphicsLayerScope.o());
        }
        if ((C2 & 2) != 0) {
            this.f17784z.a0(reusableGraphicsLayerScope.Y());
        }
        if ((C2 & 4) != 0) {
            this.f17784z.L(reusableGraphicsLayerScope.b());
        }
        if ((C2 & 8) != 0) {
            this.f17784z.f0(reusableGraphicsLayerScope.Q());
        }
        if ((C2 & 16) != 0) {
            this.f17784z.g0(reusableGraphicsLayerScope.K());
        }
        if ((C2 & 32) != 0) {
            this.f17784z.b0(reusableGraphicsLayerScope.H());
            if (reusableGraphicsLayerScope.H() > 0.0f && !this.S && (function0 = this.D) != null) {
                function0.invoke();
            }
        }
        if ((C2 & 64) != 0) {
            this.f17784z.M(reusableGraphicsLayerScope.f());
        }
        if ((C2 & 128) != 0) {
            this.f17784z.d0(reusableGraphicsLayerScope.J());
        }
        if ((C2 & 1024) != 0) {
            this.f17784z.X(reusableGraphicsLayerScope.B());
        }
        if ((C2 & 256) != 0) {
            this.f17784z.V(reusableGraphicsLayerScope.S());
        }
        if ((C2 & 512) != 0) {
            this.f17784z.W(reusableGraphicsLayerScope.z());
        }
        if ((C2 & 2048) != 0) {
            this.f17784z.N(reusableGraphicsLayerScope.O());
        }
        if (i3 != 0) {
            if (TransformOrigin.e(this.N, TransformOrigin.f16150b.a())) {
                this.f17784z.R(Offset.f15855b.b());
            } else {
                GraphicsLayer graphicsLayer = this.f17784z;
                long floatToRawIntBits = (long) Float.floatToRawIntBits(TransformOrigin.f(this.N) * ((float) ((int) (this.E >> 32))));
                graphicsLayer.R(Offset.e((((long) Float.floatToRawIntBits(TransformOrigin.g(this.N) * ((float) ((int) (this.E & 4294967295L))))) & 4294967295L) | (floatToRawIntBits << 32)));
            }
        }
        if ((C2 & 16384) != 0) {
            this.f17784z.O(reusableGraphicsLayerScope.q());
        }
        if ((131072 & C2) != 0) {
            this.f17784z.U(reusableGraphicsLayerScope.G());
        }
        if ((32768 & C2) != 0) {
            GraphicsLayer graphicsLayer2 = this.f17784z;
            int t2 = reusableGraphicsLayerScope.t();
            CompositingStrategy.Companion companion = CompositingStrategy.f15997b;
            if (CompositingStrategy.f(t2, companion.a())) {
                i2 = androidx.compose.ui.graphics.layer.CompositingStrategy.f16309b.a();
            } else if (CompositingStrategy.f(t2, companion.c())) {
                i2 = androidx.compose.ui.graphics.layer.CompositingStrategy.f16309b.c();
            } else if (CompositingStrategy.f(t2, companion.b())) {
                i2 = androidx.compose.ui.graphics.layer.CompositingStrategy.f16309b.b();
            } else {
                throw new IllegalStateException("Not supported composition strategy");
            }
            graphicsLayer2.P(i2);
        }
        boolean z2 = true;
        if ((C2 & 7963) != 0) {
            this.P = true;
            this.Q = true;
        }
        if (!Intrinsics.d(this.O, reusableGraphicsLayerScope.F())) {
            this.O = reusableGraphicsLayerScope.F();
            s();
        } else {
            z2 = false;
        }
        this.M = reusableGraphicsLayerScope.C();
        if (C2 != 0 || z2) {
            q();
        }
    }

    public long e(long j2, boolean z2) {
        float[] fArr;
        if (z2) {
            fArr = n();
            if (fArr == null) {
                return Offset.f15855b.a();
            }
        } else {
            fArr = o();
        }
        return this.R ? j2 : Matrix.f(fArr, j2);
    }

    public void f(Function2 function2, Function0 function0) {
        GraphicsContext graphicsContext = this.f17782A;
        if (graphicsContext != null) {
            if (!this.f17784z.B()) {
                InlineClassHelperKt.a("layer should have been released before reuse");
            }
            this.f17784z = graphicsContext.b();
            this.F = false;
            this.C = function2;
            this.D = function0;
            this.P = false;
            this.Q = false;
            this.R = true;
            Matrix.h(this.G);
            float[] fArr = this.H;
            if (fArr != null) {
                Matrix.h(fArr);
            }
            this.N = TransformOrigin.f16150b.a();
            this.S = false;
            long j2 = (long) Integer.MAX_VALUE;
            this.E = IntSize.c((j2 & 4294967295L) | (j2 << 32));
            this.O = null;
            this.M = 0;
            return;
        }
        InlineClassHelperKt.d("currently reuse is only supported when we manage the layer lifecycle");
        throw new KotlinNothingValueException();
    }

    public void g(long j2) {
        if (!IntSize.e(j2, this.E)) {
            this.E = j2;
            invalidate();
        }
    }

    /* renamed from: getUnderlyingMatrix-sQKQjiQ  reason: not valid java name */
    public float[] m3getUnderlyingMatrixsQKQjiQ() {
        return o();
    }

    public void h(Canvas canvas, GraphicsLayer graphicsLayer) {
        l();
        this.S = this.f17784z.w() > 0.0f;
        DrawContext G1 = this.L.G1();
        G1.i(canvas);
        G1.g(graphicsLayer);
        GraphicsLayerKt.a(this.L, this.f17784z);
    }

    public void i(float[] fArr) {
        float[] n2 = n();
        if (n2 != null) {
            Matrix.m(fArr, n2);
        }
    }

    public void invalidate() {
        if (!this.I && !this.F) {
            this.f17783B.invalidate();
            p(true);
        }
    }

    public void j(MutableRect mutableRect, boolean z2) {
        float[] n2 = z2 ? n() : o();
        if (this.R) {
            return;
        }
        if (n2 == null) {
            mutableRect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.g(n2, mutableRect);
        }
    }

    public void k(long j2) {
        this.f17784z.e0(j2);
        q();
    }

    public void l() {
        if (this.I) {
            if (!TransformOrigin.e(this.N, TransformOrigin.f16150b.a()) && !IntSize.e(this.f17784z.x(), this.E)) {
                GraphicsLayer graphicsLayer = this.f17784z;
                long floatToRawIntBits = (long) Float.floatToRawIntBits(TransformOrigin.f(this.N) * ((float) ((int) (this.E >> 32))));
                graphicsLayer.R(Offset.e((((long) Float.floatToRawIntBits(TransformOrigin.g(this.N) * ((float) ((int) (this.E & 4294967295L))))) & 4294967295L) | (floatToRawIntBits << 32)));
            }
            this.f17784z.G(this.J, this.K, this.E, this.T);
            p(false);
        }
    }

    public final float[] n() {
        float[] fArr = this.H;
        if (fArr == null) {
            fArr = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.H = fArr;
        }
        if (this.Q) {
            this.Q = false;
            float[] o2 = o();
            if (this.R) {
                return o2;
            }
            if (InvertMatrixKt.a(o2, fArr)) {
                return fArr;
            }
            fArr[0] = Float.NaN;
            return null;
        } else if (Float.isNaN(fArr[0])) {
            return null;
        } else {
            return fArr;
        }
    }

    public final float[] o() {
        r();
        return this.G;
    }

    public final void p(boolean z2) {
        if (z2 != this.I) {
            this.I = z2;
            this.f17783B.O0(this, z2);
        }
    }

    public final void q() {
        WrapperRenderNodeLayerHelperMethods.f17954a.a(this.f17783B);
    }

    public final void r() {
        if (this.P) {
            GraphicsLayer graphicsLayer = this.f17784z;
            long b2 = (graphicsLayer.q() & 9223372034707292159L) == 9205357640488583168L ? SizeKt.b(IntSizeKt.e(this.E)) : graphicsLayer.q();
            Matrix.i(this.G, Float.intBitsToFloat((int) (b2 >> 32)), Float.intBitsToFloat((int) (b2 & 4294967295L)), graphicsLayer.z(), graphicsLayer.A(), 1.0f, graphicsLayer.r(), graphicsLayer.s(), graphicsLayer.t(), graphicsLayer.u(), graphicsLayer.v(), 1.0f);
            this.P = false;
            this.R = MatrixKt.a(this.G);
        }
    }

    public final void s() {
        Function0 function0;
        Outline outline = this.O;
        if (outline != null) {
            GraphicsLayerKt.b(this.f17784z, outline);
            if ((outline instanceof Outline.Generic) && Build.VERSION.SDK_INT < 33 && (function0 = this.D) != null) {
                function0.invoke();
            }
        }
    }
}
