package androidx.compose.ui.platform;

import kotlin.Metadata;

@Metadata
public final class InvertMatrixKt {
    public static final boolean a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        if (fArr3.length < 16 || fArr4.length < 16) {
            return false;
        }
        float f2 = fArr3[0];
        float f3 = fArr3[1];
        float f4 = fArr3[2];
        float f5 = fArr3[3];
        float f6 = fArr3[4];
        float f7 = fArr3[5];
        float f8 = fArr3[6];
        float f9 = fArr3[7];
        float f10 = fArr3[8];
        float f11 = fArr3[9];
        float f12 = fArr3[10];
        float f13 = fArr3[11];
        float f14 = fArr3[12];
        float f15 = fArr3[13];
        float f16 = fArr3[14];
        float f17 = fArr3[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f18 * f29) - (f19 * f28)) + (f20 * f27)) + (f21 * f26)) - (f22 * f25)) + (f23 * f24);
        int i2 = (f30 > 0.0f ? 1 : (f30 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            float f31 = 1.0f / f30;
            fArr4[0] = (((f7 * f29) - (f8 * f28)) + (f9 * f27)) * f31;
            fArr4[1] = ((((-f3) * f29) + (f4 * f28)) - (f5 * f27)) * f31;
            fArr4[2] = (((f15 * f23) - (f16 * f22)) + (f17 * f21)) * f31;
            fArr4[3] = ((((-f11) * f23) + (f12 * f22)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr4[4] = (((f32 * f29) + (f8 * f26)) - (f9 * f25)) * f31;
            fArr4[5] = (((f29 * f2) - (f4 * f26)) + (f5 * f25)) * f31;
            float f33 = -f14;
            fArr4[6] = (((f33 * f23) + (f16 * f20)) - (f17 * f19)) * f31;
            fArr4[7] = (((f23 * f10) - (f12 * f20)) + (f13 * f19)) * f31;
            fArr4[8] = (((f6 * f28) - (f7 * f26)) + (f9 * f24)) * f31;
            fArr4[9] = ((((-f2) * f28) + (f26 * f3)) - (f5 * f24)) * f31;
            fArr4[10] = (((f14 * f22) - (f15 * f20)) + (f17 * f18)) * f31;
            fArr4[11] = ((((-f10) * f22) + (f20 * f11)) - (f13 * f18)) * f31;
            fArr4[12] = (((f32 * f27) + (f7 * f25)) - (f8 * f24)) * f31;
            fArr4[13] = (((f2 * f27) - (f3 * f25)) + (f4 * f24)) * f31;
            fArr4[14] = (((f33 * f21) + (f15 * f19)) - (f16 * f18)) * f31;
            fArr4[15] = (((f10 * f21) - (f11 * f19)) + (f12 * f18)) * f31;
        }
        return !(i2 == 0);
    }
}
