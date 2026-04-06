package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class SystemBarsDefaultInsets_androidKt {
    public static final WindowInsets a(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2011811170, i2, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i3 = i2 & 14;
        WindowInsets k2 = WindowInsetsKt.k(WindowInsets_androidKt.e(companion, composer, i3), WindowInsets_androidKt.b(companion, composer, i3));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }
}
