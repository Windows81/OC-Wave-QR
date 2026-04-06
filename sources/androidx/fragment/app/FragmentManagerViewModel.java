package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class FragmentManagerViewModel extends ViewModel {

    /* renamed from: i  reason: collision with root package name */
    public static final ViewModelProvider.Factory f21665i = new ViewModelProvider.Factory() {
        public ViewModel b(Class cls) {
            return new FragmentManagerViewModel(true);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21666b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f21667c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f21668d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21669e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21670f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21671g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21672h = false;

    public FragmentManagerViewModel(boolean z2) {
        this.f21669e = z2;
    }

    public static FragmentManagerViewModel m(ViewModelStore viewModelStore) {
        return (FragmentManagerViewModel) new ViewModelProvider(viewModelStore, f21665i).a(FragmentManagerViewModel.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        return this.f21666b.equals(fragmentManagerViewModel.f21666b) && this.f21667c.equals(fragmentManagerViewModel.f21667c) && this.f21668d.equals(fragmentManagerViewModel.f21668d);
    }

    public void f() {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f21670f = true;
    }

    public void g(Fragment fragment) {
        if (this.f21672h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f21666b.containsKey(fragment.E)) {
            this.f21666b.put(fragment.E, fragment);
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void h(Fragment fragment) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        j(fragment.E);
    }

    public int hashCode() {
        return (((this.f21666b.hashCode() * 31) + this.f21667c.hashCode()) * 31) + this.f21668d.hashCode();
    }

    public void i(String str) {
        if (FragmentManager.N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        j(str);
    }

    public final void j(String str) {
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) this.f21667c.get(str);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.f();
            this.f21667c.remove(str);
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.f21668d.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            this.f21668d.remove(str);
        }
    }

    public Fragment k(String str) {
        return (Fragment) this.f21666b.get(str);
    }

    public FragmentManagerViewModel l(Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) this.f21667c.get(fragment.E);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        FragmentManagerViewModel fragmentManagerViewModel2 = new FragmentManagerViewModel(this.f21669e);
        this.f21667c.put(fragment.E, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    public Collection n() {
        return new ArrayList(this.f21666b.values());
    }

    public ViewModelStore o(Fragment fragment) {
        ViewModelStore viewModelStore = (ViewModelStore) this.f21668d.get(fragment.E);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f21668d.put(fragment.E, viewModelStore2);
        return viewModelStore2;
    }

    public boolean p() {
        return this.f21670f;
    }

    public void q(Fragment fragment) {
        if (this.f21672h) {
            if (FragmentManager.N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f21666b.remove(fragment.E) != null && FragmentManager.N0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void r(boolean z2) {
        this.f21672h = z2;
    }

    public boolean s(Fragment fragment) {
        if (!this.f21666b.containsKey(fragment.E)) {
            return true;
        }
        return this.f21669e ? this.f21670f : !this.f21671g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f21666b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f21667c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f21668d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
