package com.hansecom.abt.presentation.screens.home.barcode.help;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
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
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.barcode.help.ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda1$1 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda1$1 f35869z = new ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda1$1();

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
                ComposerKt.Y(-1059443361, i3, -1, "com.hansecom.abt.presentation.screens.home.barcode.help.ComposableSingletons$BarcodeDisplayHelpScreenKt.lambda-1.<anonymous> (BarcodeDisplayHelpScreen.kt:53)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(ScrollKt.g(PaddingKt.h(SizeKt.f(companion, 0.0f, 1, (Object) null), paddingValues2), ScrollKt.c(0, composer2, 0, 1), false, (FlingBehavior) null, false, 14, (Object) null), Dimensions.f38856a.c(), 0.0f, 2, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.g(), composer2, 48);
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
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 32)), composer2, 6);
            IconKt.d(PainterResources_androidKt.c(R.drawable.h0, composer2, 0), (String) null, SizeKt.i(companion, Dp.m((float) 60)), 0, composer, 432, 8);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 40)), composer2, 6);
            ImageKt.a(PainterResources_androidKt.c(R.drawable.f33000b, composer2, 0), (String) null, AspectRatioKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), (Alignment) null, ContentScale.f17026a.d(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 24)), composer2, 6);
            TextKt.j(StringResources_androidKt.b(R.string.w9, composer2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(composer2, 6).l(), composer, 0, 0, 130046);
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
