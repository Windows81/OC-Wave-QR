package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata
final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final ViewModel a(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        ViewModelProvider a2 = factory != null ? ViewModelProvider.f21994b.a(viewModelStoreOwner.s(), factory, creationExtras) : viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ViewModelProvider.f21994b.a(viewModelStoreOwner.s(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).m(), creationExtras) : ViewModelProvider.Companion.c(ViewModelProvider.f21994b, viewModelStoreOwner, (ViewModelProvider.Factory) null, (CreationExtras) null, 6, (Object) null);
        return str != null ? a2.b(str, kClass) : a2.c(kClass);
    }

    public static final ViewModel b(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
        if ((i3 & 2) == 0 || (viewModelStoreOwner = LocalViewModelStoreOwner.f22073a.c(composer, 6)) != null) {
            if ((i3 & 4) != 0) {
                str = null;
            }
            if ((i3 & 8) != 0) {
                factory = null;
            }
            if ((i3 & 16) != 0) {
                creationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).n() : CreationExtras.Empty.f22064c;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1673618944, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
            }
            ViewModel a2 = ViewModelKt.a(viewModelStoreOwner, kClass, str, factory, creationExtras);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return a2;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
