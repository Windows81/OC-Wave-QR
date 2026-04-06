package com.hansecom.abt.ui.components.institution;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.model.InstitutionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.institution.ComposableSingletons$InstitutionDetailsCardKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$InstitutionDetailsCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$InstitutionDetailsCardKt$lambda1$1 f38435z = new ComposableSingletons$InstitutionDetailsCardKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-666649576, i3, -1, "com.hansecom.abt.ui.components.institution.ComposableSingletons$InstitutionDetailsCardKt.lambda-1.<anonymous> (InstitutionDetailsCard.kt:80)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 16;
            Modifier i4 = PaddingKt.i(companion, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.n(Dp.m(f2)), Alignment.f15444a.k(), composer2, 6);
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
            Composer composer3 = composer;
            InstitutionDetailsCardKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), new InstitutionState(0, "Name", "Type", (String) null, (String) null, 24, (DefaultConstructorMarker) null), false, composer3, 390, 0);
            InstitutionDetailsCardKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), new InstitutionState(0, "Name", "Type", (String) null, (String) null, 24, (DefaultConstructorMarker) null), true, composer3, 390, 0);
            composer.T();
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
