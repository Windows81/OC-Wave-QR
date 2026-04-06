package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class RoundedBitmapDrawable extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f19837a;

    /* renamed from: b  reason: collision with root package name */
    public int f19838b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f19839c;

    /* renamed from: d  reason: collision with root package name */
    public final BitmapShader f19840d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f19841e;

    /* renamed from: f  reason: collision with root package name */
    public float f19842f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f19843g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f19844h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f19845i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19846j;

    /* renamed from: k  reason: collision with root package name */
    public int f19847k;

    /* renamed from: l  reason: collision with root package name */
    public int f19848l;

    public static boolean c(float f2) {
        return f2 > 0.05f;
    }

    public float a() {
        return this.f19842f;
    }

    public void b(int i2, int i3, int i4, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        this.f19842f = (float) (Math.min(this.f19848l, this.f19847k) / 2);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f19837a;
        if (bitmap != null) {
            e();
            if (this.f19839c.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f19843g, this.f19839c);
                return;
            }
            RectF rectF = this.f19844h;
            float f2 = this.f19842f;
            canvas.drawRoundRect(rectF, f2, f2, this.f19839c);
        }
    }

    public void e() {
        if (this.f19845i) {
            if (this.f19846j) {
                int min = Math.min(this.f19847k, this.f19848l);
                b(this.f19838b, min, min, getBounds(), this.f19843g);
                int min2 = Math.min(this.f19843g.width(), this.f19843g.height());
                this.f19843g.inset(Math.max(0, (this.f19843g.width() - min2) / 2), Math.max(0, (this.f19843g.height() - min2) / 2));
                this.f19842f = ((float) min2) * 0.5f;
            } else {
                b(this.f19838b, this.f19847k, this.f19848l, getBounds(), this.f19843g);
            }
            this.f19844h.set(this.f19843g);
            if (this.f19840d != null) {
                Matrix matrix = this.f19841e;
                RectF rectF = this.f19844h;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f19841e.preScale(this.f19844h.width() / ((float) this.f19837a.getWidth()), this.f19844h.height() / ((float) this.f19837a.getHeight()));
                this.f19840d.setLocalMatrix(this.f19841e);
                this.f19839c.setShader(this.f19840d);
            }
            this.f19845i = false;
        }
    }

    public int getAlpha() {
        return this.f19839c.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f19839c.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f19848l;
    }

    public int getIntrinsicWidth() {
        return this.f19847k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r3.f19837a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r3 = this;
            int r0 = r3.f19838b
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L_0x002a
            boolean r0 = r3.f19846j
            if (r0 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            android.graphics.Bitmap r0 = r3.f19837a
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L_0x002a
            android.graphics.Paint r0 = r3.f19839c
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 < r1) goto L_0x002a
            float r0 = r3.f19842f
            boolean r0 = c(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.RoundedBitmapDrawable.getOpacity():int");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f19846j) {
            d();
        }
        this.f19845i = true;
    }

    public void setAlpha(int i2) {
        if (i2 != this.f19839c.getAlpha()) {
            this.f19839c.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19839c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z2) {
        this.f19839c.setDither(z2);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z2) {
        this.f19839c.setFilterBitmap(z2);
        invalidateSelf();
    }
}
