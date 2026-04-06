package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

@Metadata
public final class MaterialTheme {

    /* renamed from: a  reason: collision with root package name */
    public static final MaterialTheme f7937a = new MaterialTheme();

    public final Colors a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1462282791, i2, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:98)");
        }
        Colors colors = (Colors) composer.C(ColorsKt.c());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return colors;
    }

    public final Shapes b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1586253541, i2, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:110)");
        }
        Shapes shapes = (Shapes) composer.C(ShapesKt.a());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return shapes;
    }

    public final Typography c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1630198856, i2, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:106)");
        }
        Typography typography = (Typography) composer.C(TypographyKt.c());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return typography;
    }
}
