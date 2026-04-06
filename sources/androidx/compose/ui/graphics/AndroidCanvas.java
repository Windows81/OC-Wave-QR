package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidCanvas implements Canvas {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f15881a = AndroidCanvas_androidKt.f15884a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f15882b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f15883c;

    public final Canvas A() {
        return this.f15881a;
    }

    public final void B(Canvas canvas) {
        this.f15881a = canvas;
    }

    public final Region.Op C(int i2) {
        return ClipOp.e(i2, ClipOp.f15971b.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final void a(List list, Paint paint, int i2) {
        if (list.size() >= 2) {
            Paint x2 = paint.x();
            int i3 = 0;
            while (i3 < list.size() - 1) {
                long t2 = ((Offset) list.get(i3)).t();
                long t3 = ((Offset) list.get(i3 + 1)).t();
                this.f15881a.drawLine(Float.intBitsToFloat((int) (t2 >> 32)), Float.intBitsToFloat((int) (t2 & 4294967295L)), Float.intBitsToFloat((int) (t3 >> 32)), Float.intBitsToFloat((int) (t3 & 4294967295L)), x2);
                i3 += i2;
            }
        }
    }

    public void b(float f2, float f3, float f4, float f5, int i2) {
        this.f15881a.clipRect(f2, f3, f4, f5, C(i2));
    }

    public void c(Path path, int i2) {
        Canvas canvas = this.f15881a;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).B(), C(i2));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void d(float f2, float f3) {
        this.f15881a.translate(f2, f3);
    }

    public void f(float f2, float f3) {
        this.f15881a.scale(f2, f3);
    }

    public void g(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        this.f15881a.saveLayer(rect.o(), rect.r(), rect.p(), rect.i(), paint.x(), 31);
    }

    public void h(long j2, long j3, Paint paint) {
        Canvas canvas = this.f15881a;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        canvas.drawLine(intBitsToFloat, intBitsToFloat2, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), paint.x());
    }

    public void i(float f2) {
        this.f15881a.rotate(f2);
    }

    public void j(float f2, float f3, float f4, float f5, Paint paint) {
        this.f15881a.drawRect(f2, f3, f4, f5, paint.x());
    }

    public void k(int i2, List list, Paint paint) {
        PointMode.Companion companion = PointMode.f16097b;
        if (PointMode.f(i2, companion.a())) {
            a(list, paint, 2);
        } else if (PointMode.f(i2, companion.c())) {
            a(list, paint, 1);
        } else if (PointMode.f(i2, companion.b())) {
            z(list, paint);
        }
    }

    public void l(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint) {
        if (this.f15882b == null) {
            this.f15882b = new Rect();
            this.f15883c = new Rect();
        }
        Canvas canvas = this.f15881a;
        Bitmap b2 = AndroidImageBitmap_androidKt.b(imageBitmap);
        Rect rect = this.f15882b;
        Intrinsics.f(rect);
        rect.left = IntOffset.k(j2);
        rect.top = IntOffset.l(j2);
        rect.right = IntOffset.k(j2) + ((int) (j3 >> 32));
        rect.bottom = IntOffset.l(j2) + ((int) (j3 & 4294967295L));
        Unit unit = Unit.f40552a;
        Rect rect2 = this.f15883c;
        Intrinsics.f(rect2);
        rect2.left = IntOffset.k(j4);
        rect2.top = IntOffset.l(j4);
        rect2.right = IntOffset.k(j4) + ((int) (j5 >> 32));
        rect2.bottom = IntOffset.l(j4) + ((int) (j5 & 4294967295L));
        canvas.drawBitmap(b2, rect, rect2, paint.x());
    }

    public void m(ImageBitmap imageBitmap, long j2, Paint paint) {
        this.f15881a.drawBitmap(AndroidImageBitmap_androidKt.b(imageBitmap), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), paint.x());
    }

    public void o() {
        this.f15881a.save();
    }

    public void p() {
        CanvasUtils.f15966a.a(this.f15881a, false);
    }

    public void q(float[] fArr) {
        if (!MatrixKt.a(fArr)) {
            Matrix matrix = new Matrix();
            AndroidMatrixConversions_androidKt.a(matrix, fArr);
            this.f15881a.concat(matrix);
        }
    }

    public void s(Path path, Paint paint) {
        Canvas canvas = this.f15881a;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).B(), paint.x());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void t() {
        this.f15881a.restore();
    }

    public void u(long j2, float f2, Paint paint) {
        this.f15881a.drawCircle(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2, paint.x());
    }

    public void w(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint) {
        this.f15881a.drawArc(f2, f3, f4, f5, f6, f7, z2, paint.x());
    }

    public void x() {
        CanvasUtils.f15966a.a(this.f15881a, true);
    }

    public void y(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint) {
        this.f15881a.drawRoundRect(f2, f3, f4, f5, f6, f7, paint.x());
    }

    public final void z(List list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long t2 = ((Offset) list.get(i2)).t();
            this.f15881a.drawPoint(Float.intBitsToFloat((int) (t2 >> 32)), Float.intBitsToFloat((int) (t2 & 4294967295L)), paint.x());
        }
    }
}
