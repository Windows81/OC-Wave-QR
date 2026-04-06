package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import kotlin.Metadata;

@Metadata
public final class CubicBezierEasing implements Easing {

    /* renamed from: a  reason: collision with root package name */
    public final float f2519a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2520b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2521c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2522d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2523e;

    /* renamed from: f  reason: collision with root package name */
    public final float f2524f;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        this.f2519a = f2;
        this.f2520b = f3;
        this.f2521c = f4;
        this.f2522d = f5;
        if (!(!Float.isNaN(f2) && !Float.isNaN(f3) && !Float.isNaN(f4) && !Float.isNaN(f5))) {
            PreconditionsKt.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '.');
        }
        long b2 = BezierKt.b(0.0f, f3, f5, 1.0f, new float[5], 0);
        this.f2523e = Float.intBitsToFloat((int) (b2 >> 32));
        this.f2524f = Float.intBitsToFloat((int) (b2 & 4294967295L));
    }

    public float a(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return f2;
        }
        float max = Math.max(f2, 1.1920929E-7f);
        float l2 = BezierKt.l(0.0f - max, this.f2519a - max, this.f2521c - max, 1.0f - max);
        if (Float.isNaN(l2)) {
            b(f2);
        }
        float e2 = BezierKt.e(this.f2520b, this.f2522d, l2);
        float f3 = this.f2523e;
        float f4 = this.f2524f;
        if (e2 < f3) {
            e2 = f3;
        }
        return e2 > f4 ? f4 : e2;
    }

    public final void b(float f2) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f2519a + ", " + this.f2520b + ", " + this.f2521c + ", " + this.f2522d + ") has no solution at " + f2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            return this.f2519a == cubicBezierEasing.f2519a && this.f2520b == cubicBezierEasing.f2520b && this.f2521c == cubicBezierEasing.f2521c && this.f2522d == cubicBezierEasing.f2522d;
        }
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f2519a) * 31) + Float.hashCode(this.f2520b)) * 31) + Float.hashCode(this.f2521c)) * 31) + Float.hashCode(this.f2522d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f2519a + ", b=" + this.f2520b + ", c=" + this.f2521c + ", d=" + this.f2522d + ')';
    }
}
