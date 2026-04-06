package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Lab extends ColorSpace {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f16224e = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Lab(String str, int i2) {
        super(str, ColorModel.f16164b.a(), i2, (DefaultConstructorMarker) null);
    }

    public float[] b(float[] fArr) {
        float f2 = fArr[0];
        Illuminant illuminant = Illuminant.f16213a;
        float f3 = f2 / illuminant.c()[0];
        float f4 = fArr[1] / illuminant.c()[1];
        float f5 = fArr[2] / illuminant.c()[2];
        float cbrt = f3 > 0.008856452f ? (float) Math.cbrt((double) f3) : (f3 * 7.787037f) + 0.13793103f;
        float cbrt2 = f4 > 0.008856452f ? (float) Math.cbrt((double) f4) : (f4 * 7.787037f) + 0.13793103f;
        float cbrt3 = f5 > 0.008856452f ? (float) Math.cbrt((double) f5) : (f5 * 7.787037f) + 0.13793103f;
        float f6 = (116.0f * cbrt2) - 16.0f;
        float f7 = (cbrt - cbrt2) * 500.0f;
        float f8 = (cbrt2 - cbrt3) * 200.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        fArr[0] = f6;
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        float f9 = 128.0f;
        if (f7 > 128.0f) {
            f7 = 128.0f;
        }
        fArr[1] = f7;
        if (f8 < -128.0f) {
            f8 = -128.0f;
        }
        if (f8 <= 128.0f) {
            f9 = f8;
        }
        fArr[2] = f9;
        return fArr;
    }

    public float e(int i2) {
        return i2 == 0 ? 100.0f : 128.0f;
    }

    public float f(int i2) {
        return i2 == 0 ? 0.0f : -128.0f;
    }

    public long j(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        float f6 = (f3 * 0.002f) + f5;
        float f7 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f8 = f5 > 0.20689656f ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.f16213a;
        return (((long) Float.floatToRawIntBits(f8 * illuminant.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f7 * illuminant.c()[0])) << 32);
    }

    public float[] l(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        float f4 = -128.0f;
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        float f5 = 128.0f;
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        fArr[1] = f3;
        float f6 = fArr[2];
        if (f6 >= -128.0f) {
            f4 = f6;
        }
        if (f4 <= 128.0f) {
            f5 = f4;
        }
        fArr[2] = f5;
        float f7 = (f2 + 16.0f) / 116.0f;
        float f8 = (f3 * 0.002f) + f7;
        float f9 = f7 - (f5 * 0.005f);
        float f10 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float f11 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.f16213a;
        fArr[0] = f10 * illuminant.c()[0];
        fArr[1] = f11 * illuminant.c()[1];
        fArr[2] = f12 * illuminant.c()[2];
        return fArr;
    }

    public float m(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f4 < -128.0f) {
            f4 = -128.0f;
        }
        if (f4 > 128.0f) {
            f4 = 128.0f;
        }
        float f5 = ((f2 + 16.0f) / 116.0f) - (f4 * 0.005f);
        return (f5 > 0.20689656f ? f5 * f5 * f5 : 0.12841855f * (f5 - 0.13793103f)) * Illuminant.f16213a.c()[2];
    }

    public long n(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.f16213a;
        float f6 = f2 / illuminant.c()[0];
        float f7 = f3 / illuminant.c()[1];
        float f8 = f4 / illuminant.c()[2];
        float cbrt = f6 > 0.008856452f ? (float) Math.cbrt((double) f6) : (f6 * 7.787037f) + 0.13793103f;
        float cbrt2 = f7 > 0.008856452f ? (float) Math.cbrt((double) f7) : (f7 * 7.787037f) + 0.13793103f;
        float f9 = (116.0f * cbrt2) - 16.0f;
        float f10 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f8 > 0.008856452f ? (float) Math.cbrt((double) f8) : (f8 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 100.0f) {
            f9 = 100.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        float f11 = 128.0f;
        if (f10 > 128.0f) {
            f10 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        if (cbrt3 <= 128.0f) {
            f11 = cbrt3;
        }
        return ColorKt.a(f9, f10, f11, f5, colorSpace);
    }
}
