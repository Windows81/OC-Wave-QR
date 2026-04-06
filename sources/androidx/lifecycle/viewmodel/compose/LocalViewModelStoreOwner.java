package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;

@Metadata
public final class LocalViewModelStoreOwner {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalViewModelStoreOwner f22073a = new LocalViewModelStoreOwner();

    /* renamed from: b  reason: collision with root package name */
    public static final ProvidableCompositionLocal f22074b = CompositionLocalKt.h((SnapshotMutationPolicy) null, new a(), 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f22075c = 0;

    public static final ViewModelStoreOwner b() {
        return null;
    }

    public final ViewModelStoreOwner c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-584162872, i2, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) composer.C(f22074b);
        if (viewModelStoreOwner == null) {
            composer.X(1260197609);
            viewModelStoreOwner = LocalViewModelStoreOwner_androidKt.a(composer, 0);
        } else {
            composer.X(1260196493);
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return viewModelStoreOwner;
    }

    public final ProvidedValue d(ViewModelStoreOwner viewModelStoreOwner) {
        return f22074b.d(viewModelStoreOwner);
    }
}
