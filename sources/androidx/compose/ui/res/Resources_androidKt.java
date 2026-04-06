package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class Resources_androidKt {
    public static final Resources a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1554054999, i2, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        composer.C(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) composer.C(AndroidCompositionLocals_androidKt.g())).getResources();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return resources;
    }
}
