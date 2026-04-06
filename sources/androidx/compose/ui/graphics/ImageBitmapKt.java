package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;

@Metadata
public final class ImageBitmapKt {
    public static final ImageBitmap a(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.a(i2, i3, i4, z2, colorSpace);
    }

    public static /* synthetic */ ImageBitmap b(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = ImageBitmapConfig.f16021b.b();
        }
        if ((i5 & 8) != 0) {
            z2 = true;
        }
        if ((i5 & 16) != 0) {
            colorSpace = ColorSpaces.f16176a.G();
        }
        return a(i2, i3, i4, z2, colorSpace);
    }
}
