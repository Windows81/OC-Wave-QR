package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class AlertDialogDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final AlertDialogDefaults f9123a = new AlertDialogDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9124b = Dp.m((float) 0);

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(616766901, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:225)");
        }
        long k2 = ColorSchemeKt.k(DialogTokens.f13036a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1646653461, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:229)");
        }
        long k2 = ColorSchemeKt.k(DialogTokens.f13036a.h(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final Shape c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-952504159, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:221)");
        }
        Shape g2 = ShapesKt.g(DialogTokens.f13036a.e(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final long d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1729845653, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:237)");
        }
        long k2 = ColorSchemeKt.k(DialogTokens.f13036a.i(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final long e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(247083549, i2, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:233)");
        }
        long k2 = ColorSchemeKt.k(DialogTokens.f13036a.f(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float f() {
        return f9124b;
    }
}
