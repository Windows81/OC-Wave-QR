package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import kotlin.Metadata;

@Metadata
public final class MaterialTheme {

    /* renamed from: a  reason: collision with root package name */
    public static final MaterialTheme f10273a = new MaterialTheme();

    public final ColorScheme a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-561618718, i2, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
        }
        ColorScheme colorScheme = (ColorScheme) composer.C(ColorSchemeKt.j());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return colorScheme;
    }

    public final CompositionLocal b() {
        return MaterialThemeKt.f10275b;
    }

    public final MotionScheme c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-506613891, i2, -1, "androidx.compose.material3.MaterialTheme.<get-motionScheme> (MaterialTheme.kt:141)");
        }
        MotionScheme motionScheme = (MotionScheme) composer.C(b());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return motionScheme;
    }

    public final Shapes d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(419509830, i2, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:137)");
        }
        Shapes shapes = (Shapes) composer.C(ShapesKt.f());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return shapes;
    }

    public final Typography e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-942794935, i2, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        Typography typography = (Typography) composer.C(TypographyKt.d());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return typography;
    }
}
