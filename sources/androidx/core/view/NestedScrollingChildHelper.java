package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

public class NestedScrollingChildHelper {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f20237a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f20238b;

    /* renamed from: c  reason: collision with root package name */
    public final View f20239c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20240d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f20241e;

    public NestedScrollingChildHelper(View view) {
        this.f20239c = view;
    }

    public boolean a(float f2, float f3, boolean z2) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return ViewParentCompat.a(g2, this.f20239c, f2, f3, z2);
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return ViewParentCompat.b(g2, this.f20239c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        if (!j() || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.f20239c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = h();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            ViewParentCompat.c(g2, this.f20239c, i2, i3, iArr, i4);
            if (iArr2 != null) {
                this.f20239c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!j() || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f20239c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] h2 = h();
            h2[0] = 0;
            h2[1] = 0;
            iArr3 = h2;
        } else {
            iArr3 = iArr2;
        }
        ViewParentCompat.d(g2, this.f20239c, i2, i3, i4, i5, i6, iArr3);
        if (iArr4 != null) {
            this.f20239c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i2) {
        if (i2 == 0) {
            return this.f20237a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f20238b;
    }

    public final int[] h() {
        if (this.f20241e == null) {
            this.f20241e = new int[2];
        }
        return this.f20241e;
    }

    public boolean i(int i2) {
        return g(i2) != null;
    }

    public boolean j() {
        return this.f20240d;
    }

    public void k(boolean z2) {
        if (this.f20240d) {
            ViewCompat.k0(this.f20239c);
        }
        this.f20240d = z2;
    }

    public final void l(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f20237a = viewParent;
        } else if (i2 == 1) {
            this.f20238b = viewParent;
        }
    }

    public boolean m(int i2, int i3) {
        if (i(i3)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f20239c;
        for (ViewParent parent = this.f20239c.getParent(); parent != null; parent = parent.getParent()) {
            if (ViewParentCompat.f(parent, view, this.f20239c, i2, i3)) {
                l(i3, parent);
                ViewParentCompat.e(parent, view, this.f20239c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            ViewParentCompat.g(g2, this.f20239c, i2);
            l(i2, (ViewParent) null);
        }
    }
}
