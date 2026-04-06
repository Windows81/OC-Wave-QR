package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

@Metadata
@DrawScopeMarker
public interface DrawTransform {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void e(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            drawTransform.d(f2, f3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    static /* synthetic */ void f(DrawTransform drawTransform, Path path, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = ClipOp.f15971b.b();
            }
            drawTransform.c(path, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    void a(float[] fArr);

    void b(float f2, float f3, float f4, float f5, int i2);

    void c(Path path, int i2);

    void d(float f2, float f3);

    void g(float f2, float f3, long j2);

    void h(float f2, float f3, float f4, float f5);

    void i(float f2, long j2);
}
