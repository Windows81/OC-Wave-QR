package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata
public final class DensityKt {
    public static final Density a(float f2, float f3) {
        return new DensityImpl(f2, f3);
    }

    public static /* synthetic */ Density b(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        return a(f2, f3);
    }
}
