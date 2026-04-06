package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

class AppCompatTextHelper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1142a;

    /* renamed from: b  reason: collision with root package name */
    public TintInfo f1143b;

    /* renamed from: c  reason: collision with root package name */
    public TintInfo f1144c;

    /* renamed from: d  reason: collision with root package name */
    public TintInfo f1145d;

    /* renamed from: e  reason: collision with root package name */
    public TintInfo f1146e;

    /* renamed from: f  reason: collision with root package name */
    public TintInfo f1147f;

    /* renamed from: g  reason: collision with root package name */
    public TintInfo f1148g;

    /* renamed from: h  reason: collision with root package name */
    public TintInfo f1149h;

    /* renamed from: i  reason: collision with root package name */
    public final AppCompatTextViewAutoSizeHelper f1150i;

    /* renamed from: j  reason: collision with root package name */
    public int f1151j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1152k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1153l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1154m;

    public static class Api17Impl {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    public static class Api21Impl {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class Api24Impl {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class Api26Impl {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i2, int i3, int i4, int i5) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }

        public static void c(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class Api28Impl {
        public static Typeface a(Typeface typeface, int i2, boolean z2) {
            return Typeface.create(typeface, i2, z2);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f1142a = textView;
        this.f1150i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    public static TintInfo d(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList f2 = appCompatDrawableManager.f(context, i2);
        if (f2 == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.f1320d = true;
        tintInfo.f1317a = f2;
        return tintInfo;
    }

    public void A(int i2, float f2) {
        if (!ViewUtils.f1375b && !l()) {
            B(i2, f2);
        }
    }

    public final void B(int i2, float f2) {
        this.f1150i.t(i2, f2);
    }

    public final void C(Context context, TintTypedArray tintTypedArray) {
        String n2;
        this.f1151j = tintTypedArray.j(R.styleable.J2, this.f1151j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int j2 = tintTypedArray.j(R.styleable.L2, -1);
            this.f1152k = j2;
            if (j2 != -1) {
                this.f1151j &= 2;
            }
        }
        boolean z2 = true;
        if (tintTypedArray.r(R.styleable.K2) || tintTypedArray.r(R.styleable.M2)) {
            this.f1153l = null;
            int i3 = tintTypedArray.r(R.styleable.M2) ? R.styleable.M2 : R.styleable.K2;
            final int i4 = this.f1152k;
            final int i5 = this.f1151j;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1142a);
                try {
                    Typeface i6 = tintTypedArray.i(i3, this.f1151j, new ResourcesCompat.FontCallback() {
                        public void h(int i2) {
                        }

                        public void i(Typeface typeface) {
                            int i2;
                            if (Build.VERSION.SDK_INT >= 28 && (i2 = i4) != -1) {
                                typeface = Api28Impl.a(typeface, i2, (i5 & 2) != 0);
                            }
                            AppCompatTextHelper.this.n(weakReference, typeface);
                        }
                    });
                    if (i6 != null) {
                        if (i2 < 28 || this.f1152k == -1) {
                            this.f1153l = i6;
                        } else {
                            this.f1153l = Api28Impl.a(Typeface.create(i6, 0), this.f1152k, (this.f1151j & 2) != 0);
                        }
                    }
                    this.f1154m = this.f1153l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1153l == null && (n2 = tintTypedArray.n(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1152k == -1) {
                    this.f1153l = Typeface.create(n2, this.f1151j);
                    return;
                }
                Typeface create = Typeface.create(n2, 0);
                int i7 = this.f1152k;
                if ((this.f1151j & 2) == 0) {
                    z2 = false;
                }
                this.f1153l = Api28Impl.a(create, i7, z2);
            }
        } else if (tintTypedArray.r(R.styleable.I2)) {
            this.f1154m = false;
            int j3 = tintTypedArray.j(R.styleable.I2, 1);
            if (j3 == 1) {
                this.f1153l = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                this.f1153l = Typeface.SERIF;
            } else if (j3 == 3) {
                this.f1153l = Typeface.MONOSPACE;
            }
        }
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.i(drawable, tintInfo, this.f1142a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f1143b == null && this.f1144c == null && this.f1145d == null && this.f1146e == null)) {
            Drawable[] compoundDrawables = this.f1142a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1143b);
            a(compoundDrawables[1], this.f1144c);
            a(compoundDrawables[2], this.f1145d);
            a(compoundDrawables[3], this.f1146e);
        }
        if (this.f1147f != null || this.f1148g != null) {
            Drawable[] a2 = Api17Impl.a(this.f1142a);
            a(a2[0], this.f1147f);
            a(a2[2], this.f1148g);
        }
    }

    public void c() {
        this.f1150i.a();
    }

    public int e() {
        return this.f1150i.f();
    }

    public int f() {
        return this.f1150i.g();
    }

    public int g() {
        return this.f1150i.h();
    }

    public int[] h() {
        return this.f1150i.i();
    }

    public int i() {
        return this.f1150i.j();
    }

    public ColorStateList j() {
        TintInfo tintInfo = this.f1149h;
        if (tintInfo != null) {
            return tintInfo.f1317a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        TintInfo tintInfo = this.f1149h;
        if (tintInfo != null) {
            return tintInfo.f1318b;
        }
        return null;
    }

    public boolean l() {
        return this.f1150i.n();
    }

    public void m(AttributeSet attributeSet, int i2) {
        String str;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        Context context = this.f1142a.getContext();
        AppCompatDrawableManager b2 = AppCompatDrawableManager.b();
        TintTypedArray u2 = TintTypedArray.u(context, attributeSet2, R.styleable.a0, i3, 0);
        TextView textView = this.f1142a;
        ViewCompat.S(textView, textView.getContext(), R.styleable.a0, attributeSet, u2.q(), i2, 0);
        int m2 = u2.m(R.styleable.b0, -1);
        if (u2.r(R.styleable.e0)) {
            this.f1143b = d(context, b2, u2.m(R.styleable.e0, 0));
        }
        if (u2.r(R.styleable.c0)) {
            this.f1144c = d(context, b2, u2.m(R.styleable.c0, 0));
        }
        if (u2.r(R.styleable.f0)) {
            this.f1145d = d(context, b2, u2.m(R.styleable.f0, 0));
        }
        if (u2.r(R.styleable.d0)) {
            this.f1146e = d(context, b2, u2.m(R.styleable.d0, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (u2.r(R.styleable.g0)) {
            this.f1147f = d(context, b2, u2.m(R.styleable.g0, 0));
        }
        if (u2.r(R.styleable.h0)) {
            this.f1148g = d(context, b2, u2.m(R.styleable.h0, 0));
        }
        u2.v();
        boolean z5 = this.f1142a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m2 != -1) {
            TintTypedArray s2 = TintTypedArray.s(context, m2, R.styleable.G2);
            if (z5 || !s2.r(R.styleable.O2)) {
                z3 = false;
                z2 = false;
            } else {
                z3 = s2.a(R.styleable.O2, false);
                z2 = true;
            }
            C(context, s2);
            str2 = s2.r(R.styleable.P2) ? s2.n(R.styleable.P2) : null;
            str = s2.r(R.styleable.N2) ? s2.n(R.styleable.N2) : null;
            s2.v();
        } else {
            z3 = false;
            z2 = false;
            str2 = null;
            str = null;
        }
        TintTypedArray u3 = TintTypedArray.u(context, attributeSet2, R.styleable.G2, i3, 0);
        if (z5 || !u3.r(R.styleable.O2)) {
            z4 = z2;
        } else {
            z3 = u3.a(R.styleable.O2, false);
            z4 = true;
        }
        if (u3.r(R.styleable.P2)) {
            str2 = u3.n(R.styleable.P2);
        }
        if (u3.r(R.styleable.N2)) {
            str = u3.n(R.styleable.N2);
        }
        if (i4 >= 28 && u3.r(R.styleable.H2) && u3.e(R.styleable.H2, -1) == 0) {
            this.f1142a.setTextSize(0, 0.0f);
        }
        C(context, u3);
        u3.v();
        if (!z5 && z4) {
            s(z3);
        }
        Typeface typeface = this.f1153l;
        if (typeface != null) {
            if (this.f1152k == -1) {
                this.f1142a.setTypeface(typeface, this.f1151j);
            } else {
                this.f1142a.setTypeface(typeface);
            }
        }
        if (str != null) {
            Api26Impl.d(this.f1142a, str);
        }
        if (str2 != null) {
            Api24Impl.b(this.f1142a, Api24Impl.a(str2));
        }
        this.f1150i.o(attributeSet2, i3);
        if (ViewUtils.f1375b && this.f1150i.j() != 0) {
            int[] i5 = this.f1150i.i();
            if (i5.length > 0) {
                if (((float) Api26Impl.a(this.f1142a)) != -1.0f) {
                    Api26Impl.b(this.f1142a, this.f1150i.g(), this.f1150i.f(), this.f1150i.h(), 0);
                } else {
                    Api26Impl.c(this.f1142a, i5, 0);
                }
            }
        }
        TintTypedArray t2 = TintTypedArray.t(context, attributeSet2, R.styleable.i0);
        int m3 = t2.m(R.styleable.q0, -1);
        Drawable c2 = m3 != -1 ? b2.c(context, m3) : null;
        int m4 = t2.m(R.styleable.v0, -1);
        Drawable c3 = m4 != -1 ? b2.c(context, m4) : null;
        int m5 = t2.m(R.styleable.r0, -1);
        Drawable c4 = m5 != -1 ? b2.c(context, m5) : null;
        int m6 = t2.m(R.styleable.o0, -1);
        Drawable c5 = m6 != -1 ? b2.c(context, m6) : null;
        int m7 = t2.m(R.styleable.s0, -1);
        Drawable c6 = m7 != -1 ? b2.c(context, m7) : null;
        int m8 = t2.m(R.styleable.p0, -1);
        y(c2, c3, c4, c5, c6, m8 != -1 ? b2.c(context, m8) : null);
        if (t2.r(R.styleable.t0)) {
            TextViewCompat.g(this.f1142a, t2.c(R.styleable.t0));
        }
        if (t2.r(R.styleable.u0)) {
            TextViewCompat.h(this.f1142a, DrawableUtils.e(t2.j(R.styleable.u0, -1), (PorterDuff.Mode) null));
        }
        int e2 = t2.e(R.styleable.x0, -1);
        int e3 = t2.e(R.styleable.y0, -1);
        int e4 = t2.e(R.styleable.z0, -1);
        t2.v();
        if (e2 != -1) {
            TextViewCompat.i(this.f1142a, e2);
        }
        if (e3 != -1) {
            TextViewCompat.j(this.f1142a, e3);
        }
        if (e4 != -1) {
            TextViewCompat.k(this.f1142a, e4);
        }
    }

    public void n(WeakReference weakReference, final Typeface typeface) {
        if (this.f1154m) {
            this.f1153l = typeface;
            final TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (ViewCompat.C(textView)) {
                final int i2 = this.f1151j;
                textView.post(new Runnable() {
                    public void run() {
                        textView.setTypeface(typeface, i2);
                    }
                });
                return;
            }
            textView.setTypeface(typeface, this.f1151j);
        }
    }

    public void o(boolean z2, int i2, int i3, int i4, int i5) {
        if (!ViewUtils.f1375b) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i2) {
        String n2;
        TintTypedArray s2 = TintTypedArray.s(context, i2, R.styleable.G2);
        if (s2.r(R.styleable.O2)) {
            s(s2.a(R.styleable.O2, false));
        }
        if (s2.r(R.styleable.H2) && s2.e(R.styleable.H2, -1) == 0) {
            this.f1142a.setTextSize(0, 0.0f);
        }
        C(context, s2);
        if (s2.r(R.styleable.N2) && (n2 = s2.n(R.styleable.N2)) != null) {
            Api26Impl.d(this.f1142a, n2);
        }
        s2.v();
        Typeface typeface = this.f1153l;
        if (typeface != null) {
            this.f1142a.setTypeface(typeface, this.f1151j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.e(editorInfo, textView.getText());
        }
    }

    public void s(boolean z2) {
        this.f1142a.setAllCaps(z2);
    }

    public void t(int i2, int i3, int i4, int i5) {
        this.f1150i.p(i2, i3, i4, i5);
    }

    public void u(int[] iArr, int i2) {
        this.f1150i.q(iArr, i2);
    }

    public void v(int i2) {
        this.f1150i.r(i2);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f1149h == null) {
            this.f1149h = new TintInfo();
        }
        TintInfo tintInfo = this.f1149h;
        tintInfo.f1317a = colorStateList;
        tintInfo.f1320d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f1149h == null) {
            this.f1149h = new TintInfo();
        }
        TintInfo tintInfo = this.f1149h;
        tintInfo.f1318b = mode;
        tintInfo.f1319c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a2 = Api17Impl.a(this.f1142a);
            TextView textView = this.f1142a;
            if (drawable5 == null) {
                drawable5 = a2[0];
            }
            if (drawable2 == null) {
                drawable2 = a2[1];
            }
            if (drawable6 == null) {
                drawable6 = a2[2];
            }
            if (drawable4 == null) {
                drawable4 = a2[3];
            }
            Api17Impl.b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] a3 = Api17Impl.a(this.f1142a);
            Drawable drawable7 = a3[0];
            if (drawable7 == null && a3[2] == null) {
                Drawable[] compoundDrawables = this.f1142a.getCompoundDrawables();
                TextView textView2 = this.f1142a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f1142a;
            if (drawable2 == null) {
                drawable2 = a3[1];
            }
            Drawable drawable8 = a3[2];
            if (drawable4 == null) {
                drawable4 = a3[3];
            }
            Api17Impl.b(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    public final void z() {
        TintInfo tintInfo = this.f1149h;
        this.f1143b = tintInfo;
        this.f1144c = tintInfo;
        this.f1145d = tintInfo;
        this.f1146e = tintInfo;
        this.f1147f = tintInfo;
        this.f1148g = tintInfo;
    }
}
