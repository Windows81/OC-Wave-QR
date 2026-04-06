package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22264c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final ViewModelProvider.Factory f22265d = new NavControllerViewModel$Companion$FACTORY$1();

    /* renamed from: b  reason: collision with root package name */
    public final Map f22266b = new LinkedHashMap();

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NavControllerViewModel a(ViewModelStore viewModelStore) {
            Intrinsics.i(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) new ViewModelProvider(viewModelStore, NavControllerViewModel.f22265d, (CreationExtras) null, 4, (DefaultConstructorMarker) null).a(NavControllerViewModel.class);
        }

        public Companion() {
        }
    }

    public ViewModelStore a(String str) {
        Intrinsics.i(str, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) this.f22266b.get(str);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f22266b.put(str, viewModelStore2);
        return viewModelStore2;
    }

    public void f() {
        for (ViewModelStore a2 : this.f22266b.values()) {
            a2.a();
        }
        this.f22266b.clear();
    }

    public final void h(String str) {
        Intrinsics.i(str, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) this.f22266b.remove(str);
        if (viewModelStore != null) {
            viewModelStore.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f22266b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }
}
