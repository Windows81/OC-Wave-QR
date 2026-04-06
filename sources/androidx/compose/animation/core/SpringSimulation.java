package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class SpringSimulation {

    /* renamed from: a  reason: collision with root package name */
    public float f2672a;

    /* renamed from: b  reason: collision with root package name */
    public double f2673b = Math.sqrt(50.0d);

    /* renamed from: c  reason: collision with root package name */
    public float f2674c = 1.0f;

    public SpringSimulation(float f2) {
        this.f2672a = f2;
    }

    public final float a() {
        return this.f2674c;
    }

    public final float b() {
        double d2 = this.f2673b;
        return (float) (d2 * d2);
    }

    public final void c(float f2) {
        if (f2 < 0.0f) {
            PreconditionsKt.a("Damping ratio must be non-negative");
        }
        this.f2674c = f2;
    }

    public final void d(float f2) {
        this.f2672a = f2;
    }

    public final void e(float f2) {
        if (b() <= 0.0f) {
            PreconditionsKt.a("Spring stiffness constant must be positive.");
        }
        this.f2673b = Math.sqrt((double) f2);
    }

    public final long f(float f2, float f3, long j2) {
        double d2;
        double d3;
        float f4 = f3;
        float f5 = f2 - this.f2672a;
        double d4 = ((double) j2) / 1000.0d;
        float f6 = this.f2674c;
        double d5 = ((double) f6) * ((double) f6);
        double d6 = this.f2673b;
        double d7 = ((double) (-f6)) * d6;
        if (f6 > 1.0f) {
            double sqrt = d6 * Math.sqrt(d5 - ((double) 1));
            double d8 = d7 + sqrt;
            double d9 = d7 - sqrt;
            double d10 = (double) f5;
            double d11 = ((d9 * d10) - ((double) f4)) / (d9 - d8);
            double d12 = d10 - d11;
            double d13 = d9 * d4;
            double d14 = d4 * d8;
            d2 = (Math.exp(d13) * d12) + (Math.exp(d14) * d11);
            d3 = (d12 * d9 * Math.exp(d13)) + (d11 * d8 * Math.exp(d14));
        } else if (f6 == 1.0f) {
            double d15 = (double) f4;
            double d16 = (double) f5;
            double d17 = d15 + (d6 * d16);
            double d18 = (-d6) * d4;
            double d19 = d16 + (d4 * d17);
            d2 = d19 * Math.exp(d18);
            d3 = (d19 * Math.exp(d18) * (-this.f2673b)) + (d17 * Math.exp(d18));
        } else {
            double d20 = (double) 1;
            double sqrt2 = d6 * Math.sqrt(d20 - d5);
            double d21 = (double) f5;
            double d22 = (d20 / sqrt2) * (((-d7) * d21) + ((double) f4));
            double d23 = sqrt2 * d4;
            double d24 = d4 * d7;
            double exp = Math.exp(d24) * ((Math.cos(d23) * d21) + (Math.sin(d23) * d22));
            d3 = (d7 * exp) + (Math.exp(d24) * (((-sqrt2) * d21 * Math.sin(d23)) + (sqrt2 * d22 * Math.cos(d23))));
            d2 = exp;
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) (d2 + ((double) this.f2672a)));
        return Motion.a((((long) Float.floatToRawIntBits((float) d3)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
