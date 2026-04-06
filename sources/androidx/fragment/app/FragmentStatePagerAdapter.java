package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

@Deprecated
public abstract class FragmentStatePagerAdapter extends PagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public final FragmentManager f21689c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21690d;

    /* renamed from: e  reason: collision with root package name */
    public FragmentTransaction f21691e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f21692f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f21693g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f21694h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21695i;

    public void b(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f21691e == null) {
            this.f21691e = this.f21689c.p();
        }
        while (this.f21692f.size() <= i2) {
            this.f21692f.add((Object) null);
        }
        this.f21692f.set(i2, fragment.h0() ? this.f21689c.u1(fragment) : null);
        this.f21693g.set(i2, (Object) null);
        this.f21691e.p(fragment);
        if (fragment.equals(this.f21694h)) {
            this.f21694h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void d(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f21691e;
        if (fragmentTransaction != null) {
            if (!this.f21695i) {
                try {
                    this.f21695i = true;
                    fragmentTransaction.k();
                    this.f21695i = false;
                } catch (Throwable th) {
                    this.f21695i = false;
                    throw th;
                }
            }
            this.f21691e = null;
        }
    }

    public Object j(ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f21693g.size() > i2 && (fragment = (Fragment) this.f21693g.get(i2)) != null) {
            return fragment;
        }
        if (this.f21691e == null) {
            this.f21691e = this.f21689c.p();
        }
        Fragment u2 = u(i2);
        if (this.f21692f.size() > i2 && (savedState = (Fragment.SavedState) this.f21692f.get(i2)) != null) {
            u2.K1(savedState);
        }
        while (this.f21693g.size() <= i2) {
            this.f21693g.add((Object) null);
        }
        u2.L1(false);
        if (this.f21690d == 0) {
            u2.R1(false);
        }
        this.f21693g.set(i2, u2);
        this.f21691e.b(viewGroup.getId(), u2);
        if (this.f21690d == 1) {
            this.f21691e.q(u2, Lifecycle.State.STARTED);
        }
        return u2;
    }

    public boolean k(View view, Object obj) {
        return ((Fragment) obj).c0() == view;
    }

    public void m(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f21692f.clear();
            this.f21693g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f21692f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment v0 = this.f21689c.v0(bundle, str);
                    if (v0 != null) {
                        while (this.f21693g.size() <= parseInt) {
                            this.f21693g.add((Object) null);
                        }
                        v0.L1(false);
                        this.f21693g.set(parseInt, v0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    public Parcelable n() {
        Bundle bundle;
        if (this.f21692f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f21692f.size()];
            this.f21692f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.f21693g.size(); i2++) {
            Fragment fragment = (Fragment) this.f21693g.get(i2);
            if (fragment != null && fragment.h0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f21689c.j1(bundle, "f" + i2, fragment);
            }
        }
        return bundle;
    }

    public void p(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f21694h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.L1(false);
                if (this.f21690d == 1) {
                    if (this.f21691e == null) {
                        this.f21691e = this.f21689c.p();
                    }
                    this.f21691e.q(this.f21694h, Lifecycle.State.STARTED);
                } else {
                    this.f21694h.R1(false);
                }
            }
            fragment.L1(true);
            if (this.f21690d == 1) {
                if (this.f21691e == null) {
                    this.f21691e = this.f21689c.p();
                }
                this.f21691e.q(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.R1(true);
            }
            this.f21694h = fragment;
        }
    }

    public void s(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract Fragment u(int i2);
}
