package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.util.Bitmaps;
import kotlin.Metadata;
import okio.BufferedSource;

@Metadata
public final class ExifUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final ExifUtils f23375a = new ExifUtils();

    /* renamed from: b  reason: collision with root package name */
    public static final Paint f23376b = new Paint(3);

    public final ExifData a(String str, BufferedSource bufferedSource, ExifOrientationPolicy exifOrientationPolicy) {
        if (!ExifUtilsKt.c(exifOrientationPolicy, str)) {
            return ExifData.f23367d;
        }
        ExifInterface exifInterface = new ExifInterface(new ExifInterfaceInputStream(bufferedSource.peek().B1()));
        return new ExifData(exifInterface.s(), exifInterface.l());
    }

    public final Bitmap b(Bitmap bitmap, ExifData exifData) {
        if (!exifData.b() && !ExifUtilsKt.a(exifData)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        if (exifData.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (ExifUtilsKt.a(exifData)) {
            matrix.postRotate((float) exifData.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        float f2 = rectF.left;
        if (!(f2 == 0.0f && rectF.top == 0.0f)) {
            matrix.postTranslate(-f2, -rectF.top);
        }
        Bitmap createBitmap = ExifUtilsKt.b(exifData) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmaps.c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmaps.c(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, f23376b);
        bitmap.recycle();
        return createBitmap;
    }
}
