package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Painter {

    /* renamed from: A  reason: collision with root package name */
    public boolean f16456A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f16457B;
    public float C = 1.0f;
    public LayoutDirection D = LayoutDirection.Ltr;
    public final Function1 E = new Painter$drawLambda$1(this);

    /* renamed from: z  reason: collision with root package name */
    public Paint f16458z;

    public boolean a(float f2) {
        return false;
    }

    public boolean b(ColorFilter colorFilter) {
        return false;
    }

    public boolean c(LayoutDirection layoutDirection) {
        return false;
    }

    public final void d(float f2) {
        if (this.C != f2) {
            if (!a(f2)) {
                if (f2 == 1.0f) {
                    Paint paint = this.f16458z;
                    if (paint != null) {
                        paint.d(f2);
                    }
                    this.f16456A = false;
                } else {
                    l().d(f2);
                    this.f16456A = true;
                }
            }
            this.C = f2;
        }
    }

    public final void g(ColorFilter colorFilter) {
        if (!Intrinsics.d(this.f16457B, colorFilter)) {
            if (!b(colorFilter)) {
                if (colorFilter == null) {
                    Paint paint = this.f16458z;
                    if (paint != null) {
                        paint.A((ColorFilter) null);
                    }
                    this.f16456A = false;
                } else {
                    l().A(colorFilter);
                    this.f16456A = true;
                }
            }
            this.f16457B = colorFilter;
        }
    }

    public final void i(LayoutDirection layoutDirection) {
        if (this.D != layoutDirection) {
            c(layoutDirection);
            this.D = layoutDirection;
        }
    }

    public final void j(DrawScope drawScope, long j2, float f2, ColorFilter colorFilter) {
        Canvas j3;
        d(f2);
        g(colorFilter);
        i(drawScope.getLayoutDirection());
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.c() >> 32)) - Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) - Float.intBitsToFloat(i3);
        drawScope.G1().e().h(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f2 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i2) > 0.0f && Float.intBitsToFloat(i3) > 0.0f) {
                    if (this.f16456A) {
                        long c2 = Offset.f15855b.c();
                        float intBitsToFloat3 = Float.intBitsToFloat(i2);
                        Rect c3 = RectKt.c(c2, Size.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3))) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat3)) << 32)));
                        j3 = drawScope.G1().j();
                        j3.g(c3, l());
                        m(drawScope);
                        j3.t();
                    } else {
                        m(drawScope);
                    }
                }
            } catch (Throwable th) {
                drawScope.G1().e().h(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th;
            }
        }
        drawScope.G1().e().h(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long k();

    public final Paint l() {
        Paint paint = this.f16458z;
        if (paint != null) {
            return paint;
        }
        Paint a2 = AndroidPaint_androidKt.a();
        this.f16458z = a2;
        return a2;
    }

    public abstract void m(DrawScope drawScope);
}
