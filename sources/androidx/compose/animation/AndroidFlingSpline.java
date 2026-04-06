package androidx.compose.animation;

import com.google.api.Endpoint;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class AndroidFlingSpline {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidFlingSpline f2010a = new AndroidFlingSpline();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f2011b;

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f2012c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2013d = 8;

    @Metadata
    public static final class FlingResult {

        /* renamed from: a  reason: collision with root package name */
        public final float f2014a;

        /* renamed from: b  reason: collision with root package name */
        public final float f2015b;

        public FlingResult(float f2, float f3) {
            this.f2014a = f2;
            this.f2015b = f3;
        }

        public final float a() {
            return this.f2014a;
        }

        public final float b() {
            return this.f2015b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.f2014a, flingResult.f2014a) == 0 && Float.compare(this.f2015b, flingResult.f2015b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f2014a) * 31) + Float.hashCode(this.f2015b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f2014a + ", velocityCoefficient=" + this.f2015b + ')';
        }
    }

    static {
        float[] fArr = new float[Endpoint.TARGET_FIELD_NUMBER];
        f2011b = fArr;
        float[] fArr2 = new float[Endpoint.TARGET_FIELD_NUMBER];
        f2012c = fArr2;
        SplineBasedDecayKt.b(fArr, fArr2, 100);
    }

    public final double a(float f2, float f3) {
        return Math.log(((double) (Math.abs(f2) * 0.35f)) / ((double) f3));
    }

    public final FlingResult b(float f2) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        float n2 = RangesKt.n(f2, 0.0f, 1.0f);
        float f5 = (float) 100;
        int i2 = (int) (f5 * n2);
        if (i2 < 100) {
            float f6 = ((float) i2) / f5;
            int i3 = i2 + 1;
            float f7 = ((float) i3) / f5;
            float[] fArr = f2011b;
            float f8 = fArr[i2];
            float f9 = (fArr[i3] - f8) / (f7 - f6);
            f3 = f9;
            f4 = ((n2 - f6) * f9) + f8;
        }
        return new FlingResult(f4, f3);
    }
}
