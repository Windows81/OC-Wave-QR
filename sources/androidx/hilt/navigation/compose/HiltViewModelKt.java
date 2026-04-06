package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;

@Metadata
public final class HiltViewModelKt {
    public static final ViewModelProvider.Factory a(ViewModelStoreOwner viewModelStoreOwner, Composer composer, int i2) {
        composer.f(1770922558);
        ViewModelProvider.Factory a2 = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? HiltViewModelFactory.a((Context) composer.C(AndroidCompositionLocals_androidKt.g()), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).m()) : null;
        composer.S();
        return a2;
    }
}
