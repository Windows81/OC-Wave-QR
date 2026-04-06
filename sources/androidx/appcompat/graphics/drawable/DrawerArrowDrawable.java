package androidx.appcompat.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    public static final float f743m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f744a;

    /* renamed from: b  reason: collision with root package name */
    public float f745b;

    /* renamed from: c  reason: collision with root package name */
    public float f746c;

    /* renamed from: d  reason: collision with root package name */
    public float f747d;

    /* renamed from: e  reason: collision with root package name */
    public float f748e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f749f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f750g;

    /* renamed from: h  reason: collision with root package name */
    public final int f751h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f752i;

    /* renamed from: j  reason: collision with root package name */
    public float f753j;

    /* renamed from: k  reason: collision with root package name */
    public float f754k;

    /* renamed from: l  reason: collision with root package name */
    public int f755l;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    public static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void b(float f2) {
        if (this.f753j != f2) {
            this.f753j = f2;
            invalidateSelf();
        }
    }

    public void c(boolean z2) {
        if (this.f752i != z2) {
            this.f752i = z2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f755l;
        boolean z2 = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? DrawableCompat.e(this) == 0 : DrawableCompat.e(this) == 1))) {
            z2 = true;
        }
        float f2 = this.f745b;
        float a2 = a(this.f746c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.f753j);
        float a3 = a(this.f746c, this.f747d, this.f753j);
        float round = (float) Math.round(a(0.0f, this.f754k, this.f753j));
        float a4 = a(0.0f, f743m, this.f753j);
        double d2 = (double) a2;
        float a5 = a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f753j);
        double d3 = (double) a4;
        boolean z3 = z2;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.f750g.rewind();
        float a6 = a(this.f748e + this.f744a.getStrokeWidth(), -this.f754k, this.f753j);
        float f3 = (-a3) / 2.0f;
        this.f750g.moveTo(f3 + round, 0.0f);
        this.f750g.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.f750g.moveTo(f3, a6);
        this.f750g.rLineTo(round2, round3);
        this.f750g.moveTo(f3, -a6);
        this.f750g.rLineTo(round2, -round3);
        this.f750g.close();
        canvas.save();
        float strokeWidth = this.f744a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.f748e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f749f) {
            canvas2.rotate(a5 * ((float) (this.f752i ^ z3 ? -1 : 1)));
        } else if (z3) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f750g, this.f744a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f751h;
    }

    public int getIntrinsicWidth() {
        return this.f751h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.f744a.getAlpha()) {
            this.f744a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f744a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
