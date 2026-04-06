package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
final class PercentCornerSize implements CornerSize, InspectableValue {

    /* renamed from: z  reason: collision with root package name */
    public final float f5457z;

    public PercentCornerSize(float f2) {
        this.f5457z = f2;
        if (f2 < 0.0f || f2 > 100.0f) {
            InlineClassHelperKt.a("The percent should be in the range of [0, 100]");
        }
    }

    public float a(long j2, Density density) {
        return Size.h(j2) * (this.f5457z / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.f5457z, ((PercentCornerSize) obj).f5457z) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f5457z);
    }

    public String toString() {
        return "CornerSize(size = " + this.f5457z + "%)";
    }
}
