package androidx.compose.ui.unit.fontscaling;

import kotlin.Metadata;

@Metadata
public final class MathUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final MathUtils f19198a = new MathUtils();

    public final float a(float f2, float f3, float f4, float f5, float f6) {
        return b(f2, f3, Math.max(0.0f, Math.min(1.0f, c(f4, f5, f6))));
    }

    public final float b(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public final float c(float f2, float f3, float f4) {
        if (f2 == f3) {
            return 0.0f;
        }
        return (f4 - f2) / (f3 - f2);
    }
}
