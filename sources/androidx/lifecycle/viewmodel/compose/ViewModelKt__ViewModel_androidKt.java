package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;

@Metadata
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    public static final ViewModel a(Class cls, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i2, int i3) {
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
                ComposerKt.Y(-1566358618, i2, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
            }
            ViewModel a2 = ViewModelKt.a(viewModelStoreOwner, JvmClassMappingKt.c(cls), str, factory, creationExtras);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            return a2;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
