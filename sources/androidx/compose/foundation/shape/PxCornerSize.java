package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
final class PxCornerSize implements CornerSize, InspectableValue {

    /* renamed from: z  reason: collision with root package name */
    public final float f5458z;

    public PxCornerSize(float f2) {
        this.f5458z = f2;
    }

    public float a(long j2, Density density) {
        return this.f5458z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.f5458z, ((PxCornerSize) obj).f5458z) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f5458z);
    }

    public String toString() {
        return "CornerSize(size = " + this.f5458z + ".px)";
    }
}
