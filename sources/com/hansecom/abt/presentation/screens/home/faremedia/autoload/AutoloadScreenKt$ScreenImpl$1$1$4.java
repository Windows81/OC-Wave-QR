package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AutoloadScreenKt$ScreenImpl$1$1$4 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36237z;

    public AutoloadScreenKt$ScreenImpl$1$1$4(Autoload.State state) {
        this.f36237z = state;
    }

    public final void b(Composer composer, int i2) {
        int i3;
        Composer composer2 = composer;
        int i4 = i2;
        if ((i4 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(975180020, i4, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.ScreenImpl.<anonymous>.<anonymous>.<anonymous> (AutoloadScreen.kt:161)");
            }
            int i5 = R.string.I0;
            CurrencyValueFormater currencyValueFormater = CurrencyValueFormater.f39045a;
            AnnotatedString c2 = StyledStringResourceKt.c(i5, new Object[]{CurrencyValueFormater.d(currencyValueFormater, this.f36237z.c().c().toString(), false, 2, (Object) null), CurrencyValueFormater.d(currencyValueFormater, this.f36237z.c().e().toString(), false, 2, (Object) null)}, composer2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = composer;
            AbtTextKt.c(c2, (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).b(), composer3, 0, 0, 65534);
            Modifier.Companion companion = Modifier.f15489d;
            Composer composer4 = composer;
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 32)), composer4, 6);
            AbtTextKt.c(StringResourceKt.a(R.string.R0, new Object[0], composer4, 0), (Modifier) null, 0, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer4, 6).f(), composer3, 0, 0, 65534);
            float f2 = (float) 16;
            Modifier.Companion companion2 = companion;
            Composer composer5 = composer;
            SpacerKt.a(SizeKt.i(companion2, Dp.m(f2)), composer5, 6);
            composer5.X(-784591584);
            if (this.f36237z.c().g() != null) {
                i3 = 0;
                AutoloadScreenKt.q(StringResourceKt.a(R.string.S0, new Object[0], composer5, 0), this.f36237z.c().g(), composer5, 0);
            } else {
                i3 = 0;
            }
            composer.M();
            if (this.f36237z.c().d() != null) {
                SpacerKt.a(SizeKt.i(companion2, Dp.m(f2)), composer5, 6);
                AutoloadScreenKt.q(StringResourceKt.a(R.string.Q0, new Object[i3], composer5, i3), this.f36237z.c().d(), composer5, i3);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
