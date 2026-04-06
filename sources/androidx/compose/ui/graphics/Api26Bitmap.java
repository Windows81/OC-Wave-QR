package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

@Metadata
public final class Api26Bitmap {

    /* renamed from: a  reason: collision with root package name */
    public static final Api26Bitmap f15922a = new Api26Bitmap();

    public static final Bitmap a(int i2, int i3, int i4, boolean z2, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i2, i3, AndroidImageBitmap_androidKt.d(i4), z2, AndroidColorSpace_androidKt.a(colorSpace));
    }
}
