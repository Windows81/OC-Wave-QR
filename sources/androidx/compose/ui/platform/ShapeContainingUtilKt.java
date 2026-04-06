package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class ShapeContainingUtilKt {
    public static final boolean a(RoundRect roundRect) {
        return Float.intBitsToFloat((int) (roundRect.h() >> 32)) + Float.intBitsToFloat((int) (roundRect.i() >> 32)) <= roundRect.j() && Float.intBitsToFloat((int) (roundRect.b() >> 32)) + Float.intBitsToFloat((int) (roundRect.c() >> 32)) <= roundRect.j() && Float.intBitsToFloat((int) (roundRect.h() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.b() & 4294967295L)) <= roundRect.d() && Float.intBitsToFloat((int) (roundRect.i() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.c() & 4294967295L)) <= roundRect.d();
    }

    public static final boolean b(Outline outline, float f2, float f3, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return e(((Outline.Rectangle) outline).b(), f2, f3);
        }
        if (outline instanceof Outline.Rounded) {
            return f((Outline.Rounded) outline, f2, f3, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return d(((Outline.Generic) outline).b(), f2, f3, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return b(outline, f2, f3, path, path2);
    }

    public static final boolean d(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.a();
        }
        Path.d(path2, rect, (Path.Direction) null, 2, (Object) null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.a();
        }
        path3.u(path, path2, PathOperation.f16081b.b());
        boolean isEmpty = path3.isEmpty();
        path3.b();
        path2.b();
        return !isEmpty;
    }

    public static final boolean e(Rect rect, float f2, float f3) {
        return rect.o() <= f2 && f2 < rect.p() && rect.r() <= f3 && f3 < rect.i();
    }

    public static final boolean f(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        float f4 = f2;
        float f5 = f3;
        Path path3 = path2;
        RoundRect b2 = rounded.b();
        if (f4 < b2.e() || f4 >= b2.f() || f5 < b2.g() || f5 >= b2.a()) {
            return false;
        }
        if (!a(b2)) {
            Path a2 = path3 == null ? AndroidPath_androidKt.a() : path3;
            Path.l(a2, b2, (Path.Direction) null, 2, (Object) null);
            return d(a2, f4, f5, path, path3);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (b2.h() >> 32)) + b2.e();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (b2.h() & 4294967295L)) + b2.g();
        float f6 = b2.f() - Float.intBitsToFloat((int) (b2.i() >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (b2.i() & 4294967295L)) + b2.g();
        float f7 = b2.f() - Float.intBitsToFloat((int) (b2.c() >> 32));
        float a3 = b2.a() - Float.intBitsToFloat((int) (b2.c() & 4294967295L));
        float a4 = b2.a() - Float.intBitsToFloat((int) (4294967295L & b2.b()));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (b2.b() >> 32)) + b2.e();
        if (f4 < intBitsToFloat && f5 < intBitsToFloat2) {
            return g(f2, f3, b2.h(), intBitsToFloat, intBitsToFloat2);
        } else if (f4 < intBitsToFloat4 && f5 > a4) {
            return g(f2, f3, b2.b(), intBitsToFloat4, a4);
        } else if (f4 > f6 && f5 < intBitsToFloat3) {
            return g(f2, f3, b2.i(), f6, intBitsToFloat3);
        } else if (f4 <= f7 || f5 <= a3) {
            return true;
        } else {
            return g(f2, f3, b2.c(), f7, a3);
        }
    }

    public static final boolean g(float f2, float f3, long j2, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) + ((f7 * f7) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f;
    }
}
