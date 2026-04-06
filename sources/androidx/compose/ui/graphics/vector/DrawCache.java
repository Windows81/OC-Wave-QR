package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DrawCache {

    /* renamed from: a  reason: collision with root package name */
    public ImageBitmap f16460a;

    /* renamed from: b  reason: collision with root package name */
    public Canvas f16461b;

    /* renamed from: c  reason: collision with root package name */
    public Density f16462c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutDirection f16463d = LayoutDirection.Ltr;

    /* renamed from: e  reason: collision with root package name */
    public long f16464e = IntSize.f19170b.a();

    /* renamed from: f  reason: collision with root package name */
    public int f16465f = ImageBitmapConfig.f16021b.b();

    /* renamed from: g  reason: collision with root package name */
    public final CanvasDrawScope f16466g = new CanvasDrawScope();

    public final void a(DrawScope drawScope) {
        DrawScope.A1(drawScope, Color.f15975b.a(), 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, BlendMode.f15926b.a(), 62, (Object) null);
    }

    public final void b(int i2, long j2, Density density, LayoutDirection layoutDirection, Function1 function1) {
        int i3 = i2;
        long j3 = j2;
        Density density2 = density;
        LayoutDirection layoutDirection2 = layoutDirection;
        this.f16462c = density2;
        this.f16463d = layoutDirection2;
        ImageBitmap imageBitmap = this.f16460a;
        Canvas canvas = this.f16461b;
        if (imageBitmap == null || canvas == null || ((int) (j3 >> 32)) > imageBitmap.b() || ((int) (j3 & 4294967295L)) > imageBitmap.a() || !ImageBitmapConfig.i(this.f16465f, i3)) {
            imageBitmap = ImageBitmapKt.b((int) (j3 >> 32), (int) (j3 & 4294967295L), i2, false, (ColorSpace) null, 24, (Object) null);
            canvas = CanvasKt.a(imageBitmap);
            this.f16460a = imageBitmap;
            this.f16461b = canvas;
            this.f16465f = i3;
        }
        this.f16464e = j3;
        CanvasDrawScope canvasDrawScope = this.f16466g;
        long e2 = IntSizeKt.e(j2);
        CanvasDrawScope.DrawParams G = canvasDrawScope.G();
        Density a2 = G.a();
        LayoutDirection b2 = G.b();
        Canvas c2 = G.c();
        long d2 = G.d();
        CanvasDrawScope.DrawParams G2 = canvasDrawScope.G();
        G2.j(density2);
        G2.k(layoutDirection2);
        G2.i(canvas);
        G2.l(e2);
        canvas.o();
        a(canvasDrawScope);
        function1.invoke(canvasDrawScope);
        canvas.t();
        CanvasDrawScope.DrawParams G3 = canvasDrawScope.G();
        G3.j(a2);
        G3.k(b2);
        G3.i(c2);
        G3.l(d2);
        imageBitmap.c();
    }

    public final void c(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.f16460a;
        if (!(imageBitmap != null)) {
            InlineClassHelperKt.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m0(drawScope, imageBitmap, 0, this.f16464e, 0, 0, f2, (DrawStyle) null, colorFilter, 0, 0, 858, (Object) null);
    }

    public final ImageBitmap d() {
        return this.f16460a;
    }
}
