package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class FragmentStore {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f21696a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21697b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f21698c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public FragmentManagerViewModel f21699d;

    public void A(FragmentManagerViewModel fragmentManagerViewModel) {
        this.f21699d = fragmentManagerViewModel;
    }

    public FragmentState B(String str, FragmentState fragmentState) {
        return fragmentState != null ? (FragmentState) this.f21698c.put(str, fragmentState) : (FragmentState) this.f21698c.remove(str);
    }

    public void a(Fragment fragment) {
        if (!this.f21696a.contains(fragment)) {
            synchronized (this.f21696a) {
                this.f21696a.add(fragment);
            }
            fragment.K = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.f21697b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean c(String str) {
        return this.f21697b.get(str) != null;
    }

    public void d(int i2) {
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.u(i2);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f21697b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    Fragment k2 = fragmentStateManager.k();
                    printWriter.println(k2);
                    k2.h(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f21696a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f21696a.get(i2)).toString());
            }
        }
    }

    public Fragment f(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.f21697b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.k();
        }
        return null;
    }

    public Fragment g(int i2) {
        for (int size = this.f21696a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f21696a.get(size);
            if (fragment != null && fragment.W == i2) {
                return fragment;
            }
        }
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                Fragment k2 = fragmentStateManager.k();
                if (k2.W == i2) {
                    return k2;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f21696a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f21696a.get(size);
                if (fragment != null && str.equals(fragment.Y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                Fragment k2 = fragmentStateManager.k();
                if (str.equals(k2.Y)) {
                    return k2;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment j2;
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null && (j2 = fragmentStateManager.k().j(str)) != null) {
                return j2;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.g0;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f21696a.indexOf(fragment);
        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = (Fragment) this.f21696a.get(i2);
            if (fragment2.g0 == viewGroup && (view2 = fragment2.h0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f21696a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f21696a.get(indexOf);
            if (fragment3.g0 == viewGroup && (view = fragment3.h0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        return new ArrayList(this.f21698c.values());
    }

    public FragmentStateManager n(String str) {
        return (FragmentStateManager) this.f21697b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f21696a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f21696a) {
            arrayList = new ArrayList(this.f21696a);
        }
        return arrayList;
    }

    public FragmentManagerViewModel p() {
        return this.f21699d;
    }

    public FragmentState q(String str) {
        return (FragmentState) this.f21698c.get(str);
    }

    public void r(FragmentStateManager fragmentStateManager) {
        Fragment k2 = fragmentStateManager.k();
        if (!c(k2.E)) {
            this.f21697b.put(k2.E, fragmentStateManager);
            if (k2.c0) {
                if (k2.b0) {
                    this.f21699d.g(k2);
                } else {
                    this.f21699d.q(k2);
                }
                k2.c0 = false;
            }
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k2);
            }
        }
    }

    public void s(FragmentStateManager fragmentStateManager) {
        Fragment k2 = fragmentStateManager.k();
        if (k2.b0) {
            this.f21699d.q(k2);
        }
        if (((FragmentStateManager) this.f21697b.put(k2.E, (Object) null)) != null && FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k2);
        }
    }

    public void t() {
        Iterator it = this.f21696a.iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) this.f21697b.get(((Fragment) it.next()).E);
            if (fragmentStateManager != null) {
                fragmentStateManager.m();
            }
        }
        for (FragmentStateManager fragmentStateManager2 : this.f21697b.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.m();
                Fragment k2 = fragmentStateManager2.k();
                if (k2.L && !k2.k0()) {
                    if (k2.M && !this.f21698c.containsKey(k2.E)) {
                        fragmentStateManager2.s();
                    }
                    s(fragmentStateManager2);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f21696a) {
            this.f21696a.remove(fragment);
        }
        fragment.K = false;
    }

    public void v() {
        this.f21697b.clear();
    }

    public void w(List list) {
        this.f21696a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment f2 = f(str);
                if (f2 != null) {
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f2);
                    }
                    a(f2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    public void x(ArrayList arrayList) {
        this.f21698c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            this.f21698c.put(fragmentState.f21678A, fragmentState);
        }
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f21697b.size());
        for (FragmentStateManager fragmentStateManager : this.f21697b.values()) {
            if (fragmentStateManager != null) {
                Fragment k2 = fragmentStateManager.k();
                fragmentStateManager.s();
                arrayList.add(k2.E);
                if (FragmentManager.N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k2 + ": " + k2.f21546A);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f21696a) {
            try {
                if (this.f21696a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f21696a.size());
                Iterator it = this.f21696a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.E);
                    if (FragmentManager.N0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.E + "): " + fragment);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
