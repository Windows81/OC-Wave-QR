package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class SavedStateHandleSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final CreationExtras.Key f21969a = new SavedStateHandleSupport$special$$inlined$Key$1();

    /* renamed from: b  reason: collision with root package name */
    public static final CreationExtras.Key f21970b = new SavedStateHandleSupport$special$$inlined$Key$2();

    /* renamed from: c  reason: collision with root package name */
    public static final CreationExtras.Key f21971c = new SavedStateHandleSupport$special$$inlined$Key$3();

    static {
        CreationExtras.Companion companion = CreationExtras.f22062b;
    }

    public static final SavedStateHandle a(CreationExtras creationExtras) {
        Intrinsics.i(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.a(f21969a);
        if (savedStateRegistryOwner != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.a(f21970b);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) creationExtras.a(f21971c);
                String str = (String) creationExtras.a(ViewModelProvider.f21995c);
                if (str != null) {
                    return b(savedStateRegistryOwner, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final SavedStateHandle b(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider d2 = d(savedStateRegistryOwner);
        SavedStateHandlesVM e2 = e(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = (SavedStateHandle) e2.g().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle a2 = SavedStateHandle.f21960c.a(d2.c(str), bundle);
        e2.g().put(str, a2);
        return a2;
    }

    public static final void c(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.i(savedStateRegistryOwner, "<this>");
        Lifecycle.State b2 = savedStateRegistryOwner.a().b();
        if (b2 != Lifecycle.State.INITIALIZED && b2 != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (savedStateRegistryOwner.v().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.v(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.v().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.a().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider d(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.i(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider b2 = savedStateRegistryOwner.v().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = b2 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) b2 : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM e(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.i(viewModelStoreOwner, "<this>");
        return (SavedStateHandlesVM) ViewModelProvider.Companion.c(ViewModelProvider.f21994b, viewModelStoreOwner, new SavedStateHandleSupport$savedStateHandlesVM$1(), (CreationExtras) null, 4, (Object) null).b("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.b(SavedStateHandlesVM.class));
    }
}
