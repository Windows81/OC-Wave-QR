package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.AppBarLargeFlexibleTokens;
import androidx.compose.material3.tokens.AppBarLargeTokens;
import androidx.compose.material3.tokens.AppBarMediumFlexibleTokens;
import androidx.compose.material3.tokens.AppBarMediumTokens;
import androidx.compose.material3.tokens.AppBarSmallTokens;
import androidx.compose.material3.tokens.AppBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TopAppBarDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TopAppBarDefaults f11631a = new TopAppBarDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11632b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11633c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f11634d = AppBarMediumTokens.f12738a.a();

    /* renamed from: e  reason: collision with root package name */
    public static final float f11635e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f11636f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f11637g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f11638h = AppBarLargeTokens.f12730a.a();

    /* renamed from: i  reason: collision with root package name */
    public static final float f11639i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f11640j;

    static {
        AppBarSmallTokens appBarSmallTokens = AppBarSmallTokens.f12741a;
        f11632b = appBarSmallTokens.a();
        f11633c = appBarSmallTokens.a();
        AppBarMediumFlexibleTokens appBarMediumFlexibleTokens = AppBarMediumFlexibleTokens.f12733a;
        f11635e = appBarMediumFlexibleTokens.a();
        f11636f = appBarMediumFlexibleTokens.b();
        f11637g = appBarSmallTokens.a();
        AppBarLargeFlexibleTokens appBarLargeFlexibleTokens = AppBarLargeFlexibleTokens.f12725a;
        f11639i = appBarLargeFlexibleTokens.a();
        f11640j = appBarLargeFlexibleTokens.b();
    }

    public final TopAppBarColors a(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        TopAppBarColors o2 = colorScheme.o();
        if (o2 != null) {
            return o2;
        }
        AppBarTokens appBarTokens = AppBarTokens.f12745a;
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.i(colorScheme2, appBarTokens.a()), ColorSchemeKt.i(colorScheme2, appBarTokens.c()), ColorSchemeKt.i(colorScheme2, appBarTokens.b()), ColorSchemeKt.i(colorScheme2, appBarTokens.e()), ColorSchemeKt.i(colorScheme2, appBarTokens.f()), ColorSchemeKt.i(colorScheme2, appBarTokens.d()), (DefaultConstructorMarker) null);
        colorScheme2.x0(topAppBarColors);
        return topAppBarColors;
    }

    public final float b() {
        return f11632b;
    }

    public final WindowInsets c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(2143182847, i2, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1526)");
        }
        WindowInsets a2 = SystemBarsDefaultInsets_androidKt.a(WindowInsets.f4206a, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.f4266b;
        WindowInsets j2 = WindowInsetsKt.j(a2, WindowInsetsSides.q(companion.g(), companion.k()));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return j2;
    }

    public final TopAppBarColors d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1388520854, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:1444)");
        }
        TopAppBarColors a2 = a(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }
}
