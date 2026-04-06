package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class MonoSpline {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2615a;

    /* renamed from: b  reason: collision with root package name */
    public final float[][] f2616b;

    /* renamed from: c  reason: collision with root package name */
    public final float[][] f2617c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f2618d;

    public MonoSpline(float[] fArr, float[][] fArr2, float f2) {
        int i2;
        float[] fArr3 = fArr;
        float[][] fArr4 = fArr2;
        int length = fArr3.length;
        int i3 = 0;
        int length2 = fArr4[0].length;
        this.f2618d = new float[length2];
        int i4 = length - 1;
        float[][] d2 = d(i4, length2);
        float[][] d3 = d(length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                float f3 = fArr3[i7] - fArr3[i6];
                float[] fArr5 = d2[i6];
                float f4 = (fArr4[i7][i5] - fArr4[i6][i5]) / f3;
                fArr5[i5] = f4;
                if (i6 == 0) {
                    d3[i6][i5] = f4;
                } else {
                    d3[i6][i5] = (d2[i6 - 1][i5] + f4) * 0.5f;
                }
                i6 = i7;
            }
            d3[i4][i5] = d2[length - 2][i5];
        }
        if (!Float.isNaN(f2)) {
            for (int i8 = 0; i8 < length2; i8++) {
                float[] fArr6 = d2[length - 2];
                float f5 = fArr6[i8] * (((float) 1) - f2);
                float[] fArr7 = d2[0];
                float f6 = f5 + (fArr7[i8] * f2);
                fArr7[i8] = f6;
                fArr6[i8] = f6;
                d3[i4][i8] = f6;
                d3[0][i8] = f6;
            }
        }
        int i9 = 0;
        while (i9 < i4) {
            int i10 = i3;
            while (i10 < length2) {
                float f7 = d2[i9][i10];
                if (f7 == 0.0f) {
                    d3[i9][i10] = 0.0f;
                    d3[i9 + 1][i10] = 0.0f;
                    i2 = length2;
                } else {
                    float f8 = d3[i9][i10] / f7;
                    int i11 = i9 + 1;
                    float f9 = d3[i11][i10] / f7;
                    i2 = length2;
                    float hypot = (float) Math.hypot((double) f8, (double) f9);
                    if (((double) hypot) > 9.0d) {
                        float f10 = 3.0f / hypot;
                        float[] fArr8 = d3[i9];
                        float[] fArr9 = d2[i9];
                        fArr8[i10] = f8 * f10 * fArr9[i10];
                        d3[i11][i10] = f10 * f9 * fArr9[i10];
                    }
                }
                i10++;
                length2 = i2;
            }
            int i12 = length2;
            i9++;
            i3 = 0;
        }
        this.f2615a = fArr3;
        this.f2616b = fArr4;
        this.f2617c = d3;
    }

    public final void a(float f2, AnimationVector animationVector, int i2) {
        int i3;
        AnimationVector animationVector2 = animationVector;
        float[] fArr = this.f2615a;
        int length = fArr.length;
        int i4 = 0;
        int length2 = this.f2616b[0].length;
        if (f2 <= fArr[0]) {
            i3 = 0;
        } else {
            i3 = length - 1;
            if (f2 < fArr[i3]) {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            c(fArr[i3], this.f2618d);
            while (i4 < length2) {
                animationVector2.e(i4, this.f2616b[i3][i4] + ((f2 - this.f2615a[i3]) * this.f2618d[i4]));
                i4++;
            }
            return;
        }
        int i5 = length - 1;
        int i6 = i2;
        while (i6 < i5) {
            float[] fArr2 = this.f2615a;
            float f3 = fArr2[i6];
            if (f2 == f3) {
                while (i4 < length2) {
                    animationVector2.e(i4, this.f2616b[i6][i4]);
                    i4++;
                }
                return;
            }
            int i7 = i6 + 1;
            float f4 = fArr2[i7];
            if (f2 < f4) {
                float f5 = f4 - f3;
                float f6 = (f2 - f3) / f5;
                while (i4 < length2) {
                    float[][] fArr3 = this.f2616b;
                    float f7 = fArr3[i6][i4];
                    float f8 = fArr3[i7][i4];
                    float[][] fArr4 = this.f2617c;
                    animationVector2.e(i4, MonoSplineKt.b(f5, f6, f7, f8, fArr4[i6][i4], fArr4[i7][i4]));
                    i4++;
                }
                return;
            }
            i6 = i7;
        }
    }

    public final void b(float f2, AnimationVector animationVector, int i2) {
        int i3;
        AnimationVector animationVector2 = animationVector;
        float[] fArr = this.f2615a;
        float[][] fArr2 = this.f2616b;
        float[][] fArr3 = this.f2617c;
        int length = fArr.length;
        int i4 = 0;
        int length2 = fArr2[0].length;
        if (f2 <= fArr[0]) {
            i3 = 0;
        } else {
            i3 = length - 1;
            if (f2 < fArr[i3]) {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            float[] fArr4 = fArr3[i3];
            if (fArr4.length >= length2) {
                while (i4 < length2) {
                    animationVector2.e(i4, fArr4[i4]);
                    i4++;
                }
                return;
            }
            return;
        }
        int i5 = length - 1;
        int i6 = i2;
        while (i6 < i5) {
            int i7 = i6 + 1;
            float f3 = fArr[i7];
            if (f2 <= f3) {
                float f4 = fArr[i6];
                float f5 = f3 - f4;
                float f6 = (f2 - f4) / f5;
                while (i4 < length2) {
                    animationVector2.e(i4, MonoSplineKt.a(f5, f6, fArr2[i6][i4], fArr2[i7][i4], fArr3[i6][i4], fArr3[i7][i4]) / f5);
                    i4++;
                }
                return;
            }
            i6 = i7;
        }
    }

    public final void c(float f2, float[] fArr) {
        int length = this.f2616b[0].length;
        float[] fArr2 = this.f2615a;
        int length2 = fArr2.length;
        float f3 = fArr2[0];
        int i2 = length2 - 1;
        float f4 = fArr2[i2];
        if (f2 < f3) {
            f2 = f3;
        }
        if (f2 <= f4) {
            f4 = f2;
        }
        if (fArr.length >= length) {
            int i3 = 0;
            while (i3 < i2) {
                float[] fArr3 = this.f2615a;
                int i4 = i3 + 1;
                float f5 = fArr3[i4];
                if (f4 <= f5) {
                    float f6 = fArr3[i3];
                    float f7 = f5 - f6;
                    float f8 = (f4 - f6) / f7;
                    for (int i5 = 0; i5 < length; i5++) {
                        float[][] fArr4 = this.f2616b;
                        float f9 = fArr4[i3][i5];
                        float f10 = fArr4[i4][i5];
                        float[][] fArr5 = this.f2617c;
                        fArr[i5] = MonoSplineKt.a(f7, f8, f9, f10, fArr5[i3][i5], fArr5[i4][i5]) / f7;
                    }
                    return;
                }
                i3 = i4;
            }
        }
    }

    public final float[][] d(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }
}
