package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion N = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public NavDestination f22196A;

    /* renamed from: B  reason: collision with root package name */
    public final Bundle f22197B;
    public Lifecycle.State C;
    public final NavViewModelStoreProvider D;
    public final String E;
    public final Bundle F;
    public LifecycleRegistry G;
    public final SavedStateRegistryController H;
    public boolean I;
    public final Lazy J;
    public final Lazy K;
    public Lifecycle.State L;
    public final ViewModelProvider.Factory M;

    /* renamed from: z  reason: collision with root package name */
    public final Context f22198z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry b(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i2, Object obj) {
            String str2;
            Bundle bundle3 = (i2 & 4) != 0 ? null : bundle;
            Lifecycle.State state2 = (i2 & 8) != 0 ? Lifecycle.State.CREATED : state;
            NavViewModelStoreProvider navViewModelStoreProvider2 = (i2 & 16) != 0 ? null : navViewModelStoreProvider;
            if ((i2 & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.h(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            return companion.a(context, navDestination, bundle3, state2, navViewModelStoreProvider2, str2, (i2 & 64) != 0 ? null : bundle2);
        }

        public final NavBackStackEntry a(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
            Intrinsics.i(navDestination, "destination");
            Intrinsics.i(state, "hostLifecycleState");
            String str2 = str;
            Intrinsics.i(str2, "id");
            return new NavBackStackEntry(context, navDestination, bundle, state, navViewModelStoreProvider, str2, bundle2, (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(SavedStateRegistryOwner savedStateRegistryOwner) {
            super(savedStateRegistryOwner, (Bundle) null);
            Intrinsics.i(savedStateRegistryOwner, "owner");
        }

        public ViewModel f(String str, Class cls, SavedStateHandle savedStateHandle) {
            Intrinsics.i(str, "key");
            Intrinsics.i(cls, "modelClass");
            Intrinsics.i(savedStateHandle, "handle");
            return new SavedStateViewModel(savedStateHandle);
        }
    }

    @Metadata
    public static final class SavedStateViewModel extends ViewModel {

        /* renamed from: b  reason: collision with root package name */
        public final SavedStateHandle f22199b;

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            Intrinsics.i(savedStateHandle, "handle");
            this.f22199b = savedStateHandle;
        }

        public final SavedStateHandle g() {
            return this.f22199b;
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    public Lifecycle a() {
        return this.G;
    }

    public final Bundle e() {
        if (this.f22197B == null) {
            return null;
        }
        return new Bundle(this.f22197B);
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!Intrinsics.d(this.E, navBackStackEntry.E) || !Intrinsics.d(this.f22196A, navBackStackEntry.f22196A) || !Intrinsics.d(a(), navBackStackEntry.a()) || !Intrinsics.d(v(), navBackStackEntry.v())) {
            return false;
        }
        if (!Intrinsics.d(this.f22197B, navBackStackEntry.f22197B)) {
            Bundle bundle = this.f22197B;
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Iterable<String> iterable = keySet;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    Object obj2 = this.f22197B.get(str);
                    Bundle bundle2 = navBackStackEntry.f22197B;
                    if (!Intrinsics.d(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final SavedStateViewModelFactory f() {
        return (SavedStateViewModelFactory) this.J.getValue();
    }

    public final NavDestination g() {
        return this.f22196A;
    }

    public final String h() {
        return this.E;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.E.hashCode() * 31) + this.f22196A.hashCode();
        Bundle bundle = this.f22197B;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = this.f22197B.get(str);
                hashCode = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + a().hashCode()) * 31) + v().hashCode();
    }

    public final Lifecycle.State i() {
        return this.L;
    }

    public final void j(Lifecycle.Event event) {
        Intrinsics.i(event, "event");
        this.C = event.f();
        p();
    }

    public final void k(Bundle bundle) {
        Intrinsics.i(bundle, "outBundle");
        this.H.e(bundle);
    }

    public final void l(NavDestination navDestination) {
        Intrinsics.i(navDestination, "<set-?>");
        this.f22196A = navDestination;
    }

    public ViewModelProvider.Factory m() {
        return this.M;
    }

    public CreationExtras n() {
        Application application = null;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras((CreationExtras) null, 1, (DefaultConstructorMarker) null);
        Context context = this.f22198z;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            mutableCreationExtras.c(ViewModelProvider.AndroidViewModelFactory.f21999h, application);
        }
        mutableCreationExtras.c(SavedStateHandleSupport.f21969a, this);
        mutableCreationExtras.c(SavedStateHandleSupport.f21970b, this);
        Bundle e2 = e();
        if (e2 != null) {
            mutableCreationExtras.c(SavedStateHandleSupport.f21971c, e2);
        }
        return mutableCreationExtras;
    }

    public final void o(Lifecycle.State state) {
        Intrinsics.i(state, "maxState");
        this.L = state;
        p();
    }

    public final void p() {
        if (!this.I) {
            this.H.c();
            this.I = true;
            if (this.D != null) {
                SavedStateHandleSupport.c(this);
            }
            this.H.d(this.F);
        }
        if (this.C.ordinal() < this.L.ordinal()) {
            this.G.n(this.C);
        } else {
            this.G.n(this.L);
        }
    }

    public ViewModelStore s() {
        if (!this.I) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        } else if (a().b() != Lifecycle.State.DESTROYED) {
            NavViewModelStoreProvider navViewModelStoreProvider = this.D;
            if (navViewModelStoreProvider != null) {
                return navViewModelStoreProvider.a(this.E);
            }
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        } else {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NavBackStackEntry.class.getSimpleName());
        sb.append('(' + this.E + ')');
        sb.append(" destination=");
        sb.append(this.f22196A);
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }

    public SavedStateRegistry v() {
        return this.H.b();
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.f22198z = context;
        this.f22196A = navDestination;
        this.f22197B = bundle;
        this.C = state;
        this.D = navViewModelStoreProvider;
        this.E = str;
        this.F = bundle2;
        this.G = new LifecycleRegistry(this);
        this.H = SavedStateRegistryController.f22826c.b(this);
        this.J = LazyKt.b(new NavBackStackEntry$defaultFactory$2(this));
        this.K = LazyKt.b(new NavBackStackEntry$savedStateHandle$2(this));
        this.L = Lifecycle.State.INITIALIZED;
        this.M = f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.f22198z, navBackStackEntry.f22196A, bundle, navBackStackEntry.C, navBackStackEntry.D, navBackStackEntry.E, navBackStackEntry.F);
        Intrinsics.i(navBackStackEntry, "entry");
        this.C = navBackStackEntry.C;
        o(navBackStackEntry.L);
    }
}
