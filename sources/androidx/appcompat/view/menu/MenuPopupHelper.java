package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

public class MenuPopupHelper implements MenuHelper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f960a;

    /* renamed from: b  reason: collision with root package name */
    public final MenuBuilder f961b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f962c;

    /* renamed from: d  reason: collision with root package name */
    public final int f963d;

    /* renamed from: e  reason: collision with root package name */
    public final int f964e;

    /* renamed from: f  reason: collision with root package name */
    public View f965f;

    /* renamed from: g  reason: collision with root package name */
    public int f966g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f967h;

    /* renamed from: i  reason: collision with root package name */
    public MenuPresenter.Callback f968i;

    /* renamed from: j  reason: collision with root package name */
    public MenuPopup f969j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f970k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f971l;

    public static class Api17Impl {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2) {
        this(context, menuBuilder, view, z2, i2, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.MenuPopup, androidx.appcompat.view.menu.MenuPresenter] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.StandardMenuPopup] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.CascadingMenuPopup] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.appcompat.view.menu.MenuPopup a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f960a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.MenuPopupHelper.Api17Impl.a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f960a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.R.dimen.f332c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.CascadingMenuPopup r0 = new androidx.appcompat.view.menu.CascadingMenuPopup
            android.content.Context r3 = r15.f960a
            android.view.View r4 = r15.f965f
            int r5 = r15.f963d
            int r6 = r15.f964e
            boolean r7 = r15.f962c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.StandardMenuPopup r0 = new androidx.appcompat.view.menu.StandardMenuPopup
            android.content.Context r9 = r15.f960a
            androidx.appcompat.view.menu.MenuBuilder r10 = r15.f961b
            android.view.View r11 = r15.f965f
            int r12 = r15.f963d
            int r13 = r15.f964e
            boolean r14 = r15.f962c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.MenuBuilder r1 = r15.f961b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f971l
            r0.u(r1)
            android.view.View r1 = r15.f965f
            r0.p(r1)
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r15.f968i
            r0.h(r1)
            boolean r1 = r15.f967h
            r0.r(r1)
            int r1 = r15.f966g
            r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuPopupHelper.a():androidx.appcompat.view.menu.MenuPopup");
    }

    public void b() {
        if (d()) {
            this.f969j.dismiss();
        }
    }

    public MenuPopup c() {
        if (this.f969j == null) {
            this.f969j = a();
        }
        return this.f969j;
    }

    public boolean d() {
        MenuPopup menuPopup = this.f969j;
        return menuPopup != null && menuPopup.a();
    }

    public void e() {
        this.f969j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f970k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f965f = view;
    }

    public void g(boolean z2) {
        this.f967h = z2;
        MenuPopup menuPopup = this.f969j;
        if (menuPopup != null) {
            menuPopup.r(z2);
        }
    }

    public void h(int i2) {
        this.f966g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f970k = onDismissListener;
    }

    public void j(MenuPresenter.Callback callback) {
        this.f968i = callback;
        MenuPopup menuPopup = this.f969j;
        if (menuPopup != null) {
            menuPopup.h(callback);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i2, int i3, boolean z2, boolean z3) {
        MenuPopup c2 = c();
        c2.v(z3);
        if (z2) {
            if ((GravityCompat.b(this.f966g, ViewCompat.s(this.f965f)) & 7) == 5) {
                i2 -= this.f965f.getWidth();
            }
            c2.t(i2);
            c2.w(i3);
            int i4 = (int) ((this.f960a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c2.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c2.b();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f965f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f965f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z2, int i2, int i3) {
        this.f966g = 8388611;
        this.f971l = new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                MenuPopupHelper.this.e();
            }
        };
        this.f960a = context;
        this.f961b = menuBuilder;
        this.f965f = view;
        this.f962c = z2;
        this.f963d = i2;
        this.f964e = i3;
    }
}
