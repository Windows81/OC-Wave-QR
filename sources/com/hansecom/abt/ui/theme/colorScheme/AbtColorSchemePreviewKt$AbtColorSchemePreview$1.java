package com.hansecom.abt.ui.theme.colorScheme;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AbtColorSchemePreviewKt$AbtColorSchemePreview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbtColorScheme f38930z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1460311364, i3, -1, "com.hansecom.abt.ui.theme.colorScheme.AbtColorSchemePreview.<anonymous> (AbtColorSchemePreview.kt:26)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier b2 = BackgroundKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), Color.f15975b.g(), (Shape) null, 2, (Object) null);
            Arrangement arrangement = Arrangement.f3739a;
            float f2 = (float) 8;
            Arrangement.HorizontalOrVertical n2 = arrangement.n(Dp.m(f2));
            AbtColorScheme abtColorScheme = this.f38930z;
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy b3 = RowKt.b(n2, companion2.l(), composer2, 6);
            int a2 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, b2);
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
            Composer b4 = Updater.b(composer);
            Updater.g(b4, b3, companion3.c());
            Updater.g(b4, I, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                b4.N(Integer.valueOf(a2));
                b4.A(Integer.valueOf(a2), b5);
            }
            Updater.g(b4, e2, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            Modifier c2 = RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null);
            MeasurePolicy a4 = ColumnKt.a(arrangement.n(Dp.m(f2)), companion2.k(), composer2, 6);
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
            Composer b6 = Updater.b(composer);
            Updater.g(b6, a4, companion3.c());
            Updater.g(b6, I2, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a5))) {
                b6.N(Integer.valueOf(a5));
                b6.A(Integer.valueOf(a5), b7);
            }
            Updater.g(b6, e3, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            AbtColorScheme abtColorScheme2 = abtColorScheme;
            AbtColorSchemePreviewKt.b("surface/onSurface/onSurfaceLight", abtColorScheme.z(), new Object[]{Color.h(abtColorScheme.q()), Color.h(abtColorScheme.r())}, composer, 6);
            Composer composer3 = composer;
            AbtColorSchemePreviewKt.b("surfaceContainer/onSurface/onSurfaceLight", abtColorScheme2.A(), new Object[]{Color.h(abtColorScheme2.q()), Color.h(abtColorScheme2.r())}, composer3, 6);
            AbtColorSchemePreviewKt.b("outline", abtColorScheme2.u(), new Object[0], composer3, 6);
            AbtColorSchemePreviewKt.b("disabled", abtColorScheme2.a(), new Object[0], composer3, 6);
            AbtColorSchemePreviewKt.b("primary/onPrimary", abtColorScheme2.x(), new Object[]{Color.h(abtColorScheme2.o())}, composer, 6);
            Composer composer4 = composer;
            AbtColorSchemePreviewKt.b("secondary/onSecondary", abtColorScheme2.y(), new Object[]{Color.h(abtColorScheme2.p())}, composer4, 6);
            AbtColorSchemePreviewKt.b("onCard", abtColorScheme2.g(), new Object[0], composer4, 6);
            composer.T();
            Modifier c3 = RowScope.c(rowScopeInstance, companion, 1.0f, false, 2, (Object) null);
            MeasurePolicy a7 = ColumnKt.a(arrangement.n(Dp.m(f2)), companion2.k(), composer2, 6);
            int a8 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, c3);
            Function0 a9 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a9);
            } else {
                composer.K();
            }
            Composer b8 = Updater.b(composer);
            Updater.g(b8, a7, companion3.c());
            Updater.g(b8, I3, companion3.e());
            Function2 b9 = companion3.b();
            if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a8))) {
                b8.N(Integer.valueOf(a8));
                b8.A(Integer.valueOf(a8), b9);
            }
            Updater.g(b8, e4, companion3.d());
            AbtColorSchemePreviewKt.b("error/onError", abtColorScheme2.b(), new Object[]{Color.h(abtColorScheme2.h())}, composer, 6);
            AbtColorSchemePreviewKt.b("errorContainer/onErrorContainer", abtColorScheme2.c(), new Object[]{Color.h(abtColorScheme2.i())}, composer, 6);
            AbtColorSchemePreviewKt.b("positive/onPositive", abtColorScheme2.v(), new Object[]{Color.h(abtColorScheme2.m())}, composer, 6);
            AbtColorSchemePreviewKt.b("positiveContainer/onPositiveContainer", abtColorScheme2.w(), new Object[]{Color.h(abtColorScheme2.n())}, composer, 6);
            AbtColorSchemePreviewKt.b("warning/onWarning", abtColorScheme2.B(), new Object[]{Color.h(abtColorScheme2.s())}, composer, 6);
            AbtColorSchemePreviewKt.b("warningContainer/onWarningContainer", abtColorScheme2.C(), new Object[]{Color.h(abtColorScheme2.t())}, composer, 6);
            AbtColorSchemePreviewKt.b("info/onInfo", abtColorScheme2.d(), new Object[]{Color.h(abtColorScheme2.j())}, composer, 6);
            AbtColorSchemePreviewKt.b("infoContainer/onInfoContainer", abtColorScheme2.e(), new Object[]{Color.h(abtColorScheme2.k())}, composer, 6);
            AbtColorSchemePreviewKt.b("neutralContainer/onNeutralContainer", abtColorScheme2.f(), new Object[]{Color.h(abtColorScheme2.l())}, composer, 6);
            composer.T();
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
