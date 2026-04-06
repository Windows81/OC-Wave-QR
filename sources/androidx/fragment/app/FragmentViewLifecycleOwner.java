package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: A  reason: collision with root package name */
    public final ViewModelStore f21758A;

    /* renamed from: B  reason: collision with root package name */
    public ViewModelProvider.Factory f21759B;
    public LifecycleRegistry C = null;
    public SavedStateRegistryController D = null;

    /* renamed from: z  reason: collision with root package name */
    public final Fragment f21760z;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore) {
        this.f21760z = fragment;
        this.f21758A = viewModelStore;
    }

    public Lifecycle a() {
        d();
        return this.C;
    }

    public void b(Lifecycle.Event event) {
        this.C.i(event);
    }

    public void d() {
        if (this.C == null) {
            this.C = new LifecycleRegistry(this);
            SavedStateRegistryController a2 = SavedStateRegistryController.a(this);
            this.D = a2;
            a2.c();
            SavedStateHandleSupport.c(this);
        }
    }

    public boolean e() {
        return this.C != null;
    }

    public void f(Bundle bundle) {
        this.D.d(bundle);
    }

    public void g(Bundle bundle) {
        this.D.e(bundle);
    }

    public void h(Lifecycle.State state) {
        this.C.n(state);
    }

    public ViewModelProvider.Factory m() {
        Application application;
        ViewModelProvider.Factory m2 = this.f21760z.m();
        if (!m2.equals(this.f21760z.u0)) {
            this.f21759B = m2;
            return m2;
        }
        if (this.f21759B == null) {
            Context applicationContext = this.f21760z.B1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f21759B = new SavedStateViewModelFactory(application, this, this.f21760z.r());
        }
        return this.f21759B;
    }

    public CreationExtras n() {
        Application application;
        Context applicationContext = this.f21760z.B1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.c(ViewModelProvider.AndroidViewModelFactory.f21999h, application);
        }
        mutableCreationExtras.c(SavedStateHandleSupport.f21969a, this);
        mutableCreationExtras.c(SavedStateHandleSupport.f21970b, this);
        if (this.f21760z.r() != null) {
            mutableCreationExtras.c(SavedStateHandleSupport.f21971c, this.f21760z.r());
        }
        return mutableCreationExtras;
    }

    public ViewModelStore s() {
        d();
        return this.f21758A;
    }

    public SavedStateRegistry v() {
        d();
        return this.D.b();
    }
}
