package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

@Metadata
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap a(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace) {
        d(i4);
        return new AndroidImageBitmap(Api26Bitmap.a(i2, i3, i4, z2, colorSpace));
    }

    public static final Bitmap b(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).e();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final ImageBitmap c(Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    public static final Bitmap.Config d(int i2) {
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.f16021b;
        return ImageBitmapConfig.i(i2, companion.b()) ? Bitmap.Config.ARGB_8888 : ImageBitmapConfig.i(i2, companion.a()) ? Bitmap.Config.ALPHA_8 : ImageBitmapConfig.i(i2, companion.e()) ? Bitmap.Config.RGB_565 : ImageBitmapConfig.i(i2, companion.c()) ? Bitmap.Config.RGBA_F16 : ImageBitmapConfig.i(i2, companion.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ImageBitmapConfig.f16021b.a() : config == Bitmap.Config.RGB_565 ? ImageBitmapConfig.f16021b.e() : config == Bitmap.Config.ARGB_4444 ? ImageBitmapConfig.f16021b.b() : config == Bitmap.Config.RGBA_F16 ? ImageBitmapConfig.f16021b.c() : config == Bitmap.Config.HARDWARE ? ImageBitmapConfig.f16021b.d() : ImageBitmapConfig.f16021b.b();
    }
}
