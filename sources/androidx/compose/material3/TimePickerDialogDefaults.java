package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class TimePickerDialogDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TimePickerDialogDefaults f11448a = new TimePickerDialogDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11449b = Dp.m((float) 300);

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-443775449, i2, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-containerColor> (TimePickerDialog.kt:242)");
        }
        long k2 = ColorSchemeKt.k(DialogTokens.f13036a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final Shape b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1241096723, i2, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-shape> (TimePickerDialog.kt:246)");
        }
        Shape g2 = ShapesKt.g(DialogTokens.f13036a.e(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }
}
