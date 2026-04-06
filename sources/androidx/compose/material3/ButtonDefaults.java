package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ButtonDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final ButtonDefaults f9301a = new ButtonDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9302b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f9303c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f9304d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f9305e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f9306f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f9307g;

    /* renamed from: h  reason: collision with root package name */
    public static final PaddingValues f9308h;

    /* renamed from: i  reason: collision with root package name */
    public static final PaddingValues f9309i;

    /* renamed from: j  reason: collision with root package name */
    public static final float f9310j;

    /* renamed from: k  reason: collision with root package name */
    public static final PaddingValues f9311k;

    /* renamed from: l  reason: collision with root package name */
    public static final float f9312l;

    /* renamed from: m  reason: collision with root package name */
    public static final PaddingValues f9313m;

    /* renamed from: n  reason: collision with root package name */
    public static final float f9314n = Dp.m((float) 58);

    /* renamed from: o  reason: collision with root package name */
    public static final float f9315o;

    /* renamed from: p  reason: collision with root package name */
    public static final float f9316p = Dp.m((float) 18);

    /* renamed from: q  reason: collision with root package name */
    public static final float f9317q;

    static {
        BaselineButtonTokens baselineButtonTokens = BaselineButtonTokens.f12799a;
        float a2 = baselineButtonTokens.a();
        f9302b = a2;
        float b2 = baselineButtonTokens.b();
        f9303c = b2;
        float f2 = (float) 16;
        float m2 = Dp.m(f2);
        f9304d = m2;
        ButtonSmallTokens buttonSmallTokens = ButtonSmallTokens.f12857a;
        f9305e = buttonSmallTokens.d();
        f9306f = buttonSmallTokens.e();
        float m3 = Dp.m((float) 8);
        f9307g = m3;
        PaddingValues d2 = PaddingKt.d(a2, m3, b2, m3);
        f9308h = d2;
        f9309i = PaddingKt.d(m2, m3, b2, m3);
        float m4 = Dp.m((float) 12);
        f9310j = m4;
        f9311k = PaddingKt.d(m4, d2.d(), m4, d2.a());
        float m5 = Dp.m(f2);
        f9312l = m5;
        f9313m = PaddingKt.d(m4, d2.d(), m5, d2.a());
        f9315o = buttonSmallTokens.a();
        f9317q = buttonSmallTokens.c();
    }

    public final ButtonColors a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        ButtonColors e2 = e(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return e2;
    }

    public final ButtonElevation b(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledButtonTokens.f13267a.b();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledButtonTokens.f13267a.k();
        }
        float f7 = f3;
        if ((i3 & 4) != 0) {
            f4 = FilledButtonTokens.f13267a.h();
        }
        float f8 = f4;
        if ((i3 & 8) != 0) {
            f5 = FilledButtonTokens.f13267a.i();
        }
        float f9 = f5;
        if ((i3 & 16) != 0) {
            f6 = FilledButtonTokens.f13267a.d();
        }
        float f10 = f6;
        if (ComposerKt.P()) {
            ComposerKt.Y(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f2, f7, f8, f9, f10, (DefaultConstructorMarker) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return buttonElevation;
    }

    public final PaddingValues c() {
        return f9309i;
    }

    public final PaddingValues d() {
        return f9308h;
    }

    public final ButtonColors e(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        ButtonColors b2 = colorScheme.b();
        if (b2 != null) {
            return b2;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.f13267a;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.i(colorScheme2, filledButtonTokens.a()), ColorSchemeKt.i(colorScheme2, filledButtonTokens.j()), Color.l(ColorSchemeKt.i(colorScheme2, filledButtonTokens.c()), filledButtonTokens.e(), 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, filledButtonTokens.f()), filledButtonTokens.g(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        colorScheme2.k0(buttonColors);
        return buttonColors;
    }

    public final ButtonColors f(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        ButtonColors m2 = colorScheme.m();
        if (m2 != null) {
            return m2;
        }
        Color.Companion companion = Color.f15975b;
        long e2 = companion.e();
        long i2 = ColorSchemeKt.i(colorScheme2, ColorSchemeKeyTokens.Primary);
        long e3 = companion.e();
        TextButtonTokens textButtonTokens = TextButtonTokens.f14219a;
        ButtonColors buttonColors = new ButtonColors(e2, i2, e3, Color.l(ColorSchemeKt.i(colorScheme2, textButtonTokens.a()), textButtonTokens.b(), 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        colorScheme2.v0(buttonColors);
        return buttonColors;
    }

    public final float g() {
        return f9317q;
    }

    public final float h() {
        return f9315o;
    }

    public final float i() {
        return f9314n;
    }

    public final Shape j(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        Shape g2 = ShapesKt.g(ButtonSmallTokens.f12857a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final PaddingValues k() {
        return f9311k;
    }

    public final Shape l(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-349121587, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
        }
        Shape g2 = ShapesKt.g(ButtonSmallTokens.f12857a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final ButtonColors m(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1880341584, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
        }
        ButtonColors f2 = f(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return f2;
    }

    public final ButtonColors n(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long f2 = (i3 & 1) != 0 ? Color.f15975b.f() : j2;
        long f3 = (i3 & 2) != 0 ? Color.f15975b.f() : j3;
        long f4 = (i3 & 4) != 0 ? Color.f15975b.f() : j4;
        long f5 = (i3 & 8) != 0 ? Color.f15975b.f() : j5;
        if (ComposerKt.P()) {
            ComposerKt.Y(-1402274782, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:770)");
        }
        ButtonColors c2 = f(MaterialTheme.f10273a.a(composer, 6)).c(f2, f3, f4, f5);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return c2;
    }
}
