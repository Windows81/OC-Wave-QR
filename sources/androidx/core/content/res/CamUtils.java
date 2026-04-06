package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

final class CamUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f19717a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f19718b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f19719c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f19720d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f19719c;
        return ColorUtils.a((double) (f6 * fArr[0]), (double) (f4 * fArr[1]), (double) (f5 * fArr[2]));
    }

    public static float b(int i2) {
        return c(g(i2));
    }

    public static float c(float f2) {
        float f3 = f2 / 100.0f;
        return f3 <= 0.008856452f ? f3 * 903.2963f : (((float) Math.cbrt((double) f3)) * 116.0f) - 16.0f;
    }

    public static float d(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public static float e(int i2) {
        float f2 = ((float) i2) / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static void f(int i2, float[] fArr) {
        float e2 = e(Color.red(i2));
        float e3 = e(Color.green(i2));
        float e4 = e(Color.blue(i2));
        float[][] fArr2 = f19720d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * e2) + (fArr3[1] * e3) + (fArr3[2] * e4);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * e2) + (fArr4[1] * e3) + (fArr4[2] * e4);
        float[] fArr5 = fArr2[2];
        fArr[2] = (e2 * fArr5[0]) + (e3 * fArr5[1]) + (e4 * fArr5[2]);
    }

    public static float g(int i2) {
        float e2 = e(Color.red(i2));
        float e3 = e(Color.green(i2));
        float e4 = e(Color.blue(i2));
        float[] fArr = f19720d[1];
        return (e2 * fArr[0]) + (e3 * fArr[1]) + (e4 * fArr[2]);
    }

    public static float h(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((((double) f2) + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }
}
