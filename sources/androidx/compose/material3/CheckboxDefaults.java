package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CheckboxDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final CheckboxDefaults f9383a = new CheckboxDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final float f9384b = Dp.m((float) 2);

    /* renamed from: c  reason: collision with root package name */
    public static final int f9385c = 0;

    public final CheckboxColors a(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-9530498, i2, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:315)");
        }
        CheckboxColors b2 = b(MaterialTheme.f10273a.a(composer, 6));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return b2;
    }

    public final CheckboxColors b(ColorScheme colorScheme) {
        ColorScheme colorScheme2 = colorScheme;
        CheckboxColors d2 = colorScheme.d();
        if (d2 != null) {
            return d2;
        }
        CheckboxTokens checkboxTokens = CheckboxTokens.f12895a;
        long i2 = ColorSchemeKt.i(colorScheme2, checkboxTokens.c());
        Color.Companion companion = Color.f15975b;
        CheckboxColors checkboxColors = r2;
        CheckboxColors checkboxColors2 = new CheckboxColors(i2, companion.e(), ColorSchemeKt.i(colorScheme2, checkboxTokens.a()), companion.e(), Color.l(ColorSchemeKt.i(colorScheme2, checkboxTokens.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), companion.e(), Color.l(ColorSchemeKt.i(colorScheme2, checkboxTokens.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.i(colorScheme2, checkboxTokens.a()), ColorSchemeKt.i(colorScheme2, checkboxTokens.f()), Color.l(ColorSchemeKt.i(colorScheme2, checkboxTokens.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, checkboxTokens.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), Color.l(ColorSchemeKt.i(colorScheme2, checkboxTokens.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        CheckboxColors checkboxColors3 = checkboxColors;
        colorScheme2.m0(checkboxColors3);
        return checkboxColors3;
    }

    public final float c() {
        return f9384b;
    }
}
