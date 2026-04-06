package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

class AppCompatBackgroundHelper {

    /* renamed from: a  reason: collision with root package name */
    public final View f1051a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatDrawableManager f1052b;

    /* renamed from: c  reason: collision with root package name */
    public int f1053c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TintInfo f1054d;

    /* renamed from: e  reason: collision with root package name */
    public TintInfo f1055e;

    /* renamed from: f  reason: collision with root package name */
    public TintInfo f1056f;

    public AppCompatBackgroundHelper(View view) {
        this.f1051a = view;
        this.f1052b = AppCompatDrawableManager.b();
    }

    public final boolean a(Drawable drawable) {
        if (this.f1056f == null) {
            this.f1056f = new TintInfo();
        }
        TintInfo tintInfo = this.f1056f;
        tintInfo.a();
        ColorStateList m2 = ViewCompat.m(this.f1051a);
        if (m2 != null) {
            tintInfo.f1320d = true;
            tintInfo.f1317a = m2;
        }
        PorterDuff.Mode n2 = ViewCompat.n(this.f1051a);
        if (n2 != null) {
            tintInfo.f1319c = true;
            tintInfo.f1318b = n2;
        }
        if (!tintInfo.f1320d && !tintInfo.f1319c) {
            return false;
        }
        AppCompatDrawableManager.i(drawable, tintInfo, this.f1051a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f1051a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            TintInfo tintInfo = this.f1055e;
            if (tintInfo != null) {
                AppCompatDrawableManager.i(background, tintInfo, this.f1051a.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.f1054d;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.i(background, tintInfo2, this.f1051a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        TintInfo tintInfo = this.f1055e;
        if (tintInfo != null) {
            return tintInfo.f1317a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        TintInfo tintInfo = this.f1055e;
        if (tintInfo != null) {
            return tintInfo.f1318b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i2) {
        TintTypedArray u2 = TintTypedArray.u(this.f1051a.getContext(), attributeSet, R.styleable.x3, i2, 0);
        View view = this.f1051a;
        ViewCompat.S(view, view.getContext(), R.styleable.x3, attributeSet, u2.q(), i2, 0);
        try {
            if (u2.r(R.styleable.y3)) {
                this.f1053c = u2.m(R.styleable.y3, -1);
                ColorStateList f2 = this.f1052b.f(this.f1051a.getContext(), this.f1053c);
                if (f2 != null) {
                    h(f2);
                }
            }
            if (u2.r(R.styleable.z3)) {
                ViewCompat.Y(this.f1051a, u2.c(R.styleable.z3));
            }
            if (u2.r(R.styleable.A3)) {
                ViewCompat.Z(this.f1051a, DrawableUtils.e(u2.j(R.styleable.A3, -1), (PorterDuff.Mode) null));
            }
            u2.v();
        } catch (Throwable th) {
            u2.v();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f1053c = -1;
        h((ColorStateList) null);
        b();
    }

    public void g(int i2) {
        this.f1053c = i2;
        AppCompatDrawableManager appCompatDrawableManager = this.f1052b;
        h(appCompatDrawableManager != null ? appCompatDrawableManager.f(this.f1051a.getContext(), i2) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1054d == null) {
                this.f1054d = new TintInfo();
            }
            TintInfo tintInfo = this.f1054d;
            tintInfo.f1317a = colorStateList;
            tintInfo.f1320d = true;
        } else {
            this.f1054d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1055e == null) {
            this.f1055e = new TintInfo();
        }
        TintInfo tintInfo = this.f1055e;
        tintInfo.f1317a = colorStateList;
        tintInfo.f1320d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1055e == null) {
            this.f1055e = new TintInfo();
        }
        TintInfo tintInfo = this.f1055e;
        tintInfo.f1318b = mode;
        tintInfo.f1319c = true;
        b();
    }

    public final boolean k() {
        return this.f1054d != null;
    }
}
