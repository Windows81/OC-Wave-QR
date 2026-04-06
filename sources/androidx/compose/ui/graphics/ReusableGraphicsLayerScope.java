package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {

    /* renamed from: A  reason: collision with root package name */
    public float f16111A = 1.0f;

    /* renamed from: B  reason: collision with root package name */
    public float f16112B = 1.0f;
    public float C = 1.0f;
    public float D;
    public float E;
    public float F;
    public long G = GraphicsLayerScopeKt.a();
    public long H = GraphicsLayerScopeKt.a();
    public float I;
    public float J;
    public float K;
    public float L = 8.0f;
    public long M = TransformOrigin.f16150b.a();
    public Shape N = RectangleShapeKt.a();
    public boolean O;
    public int P = CompositingStrategy.f15997b.a();
    public long Q = Size.f15876b.a();
    public Density R = DensityKt.b(1.0f, 0.0f, 2, (Object) null);
    public LayoutDirection S = LayoutDirection.Ltr;
    public RenderEffect T;
    public Outline U;

    /* renamed from: z  reason: collision with root package name */
    public int f16113z;

    public float B() {
        return this.K;
    }

    public final int C() {
        return this.f16113z;
    }

    public final Outline F() {
        return this.U;
    }

    public RenderEffect G() {
        return this.T;
    }

    public float H() {
        return this.F;
    }

    public Shape I() {
        return this.N;
    }

    public long J() {
        return this.H;
    }

    public float K() {
        return this.E;
    }

    public void L(long j2) {
        if (!Color.n(this.G, j2)) {
            this.f16113z |= 64;
            this.G = j2;
        }
    }

    public final void M() {
        j(1.0f);
        i(1.0f);
        d(1.0f);
        l(0.0f);
        h(0.0f);
        p(0.0f);
        L(GraphicsLayerScopeKt.a());
        T(GraphicsLayerScopeKt.a());
        n(0.0f);
        e(0.0f);
        g(0.0f);
        m(8.0f);
        Q1(TransformOrigin.f16150b.a());
        s1(RectangleShapeKt.a());
        R(false);
        k((RenderEffect) null);
        y(CompositingStrategy.f15997b.a());
        U(Size.f15876b.a());
        this.U = null;
        this.f16113z = 0;
    }

    public final void N(Density density) {
        this.R = density;
    }

    public long N1() {
        return this.M;
    }

    public float O() {
        return this.L;
    }

    public final void P(LayoutDirection layoutDirection) {
        this.S = layoutDirection;
    }

    public float Q() {
        return this.D;
    }

    public void Q1(long j2) {
        if (!TransformOrigin.e(this.M, j2)) {
            this.f16113z |= 4096;
            this.M = j2;
        }
    }

    public void R(boolean z2) {
        if (this.O != z2) {
            this.f16113z |= 16384;
            this.O = z2;
        }
    }

    public float S() {
        return this.I;
    }

    public void T(long j2) {
        if (!Color.n(this.H, j2)) {
            this.f16113z |= 128;
            this.H = j2;
        }
    }

    public void U(long j2) {
        this.Q = j2;
    }

    public final void W() {
        this.U = I().a(c(), this.S, this.R);
    }

    public float Y() {
        return this.f16112B;
    }

    public float b() {
        return this.C;
    }

    public long c() {
        return this.Q;
    }

    public void d(float f2) {
        if (this.C != f2) {
            this.f16113z |= 4;
            this.C = f2;
        }
    }

    public void e(float f2) {
        if (this.J != f2) {
            this.f16113z |= 512;
            this.J = f2;
        }
    }

    public long f() {
        return this.G;
    }

    public void g(float f2) {
        if (this.K != f2) {
            this.f16113z |= 1024;
            this.K = f2;
        }
    }

    public float getDensity() {
        return this.R.getDensity();
    }

    public void h(float f2) {
        if (this.E != f2) {
            this.f16113z |= 16;
            this.E = f2;
        }
    }

    public void i(float f2) {
        if (this.f16112B != f2) {
            this.f16113z |= 2;
            this.f16112B = f2;
        }
    }

    public void j(float f2) {
        if (this.f16111A != f2) {
            this.f16113z |= 1;
            this.f16111A = f2;
        }
    }

    public void k(RenderEffect renderEffect) {
        if (!Intrinsics.d(this.T, renderEffect)) {
            this.f16113z |= 131072;
            this.T = renderEffect;
        }
    }

    public void l(float f2) {
        if (this.D != f2) {
            this.f16113z |= 8;
            this.D = f2;
        }
    }

    public void m(float f2) {
        if (this.L != f2) {
            this.f16113z |= 2048;
            this.L = f2;
        }
    }

    public void n(float f2) {
        if (this.I != f2) {
            this.f16113z |= 256;
            this.I = f2;
        }
    }

    public float o() {
        return this.f16111A;
    }

    public void p(float f2) {
        if (this.F != f2) {
            this.f16113z |= 32;
            this.F = f2;
        }
    }

    public boolean q() {
        return this.O;
    }

    public void s1(Shape shape) {
        if (!Intrinsics.d(this.N, shape)) {
            this.f16113z |= 8192;
            this.N = shape;
        }
    }

    public int t() {
        return this.P;
    }

    public final Density u() {
        return this.R;
    }

    public float u1() {
        return this.R.u1();
    }

    public final LayoutDirection w() {
        return this.S;
    }

    public void y(int i2) {
        if (!CompositingStrategy.f(this.P, i2)) {
            this.f16113z |= 32768;
            this.P = i2;
        }
    }

    public float z() {
        return this.J;
    }
}
