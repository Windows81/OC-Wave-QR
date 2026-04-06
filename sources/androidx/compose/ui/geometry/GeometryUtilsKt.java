package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata
public final class GeometryUtilsKt {
    public static final String a(float f2, int i2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(i2, 0);
        float pow = (float) Math.pow((double) 10.0f, (double) max);
        float f3 = f2 * pow;
        int i3 = (int) f3;
        if (f3 - ((float) i3) >= 0.5f) {
            i3++;
        }
        float f4 = ((float) i3) / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }
}
