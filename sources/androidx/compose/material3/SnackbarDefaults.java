package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

@Metadata
public final class SnackbarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarDefaults f11157a = new SnackbarDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final int f11158b = 0;

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(743425465, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:425)");
        }
        long k2 = ColorSchemeKt.k(SnackbarTokens.f14050a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1313141593, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:429)");
        }
        long k2 = ColorSchemeKt.k(SnackbarTokens.f14050a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(987938253, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:417)");
        }
        long k2 = ColorSchemeKt.k(SnackbarTokens.f14050a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1021310823, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:421)");
        }
        long k2 = ColorSchemeKt.k(SnackbarTokens.f14050a.h(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-528602817, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:433)");
        }
        long k2 = ColorSchemeKt.k(SnackbarTokens.f14050a.f(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final Shape f(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-551629101, i2, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:413)");
        }
        Shape g2 = ShapesKt.g(SnackbarTokens.f14050a.e(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }
}
