package androidx.compose.foundation.layout;

import com.google.api.Endpoint;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata
final class AndroidFlingSpline {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidFlingSpline f3731a = new AndroidFlingSpline();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f3732b = new float[Endpoint.TARGET_FIELD_NUMBER];

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f3733c = new float[Endpoint.TARGET_FIELD_NUMBER];

    @JvmInline
    @Metadata
    public static final class FlingResult {

        /* renamed from: a  reason: collision with root package name */
        public final long f3734a;

        public static long a(long j2) {
            return j2;
        }

        public static boolean b(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).g();
        }

        public static final float c(long j2) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        public static final float d(long j2) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }

        public static int e(long j2) {
            return Long.hashCode(j2);
        }

        public static String f(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return b(this.f3734a, obj);
        }

        public final /* synthetic */ long g() {
            return this.f3734a;
        }

        public int hashCode() {
            return e(this.f3734a);
        }

        public String toString() {
            return f(this.f3734a);
        }
    }

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f12 = ((float) i2) / ((float) 100);
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
            f3732b[i2] = (f4 * ((f3 * 0.5f) + f2)) + f5;
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
            f3733c[i2] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
        }
        f3733c[100] = 1.0f;
        f3732b[100] = 1.0f;
    }

    public final double a(float f2, float f3) {
        return Math.log(((double) (Math.abs(f2) * 0.35f)) / ((double) f3));
    }

    public final long b(float f2) {
        float f3;
        float f4;
        float f5 = (float) 100;
        int i2 = (int) (f5 * f2);
        if (i2 < 100) {
            float f6 = ((float) i2) / f5;
            int i3 = i2 + 1;
            float f7 = ((float) i3) / f5;
            float[] fArr = f3732b;
            float f8 = fArr[i2];
            f4 = (fArr[i3] - f8) / (f7 - f6);
            f3 = f8 + ((f2 - f6) * f4);
        } else {
            f3 = 1.0f;
            f4 = 0.0f;
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f3);
        return FlingResult.a((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (floatToRawIntBits << 32));
    }
}
