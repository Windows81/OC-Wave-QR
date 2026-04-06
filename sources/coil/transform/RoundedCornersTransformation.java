package coil.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.decode.DecodeUtils;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

@Metadata
public final class RoundedCornersTransformation implements Transformation {

    /* renamed from: a  reason: collision with root package name */
    public final float f23716a;

    /* renamed from: b  reason: collision with root package name */
    public final float f23717b;

    /* renamed from: c  reason: collision with root package name */
    public final float f23718c;

    /* renamed from: d  reason: collision with root package name */
    public final float f23719d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23720e;

    public String a() {
        return this.f23720e;
    }

    public Object b(Bitmap bitmap, Size size, Continuation continuation) {
        Paint paint = new Paint(3);
        Pair c2 = c(bitmap, size);
        int intValue = ((Number) c2.a()).intValue();
        int intValue2 = ((Number) c2.b()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmaps.c(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float c3 = (float) DecodeUtils.c(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, Scale.FILL);
        float f2 = (float) 2;
        matrix.setTranslate((((float) intValue) - (((float) bitmap.getWidth()) * c3)) / f2, (((float) intValue2) - (((float) bitmap.getHeight()) * c3)) / f2);
        matrix.preScale(c3, c3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f3 = this.f23716a;
        float f4 = this.f23717b;
        float f5 = this.f23719d;
        float f6 = this.f23718c;
        float[] fArr = {f3, f3, f4, f4, f5, f5, f6, f6};
        RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public final Pair c(Bitmap bitmap, Size size) {
        if (Sizes.a(size)) {
            return TuplesKt.a(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        Dimension a2 = size.a();
        Dimension b2 = size.b();
        if ((a2 instanceof Dimension.Pixels) && (b2 instanceof Dimension.Pixels)) {
            return TuplesKt.a(Integer.valueOf(((Dimension.Pixels) a2).f23691a), Integer.valueOf(((Dimension.Pixels) b2).f23691a));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Dimension d2 = size.d();
        int i2 = Integer.MIN_VALUE;
        int i3 = d2 instanceof Dimension.Pixels ? ((Dimension.Pixels) d2).f23691a : Integer.MIN_VALUE;
        Dimension c2 = size.c();
        if (c2 instanceof Dimension.Pixels) {
            i2 = ((Dimension.Pixels) c2).f23691a;
        }
        double c3 = DecodeUtils.c(width, height, i3, i2, Scale.FILL);
        return TuplesKt.a(Integer.valueOf(MathKt.c(((double) bitmap.getWidth()) * c3)), Integer.valueOf(MathKt.c(c3 * ((double) bitmap.getHeight()))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            return this.f23716a == roundedCornersTransformation.f23716a && this.f23717b == roundedCornersTransformation.f23717b && this.f23718c == roundedCornersTransformation.f23718c && this.f23719d == roundedCornersTransformation.f23719d;
        }
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f23716a) * 31) + Float.hashCode(this.f23717b)) * 31) + Float.hashCode(this.f23718c)) * 31) + Float.hashCode(this.f23719d);
    }
}
