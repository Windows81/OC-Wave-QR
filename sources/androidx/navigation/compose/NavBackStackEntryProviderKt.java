package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class NavBackStackEntryProviderKt {
    public static final void a(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1579360880);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(navBackStackEntry) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(saveableStateHolder) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1579360880, i3, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            CompositionLocalKt.d(new ProvidedValue[]{LocalViewModelStoreOwner.f22073a.d(navBackStackEntry), LocalLifecycleOwnerKt.c().d(navBackStackEntry), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().d(navBackStackEntry)}, ComposableLambdaKt.e(-52928304, true, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(saveableStateHolder, function2), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, saveableStateHolder, function2, i2));
        }
    }

    public static final void b(SaveableStateHolder saveableStateHolder, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(1211832233);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(saveableStateHolder) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1211832233, i4, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            q2.f(1729797275);
            ViewModelStoreOwner c2 = LocalViewModelStoreOwner.f22073a.c(q2, 6);
            if (c2 != null) {
                ViewModel c3 = ViewModelKt.c(Reflection.b(BackStackEntryIdViewModel.class), c2, (String) null, (ViewModelProvider.Factory) null, c2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) c2).n() : CreationExtras.Empty.f22064c, q2, 0, 0);
                q2.S();
                BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) c3;
                backStackEntryIdViewModel.i(new WeakReference(saveableStateHolder));
                saveableStateHolder.c(backStackEntryIdViewModel.g(), function2, q2, (i4 & 112) | ((i4 << 6) & 896));
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new NavBackStackEntryProviderKt$SaveableStateProvider$1(saveableStateHolder, function2, i2));
        }
    }
}
