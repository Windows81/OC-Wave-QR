package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ColorSpaceVerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorSpaceVerificationHelper f15995a = new ColorSpaceVerificationHelper();

    public static final ColorSpace c(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace a2;
        androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2 = colorSpace;
        ColorSpaces colorSpaces = ColorSpaces.f16176a;
        if (Intrinsics.d(colorSpace2, colorSpaces.G())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.s())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.t())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.u())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.w())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.x())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.y())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.z())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.A())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.B())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.E())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.d(colorSpace2, colorSpaces.F())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (a2 = ColorSpaceVerificationHelperV34.a(colorSpace)) != null) {
            return a2;
        }
        if (!(colorSpace2 instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb = (Rgb) colorSpace2;
        float[] c2 = rgb.J().c();
        TransferParameters H = rgb.H();
        ColorSpace.Rgb.TransferParameters transferParameters = H != null ? new ColorSpace.Rgb.TransferParameters(H.a(), H.b(), H.c(), H.d(), H.e(), H.f(), H.g()) : null;
        return transferParameters != null ? new ColorSpace.Rgb(colorSpace.h(), rgb.G(), c2, transferParameters) : new ColorSpace.Rgb(colorSpace.h(), rgb.G(), c2, new K(rgb.D()), new L(rgb.z()), colorSpace2.f(0), colorSpace2.e(0));
    }

    public static final double d(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }

    public static final double e(Function1 function1, double d2) {
        return ((Number) function1.invoke(Double.valueOf(d2))).doubleValue();
    }
}
