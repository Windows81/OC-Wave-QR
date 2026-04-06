package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

@Metadata
public final class AndroidColorFilter_androidKt {
    public static final float[] a(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && d()) {
            return ColorMatrixFilterHelper.f15994a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final ColorFilter b(long j2, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.f15954a.a(j2, i2) : new PorterDuffColorFilter(ColorKt.j(j2), AndroidBlendMode_androidKt.b(i2));
    }

    public static final ColorFilter c(ColorFilter colorFilter) {
        return colorFilter.a();
    }

    public static final boolean d() {
        return true;
    }
}
