package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;

@Deprecated
public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public final FragmentManager f21673c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21674d;

    /* renamed from: e  reason: collision with root package name */
    public FragmentTransaction f21675e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f21676f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21677g;

    public static String w(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    public void b(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f21675e == null) {
            this.f21675e = this.f21673c.p();
        }
        this.f21675e.l(fragment);
        if (fragment.equals(this.f21676f)) {
            this.f21676f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f21675e;
        if (fragmentTransaction != null) {
            if (!this.f21677g) {
                try {
                    this.f21677g = true;
                    fragmentTransaction.k();
                    this.f21677g = false;
                } catch (Throwable th) {
                    this.f21677g = false;
                    throw th;
                }
            }
            this.f21675e = null;
        }
    }

    public Object j(ViewGroup viewGroup, int i2) {
        if (this.f21675e == null) {
            this.f21675e = this.f21673c.p();
        }
        long v2 = v(i2);
        Fragment l0 = this.f21673c.l0(w(viewGroup.getId(), v2));
        if (l0 != null) {
            this.f21675e.g(l0);
        } else {
            l0 = u(i2);
            this.f21675e.c(viewGroup.getId(), l0, w(viewGroup.getId(), v2));
        }
        if (l0 != this.f21676f) {
            l0.L1(false);
            if (this.f21674d == 1) {
                this.f21675e.q(l0, Lifecycle.State.STARTED);
            } else {
                l0.R1(false);
            }
        }
        return l0;
    }

    public boolean k(View view, Object obj) {
        return ((Fragment) obj).c0() == view;
    }

    public void m(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable n() {
        return null;
    }

    public void p(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f21676f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.L1(false);
                if (this.f21674d == 1) {
                    if (this.f21675e == null) {
                        this.f21675e = this.f21673c.p();
                    }
                    this.f21675e.q(this.f21676f, Lifecycle.State.STARTED);
                } else {
                    this.f21676f.R1(false);
                }
            }
            fragment.L1(true);
            if (this.f21674d == 1) {
                if (this.f21675e == null) {
                    this.f21675e = this.f21673c.p();
                }
                this.f21675e.q(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.R1(true);
            }
            this.f21676f = fragment;
        }
    }

    public void s(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment u(int i2);

    public long v(int i2) {
        return (long) i2;
    }
}
