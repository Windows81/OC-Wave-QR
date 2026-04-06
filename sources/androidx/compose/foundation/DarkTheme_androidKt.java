package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

@Metadata
public final class DarkTheme_androidKt {
    public static final boolean a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-882615028, i2, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z2 = (((Configuration) composer.C(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return z2;
    }
}
