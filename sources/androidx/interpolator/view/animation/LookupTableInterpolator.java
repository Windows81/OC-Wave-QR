package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f21845a;

    /* renamed from: b  reason: collision with root package name */
    public final float f21846b;

    public LookupTableInterpolator(float[] fArr) {
        this.f21845a = fArr;
        this.f21846b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f21845a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f21846b;
        float f4 = (f2 - (((float) min) * f3)) / f3;
        float[] fArr2 = this.f21845a;
        float f5 = fArr2[min];
        return f5 + (f4 * (fArr2[min + 1] - f5));
    }
}
