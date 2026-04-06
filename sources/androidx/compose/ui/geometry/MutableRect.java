package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata
public final class MutableRect {

    /* renamed from: a  reason: collision with root package name */
    public float f15851a;

    /* renamed from: b  reason: collision with root package name */
    public float f15852b;

    /* renamed from: c  reason: collision with root package name */
    public float f15853c;

    /* renamed from: d  reason: collision with root package name */
    public float f15854d;

    public MutableRect(float f2, float f3, float f4, float f5) {
        this.f15851a = f2;
        this.f15852b = f3;
        this.f15853c = f4;
        this.f15854d = f5;
    }

    public final float a() {
        return this.f15854d;
    }

    public final float b() {
        return this.f15851a;
    }

    public final float c() {
        return this.f15853c;
    }

    public final float d() {
        return this.f15852b;
    }

    public final void e(float f2, float f3, float f4, float f5) {
        this.f15851a = Math.max(f2, this.f15851a);
        this.f15852b = Math.max(f3, this.f15852b);
        this.f15853c = Math.min(f4, this.f15853c);
        this.f15854d = Math.min(f5, this.f15854d);
    }

    public final boolean f() {
        boolean z2 = false;
        boolean z3 = this.f15851a >= this.f15853c;
        if (this.f15852b >= this.f15854d) {
            z2 = true;
        }
        return z3 | z2;
    }

    public final void g(float f2, float f3, float f4, float f5) {
        this.f15851a = f2;
        this.f15852b = f3;
        this.f15853c = f4;
        this.f15854d = f5;
    }

    public final void h(float f2) {
        this.f15854d = f2;
    }

    public final void i(float f2) {
        this.f15851a = f2;
    }

    public final void j(float f2) {
        this.f15853c = f2;
    }

    public final void k(float f2) {
        this.f15852b = f2;
    }

    public final void l(float f2, float f3) {
        this.f15851a += f2;
        this.f15852b += f3;
        this.f15853c += f2;
        this.f15854d += f3;
    }

    public final void m(long j2) {
        l(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.a(this.f15851a, 1) + ", " + GeometryUtilsKt.a(this.f15852b, 1) + ", " + GeometryUtilsKt.a(this.f15853c, 1) + ", " + GeometryUtilsKt.a(this.f15854d, 1) + ')';
    }
}
