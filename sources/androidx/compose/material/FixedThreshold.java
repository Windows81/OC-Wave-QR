package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@Deprecated
public final class FixedThreshold implements ThresholdConfig {

    /* renamed from: a  reason: collision with root package name */
    public final float f7862a;

    public /* synthetic */ FixedThreshold(float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2);
    }

    public float a(Density density, float f2, float f3) {
        return f2 + (density.B1(this.f7862a) * Math.signum(f3 - f2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.o(this.f7862a, ((FixedThreshold) obj).f7862a);
    }

    public int hashCode() {
        return Dp.p(this.f7862a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + Dp.r(this.f7862a) + ')';
    }

    public FixedThreshold(float f2) {
        this.f7862a = f2;
    }
}
