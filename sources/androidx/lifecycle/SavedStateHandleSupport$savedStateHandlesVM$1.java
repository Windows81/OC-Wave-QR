package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public final class SavedStateHandleSupport$savedStateHandlesVM$1 implements ViewModelProvider.Factory {
    public ViewModel a(KClass kClass, CreationExtras creationExtras) {
        Intrinsics.i(kClass, "modelClass");
        Intrinsics.i(creationExtras, "extras");
        return new SavedStateHandlesVM();
    }
}
