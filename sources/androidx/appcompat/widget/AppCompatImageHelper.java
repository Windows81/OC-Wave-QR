package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

public class AppCompatImageHelper {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1098a;

    /* renamed from: b  reason: collision with root package name */
    public TintInfo f1099b;

    /* renamed from: c  reason: collision with root package name */
    public TintInfo f1100c;

    /* renamed from: d  reason: collision with root package name */
    public TintInfo f1101d;

    /* renamed from: e  reason: collision with root package name */
    public int f1102e = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f1098a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f1101d == null) {
            this.f1101d = new TintInfo();
        }
        TintInfo tintInfo = this.f1101d;
        tintInfo.a();
        ColorStateList a2 = ImageViewCompat.a(this.f1098a);
        if (a2 != null) {
            tintInfo.f1320d = true;
            tintInfo.f1317a = a2;
        }
        PorterDuff.Mode b2 = ImageViewCompat.b(this.f1098a);
        if (b2 != null) {
            tintInfo.f1319c = true;
            tintInfo.f1318b = b2;
        }
        if (!tintInfo.f1320d && !tintInfo.f1319c) {
            return false;
        }
        AppCompatDrawableManager.i(drawable, tintInfo, this.f1098a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f1098a.getDrawable() != null) {
            this.f1098a.getDrawable().setLevel(this.f1102e);
        }
    }

    public void c() {
        Drawable drawable = this.f1098a.getDrawable();
        if (drawable != null) {
            DrawableUtils.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            TintInfo tintInfo = this.f1100c;
            if (tintInfo != null) {
                AppCompatDrawableManager.i(drawable, tintInfo, this.f1098a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f1099b;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.i(drawable, tintInfo2, this.f1098a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        TintInfo tintInfo = this.f1100c;
        if (tintInfo != null) {
            return tintInfo.f1317a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        TintInfo tintInfo = this.f1100c;
        if (tintInfo != null) {
            return tintInfo.f1318b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f1098a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i2) {
        int m2;
        TintTypedArray u2 = TintTypedArray.u(this.f1098a.getContext(), attributeSet, R.styleable.R, i2, 0);
        ImageView imageView = this.f1098a;
        ViewCompat.S(imageView, imageView.getContext(), R.styleable.R, attributeSet, u2.q(), i2, 0);
        try {
            Drawable drawable = this.f1098a.getDrawable();
            if (!(drawable != null || (m2 = u2.m(R.styleable.S, -1)) == -1 || (drawable = AppCompatResources.b(this.f1098a.getContext(), m2)) == null)) {
                this.f1098a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.b(drawable);
            }
            if (u2.r(R.styleable.T)) {
                ImageViewCompat.c(this.f1098a, u2.c(R.styleable.T));
            }
            if (u2.r(R.styleable.U)) {
                ImageViewCompat.d(this.f1098a, DrawableUtils.e(u2.j(R.styleable.U, -1), (PorterDuff.Mode) null));
            }
            u2.v();
        } catch (Throwable th) {
            u2.v();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.f1102e = drawable.getLevel();
    }

    public void i(int i2) {
        if (i2 != 0) {
            Drawable b2 = AppCompatResources.b(this.f1098a.getContext(), i2);
            if (b2 != null) {
                DrawableUtils.b(b2);
            }
            this.f1098a.setImageDrawable(b2);
        } else {
            this.f1098a.setImageDrawable((Drawable) null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f1100c == null) {
            this.f1100c = new TintInfo();
        }
        TintInfo tintInfo = this.f1100c;
        tintInfo.f1317a = colorStateList;
        tintInfo.f1320d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f1100c == null) {
            this.f1100c = new TintInfo();
        }
        TintInfo tintInfo = this.f1100c;
        tintInfo.f1318b = mode;
        tintInfo.f1319c = true;
        c();
    }

    public final boolean l() {
        return this.f1099b != null;
    }
}
