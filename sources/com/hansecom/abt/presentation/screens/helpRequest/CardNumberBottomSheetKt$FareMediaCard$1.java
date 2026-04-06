package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberBottomSheetKt$FareMediaCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f34794A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f34795z;

    public CardNumberBottomSheetKt$FareMediaCard$1(String str, String str2) {
        this.f34795z = str;
        this.f34794A = str2;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        int i3;
        String str;
        ColumnScope columnScope2 = columnScope;
        Composer composer2 = composer;
        Intrinsics.i(columnScope2, "$this$Card");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(columnScope2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-662992429, i3, -1, "com.hansecom.abt.presentation.screens.helpRequest.FareMediaCard.<anonymous> (CardNumberBottomSheet.kt:169)");
            }
            Arrangement arrangement = Arrangement.f3739a;
            float m2 = Dp.m((float) 8);
            Alignment.Companion companion = Alignment.f15444a;
            Arrangement.Vertical p2 = arrangement.p(m2, companion.i());
            Modifier i4 = PaddingKt.i(ColumnScope.c(columnScope, Modifier.f15489d, 1.0f, false, 2, (Object) null), Dp.m((float) 16));
            String str2 = this.f34795z;
            String str3 = this.f34794A;
            MeasurePolicy a2 = ColumnKt.a(p2, companion.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer2.X(212135617);
            if (str2.length() > 0) {
                AbtTheme abtTheme = AbtTheme.f38851a;
                str = str3;
                AbtTextKt.c(str2, (Modifier) null, abtTheme.b(composer2, 6).x(), 0, (FontStyle) null, FontWeight.f18746A.b(), (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).b(), composer, 196608, 0, 65498);
            } else {
                str = str3;
            }
            composer.M();
            AbtTheme abtTheme2 = AbtTheme.f38851a;
            Composer composer3 = composer;
            AbtTextKt.c(str, (Modifier) null, abtTheme2.b(composer3, 6).q(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme2.d(composer3, 6).b(), composer, 0, 0, 65530);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
