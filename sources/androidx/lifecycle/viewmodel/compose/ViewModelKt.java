package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata
public final class ViewModelKt {
    public static final ViewModel a(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return ViewModelKt__ViewModelKt.a(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    public static final ViewModel b(Class cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        return ViewModelKt__ViewModel_androidKt.a(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i2, i3);
    }

    public static final ViewModel c(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        return ViewModelKt__ViewModelKt.b(kClass, viewModelStoreOwner, str, factory, creationExtras, composer, i2, i3);
    }
}
