package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata
public final class SplineBasedDecayKt {
    public static final void b(float[] fArr, float[] fArr2, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i3 = i2;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i4 = 0; i4 < i3; i4++) {
            float f12 = ((float) i4) / ((float) i3);
            float f13 = 1.0f;
            while (true) {
                f2 = ((f13 - f10) / 2.0f) + f10;
                f3 = 1.0f - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float f14 = (((f3 * 0.175f) + (f2 * 0.35000002f)) * f4) + f5;
                if (((double) Math.abs(f14 - f12)) < 1.0E-5d) {
                    break;
                } else if (f14 > f12) {
                    f13 = f2;
                } else {
                    f10 = f2;
                }
            }
            float f15 = 0.5f;
            fArr[i4] = (f4 * ((f3 * 0.5f) + f2)) + f5;
            float f16 = 1.0f;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = 1.0f - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f17 = (((f7 * f15) + f6) * f8) + f9;
                if (((double) Math.abs(f17 - f12)) < 1.0E-5d) {
                    break;
                }
                if (f17 > f12) {
                    f16 = f6;
                } else {
                    f11 = f6;
                }
                f15 = 0.5f;
            }
            fArr2[i4] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
        }
        fArr2[i3] = 1.0f;
        fArr[i3] = 1.0f;
    }

    public static final DecayAnimationSpec c(Density density) {
        return DecayAnimationSpecKt.d(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
