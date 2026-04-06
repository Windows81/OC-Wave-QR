package androidx.compose.material3;

import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CardDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final CardDefaults f9356a = new CardDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final int f9357b = 0;

    public final CardColors a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1876034303, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:472)");
        }
        CardColors d2 = d(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return d2;
    }

    public final CardColors b(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        int i4 = i2;
        long f2 = (i3 & 1) != 0 ? Color.f15975b.f() : j2;
        long g2 = (i3 & 2) != 0 ? ColorSchemeKt.g(f2, composer2, i4 & 14) : j3;
        long f3 = (i3 & 4) != 0 ? Color.f15975b.f() : j4;
        long l2 = (i3 & 8) != 0 ? Color.l(g2, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j5;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1589582123, i4, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:490)");
        }
        CardColors c2 = d(MaterialTheme.f10273a.a(composer2, 6)).c(f2, g2, f3, l2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final CardElevation c(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledCardTokens.f13293a.b();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledCardTokens.f13293a.j();
        }
        float f8 = f3;
        if ((i3 & 4) != 0) {
            f4 = FilledCardTokens.f13293a.h();
        }
        float f9 = f4;
        if ((i3 & 8) != 0) {
            f5 = FilledCardTokens.f13293a.i();
        }
        float f10 = f5;
        if ((i3 & 16) != 0) {
            f6 = FilledCardTokens.f13293a.g();
        }
        float f11 = f6;
        if ((i3 & 32) != 0) {
            f7 = FilledCardTokens.f13293a.e();
        }
        float f12 = f7;
        if (ComposerKt.P()) {
            ComposerKt.Y(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:400)");
        }
        CardElevation cardElevation = new CardElevation(f2, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return cardElevation;
    }

    public final CardColors d(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        CardColors c2 = colorScheme.c();
        if (c2 != null) {
            return c2;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.f13293a;
        CardColors cardColors = new CardColors(ColorSchemeKt.i(colorScheme2, filledCardTokens.a()), ColorSchemeKt.f(colorScheme2, ColorSchemeKt.i(colorScheme2, filledCardTokens.a())), ColorKt.g(Color.l(ColorSchemeKt.i(colorScheme2, filledCardTokens.d()), filledCardTokens.f(), 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, filledCardTokens.a())), Color.l(ColorSchemeKt.f(colorScheme2, ColorSchemeKt.i(colorScheme2, filledCardTokens.a())), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        colorScheme2.l0(cardColors);
        return cardColors;
    }

    public final Shape e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:370)");
        }
        Shape g2 = ShapesKt.g(FilledCardTokens.f13293a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }
}
