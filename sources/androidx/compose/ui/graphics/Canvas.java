package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface Canvas {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void e(Canvas canvas, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 16) != 0) {
                i2 = ClipOp.f15971b.b();
            }
            canvas.b(f2, f3, f4, f5, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    static /* synthetic */ void n(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = ClipOp.f15971b.b();
            }
            canvas.r(rect, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
    }

    static /* synthetic */ void v(Canvas canvas, Path path, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = ClipOp.f15971b.b();
            }
            canvas.c(path, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    void b(float f2, float f3, float f4, float f5, int i2);

    void c(Path path, int i2);

    void d(float f2, float f3);

    void f(float f2, float f3);

    void g(Rect rect, Paint paint);

    void h(long j2, long j3, Paint paint);

    void i(float f2);

    void j(float f2, float f3, float f4, float f5, Paint paint);

    void k(int i2, List list, Paint paint);

    void l(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint);

    void m(ImageBitmap imageBitmap, long j2, Paint paint);

    void o();

    void p();

    void q(float[] fArr);

    void r(Rect rect, int i2) {
        b(rect.o(), rect.r(), rect.p(), rect.i(), i2);
    }

    void s(Path path, Paint paint);

    void t();

    void u(long j2, float f2, Paint paint);

    void w(float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, Paint paint);

    void x();

    void y(float f2, float f3, float f4, float f5, float f6, float f7, Paint paint);
}
