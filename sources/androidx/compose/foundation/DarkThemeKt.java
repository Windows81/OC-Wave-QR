package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class DarkThemeKt {
    public static final boolean a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1100791446, i2, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:36)");
        }
        boolean a2 = DarkTheme_androidKt.a(composer, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
