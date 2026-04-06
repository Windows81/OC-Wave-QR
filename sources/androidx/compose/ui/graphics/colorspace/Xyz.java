package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Xyz extends ColorSpace {
    public Xyz(String str, int i2) {
        super(str, ColorModel.f16164b.c(), i2, (DefaultConstructorMarker) null);
    }

    public float[] b(float[] fArr) {
        float f2 = fArr[0];
        float f3 = -2.0f;
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        float f4 = 2.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f5 = fArr[1];
        if (f5 < -2.0f) {
            f5 = -2.0f;
        }
        if (f5 > 2.0f) {
            f5 = 2.0f;
        }
        fArr[1] = f5;
        float f6 = fArr[2];
        if (f6 >= -2.0f) {
            f3 = f6;
        }
        if (f3 <= 2.0f) {
            f4 = f3;
        }
        fArr[2] = f4;
        return fArr;
    }

    public float e(int i2) {
        return 2.0f;
    }

    public float f(int i2) {
        return -2.0f;
    }

    public long j(float f2, float f3, float f4) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        float f5 = 2.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 <= 2.0f) {
            f5 = f3;
        }
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    public float[] l(float[] fArr) {
        float f2 = fArr[0];
        float f3 = -2.0f;
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        float f4 = 2.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f5 = fArr[1];
        if (f5 < -2.0f) {
            f5 = -2.0f;
        }
        if (f5 > 2.0f) {
            f5 = 2.0f;
        }
        fArr[1] = f5;
        float f6 = fArr[2];
        if (f6 >= -2.0f) {
            f3 = f6;
        }
        if (f3 <= 2.0f) {
            f4 = f3;
        }
        fArr[2] = f4;
        return fArr;
    }

    public float m(float f2, float f3, float f4) {
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        if (f4 > 2.0f) {
            return 2.0f;
        }
        return f4;
    }

    public long n(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        float f6 = 2.0f;
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        if (f4 <= 2.0f) {
            f6 = f4;
        }
        return ColorKt.a(f2, f3, f6, f5, colorSpace);
    }
}
