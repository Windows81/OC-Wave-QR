package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class ScaffoldDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ScaffoldDefaults f10764a = new ScaffoldDefaults();

    public final WindowInsets a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(757124140, i2, -1, "androidx.compose.material3.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:301)");
        }
        WindowInsets a2 = SystemBarsDefaultInsets_androidKt.a(WindowInsets.f4206a, composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
