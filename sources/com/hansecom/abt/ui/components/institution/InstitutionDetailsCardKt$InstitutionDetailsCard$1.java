package com.hansecom.abt.ui.components.institution;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.DividerKt;
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
public final class InstitutionDetailsCardKt$InstitutionDetailsCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f38437A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionState f38438z;

    public InstitutionDetailsCardKt$InstitutionDetailsCard$1(InstitutionState institutionState, boolean z2) {
        this.f38438z = institutionState;
        this.f38437A = z2;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$Card");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-338233752, i3, -1, "com.hansecom.abt.ui.components.institution.InstitutionDetailsCard.<anonymous> (InstitutionDetailsCard.kt:38)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier j2 = PaddingKt.j(companion, Dp.m((float) 19), Dp.m((float) 32));
            InstitutionState institutionState = this.f38438z;
            boolean z2 = this.f38437A;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, j2);
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
            String d2 = institutionState.d();
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            InstitutionState institutionState2 = institutionState;
            boolean z3 = z2;
            TextKt.j(d2, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).a(), composer, 0, 0, 131070);
            Modifier.Companion companion3 = companion;
            Composer composer3 = composer;
            SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 4)), composer3, 6);
            int i4 = R.string.D6;
            String c2 = institutionState2.c();
            String str = "";
            if (c2 == null) {
                c2 = str;
            }
            AbtTheme abtTheme3 = abtTheme2;
            AbtTheme abtTheme4 = abtTheme3;
            Modifier.Companion companion4 = companion3;
            TextKt.j(StringResources_androidKt.c(i4, new Object[]{c2}, composer3, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer3, 6).b(), composer, 0, 0, 131070);
            Composer composer4 = composer;
            composer4.X(-1375426405);
            if (z3) {
                float f2 = (float) 16;
                Modifier.Companion companion5 = companion4;
                SpacerKt.a(SizeKt.i(companion5, Dp.m(f2)), composer4, 6);
                DividerKt.e((Modifier) null, 0.0f, 0, composer, 0, 7);
                SpacerKt.a(SizeKt.i(companion5, Dp.m(f2)), composer4, 6);
                String b4 = institutionState2.b();
                if (b4 == null) {
                    b4 = str;
                }
                AbtTheme abtTheme5 = abtTheme4;
                AbtTheme abtTheme6 = abtTheme5;
                TextKt.j(b4, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme5.d(composer4, 6).b(), composer, 0, 0, 131070);
                Composer composer5 = composer;
                SpacerKt.a(SizeKt.i(companion5, Dp.m((float) 8)), composer5, 6);
                int i5 = R.string.C6;
                String e3 = institutionState2.e();
                if (e3 != null) {
                    str = e3;
                }
                TextKt.j(StringResources_androidKt.c(i5, new Object[]{str}, composer5, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme6.d(composer5, 6).b(), composer, 0, 0, 131070);
            }
            composer.M();
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
