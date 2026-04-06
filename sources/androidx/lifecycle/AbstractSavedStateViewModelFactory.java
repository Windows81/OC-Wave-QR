package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: b  reason: collision with root package name */
    public SavedStateRegistry f21854b;

    /* renamed from: c  reason: collision with root package name */
    public Lifecycle f21855c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f21856d;

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        Intrinsics.i(savedStateRegistryOwner, "owner");
        this.f21854b = savedStateRegistryOwner.v();
        this.f21855c = savedStateRegistryOwner.a();
        this.f21856d = bundle;
    }

    private final ViewModel e(String str, Class cls) {
        SavedStateRegistry savedStateRegistry = this.f21854b;
        Intrinsics.f(savedStateRegistry);
        Lifecycle lifecycle = this.f21855c;
        Intrinsics.f(lifecycle);
        SavedStateHandleController b2 = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, this.f21856d);
        ViewModel f2 = f(str, cls, b2.d());
        f2.c("androidx.lifecycle.savedstate.vm.tag", b2);
        return f2;
    }

    public ViewModel b(Class cls) {
        Intrinsics.i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f21855c != null) {
            return e(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public ViewModel c(Class cls, CreationExtras creationExtras) {
        Intrinsics.i(cls, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        String str = (String) creationExtras.a(ViewModelProvider.NewInstanceFactory.f22005d);
        if (str != null) {
            return this.f21854b != null ? e(str, cls) : f(str, cls, SavedStateHandleSupport.a(creationExtras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public void d(ViewModel viewModel) {
        Intrinsics.i(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.f21854b;
        if (savedStateRegistry != null) {
            Intrinsics.f(savedStateRegistry);
            Lifecycle lifecycle = this.f21855c;
            Intrinsics.f(lifecycle);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public abstract ViewModel f(String str, Class cls, SavedStateHandle savedStateHandle);
}
