package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DrawScopeMarker
public interface DrawScope extends Density {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f16288g = Companion.f16289a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f16289a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final int f16290b = BlendMode.f15926b.B();

        /* renamed from: c  reason: collision with root package name */
        public static final int f16291c = FilterQuality.f16003b.a();

        public final int a() {
            return f16290b;
        }

        public final int b() {
            return f16291c;
        }
    }

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void A1(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        long j5;
        if (obj == null) {
            long c2 = (i3 & 2) != 0 ? Offset.f15855b.c() : j3;
            if ((i3 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j5 = drawScope.o1(drawScope.c(), c2);
            } else {
                DrawScope drawScope3 = drawScope;
                j5 = j4;
            }
            drawScope.D0(j2, c2, j5, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.f16295a : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    static /* synthetic */ void E1(DrawScope drawScope, Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.B0(path, j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.f16295a : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    static /* synthetic */ void G0(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        long j4;
        if (obj == null) {
            long c2 = (i3 & 2) != 0 ? Offset.f15855b.c() : j2;
            if ((i3 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j4 = drawScope.o1(drawScope.c(), c2);
            } else {
                DrawScope drawScope3 = drawScope;
                j4 = j3;
            }
            drawScope.w0(brush, c2, j4, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.f16295a : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    static /* synthetic */ void Z1(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, Function1 function1, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                j2 = IntSizeKt.d(drawScope.c());
            }
            drawScope.l1(graphicsLayer, j2, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
    }

    static /* synthetic */ void a2(DrawScope drawScope, long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        long j5;
        int i4 = i3;
        if (obj == null) {
            long c2 = (i4 & 16) != 0 ? Offset.f15855b.c() : j3;
            if ((i4 & 32) != 0) {
                j5 = drawScope.o1(drawScope.c(), c2);
            } else {
                DrawScope drawScope2 = drawScope;
                j5 = j4;
            }
            drawScope.a1(j2, f2, f3, z2, c2, j5, (i4 & 64) != 0 ? 1.0f : f4, (i4 & 128) != 0 ? Fill.f16295a : drawStyle, (i4 & 256) != 0 ? null : colorFilter, (i4 & 512) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    static /* synthetic */ void j2(DrawScope drawScope, long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
        int i5 = i4;
        if (obj == null) {
            drawScope.z0(j2, j3, j4, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? Stroke.f16296f.a() : i2, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? f16288g.a() : i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    static /* synthetic */ void k2(DrawScope drawScope, long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.O0(j2, (i3 & 2) != 0 ? Size.h(drawScope.c()) / 2.0f : f2, (i3 & 4) != 0 ? drawScope.T1() : j3, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.f16295a : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    static /* synthetic */ void m0(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        int i5 = i4;
        if (obj == null) {
            long b2 = (i5 & 2) != 0 ? IntOffset.f19160b.b() : j2;
            long c2 = (i5 & 4) != 0 ? IntSize.c((((long) imageBitmap.a()) & 4294967295L) | (((long) imageBitmap.b()) << 32)) : j3;
            drawScope.Y1(imageBitmap, b2, c2, (i5 & 8) != 0 ? IntOffset.f19160b.b() : j4, (i5 & 16) != 0 ? c2 : j5, (i5 & 32) != 0 ? 1.0f : f2, (i5 & 64) != 0 ? Fill.f16295a : drawStyle, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? f16288g.a() : i2, (i5 & 512) != 0 ? f16288g.b() : i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    static /* synthetic */ void m1(DrawScope drawScope, List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
        int i6 = i5;
        if (obj == null) {
            drawScope.D1(list, i2, j2, (i6 & 8) != 0 ? 0.0f : f2, (i6 & 16) != 0 ? StrokeCap.f16130b.a() : i3, (i6 & 32) != 0 ? null : pathEffect, (i6 & 64) != 0 ? 1.0f : f3, (i6 & 128) != 0 ? null : colorFilter, (i6 & 256) != 0 ? f16288g.a() : i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    static /* synthetic */ void m2(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        long j6;
        int i4 = i3;
        if (obj == null) {
            long c2 = (i4 & 2) != 0 ? Offset.f15855b.c() : j3;
            if ((i4 & 4) != 0) {
                j6 = drawScope.o1(drawScope.c(), c2);
            } else {
                DrawScope drawScope2 = drawScope;
                j6 = j4;
            }
            drawScope.b2(j2, c2, j6, (i4 & 8) != 0 ? CornerRadius.f15848b.a() : j5, (i4 & 16) != 0 ? Fill.f16295a : drawStyle, (i4 & 32) != 0 ? 1.0f : f2, (i4 & 64) != 0 ? null : colorFilter, (i4 & 128) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    static /* synthetic */ void n1(DrawScope drawScope, Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
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
                i2 = f16288g.a();
            }
            drawScope.y1(path, brush, f3, drawStyle2, colorFilter2, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    static /* synthetic */ void o2(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        long j5;
        int i4 = i3;
        if (obj == null) {
            long c2 = (i4 & 2) != 0 ? Offset.f15855b.c() : j2;
            if ((i4 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j5 = drawScope.o1(drawScope.c(), c2);
            } else {
                DrawScope drawScope3 = drawScope;
                j5 = j3;
            }
            drawScope.p1(brush, c2, j5, (i4 & 8) != 0 ? CornerRadius.f15848b.a() : j4, (i4 & 16) != 0 ? 1.0f : f2, (i4 & 32) != 0 ? Fill.f16295a : drawStyle, (i4 & 64) != 0 ? null : colorFilter, (i4 & 128) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    static /* synthetic */ void p2(DrawScope drawScope, Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
        int i5 = i4;
        if (obj == null) {
            drawScope.J1(brush, j2, j3, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? Stroke.f16296f.a() : i2, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? f16288g.a() : i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    static /* synthetic */ void t0(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.r0(imageBitmap, (i3 & 2) != 0 ? Offset.f15855b.c() : j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.f16295a : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? f16288g.a() : i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    void B0(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void D0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void D1(List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4);

    DrawContext G1();

    void J1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    void O0(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    long T1() {
        return SizeKt.b(G1().c());
    }

    void Y1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        m0(this, imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, 0, 512, (Object) null);
    }

    void a1(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void b2(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2);

    long c() {
        return G1().c();
    }

    LayoutDirection getLayoutDirection();

    void l1(GraphicsLayer graphicsLayer, long j2, Function1 function1) {
        graphicsLayer.G(this, getLayoutDirection(), j2, new DrawScope$record$1(this, function1));
    }

    long o1(long j2, long j3) {
        return Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L));
    }

    void p1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void r0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void w0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void y1(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    void z0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);
}
