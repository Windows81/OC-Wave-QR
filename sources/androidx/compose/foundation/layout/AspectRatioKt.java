package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;

@Metadata
public final class AspectRatioKt {
    public static final Modifier a(Modifier modifier, float f2, boolean z2) {
        return modifier.o0(new AspectRatioElement(f2, z2, InspectableValueKt.b() ? new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f2, z2) : InspectableValueKt.a()));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, float f2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return a(modifier, f2, z2);
    }

    public static final boolean c(long j2, int i2, int i3) {
        int n2 = Constraints.n(j2);
        if (i2 <= Constraints.l(j2) && n2 <= i2) {
            return i3 <= Constraints.k(j2) && Constraints.m(j2) <= i3;
        }
    }
}
