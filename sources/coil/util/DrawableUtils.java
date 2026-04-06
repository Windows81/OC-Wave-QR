package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class DrawableUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final DrawableUtils f23746a = new DrawableUtils();

    public final Bitmap a(Drawable drawable, Bitmap.Config config, Size size, Scale scale, boolean z2) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z2, bitmap, size, scale)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int q2 = Utils.q(mutate);
        int i2 = 512;
        if (q2 <= 0) {
            q2 = 512;
        }
        int j2 = Utils.j(mutate);
        if (j2 > 0) {
            i2 = j2;
        }
        double c2 = DecodeUtils.c(q2, i2, Sizes.a(size) ? q2 : Utils.B(size.d(), scale), Sizes.a(size) ? i2 : Utils.B(size.c(), scale), scale);
        int c3 = MathKt.c(((double) q2) * c2);
        int c4 = MathKt.c(c2 * ((double) i2));
        Bitmap createBitmap = Bitmap.createBitmap(c3, c4, Bitmaps.e(config));
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, c3, c4);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == Bitmaps.e(config);
    }

    public final boolean c(boolean z2, Bitmap bitmap, Size size, Scale scale) {
        if (z2) {
            return true;
        }
        return DecodeUtils.c(bitmap.getWidth(), bitmap.getHeight(), Sizes.a(size) ? bitmap.getWidth() : Utils.B(size.d(), scale), Sizes.a(size) ? bitmap.getHeight() : Utils.B(size.c(), scale), scale) == 1.0d;
    }
}
