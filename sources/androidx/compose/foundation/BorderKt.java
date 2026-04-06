package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class BorderKt {
    public static final Modifier e(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return g(modifier, borderStroke.b(), borderStroke.a(), shape);
    }

    public static final Modifier f(Modifier modifier, float f2, long j2, Shape shape) {
        return g(modifier, f2, new SolidColor(j2, (DefaultConstructorMarker) null), shape);
    }

    public static final Modifier g(Modifier modifier, float f2, Brush brush, Shape shape) {
        return modifier.o0(new BorderModifierNodeElement(f2, brush, shape, (DefaultConstructorMarker) null));
    }

    public static final RoundRect h(float f2, RoundRect roundRect) {
        float f3 = f2;
        return new RoundRect(f2, f3, roundRect.j() - f3, roundRect.d() - f3, l(roundRect.h(), f2), l(roundRect.i(), f2), l(roundRect.c(), f2), l(roundRect.b(), f2), (DefaultConstructorMarker) null);
    }

    public static final Path i(Path path, RoundRect roundRect, float f2, boolean z2) {
        path.b();
        Path.l(path, roundRect, (Path.Direction) null, 2, (Object) null);
        if (!z2) {
            Path a2 = AndroidPath_androidKt.a();
            Path.l(a2, h(f2, roundRect), (Path.Direction) null, 2, (Object) null);
            path.u(path, a2, PathOperation.f16081b.a());
        }
        return path;
    }

    public static final DrawResult j(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.t(BorderKt$drawContentWithoutBorder$1.f2971z);
    }

    public static final DrawResult k(CacheDrawScope cacheDrawScope, Brush brush, long j2, long j3, boolean z2, float f2) {
        return cacheDrawScope.t(new BorderKt$drawRectBorder$1(brush, z2 ? Offset.f15855b.c() : j2, z2 ? cacheDrawScope.c() : j3, z2 ? Fill.f16295a : new Stroke(f2, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null)));
    }

    public static final long l(long j2, float f2) {
        return CornerRadius.b((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2))) & 4294967295L));
    }
}
