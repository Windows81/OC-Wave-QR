package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

class AppCompatCompoundButtonHelper {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1072a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1073b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1074c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1075d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1076e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1077f;

    public AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f1072a = compoundButton;
    }

    public void a() {
        Drawable a2 = CompoundButtonCompat.a(this.f1072a);
        if (a2 == null) {
            return;
        }
        if (this.f1075d || this.f1076e) {
            Drawable mutate = DrawableCompat.q(a2).mutate();
            if (this.f1075d) {
                DrawableCompat.n(mutate, this.f1073b);
            }
            if (this.f1076e) {
                DrawableCompat.o(mutate, this.f1074c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1072a.getDrawableState());
            }
            this.f1072a.setButtonDrawable(mutate);
        }
    }

    public int b(int i2) {
        return i2;
    }

    public ColorStateList c() {
        return this.f1073b;
    }

    public PorterDuff.Mode d() {
        return this.f1074c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1072a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.W0
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.u(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1072a
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.R.styleable.W0
            android.content.res.TypedArray r7 = r0.q()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.S(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.R.styleable.Y0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.r(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            int r11 = androidx.appcompat.R.styleable.Y0     // Catch:{ all -> 0x003d }
            int r11 = r0.m(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            android.widget.CompoundButton r12 = r10.f1072a     // Catch:{ NotFoundException -> 0x003f }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x003f }
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.b(r1, r11)     // Catch:{ NotFoundException -> 0x003f }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003d:
            r11 = move-exception
            goto L_0x008c
        L_0x003f:
            int r11 = androidx.appcompat.R.styleable.X0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.r(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            int r11 = androidx.appcompat.R.styleable.X0     // Catch:{ all -> 0x003d }
            int r11 = r0.m(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            android.widget.CompoundButton r12 = r10.f1072a     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.b(r1, r11)     // Catch:{ all -> 0x003d }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x003d }
        L_0x005c:
            int r11 = androidx.appcompat.R.styleable.Z0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.r(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x006f
            android.widget.CompoundButton r11 = r10.f1072a     // Catch:{ all -> 0x003d }
            int r12 = androidx.appcompat.R.styleable.Z0     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch:{ all -> 0x003d }
            androidx.core.widget.CompoundButtonCompat.b(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x006f:
            int r11 = androidx.appcompat.R.styleable.a1     // Catch:{ all -> 0x003d }
            boolean r11 = r0.r(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x0088
            android.widget.CompoundButton r11 = r10.f1072a     // Catch:{ all -> 0x003d }
            int r12 = androidx.appcompat.R.styleable.a1     // Catch:{ all -> 0x003d }
            r1 = -1
            int r12 = r0.j(r12, r1)     // Catch:{ all -> 0x003d }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.DrawableUtils.e(r12, r1)     // Catch:{ all -> 0x003d }
            androidx.core.widget.CompoundButtonCompat.c(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x0088:
            r0.v()
            return
        L_0x008c:
            r0.v()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f1077f) {
            this.f1077f = false;
            return;
        }
        this.f1077f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.f1073b = colorStateList;
        this.f1075d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f1074c = mode;
        this.f1076e = true;
        a();
    }
}
