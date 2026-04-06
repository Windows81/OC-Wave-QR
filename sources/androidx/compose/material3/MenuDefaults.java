package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class MenuDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final MenuDefaults f10281a = new MenuDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10282b = ElevationTokens.f13121a.a();

    /* renamed from: c  reason: collision with root package name */
    public static final float f10283c = MenuTokens.f13544a.b();

    /* renamed from: d  reason: collision with root package name */
    public static final PaddingValues f10284d = PaddingKt.b(MenuKt.f10293c, Dp.m((float) 0));

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1787427929, i2, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:193)");
        }
        long k2 = ColorSchemeKt.k(MenuTokens.f13544a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final MenuItemColors b(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        MenuItemColors i2 = colorScheme.i();
        if (i2 != null) {
            return i2;
        }
        ListTokens listTokens = ListTokens.f13495a;
        MenuItemColors menuItemColors = new MenuItemColors(ColorSchemeKt.i(colorScheme2, listTokens.h()), ColorSchemeKt.i(colorScheme2, listTokens.j()), ColorSchemeKt.i(colorScheme2, listTokens.p()), Color.l(ColorSchemeKt.i(colorScheme2, listTokens.b()), listTokens.c(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, listTokens.d()), listTokens.e(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, listTokens.f()), listTokens.g(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        colorScheme2.r0(menuItemColors);
        return menuItemColors;
    }

    public final PaddingValues c() {
        return f10284d;
    }

    public final float d() {
        return f10283c;
    }

    public final Shape e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(218702739, i2, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:189)");
        }
        Shape g2 = ShapesKt.g(MenuTokens.f13544a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final float f() {
        return f10282b;
    }

    public final MenuItemColors g(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1326531516, i2, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:199)");
        }
        MenuItemColors b2 = b(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }
}
