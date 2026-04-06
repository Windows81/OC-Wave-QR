package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList f21604a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f21605b;

    public static final class FragmentLifecycleCallbacksHolder {

        /* renamed from: a  reason: collision with root package name */
        public final FragmentManager.FragmentLifecycleCallbacks f21606a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21607b;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z2) {
            this.f21606a = fragmentLifecycleCallbacks;
            this.f21607b = z2;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.f21605b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().a(fragment, bundle, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.a(this.f21605b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z2) {
        Context l2 = this.f21605b.A0().l();
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().b(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.b(this.f21605b, fragment, l2);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().c(fragment, bundle, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.c(this.f21605b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().d(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.d(this.f21605b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().e(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.e(this.f21605b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().f(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.f(this.f21605b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z2) {
        Context l2 = this.f21605b.A0().l();
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().g(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.g(this.f21605b, fragment, l2);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().h(fragment, bundle, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.h(this.f21605b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().i(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.i(this.f21605b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().j(fragment, bundle, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.j(this.f21605b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().k(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.k(this.f21605b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().l(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.l(this.f21605b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.m(this.f21605b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z2) {
        Fragment D0 = this.f21605b.D0();
        if (D0 != null) {
            D0.J().C0().n(fragment, true);
        }
        Iterator it = this.f21604a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2 || fragmentLifecycleCallbacksHolder.f21607b) {
                fragmentLifecycleCallbacksHolder.f21606a.n(this.f21605b, fragment);
            }
        }
    }

    public void o(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z2) {
        this.f21604a.add(new FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z2));
    }

    public void p(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.f21604a) {
            try {
                int size = this.f21604a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (((FragmentLifecycleCallbacksHolder) this.f21604a.get(i2)).f21606a == fragmentLifecycleCallbacks) {
                        this.f21604a.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
