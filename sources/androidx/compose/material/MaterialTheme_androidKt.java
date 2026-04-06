package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class MaterialTheme_androidKt {
    public static final void a(Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1322912246);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (q2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1322912246, i3, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            function2.m(q2, Integer.valueOf(i3 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new MaterialTheme_androidKt$PlatformMaterialTheme$1(function2, i2));
        }
    }
}
