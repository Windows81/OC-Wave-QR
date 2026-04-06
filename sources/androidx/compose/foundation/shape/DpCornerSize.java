package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class DpCornerSize implements CornerSize, InspectableValue {

    /* renamed from: z  reason: collision with root package name */
    public final float f5455z;

    public /* synthetic */ DpCornerSize(float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2);
    }

    public float a(long j2, Density density) {
        return density.B1(this.f5455z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.o(this.f5455z, ((DpCornerSize) obj).f5455z);
    }

    public int hashCode() {
        return Dp.p(this.f5455z);
    }

    public String toString() {
        return "CornerSize(size = " + this.f5455z + ".dp)";
    }

    public DpCornerSize(float f2) {
        this.f5455z = f2;
    }
}
