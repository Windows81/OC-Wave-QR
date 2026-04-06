package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TooltipDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final TooltipDefaults f11582a = new TooltipDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final long f11583b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11584c = Dp.m((float) 200);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11585d = Dp.m((float) 320);

    /* renamed from: e  reason: collision with root package name */
    public static final DefaultTooltipCaretShape f11586e;

    static {
        long b2 = DpKt.b(Dp.m((float) 16), Dp.m((float) 8));
        f11583b = b2;
        f11586e = new DefaultTooltipCaretShape(b2, (DefaultConstructorMarker) null);
    }

    public final long a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(102696215, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:626)");
        }
        long k2 = ColorSchemeKt.k(PlainTooltipTokens.f13853a.a(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final Shape b(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(49570325, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:622)");
        }
        Shape g2 = ShapesKt.g(PlainTooltipTokens.f13853a.b(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return g2;
    }

    public final long c(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1982928937, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:630)");
        }
        long k2 = ColorSchemeKt.k(PlainTooltipTokens.f13853a.c(), composer, 6);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return k2;
    }

    public final float d() {
        return f11584c;
    }

    public final PopupPositionProvider e(int i2, float f2, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            f2 = TooltipKt.t();
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(-573803578, i3, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:849)");
        }
        int P1 = ((Density) composer.C(CompositionLocalsKt.g())).P1(f2);
        boolean i5 = ((((i3 & 14) ^ 6) > 4 && composer.i(i2)) || (i3 & 6) == 4) | composer.i(P1);
        Object g2 = composer.g();
        if (i5 || g2 == Composer.f14567a.a()) {
            g2 = new TooltipPositionProviderImpl(i2, P1, (DefaultConstructorMarker) null);
            composer.N(g2);
        }
        TooltipPositionProviderImpl tooltipPositionProviderImpl = (TooltipPositionProviderImpl) g2;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return tooltipPositionProviderImpl;
    }
}
