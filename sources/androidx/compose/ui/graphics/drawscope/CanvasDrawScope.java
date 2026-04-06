package androidx.compose.ui.graphics.drawscope;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CanvasDrawScope implements DrawScope {

    /* renamed from: A  reason: collision with root package name */
    public final DrawContext f16276A = new CanvasDrawScope$drawContext$1(this);

    /* renamed from: B  reason: collision with root package name */
    public Paint f16277B;
    public Paint C;

    /* renamed from: z  reason: collision with root package name */
    public final DrawParams f16278z = new DrawParams((Density) null, (LayoutDirection) null, (Canvas) null, 0, 15, (DefaultConstructorMarker) null);

    @Metadata
    public static final class DrawParams {

        /* renamed from: a  reason: collision with root package name */
        public Density f16279a;

        /* renamed from: b  reason: collision with root package name */
        public LayoutDirection f16280b;

        /* renamed from: c  reason: collision with root package name */
        public Canvas f16281c;

        /* renamed from: d  reason: collision with root package name */
        public long f16282d;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j2);
        }

        public final Density a() {
            return this.f16279a;
        }

        public final LayoutDirection b() {
            return this.f16280b;
        }

        public final Canvas c() {
            return this.f16281c;
        }

        public final long d() {
            return this.f16282d;
        }

        public final Canvas e() {
            return this.f16281c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return Intrinsics.d(this.f16279a, drawParams.f16279a) && this.f16280b == drawParams.f16280b && Intrinsics.d(this.f16281c, drawParams.f16281c) && Size.f(this.f16282d, drawParams.f16282d);
        }

        public final Density f() {
            return this.f16279a;
        }

        public final LayoutDirection g() {
            return this.f16280b;
        }

        public final long h() {
            return this.f16282d;
        }

        public int hashCode() {
            return (((((this.f16279a.hashCode() * 31) + this.f16280b.hashCode()) * 31) + this.f16281c.hashCode()) * 31) + Size.j(this.f16282d);
        }

        public final void i(Canvas canvas) {
            this.f16281c = canvas;
        }

        public final void j(Density density) {
            this.f16279a = density;
        }

        public final void k(LayoutDirection layoutDirection) {
            this.f16280b = layoutDirection;
        }

        public final void l(long j2) {
            this.f16282d = j2;
        }

        public String toString() {
            return "DrawParams(density=" + this.f16279a + ", layoutDirection=" + this.f16280b + ", canvas=" + this.f16281c + ", size=" + Size.l(this.f16282d) + ')';
        }

        public DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2) {
            this.f16279a = density;
            this.f16280b = layoutDirection;
            this.f16281c = canvas;
            this.f16282d = j2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? DrawContextKt.a() : density, (i2 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i2 & 4) != 0 ? EmptyCanvas.f16294a : canvas, (i2 & 8) != 0 ? Size.f15876b.b() : j2, (DefaultConstructorMarker) null);
        }
    }

    public static /* synthetic */ Paint F(CanvasDrawScope canvasDrawScope, Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        return canvasDrawScope.C(brush, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, (i6 & 512) != 0 ? DrawScope.f16288g.b() : i5);
    }

    public static /* synthetic */ Paint f(CanvasDrawScope canvasDrawScope, long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        return canvasDrawScope.b(j2, drawStyle, f2, colorFilter, i2, (i4 & 32) != 0 ? DrawScope.f16288g.b() : i3);
    }

    public static /* synthetic */ Paint t(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            i3 = DrawScope.f16288g.b();
        }
        return canvasDrawScope.q(brush, drawStyle, f2, colorFilter, i2, i3);
    }

    public static /* synthetic */ Paint w(CanvasDrawScope canvasDrawScope, long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5, int i6, Object obj) {
        return canvasDrawScope.u(j2, f2, f3, i2, i3, pathEffect, f4, colorFilter, i4, (i6 & 512) != 0 ? DrawScope.f16288g.b() : i5);
    }

    public void B0(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path path2 = path;
        this.f16278z.e().s(path, f(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public final Paint C(Brush brush, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint J = J();
        if (brush != null) {
            brush.a(c(), J, f4);
        } else if (J.c() != f4) {
            J.d(f4);
        }
        if (!Intrinsics.d(J.f(), colorFilter)) {
            J.A(colorFilter);
        }
        if (!BlendMode.F(J.s(), i4)) {
            J.v(i4);
        }
        if (J.L() != f2) {
            J.K(f2);
        }
        if (J.w() != f3) {
            J.B(f3);
        }
        if (!StrokeCap.g(J.E(), i2)) {
            J.u(i2);
        }
        if (!StrokeJoin.g(J.t(), i3)) {
            J.G(i3);
        }
        if (!Intrinsics.d(J.J(), pathEffect)) {
            J.F(pathEffect);
        }
        if (!FilterQuality.e(J.D(), i5)) {
            J.C(i5);
        }
        return J;
    }

    public void D0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        this.f16278z.e().j(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 & 4294967295L)), f(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public void D1(List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        int i5 = i2;
        this.f16278z.e().k(i5, list, w(this, j2, f2, 4.0f, i3, StrokeJoin.f16135b.b(), pathEffect, f3, colorFilter, i4, 0, 512, (Object) null));
    }

    public final DrawParams G() {
        return this.f16278z;
    }

    public DrawContext G1() {
        return this.f16276A;
    }

    public final long H(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Color.l(j2, Color.o(j2) * f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final Paint I() {
        Paint paint = this.f16277B;
        if (paint != null) {
            return paint;
        }
        Paint a2 = AndroidPaint_androidKt.a();
        a2.H(PaintingStyle.f16061b.a());
        this.f16277B = a2;
        return a2;
    }

    public final Paint J() {
        Paint paint = this.C;
        if (paint != null) {
            return paint;
        }
        Paint a2 = AndroidPaint_androidKt.a();
        a2.H(PaintingStyle.f16061b.b());
        this.C = a2;
        return a2;
    }

    public void J1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f16278z.e().h(j2, j3, F(this, brush, f2, 4.0f, i2, StrokeJoin.f16135b.b(), pathEffect, f3, colorFilter, i3, 0, 512, (Object) null));
    }

    public final Paint M(DrawStyle drawStyle) {
        if (Intrinsics.d(drawStyle, Fill.f16295a)) {
            return I();
        }
        if (drawStyle instanceof Stroke) {
            Paint J = J();
            Stroke stroke = (Stroke) drawStyle;
            if (J.L() != stroke.f()) {
                J.K(stroke.f());
            }
            if (!StrokeCap.g(J.E(), stroke.b())) {
                J.u(stroke.b());
            }
            if (J.w() != stroke.d()) {
                J.B(stroke.d());
            }
            if (!StrokeJoin.g(J.t(), stroke.c())) {
                J.G(stroke.c());
            }
            if (!Intrinsics.d(J.J(), stroke.e())) {
                J.F(stroke.e());
            }
            return J;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void O0(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        float f4 = f2;
        this.f16278z.e().u(j3, f2, f(this, j2, drawStyle, f3, colorFilter, i2, 0, 32, (Object) null));
    }

    public void Y1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.f16278z.e().l(imageBitmap, j2, j3, j4, j5, q((Brush) null, drawStyle, f2, colorFilter, i2, i3));
    }

    public void a1(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        this.f16278z.e().w(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 & 4294967295L)), f2, f3, z2, f(this, j2, drawStyle, f4, colorFilter, i2, 0, 32, (Object) null));
    }

    public final Paint b(long j2, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint M = M(drawStyle);
        long H = H(j2, f2);
        if (!Color.n(M.g(), H)) {
            M.I(H);
        }
        if (M.z() != null) {
            M.y((Shader) null);
        }
        if (!Intrinsics.d(M.f(), colorFilter)) {
            M.A(colorFilter);
        }
        if (!BlendMode.F(M.s(), i2)) {
            M.v(i2);
        }
        if (!FilterQuality.e(M.D(), i3)) {
            M.C(i3);
        }
        return M;
    }

    public void b2(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        this.f16278z.e().y(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f(this, j2, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public float getDensity() {
        return this.f16278z.f().getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f16278z.g();
    }

    public void p1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j2 & 4294967295L);
        this.f16278z.e().y(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), t(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public final Paint q(Brush brush, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3) {
        Paint M = M(drawStyle);
        if (brush != null) {
            brush.a(c(), M, f2);
        } else {
            if (M.z() != null) {
                M.y((Shader) null);
            }
            long g2 = M.g();
            Color.Companion companion = Color.f15975b;
            if (!Color.n(g2, companion.a())) {
                M.I(companion.a());
            }
            if (M.c() != f2) {
                M.d(f2);
            }
        }
        if (!Intrinsics.d(M.f(), colorFilter)) {
            M.A(colorFilter);
        }
        if (!BlendMode.F(M.s(), i2)) {
            M.v(i2);
        }
        if (!FilterQuality.e(M.D(), i3)) {
            M.C(i3);
        }
        return M;
    }

    public void r0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        ImageBitmap imageBitmap2 = imageBitmap;
        long j3 = j2;
        this.f16278z.e().m(imageBitmap, j2, t(this, (Brush) null, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public final Paint u(long j2, float f2, float f3, int i2, int i3, PathEffect pathEffect, float f4, ColorFilter colorFilter, int i4, int i5) {
        Paint J = J();
        long H = H(j2, f4);
        if (!Color.n(J.g(), H)) {
            J.I(H);
        }
        if (J.z() != null) {
            J.y((Shader) null);
        }
        if (!Intrinsics.d(J.f(), colorFilter)) {
            J.A(colorFilter);
        }
        if (!BlendMode.F(J.s(), i4)) {
            J.v(i4);
        }
        if (J.L() != f2) {
            J.K(f2);
        }
        if (J.w() != f3) {
            J.B(f3);
        }
        if (!StrokeCap.g(J.E(), i2)) {
            J.u(i2);
        }
        if (!StrokeJoin.g(J.t(), i3)) {
            J.G(i3);
        }
        if (!Intrinsics.d(J.J(), pathEffect)) {
            J.F(pathEffect);
        }
        if (!FilterQuality.e(J.D(), i5)) {
            J.C(i5);
        }
        return J;
    }

    public float u1() {
        return this.f16278z.f().u1();
    }

    public void w0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (j2 & 4294967295L);
        this.f16278z.e().j(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (j3 & 4294967295L)), t(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public void y1(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path path2 = path;
        this.f16278z.e().s(path, t(this, brush, drawStyle, f2, colorFilter, i2, 0, 32, (Object) null));
    }

    public void z0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f16278z.e().h(j3, j4, w(this, j2, f2, 4.0f, i2, StrokeJoin.f16135b.b(), pathEffect, f3, colorFilter, i3, 0, 512, (Object) null));
    }
}
