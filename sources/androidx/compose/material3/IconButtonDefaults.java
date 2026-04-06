package androidx.compose.material3;

import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.StandardIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class IconButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final IconButtonDefaults f10121a = new IconButtonDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final int f10122b = 0;

    @JvmInline
    @Metadata
    public static final class IconButtonWidthOption {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f10123b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static final int f10124c = d(0);

        /* renamed from: d  reason: collision with root package name */
        public static final int f10125d = d(1);

        /* renamed from: e  reason: collision with root package name */
        public static final int f10126e = d(2);

        /* renamed from: a  reason: collision with root package name */
        public final int f10127a;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return IconButtonWidthOption.f10124c;
            }

            public final int b() {
                return IconButtonWidthOption.f10125d;
            }

            public final int c() {
                return IconButtonWidthOption.f10126e;
            }

            public Companion() {
            }
        }

        public static int d(int i2) {
            return i2;
        }

        public static boolean e(int i2, Object obj) {
            return (obj instanceof IconButtonWidthOption) && i2 == ((IconButtonWidthOption) obj).i();
        }

        public static final boolean f(int i2, int i3) {
            return i2 == i3;
        }

        public static int g(int i2) {
            return Integer.hashCode(i2);
        }

        public static String h(int i2) {
            return f(i2, f10124c) ? "Narrow" : f(i2, f10125d) ? "Uniform" : f(i2, f10126e) ? "Wide" : "Unknown";
        }

        public boolean equals(Object obj) {
            return e(this.f10127a, obj);
        }

        public int hashCode() {
            return g(this.f10127a);
        }

        public final /* synthetic */ int i() {
            return this.f10127a;
        }

        public String toString() {
            return h(this.f10127a);
        }
    }

    public static /* synthetic */ long j(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.f10123b.b();
        }
        return iconButtonDefaults.i(i2);
    }

    public final IconButtonColors a(ColorScheme colorScheme, long j2) {
        IconButtonColors f2 = colorScheme.f();
        if (f2 != null) {
            return f2;
        }
        Color.Companion companion = Color.f15975b;
        long j3 = j2;
        IconButtonColors iconButtonColors = new IconButtonColors(companion.e(), j3, companion.e(), Color.l(j2, StandardIconButtonTokens.f14134a.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        colorScheme.o0(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors b(ColorScheme colorScheme, long j2) {
        ColorScheme colorScheme2 = colorScheme;
        IconToggleButtonColors g2 = colorScheme.g();
        if (g2 != null) {
            return g2;
        }
        Color.Companion companion = Color.f15975b;
        long e2 = companion.e();
        long e3 = companion.e();
        StandardIconButtonTokens standardIconButtonTokens = StandardIconButtonTokens.f14134a;
        long j3 = j2;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(e2, j3, e3, Color.l(j2, standardIconButtonTokens.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), companion.e(), ColorSchemeKt.i(colorScheme2, standardIconButtonTokens.c()), (DefaultConstructorMarker) null);
        colorScheme2.p0(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors c(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        IconToggleButtonColors h2 = colorScheme.h();
        if (h2 != null) {
            return h2;
        }
        Color.Companion companion = Color.f15975b;
        long e2 = companion.e();
        StandardIconButtonTokens standardIconButtonTokens = StandardIconButtonTokens.f14134a;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(e2, ColorSchemeKt.i(colorScheme2, standardIconButtonTokens.d()), companion.e(), Color.l(ColorSchemeKt.i(colorScheme2, standardIconButtonTokens.a()), standardIconButtonTokens.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), companion.e(), ColorSchemeKt.i(colorScheme2, standardIconButtonTokens.c()), (DefaultConstructorMarker) null);
        colorScheme2.q0(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final Shape d(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-377108005, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
        }
        Shape g2 = ShapesKt.g(SmallIconButtonTokens.f14035a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final IconButtonColors e(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1037266503, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
        }
        long v2 = ((Color) composer.C(ContentColorKt.a())).v();
        IconButtonColors a2 = a(MaterialTheme.f10273a.a(composer, 6), v2);
        if (!Color.n(a2.e(), v2)) {
            a2 = IconButtonColors.d(a2, 0, v2, 0, Color.l(v2, StandardIconButtonTokens.f14134a.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), 5, (Object) null);
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return a2;
    }

    public final IconButtonColors f(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        Composer composer2 = composer;
        long f2 = (i3 & 1) != 0 ? Color.f15975b.f() : j2;
        long v2 = (i3 & 2) != 0 ? ((Color) composer2.C(ContentColorKt.a())).v() : j3;
        long f3 = (i3 & 4) != 0 ? Color.f15975b.f() : j4;
        long l2 = (i3 & 8) != 0 ? Color.l(v2, StandardIconButtonTokens.f14134a.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j5;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1639168605, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:78)");
        }
        ColorScheme a2 = MaterialTheme.f10273a.a(composer2, 6);
        long v3 = ((Color) composer2.C(ContentColorKt.a())).v();
        IconButtonColors c2 = a(a2, v3).c(f2, v2, f3, l2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final IconToggleButtonColors g(Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(-1355771567);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1355771567, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:164)");
        }
        long v2 = ((Color) composer2.C(ContentColorKt.a())).v();
        IconToggleButtonColors b2 = b(MaterialTheme.f10273a.a(composer2, 6), v2);
        if (Color.n(b2.e(), v2)) {
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            return b2;
        }
        IconToggleButtonColors d2 = IconToggleButtonColors.d(b2, 0, v2, 0, Color.l(v2, StandardIconButtonTokens.f14134a.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, 0, 53, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return d2;
    }

    public final IconToggleButtonColors h(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1755001127, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:241)");
        }
        IconToggleButtonColors c2 = c(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }

    public final long i(int i2) {
        float f2;
        IconButtonWidthOption.Companion companion = IconButtonWidthOption.f10123b;
        if (IconButtonWidthOption.f(i2, companion.a())) {
            SmallIconButtonTokens smallIconButtonTokens = SmallIconButtonTokens.f14035a;
            f2 = Dp.m(smallIconButtonTokens.e() + smallIconButtonTokens.f());
        } else if (IconButtonWidthOption.f(i2, companion.b())) {
            SmallIconButtonTokens smallIconButtonTokens2 = SmallIconButtonTokens.f14035a;
            f2 = Dp.m(smallIconButtonTokens2.c() + smallIconButtonTokens2.c());
        } else if (IconButtonWidthOption.f(i2, companion.c())) {
            SmallIconButtonTokens smallIconButtonTokens3 = SmallIconButtonTokens.f14035a;
            f2 = Dp.m(smallIconButtonTokens3.g() + smallIconButtonTokens3.h());
        } else {
            f2 = Dp.m((float) 0);
        }
        SmallIconButtonTokens smallIconButtonTokens4 = SmallIconButtonTokens.f14035a;
        return DpKt.b(Dp.m(smallIconButtonTokens4.d() + f2), smallIconButtonTokens4.a());
    }
}
