package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class OutlineKt {
    public static final void a(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.d(path, ((Outline.Rectangle) outline).b(), (Path.Direction) null, 2, (Object) null);
        } else if (outline instanceof Outline.Rounded) {
            Path.l(path, ((Outline.Rounded) outline).b(), (Path.Direction) null, 2, (Object) null);
        } else if (outline instanceof Outline.Generic) {
            Path.p(path, ((Outline.Generic) outline).b(), 0, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void b(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path b2;
        Outline outline2 = outline;
        if (outline2 instanceof Outline.Rectangle) {
            Rect b3 = ((Outline.Rectangle) outline2).b();
            drawScope.w0(brush, h(b3), f(b3), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (outline2 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline2;
            b2 = rounded.c();
            if (b2 == null) {
                RoundRect b4 = rounded.b();
                float intBitsToFloat = Float.intBitsToFloat((int) (b4.b() >> 32));
                long i3 = i(b4);
                long g2 = g(b4);
                long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
                DrawScope drawScope2 = drawScope;
                Brush brush2 = brush;
                drawScope2.p1(brush2, i3, g2, CornerRadius.b((((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32)), f2, drawStyle, colorFilter, i2);
                return;
            }
        } else if (outline2 instanceof Outline.Generic) {
            b2 = ((Outline.Generic) outline2).b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawScope.y1(b2, brush, f2, drawStyle, colorFilter, i2);
    }

    public static /* synthetic */ void c(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.f16295a;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i3 & 32) != 0) {
            i2 = DrawScope.f16288g.a();
        }
        b(drawScope, outline, brush, f3, drawStyle2, colorFilter2, i2);
    }

    public static final void d(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        Path b2;
        Outline outline2 = outline;
        if (outline2 instanceof Outline.Rectangle) {
            Rect b3 = ((Outline.Rectangle) outline2).b();
            drawScope.D0(j2, h(b3), f(b3), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (outline2 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline2;
            b2 = rounded.c();
            if (b2 == null) {
                RoundRect b4 = rounded.b();
                float intBitsToFloat = Float.intBitsToFloat((int) (b4.b() >> 32));
                long i3 = i(b4);
                long g2 = g(b4);
                long floatToRawIntBits = (long) Float.floatToRawIntBits(intBitsToFloat);
                DrawScope drawScope2 = drawScope;
                long j3 = j2;
                drawScope2.b2(j3, i3, g2, CornerRadius.b((((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32)), drawStyle, f2, colorFilter, i2);
                return;
            }
        } else if (outline2 instanceof Outline.Generic) {
            b2 = ((Outline.Generic) outline2).b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawScope.B0(b2, j2, f2, drawStyle, colorFilter, i2);
    }

    public static /* synthetic */ void e(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        d(drawScope, outline, j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.f16295a : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.f16288g.a() : i2);
    }

    public static final long f(Rect rect) {
        float p2 = rect.p() - rect.o();
        float i2 = rect.i() - rect.r();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(p2);
        return Size.d((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long g(RoundRect roundRect) {
        return Size.d((((long) Float.floatToRawIntBits(roundRect.j())) << 32) | (((long) Float.floatToRawIntBits(roundRect.d())) & 4294967295L));
    }

    public static final long h(Rect rect) {
        return Offset.e((((long) Float.floatToRawIntBits(rect.o())) << 32) | (((long) Float.floatToRawIntBits(rect.r())) & 4294967295L));
    }

    public static final long i(RoundRect roundRect) {
        return Offset.e((((long) Float.floatToRawIntBits(roundRect.e())) << 32) | (((long) Float.floatToRawIntBits(roundRect.g())) & 4294967295L));
    }
}
