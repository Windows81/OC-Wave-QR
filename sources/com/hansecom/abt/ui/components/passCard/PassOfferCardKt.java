package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PassOfferCardKt {
    public static final void e(PassOfferCardState passOfferCardState, Modifier modifier, String str, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(passOfferCardState, "state");
        Intrinsics.i(str, "buttonLabel");
        Intrinsics.i(function0, "onClick");
        Composer q2 = composer.q(-1314695899);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(passOfferCardState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(str) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.l(function0) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1314695899, i4, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCard (PassOfferCard.kt:40)");
            }
            PassCardStatusKt.m(modifier, ComposableLambdaKt.e(-867004359, true, new PassOfferCardKt$PassOfferCard$1(passOfferCardState, function0, str), q2, 54), q2, ((i4 >> 3) & 14) | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new E(passOfferCardState, modifier2, str, function0, i2, i3));
        }
    }

    public static final Unit f(PassOfferCardState passOfferCardState, Modifier modifier, String str, Function0 function0, int i2, int i3, Composer composer, int i4) {
        e(passOfferCardState, modifier, str, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void g(String str, String str2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str3 = str;
        String str4 = str2;
        int i4 = i2;
        Intrinsics.i(str3, "description");
        Composer q2 = composer.q(-510633239);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(str4) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-510633239, i3, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCardDescription (PassOfferCard.kt:123)");
            }
            String str5 = null;
            String str6 = str.length() > 0 ? str3 : null;
            q2.X(1747354560);
            if (str4 != null) {
                str5 = StringResources_androidKt.c(R.string.i7, new Object[]{StringExtKt.b(str2)}, q2, 0);
            }
            q2.M();
            String n0 = CollectionsKt.n0(CollectionsKt.r(str6, str5), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            AbtTheme abtTheme = AbtTheme.f38851a;
            TextStyle b2 = abtTheme.d(q2, 6).b();
            long q3 = abtTheme.b(q2, 6).q();
            composer2 = q2;
            TextKt.j(n0, (Modifier) null, q3, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, b2, composer2, 0, 0, 131066);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new G(str3, str4, i4));
        }
    }

    public static final Unit h(String str, String str2, int i2, Composer composer, int i3) {
        g(str, str2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void i(PassOfferCardState passOfferCardState, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(passOfferCardState, "state");
        Composer q2 = composer.q(-450998787);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(passOfferCardState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-450998787, i4, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCardSmall (PassOfferCard.kt:68)");
            }
            PassCardStatusKt.m(modifier, ComposableLambdaKt.e(824084241, true, new PassOfferCardKt$PassOfferCardSmall$1(passOfferCardState), q2, 54), q2, ((i4 >> 3) & 14) | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new H(passOfferCardState, modifier, i2, i3));
        }
    }

    public static final Unit j(PassOfferCardState passOfferCardState, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        i(passOfferCardState, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void k(String str, BigDecimal bigDecimal, boolean z2, Composer composer, int i2) {
        int i3;
        BigDecimal bigDecimal2;
        Composer composer2;
        boolean z3;
        String c2;
        String str2 = str;
        BigDecimal bigDecimal3 = bigDecimal;
        boolean z4 = z2;
        int i4 = i2;
        Intrinsics.i(str2, "title");
        Intrinsics.i(bigDecimal3, "price");
        Composer q2 = composer.q(1134003665);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(bigDecimal3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z4) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1134003665, i5, -1, "com.hansecom.abt.ui.components.passCard.PassOfferCardTitle (PassOfferCard.kt:83)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i6 = companion2.i();
            Arrangement arrangement = Arrangement.f3739a;
            MeasurePolicy b2 = RowKt.b(arrangement.f(), i6, q2, 48);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Modifier t2 = SizeKt.t(companion, Dp.m((float) 40));
            AbtTheme abtTheme = AbtTheme.f38851a;
            SurfaceKt.c(t2, RoundedCornerShapeKt.f(), abtTheme.b(q2, 6).v(), 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(710109136, true, new PassOfferCardKt$PassOfferCardTitle$1$1(rowScopeInstance), q2, 54), q2, 12582918, 120);
            SpacerKt.a(SizeKt.y(companion, Dp.m((float) 16)), q2, 6);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a4 = ColumnKt.a(arrangement.b(), companion2.k(), q2, 6);
            int a5 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, h3);
            Function0 a6 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a6);
            } else {
                q2.K();
            }
            Composer b5 = Updater.b(q2);
            Updater.g(b5, a4, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Modifier.Companion companion4 = companion;
            AbtTheme abtTheme2 = abtTheme;
            Composer composer3 = q2;
            TextKt.j(str, (Modifier) null, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).m(), composer3, i5 & 14, 0, 131066);
            composer2 = composer3;
            composer2.X(-2146159652);
            z3 = z2;
            if (z3) {
                c2 = StringResources_androidKt.b(R.string.J, composer2, 0);
                BigDecimal bigDecimal4 = bigDecimal;
            } else {
                c2 = CurrencyValueFormater.c(CurrencyValueFormater.f39045a, bigDecimal, false, 2, (Object) null);
            }
            String str3 = c2;
            composer2.M();
            AbtTheme abtTheme3 = abtTheme2;
            bigDecimal2 = bigDecimal;
            TextKt.j(str3, PaddingKt.m(companion4, 0.0f, Dp.m((float) 4), 0.0f, 0.0f, 13, (Object) null), abtTheme3.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer2, 6).a(), composer2, 48, 0, 131064);
            composer2.T();
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
            bigDecimal2 = bigDecimal3;
            z3 = z4;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new F(str, bigDecimal2, z3, i2));
        }
    }

    public static final Unit l(String str, BigDecimal bigDecimal, boolean z2, int i2, Composer composer, int i3) {
        k(str, bigDecimal, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
