package androidx.compose.ui.graphics;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import kotlin.Metadata;

@Metadata
final class ColorMatrixFilterHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorMatrixFilterHelper f15994a = new ColorMatrixFilterHelper();

    public final float[] a(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.a(colorMatrix.getArray());
    }
}
