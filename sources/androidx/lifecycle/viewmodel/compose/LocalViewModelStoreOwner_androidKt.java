package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;

@Metadata
public final class LocalViewModelStoreOwner_androidKt {
    public static final ViewModelStoreOwner a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1382572291, i2, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        ViewModelStoreOwner a2 = ViewTreeViewModelStoreOwner.a((View) composer.C(AndroidCompositionLocals_androidKt.j()));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
