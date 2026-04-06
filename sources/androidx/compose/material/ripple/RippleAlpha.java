package androidx.compose.material.ripple;

import kotlin.Metadata;

@Metadata
public final class RippleAlpha {

    /* renamed from: a  reason: collision with root package name */
    public final float f9059a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9060b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9061c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9062d;

    public RippleAlpha(float f2, float f3, float f4, float f5) {
        this.f9059a = f2;
        this.f9060b = f3;
        this.f9061c = f4;
        this.f9062d = f5;
    }

    public final float a() {
        return this.f9059a;
    }

    public final float b() {
        return this.f9060b;
    }

    public final float c() {
        return this.f9061c;
    }

    public final float d() {
        return this.f9062d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) obj;
        return this.f9059a == rippleAlpha.f9059a && this.f9060b == rippleAlpha.f9060b && this.f9061c == rippleAlpha.f9061c && this.f9062d == rippleAlpha.f9062d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f9059a) * 31) + Float.hashCode(this.f9060b)) * 31) + Float.hashCode(this.f9061c)) * 31) + Float.hashCode(this.f9062d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f9059a + ", focusedAlpha=" + this.f9060b + ", hoveredAlpha=" + this.f9061c + ", pressedAlpha=" + this.f9062d + ')';
    }
}
