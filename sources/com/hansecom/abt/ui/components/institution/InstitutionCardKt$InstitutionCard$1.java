package com.hansecom.abt.ui.components.institution;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InstitutionCardKt$InstitutionCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionState f38436z;

    public InstitutionCardKt$InstitutionCard$1(InstitutionState institutionState) {
        this.f38436z = institutionState;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$Card");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1381000915, i3, -1, "com.hansecom.abt.ui.components.institution.InstitutionCard.<anonymous> (InstitutionCard.kt:41)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier j2 = PaddingKt.j(companion, Dp.m((float) 19), Dp.m((float) 32));
            Alignment.Companion companion2 = Alignment.f15444a;
            Alignment.Vertical i4 = companion2.i();
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.HorizontalOrVertical n2 = arrangement.n(Dp.m((float) 8));
            InstitutionState institutionState = this.f38436z;
            MeasurePolicy b2 = RowKt.b(n2, i4, composer2, 54);
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
            Modifier c2 = RowScope.c(RowScopeInstance.f4150a, companion, 1.0f, false, 2, (Object) null);
            MeasurePolicy a4 = ColumnKt.a(arrangement.g(), companion2.k(), composer2, 0);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, c2);
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
            Updater.g(b5, a4, companion3.c());
            Updater.g(b5, I2, companion3.e());
            Function2 b6 = companion3.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            String d2 = institutionState.d();
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            TextKt.j(d2, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).a(), composer, 0, 0, 131070);
            Modifier.Companion companion4 = companion;
            Composer composer3 = composer;
            SpacerKt.a(SizeKt.i(companion4, Dp.m((float) 4)), composer3, 6);
            int i5 = R.string.D6;
            String c3 = institutionState.c();
            if (c3 == null) {
                c3 = "";
            }
            AbtTheme abtTheme3 = abtTheme2;
            TextKt.j(StringResources_androidKt.c(i5, new Object[]{c3}, composer3, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer3, 6).b(), composer, 0, 0, 131070);
            composer.T();
            Composer composer4 = composer;
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33014p, composer4, 0), (String) null, SizeKt.t(companion4, Dp.m((float) 24)), abtTheme3.b(composer4, 6).x(), composer, 432, 0);
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
