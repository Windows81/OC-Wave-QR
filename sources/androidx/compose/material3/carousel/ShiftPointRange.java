package androidx.compose.material3.carousel;

import kotlin.Metadata;

@Metadata
final class ShiftPointRange {

    /* renamed from: a  reason: collision with root package name */
    public final int f11947a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11948b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11949c;

    public ShiftPointRange(int i2, int i3, float f2) {
        this.f11947a = i2;
        this.f11948b = i3;
        this.f11949c = f2;
    }

    public final int a() {
        return this.f11947a;
    }

    public final float b() {
        return this.f11949c;
    }

    public final int c() {
        return this.f11948b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.f11947a == shiftPointRange.f11947a && this.f11948b == shiftPointRange.f11948b && Float.compare(this.f11949c, shiftPointRange.f11949c) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11947a) * 31) + Integer.hashCode(this.f11948b)) * 31) + Float.hashCode(this.f11949c);
    }

    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.f11947a + ", toStepIndex=" + this.f11948b + ", steppedInterpolation=" + this.f11949c + ')';
    }
}
