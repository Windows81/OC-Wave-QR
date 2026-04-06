package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ColorSpaceKt {
    public static final double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2;
        return Math.copySign(o(d8 < 0.0d ? -d8 : d8, d3, d4, d5, d6, d7), d8);
    }

    public static final double b(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2;
        return Math.copySign(q(d8 < 0.0d ? -d8 : d8, d3, d4, d5, d6, d7), d8);
    }

    public static final ColorSpace c(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (!ColorModel.f(colorSpace.g(), ColorModel.f16164b.b())) {
            return colorSpace;
        }
        Intrinsics.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) colorSpace;
        if (f(rgb.J(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, l(e(adaptation.b(), rgb.J().c(), whitePoint.c()), rgb.I()), whitePoint);
    }

    public static /* synthetic */ ColorSpace d(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.f16159b.a();
        }
        return c(colorSpace, whitePoint, adaptation);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] n2 = n(fArr, fArr2);
        float[] n3 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{n3[0] / n2[0], n3[1] / n2[1], n3[2] / n2[2]}, fArr));
    }

    public static final boolean f(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.a() - whitePoint2.a()) < 0.001f && Math.abs(whitePoint.b() - whitePoint2.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final Connector h(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        int d2 = colorSpace.d();
        int d3 = colorSpace2.d();
        if ((d2 | d3) < 0) {
            return j(colorSpace, colorSpace2, i2);
        }
        MutableIntObjectMap a2 = ConnectorKt.a();
        int i3 = d2 | (d3 << 6) | (i2 << 12);
        Object b2 = a2.b(i3);
        if (b2 == null) {
            b2 = j(colorSpace, colorSpace2, i2);
            a2.r(i3, b2);
        }
        return (Connector) b2;
    }

    public static /* synthetic */ Connector i(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            colorSpace2 = ColorSpaces.f16176a.G();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.f16230b.b();
        }
        return h(colorSpace, colorSpace2, i2);
    }

    public static final Connector j(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        Connector connector;
        if (colorSpace == colorSpace2) {
            return Connector.f16202g.c(colorSpace);
        }
        long g2 = colorSpace.g();
        ColorModel.Companion companion = ColorModel.f16164b;
        if (!ColorModel.f(g2, companion.b()) || !ColorModel.f(colorSpace2.g(), companion.b())) {
            connector = new Connector(colorSpace, colorSpace2, i2, (DefaultConstructorMarker) null);
        } else {
            Intrinsics.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Intrinsics.g(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            connector = new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2, (DefaultConstructorMarker) null);
        }
        return connector;
    }

    public static final float[] k(float[] fArr) {
        float[] fArr2 = fArr;
        float f2 = fArr2[0];
        float f3 = fArr2[3];
        float f4 = fArr2[6];
        float f5 = fArr2[1];
        float f6 = fArr2[4];
        float f7 = fArr2[7];
        float f8 = fArr2[2];
        float f9 = fArr2[5];
        float f10 = fArr2[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f2 * f11) + (f3 * f12) + (f4 * f13);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f11 / f14;
        fArr3[1] = f12 / f14;
        fArr3[2] = f13 / f14;
        fArr3[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr3[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr3[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr3[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr3[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr3[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr3;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = new float[9];
        if (fArr3.length < 9 || fArr4.length < 9) {
            return fArr5;
        }
        float f2 = fArr3[3];
        float f3 = fArr4[1];
        float f4 = fArr3[6];
        float f5 = fArr4[2];
        fArr5[0] = (fArr3[0] * fArr4[0]) + (f2 * f3) + (f4 * f5);
        float f6 = fArr3[1];
        float f7 = fArr4[0];
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr5[1] = (f6 * f7) + (f3 * f8) + (f9 * f5);
        float f10 = fArr3[5];
        float f11 = fArr3[8];
        fArr5[2] = (fArr3[2] * f7) + (fArr4[1] * f10) + (f5 * f11);
        float f12 = fArr3[0];
        float f13 = fArr4[4];
        float f14 = (fArr4[3] * f12) + (f2 * f13);
        float f15 = fArr4[5];
        fArr5[3] = f14 + (f4 * f15);
        float f16 = fArr3[1];
        float f17 = fArr4[3];
        fArr5[4] = (f16 * f17) + (f8 * f13) + (f9 * f15);
        float f18 = fArr3[2];
        fArr5[5] = (f17 * f18) + (f10 * fArr4[4]) + (f15 * f11);
        float f19 = f12 * fArr4[6];
        float f20 = fArr3[3];
        float f21 = fArr4[7];
        float f22 = f19 + (f20 * f21);
        float f23 = fArr4[8];
        fArr5[6] = f22 + (f4 * f23);
        float f24 = fArr4[6];
        fArr5[7] = (f16 * f24) + (fArr3[4] * f21) + (f9 * f23);
        fArr5[8] = (f18 * f24) + (fArr3[5] * fArr4[7]) + (f11 * f23);
        return fArr5;
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0] * f2;
        float f4 = fArr[1];
        float f5 = fArr2[1] * f4;
        float f6 = fArr[2];
        return new float[]{f3, f5, fArr2[2] * f6, fArr2[3] * f2, fArr2[4] * f4, fArr2[5] * f6, f2 * fArr2[6], f4 * fArr2[7], f6 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
        fArr2[1] = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
        fArr2[2] = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
        return fArr2;
    }

    public static final double o(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 * d5 ? (Math.pow(d2, 1.0d / d7) - d4) / d3 : d2 / d5;
    }

    public static final double p(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 * d5 ? (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3 : (d2 - d8) / d5;
    }

    public static final double q(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d7) : d2 * d5;
    }

    public static final double r(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d9) + d7 : (d5 * d2) + d8;
    }
}
