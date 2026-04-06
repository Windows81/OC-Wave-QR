package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: b  reason: collision with root package name */
    public Application f21977b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewModelProvider.Factory f21978c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f21979d;

    /* renamed from: e  reason: collision with root package name */
    public Lifecycle f21980e;

    /* renamed from: f  reason: collision with root package name */
    public SavedStateRegistry f21981f;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        Intrinsics.i(savedStateRegistryOwner, "owner");
        this.f21981f = savedStateRegistryOwner.v();
        this.f21980e = savedStateRegistryOwner.a();
        this.f21979d = bundle;
        this.f21977b = application;
        this.f21978c = application != null ? ViewModelProvider.AndroidViewModelFactory.f21997f.a(application) : new ViewModelProvider.AndroidViewModelFactory();
    }

    public ViewModel a(KClass kClass, CreationExtras creationExtras) {
        Intrinsics.i(kClass, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        return c(JvmClassMappingKt.a(kClass), creationExtras);
    }

    public ViewModel b(Class cls) {
        Intrinsics.i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public ViewModel c(Class cls, CreationExtras creationExtras) {
        Intrinsics.i(cls, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        String str = (String) creationExtras.a(ViewModelProvider.f21995c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (creationExtras.a(SavedStateHandleSupport.f21969a) != null && creationExtras.a(SavedStateHandleSupport.f21970b) != null) {
            Application application = (Application) creationExtras.a(ViewModelProvider.AndroidViewModelFactory.f21999h);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Constructor c2 = (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f21983b) : SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f21982a);
            return c2 == null ? this.f21978c.c(cls, creationExtras) : (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.d(cls, c2, SavedStateHandleSupport.a(creationExtras)) : SavedStateViewModelFactory_androidKt.d(cls, c2, application, SavedStateHandleSupport.a(creationExtras));
        } else if (this.f21980e != null) {
            return e(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void d(ViewModel viewModel) {
        Intrinsics.i(viewModel, "viewModel");
        if (this.f21980e != null) {
            SavedStateRegistry savedStateRegistry = this.f21981f;
            Intrinsics.f(savedStateRegistry);
            Lifecycle lifecycle = this.f21980e;
            Intrinsics.f(lifecycle);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public final ViewModel e(String str, Class cls) {
        ViewModel viewModel;
        Application application;
        Intrinsics.i(str, "key");
        Intrinsics.i(cls, "modelClass");
        Lifecycle lifecycle = this.f21980e;
        if (lifecycle != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Constructor c2 = (!isAssignableFrom || this.f21977b == null) ? SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f21983b) : SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f21982a);
            if (c2 == null) {
                return this.f21977b != null ? this.f21978c.b(cls) : ViewModelProvider.NewInstanceFactory.f22003b.a().b(cls);
            }
            SavedStateRegistry savedStateRegistry = this.f21981f;
            Intrinsics.f(savedStateRegistry);
            SavedStateHandleController b2 = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, this.f21979d);
            if (!isAssignableFrom || (application = this.f21977b) == null) {
                viewModel = SavedStateViewModelFactory_androidKt.d(cls, c2, b2.d());
            } else {
                Intrinsics.f(application);
                viewModel = SavedStateViewModelFactory_androidKt.d(cls, c2, application, b2.d());
            }
            viewModel.c("androidx.lifecycle.savedstate.vm.tag", b2);
            return viewModel;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
