package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ColorSpaceVerificationHelperV34 {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorSpaceVerificationHelperV34 f15996a = new ColorSpaceVerificationHelperV34();

    public static final ColorSpace a(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpaces colorSpaces = ColorSpaces.f16176a;
        if (Intrinsics.d(colorSpace, colorSpaces.q())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (Intrinsics.d(colorSpace, colorSpaces.r())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
