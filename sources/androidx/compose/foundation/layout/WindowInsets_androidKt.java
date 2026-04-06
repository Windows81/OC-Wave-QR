package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.Insets;
import kotlin.Metadata;

@Metadata
public final class WindowInsets_androidKt {
    public static final ValueInsets a(Insets insets, String str) {
        return new ValueInsets(f(insets), str);
    }

    public static final WindowInsets b(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1324817724, i2, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:143)");
        }
        AndroidWindowInsets e2 = WindowInsetsHolder.f4215x.c(composer, 6).e();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public static final WindowInsets c(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-49441252, i2, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:198)");
        }
        WindowInsets j2 = WindowInsetsHolder.f4215x.c(composer, 6).j();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }

    public static final WindowInsets d(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-675090670, i2, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        AndroidWindowInsets l2 = WindowInsetsHolder.f4215x.c(composer, 6).l();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return l2;
    }

    public static final WindowInsets e(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-282936756, i2, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:179)");
        }
        AndroidWindowInsets m2 = WindowInsetsHolder.f4215x.c(composer, 6).m();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return m2;
    }

    public static final InsetsValues f(Insets insets) {
        return new InsetsValues(insets.f19774a, insets.f19775b, insets.f19776c, insets.f19777d);
    }
}
