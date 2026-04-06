package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

@Metadata
public final class SnackbarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarDefaults f8428a = new SnackbarDefaults();

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1630911716, i2, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:203)");
        }
        MaterialTheme materialTheme = MaterialTheme.f7937a;
        long g2 = ColorKt.g(Color.l(materialTheme.a(composer, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), materialTheme.a(composer, 6).n());
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final long b(Composer composer, int i2) {
        long j2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-810329402, i2, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:223)");
        }
        Colors a2 = MaterialTheme.f7937a.a(composer, 6);
        if (a2.o()) {
            j2 = ColorKt.g(Color.l(a2.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), a2.j());
        } else {
            j2 = a2.k();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }
}
