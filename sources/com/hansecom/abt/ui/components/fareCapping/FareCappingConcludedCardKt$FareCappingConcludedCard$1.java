package com.hansecom.abt.ui.components.fareCapping;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.DateTimeFormaterKt;
import com.hansecom.abt.util.resourcesResolvers.StyledStringResourceKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareCappingConcludedCardKt$FareCappingConcludedCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCappingCardState.Concluded f38181z;

    public FareCappingConcludedCardKt$FareCappingConcludedCard$1(FareCappingCardState.Concluded concluded) {
        this.f38181z = concluded;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$Card");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1074052902, i3, -1, "com.hansecom.abt.ui.components.fareCapping.FareCappingConcludedCard.<anonymous> (FareCappingConcludedCard.kt:43)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier j2 = PaddingKt.j(SizeKt.h(companion, 0.0f, 1, (Object) null), Dp.m((float) 12), Dp.m((float) 24));
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i4 = companion2.i();
            FareCappingCardState.Concluded concluded = this.f38181z;
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.f(), i4, composer2, 48);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, j2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a3);
            } else {
                composer.K();
            }
            Composer b3 = Updater.b(composer);
            Updater.g(b3, b2, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Modifier t2 = SizeKt.t(companion, Dp.m((float) 48));
            AbtTheme abtTheme = AbtTheme.f38851a;
            Modifier a4 = BackgroundKt.a(t2, abtTheme.b(composer2, 6).z(), RoundedCornerShapeKt.f());
            MeasurePolicy g2 = BoxKt.g(companion2.e(), false);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, a4);
            Function0 a6 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a6);
            } else {
                composer.K();
            }
            Composer b5 = Updater.b(composer);
            Updater.g(b5, g2, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            IconKt.d(PainterResources_androidKt.c(concluded.b(), composer2, 0), (String) null, SizeKt.t(companion, Dp.m((float) 32)), abtTheme.b(composer2, 6).x(), composer, 432, 0);
            composer.T();
            SpacerKt.a(SizeKt.y(companion, Dp.m((float) 16)), composer2, 6);
            TextKt.k(StyledStringResourceKt.g(concluded.c(), new Object[]{DateTimeFormaterKt.b(concluded.a(), composer2, 0)}, composer2, 0), (Modifier) null, abtTheme.b(composer2, 6).o(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Map) null, (Function1) null, abtTheme.d(composer2, 6).a(), composer, 0, 0, 262138);
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
