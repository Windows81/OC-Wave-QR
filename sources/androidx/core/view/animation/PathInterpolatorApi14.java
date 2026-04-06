package androidx.core.view.animation;

import android.view.animation.Interpolator;

class PathInterpolatorApi14 implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f20418a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f20419b;

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f20418a.length - 1;
        int i2 = 0;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f20418a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f20418a;
        float f3 = fArr[length];
        float f4 = fArr[i2];
        float f5 = f3 - f4;
        if (f5 == 0.0f) {
            return this.f20419b[i2];
        }
        float[] fArr2 = this.f20419b;
        float f6 = fArr2[i2];
        return f6 + (((f2 - f4) / f5) * (fArr2[length] - f6));
    }
}
