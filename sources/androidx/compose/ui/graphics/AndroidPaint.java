package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

@Metadata
public final class AndroidPaint implements Paint {

    /* renamed from: a  reason: collision with root package name */
    public Paint f15899a;

    /* renamed from: b  reason: collision with root package name */
    public int f15900b;

    /* renamed from: c  reason: collision with root package name */
    public Shader f15901c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f15902d;

    /* renamed from: e  reason: collision with root package name */
    public PathEffect f15903e;

    public AndroidPaint(Paint paint) {
        this.f15899a = paint;
        this.f15900b = BlendMode.f15926b.B();
    }

    public void A(ColorFilter colorFilter) {
        this.f15902d = colorFilter;
        AndroidPaint_androidKt.n(this.f15899a, colorFilter);
    }

    public void B(float f2) {
        AndroidPaint_androidKt.t(this.f15899a, f2);
    }

    public void C(int i2) {
        AndroidPaint_androidKt.o(this.f15899a, i2);
    }

    public int D() {
        return AndroidPaint_androidKt.e(this.f15899a);
    }

    public int E() {
        return AndroidPaint_androidKt.f(this.f15899a);
    }

    public void F(PathEffect pathEffect) {
        AndroidPaint_androidKt.p(this.f15899a, pathEffect);
        this.f15903e = pathEffect;
    }

    public void G(int i2) {
        AndroidPaint_androidKt.s(this.f15899a, i2);
    }

    public void H(int i2) {
        AndroidPaint_androidKt.v(this.f15899a, i2);
    }

    public void I(long j2) {
        AndroidPaint_androidKt.m(this.f15899a, j2);
    }

    public PathEffect J() {
        return this.f15903e;
    }

    public void K(float f2) {
        AndroidPaint_androidKt.u(this.f15899a, f2);
    }

    public float L() {
        return AndroidPaint_androidKt.i(this.f15899a);
    }

    public float c() {
        return AndroidPaint_androidKt.c(this.f15899a);
    }

    public void d(float f2) {
        AndroidPaint_androidKt.k(this.f15899a, f2);
    }

    public ColorFilter f() {
        return this.f15902d;
    }

    public long g() {
        return AndroidPaint_androidKt.d(this.f15899a);
    }

    public int s() {
        return this.f15900b;
    }

    public int t() {
        return AndroidPaint_androidKt.g(this.f15899a);
    }

    public void u(int i2) {
        AndroidPaint_androidKt.r(this.f15899a, i2);
    }

    public void v(int i2) {
        if (!BlendMode.F(this.f15900b, i2)) {
            this.f15900b = i2;
            AndroidPaint_androidKt.l(this.f15899a, i2);
        }
    }

    public float w() {
        return AndroidPaint_androidKt.h(this.f15899a);
    }

    public Paint x() {
        return this.f15899a;
    }

    public void y(Shader shader) {
        this.f15901c = shader;
        AndroidPaint_androidKt.q(this.f15899a, shader);
    }

    public Shader z() {
        return this.f15901c;
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.j());
    }
}
