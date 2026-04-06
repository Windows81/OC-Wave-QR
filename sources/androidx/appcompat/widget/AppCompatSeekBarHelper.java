package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1119d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1120e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1121f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1122g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1123h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1124i = false;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f1119d = seekBar;
    }

    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        TintTypedArray u2 = TintTypedArray.u(this.f1119d.getContext(), attributeSet, R.styleable.V, i2, 0);
        SeekBar seekBar = this.f1119d;
        ViewCompat.S(seekBar, seekBar.getContext(), R.styleable.V, attributeSet, u2.q(), i2, 0);
        Drawable g2 = u2.g(R.styleable.W);
        if (g2 != null) {
            this.f1119d.setThumb(g2);
        }
        j(u2.f(R.styleable.X));
        if (u2.r(R.styleable.Z)) {
            this.f1122g = DrawableUtils.e(u2.j(R.styleable.Z, -1), this.f1122g);
            this.f1124i = true;
        }
        if (u2.r(R.styleable.Y)) {
            this.f1121f = u2.c(R.styleable.Y);
            this.f1123h = true;
        }
        u2.v();
        f();
    }

    public final void f() {
        Drawable drawable = this.f1120e;
        if (drawable == null) {
            return;
        }
        if (this.f1123h || this.f1124i) {
            Drawable q2 = DrawableCompat.q(drawable.mutate());
            this.f1120e = q2;
            if (this.f1123h) {
                DrawableCompat.n(q2, this.f1121f);
            }
            if (this.f1124i) {
                DrawableCompat.o(this.f1120e, this.f1122g);
            }
            if (this.f1120e.isStateful()) {
                this.f1120e.setState(this.f1119d.getDrawableState());
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f1120e != null) {
            int max = this.f1119d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1120e.getIntrinsicWidth();
                int intrinsicHeight = this.f1120e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1120e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f1119d.getWidth() - this.f1119d.getPaddingLeft()) - this.f1119d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1119d.getPaddingLeft(), (float) (this.f1119d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1120e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f1120e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1119d.getDrawableState())) {
            this.f1119d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f1120e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f1120e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1120e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1119d);
            DrawableCompat.l(drawable, ViewCompat.s(this.f1119d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1119d.getDrawableState());
            }
            f();
        }
        this.f1119d.invalidate();
    }
}
