package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata
final class DensityImpl implements Density {

    /* renamed from: A  reason: collision with root package name */
    public final float f19139A;

    /* renamed from: z  reason: collision with root package name */
    public final float f19140z;

    public DensityImpl(float f2, float f3) {
        this.f19140z = f2;
        this.f19139A = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.f19140z, densityImpl.f19140z) == 0 && Float.compare(this.f19139A, densityImpl.f19139A) == 0;
    }

    public float getDensity() {
        return this.f19140z;
    }

    public int hashCode() {
        return (Float.hashCode(this.f19140z) * 31) + Float.hashCode(this.f19139A);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f19140z + ", fontScale=" + this.f19139A + ')';
    }

    public float u1() {
        return this.f19139A;
    }
}
