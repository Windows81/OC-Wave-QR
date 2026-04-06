package com.hansecom.abt.presentation.screens.home.barcode;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplay;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeDisplayScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f35847A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BarcodeDisplay.State f35848z;

    public BarcodeDisplayScreenKt$ScreenImpl$3(BarcodeDisplay.State state, Function0 function0) {
        this.f35848z = state;
        this.f35847A = function0;
    }

    public final void b(PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        PaddingValues paddingValues2 = paddingValues;
        Composer composer2 = composer;
        Intrinsics.i(paddingValues2, "it");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer2.W(paddingValues2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-806391575, i3, -1, "com.hansecom.abt.presentation.screens.home.barcode.ScreenImpl.<anonymous> (BarcodeDisplayScreen.kt:94)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(ScrollKt.g(PaddingKt.h(SizeKt.f(companion, 0.0f, 1, (Object) null), paddingValues2), ScrollKt.c(0, composer2, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null), Dimensions.f38856a.c(), 0.0f, 2, (Object) null);
            Alignment.Horizontal g2 = Alignment.f15444a.g();
            Arrangement.HorizontalOrVertical b2 = Arrangement.f3739a.b();
            BarcodeDisplay.State state = this.f35848z;
            Function0 function0 = this.f35847A;
            MeasurePolicy a2 = ColumnKt.a(b2, g2, composer2, 54);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, k2);
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
            Composer b3 = Updater.b(composer);
            Updater.g(b3, a2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            float f2 = (float) 32;
            SpacerKt.a(SizeKt.i(companion, Dp.m(f2)), composer2, 6);
            float f3 = f2;
            BarcodeDisplay.State state2 = state;
            IconKt.d(PainterResources_androidKt.c(R.drawable.h0, composer2, 0), (String) null, SizeKt.i(companion, Dp.m((float) 60)), 0, composer, 432, 8);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 42)), composer2, 6);
            BarcodeDisplayScreenKt.d(state2, composer2, 0);
            SpacerKt.a(SizeKt.i(companion, Dp.m(f3)), composer2, 6);
            AbtButtonState abtButtonState = AbtButtonState.Enabled;
            BarcodeDisplay.State state3 = state2;
            AbtButtonKt.j(function0, SizeKt.h(companion, 0.0f, 1, (Object) null), AbtButtonStyle.f37880f.a(composer2, 6).d(composer2, 0), abtButtonState, StringResources_androidKt.b(R.string.z9, composer2, 0), Integer.valueOf(R.drawable.H), (AbtButtonIconPosition) null, composer, 3120, 64);
            SpacerKt.a(ColumnScope.c(columnScopeInstance, companion, 1.0f, false, 2, (Object) null), composer2, 0);
            SpacerKt.a(SizeKt.i(companion, Dp.m(f3)), composer2, 6);
            String d2 = state3.d();
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = composer;
            TextKt.j(d2, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).a(), composer3, 0, 0, 131070);
            Modifier.Companion companion3 = companion;
            Composer composer4 = composer;
            AbtTheme abtTheme2 = abtTheme;
            DividerKt.e(PaddingKt.j(companion3, Dp.m(f3), Dp.m((float) 8)), 0.0f, abtTheme2.b(composer4, 6).u(), composer, 0, 2);
            TextKt.j(StringResources_androidKt.c(R.string.y9, new Object[]{CurrencyValueFormater.c(CurrencyValueFormater.f39045a, state3.c(), false, 2, (Object) null)}, composer4, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme2.d(composer4, 6).a(), composer3, 0, 0, 131070);
            SpacerKt.a(SizeKt.i(companion3, Dp.m(f3)), composer, 6);
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
        b((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
