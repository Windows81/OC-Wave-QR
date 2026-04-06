package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Oklab extends ColorSpace {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f16225e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f16226f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f16227g;

    /* renamed from: h  reason: collision with root package name */
    public static final float[] f16228h;

    /* renamed from: i  reason: collision with root package name */
    public static final float[] f16229i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        float[] b2 = Adaptation.f16159b.a().b();
        Illuminant illuminant = Illuminant.f16213a;
        float[] l2 = ColorSpaceKt.l(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.e(b2, illuminant.b().c(), illuminant.e().c()));
        f16226f = l2;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f16227g = fArr;
        f16228h = ColorSpaceKt.k(l2);
        f16229i = ColorSpaceKt.k(fArr);
    }

    public Oklab(String str, int i2) {
        super(str, ColorModel.f16164b.a(), i2, (DefaultConstructorMarker) null);
    }

    public float[] b(float[] fArr) {
        ColorSpaceKt.n(f16226f, fArr);
        fArr[0] = MathHelpersKt.a(fArr[0]);
        fArr[1] = MathHelpersKt.a(fArr[1]);
        fArr[2] = MathHelpersKt.a(fArr[2]);
        ColorSpaceKt.n(f16227g, fArr);
        return fArr;
    }

    public float e(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    public float f(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    public long j(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = f16229i;
        float f6 = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f5);
        float f7 = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f5);
        float f8 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f5);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f16228h;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f9) + (fArr2[3] * f10)) + (fArr2[6] * f11))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f9) + (fArr2[4] * f10) + (fArr2[7] * f11))) & 4294967295L);
    }

    public float[] l(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        float f4 = -0.5f;
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        float f6 = fArr[2];
        if (f6 >= -0.5f) {
            f4 = f6;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        fArr[2] = f5;
        ColorSpaceKt.n(f16229i, fArr);
        float f7 = fArr[0];
        fArr[0] = f7 * f7 * f7;
        float f8 = fArr[1];
        fArr[1] = f8 * f8 * f8;
        float f9 = fArr[2];
        fArr[2] = f9 * f9 * f9;
        ColorSpaceKt.n(f16228h, fArr);
        return fArr;
    }

    public float m(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = f16229i;
        float f6 = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f5);
        float f7 = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f5);
        float f8 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f5);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f16228h;
        return (fArr2[2] * f9) + (fArr2[5] * f10) + (fArr2[8] * f8 * f8 * f8);
    }

    public long n(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = f16226f;
        float f6 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
        float a2 = MathHelpersKt.a((fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4));
        float a3 = MathHelpersKt.a((fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4));
        float a4 = MathHelpersKt.a(f6);
        float[] fArr2 = f16227g;
        return ColorKt.a((fArr2[0] * a2) + (fArr2[3] * a3) + (fArr2[6] * a4), (fArr2[1] * a2) + (fArr2[4] * a3) + (fArr2[7] * a4), (fArr2[2] * a2) + (fArr2[5] * a3) + (fArr2[8] * a4), f5, colorSpace);
    }
}
