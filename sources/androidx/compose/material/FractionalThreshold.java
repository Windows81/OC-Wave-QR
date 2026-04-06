package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class FractionalThreshold implements ThresholdConfig {

    /* renamed from: a  reason: collision with root package name */
    public final float f7888a;

    public float a(Density density, float f2, float f3) {
        return MathHelpersKt.b(f2, f3, this.f7888a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(this.f7888a, ((FractionalThreshold) obj).f7888a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f7888a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f7888a + ')';
    }
}
