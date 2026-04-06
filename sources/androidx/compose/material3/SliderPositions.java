package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata
@Deprecated
public final class SliderPositions {

    /* renamed from: a  reason: collision with root package name */
    public final MutableState f11130a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableState f11131b;

    public final ClosedFloatingPointRange a() {
        return (ClosedFloatingPointRange) this.f11130a.getValue();
    }

    public final float[] b() {
        return (float[]) this.f11131b.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPositions)) {
            return false;
        }
        SliderPositions sliderPositions = (SliderPositions) obj;
        return Intrinsics.d(a(), sliderPositions.a()) && Arrays.equals(b(), sliderPositions.b());
    }

    public int hashCode() {
        return (a().hashCode() * 31) + Arrays.hashCode(b());
    }
}
