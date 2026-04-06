package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OutlineResolver {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17823a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Outline f17824b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.compose.ui.graphics.Outline f17825c;

    /* renamed from: d  reason: collision with root package name */
    public Path f17826d;

    /* renamed from: e  reason: collision with root package name */
    public Path f17827e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17828f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17829g;

    /* renamed from: h  reason: collision with root package name */
    public Path f17830h;

    /* renamed from: i  reason: collision with root package name */
    public RoundRect f17831i;

    /* renamed from: j  reason: collision with root package name */
    public float f17832j;

    /* renamed from: k  reason: collision with root package name */
    public long f17833k;

    /* renamed from: l  reason: collision with root package name */
    public long f17834l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17835m;

    /* renamed from: n  reason: collision with root package name */
    public Path f17836n;

    /* renamed from: o  reason: collision with root package name */
    public Path f17837o;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f17824b = outline;
        this.f17833k = Offset.f15855b.c();
        this.f17834l = Size.f15876b.b();
    }

    public final void a(Canvas canvas) {
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        Path d2 = d();
        if (d2 != null) {
            Canvas.v(canvas2, d2, 0, 2, (Object) null);
            return;
        }
        float f2 = this.f17832j;
        if (f2 > 0.0f) {
            Path path = this.f17830h;
            RoundRect roundRect = this.f17831i;
            if (path != null) {
                if (g(roundRect, this.f17833k, this.f17834l, f2)) {
                    i3 = 0;
                    i2 = 2;
                    Canvas.v(canvas2, path, i3, i2, (Object) null);
                    return;
                }
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (this.f17833k >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f17833k & 4294967295L));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f17834l >> 32)) + Float.intBitsToFloat((int) (this.f17833k >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (this.f17834l & 4294967295L)) + Float.intBitsToFloat((int) (this.f17833k & 4294967295L));
            float f3 = this.f17832j;
            RoundRect d3 = RoundRectKt.d(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, CornerRadius.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)));
            if (path == null) {
                path = AndroidPath_androidKt.a();
            } else {
                path.b();
            }
            i2 = 2;
            Path.l(path, d3, (Path.Direction) null, 2, (Object) null);
            this.f17831i = d3;
            this.f17830h = path;
            i3 = 0;
            Canvas.v(canvas2, path, i3, i2, (Object) null);
            return;
        }
        Canvas.e(canvas, Float.intBitsToFloat((int) (this.f17833k >> 32)), Float.intBitsToFloat((int) (this.f17833k & 4294967295L)), Float.intBitsToFloat((int) (this.f17833k >> 32)) + Float.intBitsToFloat((int) (this.f17834l >> 32)), Float.intBitsToFloat((int) (this.f17833k & 4294967295L)) + Float.intBitsToFloat((int) (this.f17834l & 4294967295L)), 0, 16, (Object) null);
    }

    public final Outline b() {
        i();
        if (!this.f17835m || !this.f17823a) {
            return null;
        }
        return this.f17824b;
    }

    public final boolean c() {
        return this.f17828f;
    }

    public final Path d() {
        i();
        return this.f17827e;
    }

    public final boolean e() {
        return !this.f17829g;
    }

    public final boolean f(long j2) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.f17835m && (outline = this.f17825c) != null) {
            return ShapeContainingUtilKt.b(outline, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), this.f17836n, this.f17837o);
        }
        return true;
    }

    public final boolean g(RoundRect roundRect, long j2, long j3, float f2) {
        if (roundRect == null || !RoundRectKt.g(roundRect)) {
            return false;
        }
        int i2 = (int) (j2 >> 32);
        if (roundRect.e() != Float.intBitsToFloat(i2)) {
            return false;
        }
        int i3 = (int) (j2 & 4294967295L);
        return roundRect.g() == Float.intBitsToFloat(i3) && roundRect.f() == Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)) && roundRect.a() == Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.h() >> 32)) == f2;
    }

    public final boolean h(androidx.compose.ui.graphics.Outline outline, float f2, boolean z2, float f3, long j2) {
        this.f17824b.setAlpha(f2);
        boolean d2 = Intrinsics.d(this.f17825c, outline);
        boolean z3 = !d2;
        if (!d2) {
            this.f17825c = outline;
            this.f17828f = true;
        }
        this.f17834l = j2;
        boolean z4 = outline != null && (z2 || f3 > 0.0f);
        if (this.f17835m != z4) {
            this.f17835m = z4;
            this.f17828f = true;
        }
        return z3;
    }

    public final void i() {
        if (this.f17828f) {
            this.f17833k = Offset.f15855b.c();
            this.f17832j = 0.0f;
            this.f17827e = null;
            this.f17828f = false;
            this.f17829g = false;
            androidx.compose.ui.graphics.Outline outline = this.f17825c;
            if (outline == null || !this.f17835m || Float.intBitsToFloat((int) (this.f17834l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f17834l & 4294967295L)) <= 0.0f) {
                this.f17824b.setEmpty();
                return;
            }
            this.f17823a = true;
            if (outline instanceof Outline.Rectangle) {
                k(((Outline.Rectangle) outline).b());
            } else if (outline instanceof Outline.Rounded) {
                l(((Outline.Rounded) outline).b());
            } else if (outline instanceof Outline.Generic) {
                j(((Outline.Generic) outline).b());
            }
        }
    }

    public final void j(Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28 || path.e()) {
            if (i2 >= 30) {
                OutlineVerificationHelper.f17838a.a(this.f17824b, path);
            } else {
                android.graphics.Outline outline = this.f17824b;
                if (path instanceof AndroidPath) {
                    outline.setConvexPath(((AndroidPath) path).B());
                } else {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
            }
            this.f17829g = !this.f17824b.canClip();
        } else {
            this.f17823a = false;
            this.f17824b.setEmpty();
            this.f17829g = true;
        }
        this.f17827e = path;
    }

    public final void k(Rect rect) {
        float o2 = rect.o();
        float r2 = rect.r();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(o2);
        this.f17833k = Offset.e((((long) Float.floatToRawIntBits(r2)) & 4294967295L) | (floatToRawIntBits << 32));
        float p2 = rect.p() - rect.o();
        float i2 = rect.i() - rect.r();
        long floatToRawIntBits2 = (long) Float.floatToRawIntBits(p2);
        this.f17834l = Size.d((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (floatToRawIntBits2 << 32));
        this.f17824b.setRect(Math.round(rect.o()), Math.round(rect.r()), Math.round(rect.p()), Math.round(rect.i()));
    }

    public final void l(RoundRect roundRect) {
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.h() >> 32));
        float e2 = roundRect.e();
        float g2 = roundRect.g();
        this.f17833k = Offset.e((((long) Float.floatToRawIntBits(e2)) << 32) | (((long) Float.floatToRawIntBits(g2)) & 4294967295L));
        float j2 = roundRect.j();
        float d2 = roundRect.d();
        this.f17834l = Size.d((((long) Float.floatToRawIntBits(j2)) << 32) | (((long) Float.floatToRawIntBits(d2)) & 4294967295L));
        if (RoundRectKt.g(roundRect)) {
            this.f17824b.setRoundRect(Math.round(roundRect.e()), Math.round(roundRect.g()), Math.round(roundRect.f()), Math.round(roundRect.a()), intBitsToFloat);
            this.f17832j = intBitsToFloat;
            return;
        }
        Path path = this.f17826d;
        if (path == null) {
            path = AndroidPath_androidKt.a();
            this.f17826d = path;
        }
        path.b();
        Path.l(path, roundRect, (Path.Direction) null, 2, (Object) null);
        j(path);
    }
}
