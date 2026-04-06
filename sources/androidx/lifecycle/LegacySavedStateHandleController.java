package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f21892a = new LegacySavedStateHandleController();

    @Metadata
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        public void a(SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.i(savedStateRegistryOwner, "owner");
            if (savedStateRegistryOwner instanceof ViewModelStoreOwner) {
                ViewModelStore s2 = ((ViewModelStoreOwner) savedStateRegistryOwner).s();
                SavedStateRegistry v2 = savedStateRegistryOwner.v();
                for (String b2 : s2.c()) {
                    ViewModel b3 = s2.b(b2);
                    if (b3 != null) {
                        LegacySavedStateHandleController.a(b3, v2, savedStateRegistryOwner.a());
                    }
                }
                if (!s2.c().isEmpty()) {
                    v2.d(OnRecreation.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + savedStateRegistryOwner).toString());
        }
    }

    public static final void a(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Intrinsics.i(viewModel, "viewModel");
        Intrinsics.i(savedStateRegistry, "registry");
        Intrinsics.i(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.e("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f()) {
            savedStateHandleController.b(savedStateRegistry, lifecycle);
            f21892a.c(savedStateRegistry, lifecycle);
        }
    }

    public static final SavedStateHandleController b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        Intrinsics.i(savedStateRegistry, "registry");
        Intrinsics.i(lifecycle, "lifecycle");
        Intrinsics.f(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.f21960c.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.b(savedStateRegistry, lifecycle);
        f21892a.c(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    public final void c(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Lifecycle.State b2 = lifecycle.b();
        if (b2 == Lifecycle.State.INITIALIZED || b2.f(Lifecycle.State.STARTED)) {
            savedStateRegistry.d(OnRecreation.class);
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, savedStateRegistry));
        }
    }
}
