package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TransferParameters {

    /* renamed from: a  reason: collision with root package name */
    public final double f16255a;

    /* renamed from: b  reason: collision with root package name */
    public final double f16256b;

    /* renamed from: c  reason: collision with root package name */
    public final double f16257c;

    /* renamed from: d  reason: collision with root package name */
    public final double f16258d;

    /* renamed from: e  reason: collision with root package name */
    public final double f16259e;

    /* renamed from: f  reason: collision with root package name */
    public final double f16260f;

    /* renamed from: g  reason: collision with root package name */
    public final double f16261g;

    public TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f16255a = d2;
        this.f16256b = d3;
        this.f16257c = d4;
        this.f16258d = d5;
        this.f16259e = d6;
        this.f16260f = d7;
        this.f16261g = d8;
        if (Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        } else if (TransferParametersKt.b(d2)) {
        } else {
            if (d6 < 0.0d || d6 > 1.0d) {
                throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d6);
            } else if (d6 == 0.0d && (d3 == 0.0d || d2 == 0.0d)) {
                throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
            } else if (d6 >= 1.0d && d5 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            } else if ((d3 == 0.0d || d2 == 0.0d) && d5 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            } else if (d5 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be increasing");
            } else if (d3 < 0.0d || d2 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be positive or increasing");
            }
        }
    }

    public final double a() {
        return this.f16256b;
    }

    public final double b() {
        return this.f16257c;
    }

    public final double c() {
        return this.f16258d;
    }

    public final double d() {
        return this.f16259e;
    }

    public final double e() {
        return this.f16260f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.f16255a, transferParameters.f16255a) == 0 && Double.compare(this.f16256b, transferParameters.f16256b) == 0 && Double.compare(this.f16257c, transferParameters.f16257c) == 0 && Double.compare(this.f16258d, transferParameters.f16258d) == 0 && Double.compare(this.f16259e, transferParameters.f16259e) == 0 && Double.compare(this.f16260f, transferParameters.f16260f) == 0 && Double.compare(this.f16261g, transferParameters.f16261g) == 0;
    }

    public final double f() {
        return this.f16261g;
    }

    public final double g() {
        return this.f16255a;
    }

    public final boolean h() {
        return this.f16255a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f16255a) * 31) + Double.hashCode(this.f16256b)) * 31) + Double.hashCode(this.f16257c)) * 31) + Double.hashCode(this.f16258d)) * 31) + Double.hashCode(this.f16259e)) * 31) + Double.hashCode(this.f16260f)) * 31) + Double.hashCode(this.f16261g);
    }

    public final boolean i() {
        return this.f16255a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f16255a + ", a=" + this.f16256b + ", b=" + this.f16257c + ", c=" + this.f16258d + ", d=" + this.f16259e + ", e=" + this.f16260f + ", f=" + this.f16261g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, d4, d5, d6, (i2 & 32) != 0 ? 0.0d : d7, (i2 & 64) != 0 ? 0.0d : d8);
    }
}
