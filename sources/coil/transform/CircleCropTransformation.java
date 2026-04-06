package coil.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import coil.size.Size;
import coil.util.Bitmaps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public final class CircleCropTransformation implements Transformation {

    /* renamed from: a  reason: collision with root package name */
    public final String f23715a;

    public String a() {
        return this.f23715a;
    }

    public Object b(Bitmap bitmap, Size size, Continuation continuation) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f2 = ((float) min) / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmaps.c(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f2, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f2 - (((float) bitmap.getWidth()) / 2.0f), f2 - (((float) bitmap.getHeight()) / 2.0f), paint);
        return createBitmap;
    }

    public boolean equals(Object obj) {
        return obj instanceof CircleCropTransformation;
    }

    public int hashCode() {
        return CircleCropTransformation.class.hashCode();
    }
}
