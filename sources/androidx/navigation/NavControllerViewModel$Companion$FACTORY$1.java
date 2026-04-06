package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavControllerViewModel$Companion$FACTORY$1 implements ViewModelProvider.Factory {
    public ViewModel b(Class cls) {
        Intrinsics.i(cls, "modelClass");
        return new NavControllerViewModel();
    }
}
