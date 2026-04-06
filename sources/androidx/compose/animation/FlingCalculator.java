package androidx.compose.animation;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class FlingCalculator {

    /* renamed from: a  reason: collision with root package name */
    public final float f2283a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f2284b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2285c;

    @Metadata
    public static final class FlingInfo {

        /* renamed from: a  reason: collision with root package name */
        public final float f2286a;

        /* renamed from: b  reason: collision with root package name */
        public final float f2287b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2288c;

        public FlingInfo(float f2, float f3, long j2) {
            this.f2286a = f2;
            this.f2287b = f3;
            this.f2288c = j2;
        }

        public final float a(long j2) {
            long j3 = this.f2288c;
            return this.f2287b * Math.signum(this.f2286a) * AndroidFlingSpline.f2010a.b(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).a();
        }

        public final float b(long j2) {
            long j3 = this.f2288c;
            return (((AndroidFlingSpline.f2010a.b(j3 > 0 ? ((float) j2) / ((float) j3) : 1.0f).b() * Math.signum(this.f2286a)) * this.f2287b) / ((float) this.f2288c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.f2286a, flingInfo.f2286a) == 0 && Float.compare(this.f2287b, flingInfo.f2287b) == 0 && this.f2288c == flingInfo.f2288c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f2286a) * 31) + Float.hashCode(this.f2287b)) * 31) + Long.hashCode(this.f2288c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f2286a + ", distance=" + this.f2287b + ", duration=" + this.f2288c + ')';
        }
    }

    public FlingCalculator(float f2, Density density) {
        this.f2283a = f2;
        this.f2284b = density;
        this.f2285c = a(density);
    }

    public final float a(Density density) {
        return FlingCalculatorKt.c(0.84f, density.getDensity());
    }

    public final float b(float f2) {
        double e2 = e(f2);
        return (float) (((double) (this.f2283a * this.f2285c)) * Math.exp((((double) FlingCalculatorKt.f2289a) / (((double) FlingCalculatorKt.f2289a) - 1.0d)) * e2));
    }

    public final long c(float f2) {
        return (long) (Math.exp(e(f2) / (((double) FlingCalculatorKt.f2289a) - 1.0d)) * 1000.0d);
    }

    public final FlingInfo d(float f2) {
        double e2 = e(f2);
        double b2 = ((double) FlingCalculatorKt.f2289a) - 1.0d;
        return new FlingInfo(f2, (float) (((double) (this.f2283a * this.f2285c)) * Math.exp((((double) FlingCalculatorKt.f2289a) / b2) * e2)), (long) (Math.exp(e2 / b2) * 1000.0d));
    }

    public final double e(float f2) {
        return AndroidFlingSpline.f2010a.a(f2, this.f2283a * this.f2285c);
    }
}
