package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
final class DebugRippleTheme implements RippleTheme {

    /* renamed from: b  reason: collision with root package name */
    public static final DebugRippleTheme f9053b = new DebugRippleTheme();

    public long a(Composer composer, int i2) {
        composer.X(2042140174);
        if (ComposerKt.P()) {
            ComposerKt.Y(2042140174, i2, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long b2 = RippleTheme.f9089a.b(Color.f15975b.a(), true);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return b2;
    }

    public RippleAlpha b(Composer composer, int i2) {
        composer.X(-1629816343);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1629816343, i2, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        RippleAlpha a2 = RippleTheme.f9089a.a(Color.f15975b.a(), true);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }
}
