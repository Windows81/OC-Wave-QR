package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public interface Path {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f16065a = Companion.f16066a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f16066a = new Companion();
    }

    @Metadata
    public static final class DefaultImpls {
    }

    @Metadata
    public enum Direction {
        CounterClockwise,
        Clockwise;

        static {
            Direction[] d2;
            C = EnumEntriesKt.a(d2);
        }
    }

    static /* synthetic */ void d(Path path, Rect rect, Direction direction, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.r(rect, direction);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
    }

    static /* synthetic */ void l(Path path, RoundRect roundRect, Direction direction, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                direction = Direction.CounterClockwise;
            }
            path.A(roundRect, direction);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
    }

    static /* synthetic */ void p(Path path, Path path2, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Offset.f15855b.c();
            }
            path.y(path2, j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
    }

    void A(RoundRect roundRect, Direction direction);

    void a(float[] fArr) {
    }

    void b();

    void c(float f2, float f3, float f4, float f5) {
        k(f2, f3, f4, f5);
    }

    void close();

    boolean e();

    Path f(Path path) {
        Path a2 = AndroidPath_androidKt.a();
        a2.u(this, path, PathOperation.f16081b.b());
        return a2;
    }

    void g(float f2, float f3);

    Rect getBounds();

    void h(float f2, float f3, float f4, float f5, float f6, float f7);

    void i(float f2, float f3, float f4, float f5);

    boolean isEmpty();

    PathIterator j(PathIterator.ConicEvaluation conicEvaluation, float f2) {
        return AndroidPathIterator_androidKt.a(this, conicEvaluation, f2);
    }

    void k(float f2, float f3, float f4, float f5);

    void m(int i2);

    void n(float f2, float f3, float f4, float f5) {
        i(f2, f3, f4, f5);
    }

    int o();

    void q(float f2, float f3);

    void r(Rect rect, Direction direction);

    void s(float f2, float f3, float f4, float f5, float f6, float f7);

    void t() {
        b();
    }

    boolean u(Path path, Path path2, int i2);

    void v(long j2);

    void w(Rect rect, float f2, float f3, boolean z2);

    void x(float f2, float f3);

    void y(Path path, long j2);

    void z(float f2, float f3);
}
