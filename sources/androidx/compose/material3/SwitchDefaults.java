package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SwitchDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final SwitchDefaults f11247a = new SwitchDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11248b = Dp.m((float) 16);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11249c = 0;

    public final SwitchColors a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(435552781, i2, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:306)");
        }
        SwitchColors b2 = b(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public final SwitchColors b(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        SwitchColors l2 = colorScheme.l();
        if (l2 != null) {
            return l2;
        }
        SwitchTokens switchTokens = SwitchTokens.f14193a;
        long i2 = ColorSchemeKt.i(colorScheme2, switchTokens.o());
        long i3 = ColorSchemeKt.i(colorScheme2, switchTokens.r());
        Color.Companion companion = Color.f15975b;
        SwitchColors switchColors = r2;
        long j2 = i2;
        SwitchColors switchColors2 = new SwitchColors(j2, i3, companion.e(), ColorSchemeKt.i(colorScheme2, switchTokens.q()), ColorSchemeKt.i(colorScheme2, switchTokens.y()), ColorSchemeKt.i(colorScheme2, switchTokens.B()), ColorSchemeKt.i(colorScheme2, switchTokens.x()), ColorSchemeKt.i(colorScheme2, switchTokens.A()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.a()), switchTokens.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.e()), switchTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), companion.e(), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.c()), switchTokens.d(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.g()), switchTokens.h(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.k()), switchTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.l()), switchTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, switchTokens.i()), switchTokens.j(), 0.0f, 0.0f, 0.0f, 14, (Object) null), colorScheme.W()), (DefaultConstructorMarker) null);
        SwitchColors switchColors3 = switchColors;
        colorScheme2.u0(switchColors3);
        return switchColors3;
    }
}
