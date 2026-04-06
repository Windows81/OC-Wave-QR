package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

@Metadata
public final class WhitePoint {

    /* renamed from: a  reason: collision with root package name */
    public final float f16262a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16263b;

    public WhitePoint(float f2, float f3) {
        this.f16262a = f2;
        this.f16263b = f3;
    }

    public final float a() {
        return this.f16262a;
    }

    public final float b() {
        return this.f16263b;
    }

    public final float[] c() {
        float f2 = this.f16262a;
        float f3 = this.f16263b;
        return new float[]{f2 / f3, 1.0f, ((1.0f - f2) - f3) / f3};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f16262a, whitePoint.f16262a) == 0 && Float.compare(this.f16263b, whitePoint.f16263b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f16262a) * 31) + Float.hashCode(this.f16263b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f16262a + ", y=" + this.f16263b + ')';
    }
}
