package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class MonoSplineKt {
    public static final float a(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        float f9 = (float) 2;
        return (f2 * ((f6 - ((f9 * f3) * ((f9 * f6) + f7))) + ((((float) 3) * (f6 + f7)) * f8))) - ((((float) 6) * (f3 - f8)) * (f4 - f5));
    }

    public static final float b(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f3 * f3;
        float f9 = f8 * f3;
        float f10 = (float) 2;
        return ((((f6 * f2) * ((f3 - (f10 * f8)) + f9)) + ((f2 * f7) * (f9 - f8))) + f4) - (((((float) 3) * f8) - (f10 * f9)) * (f4 - f5));
    }
}
