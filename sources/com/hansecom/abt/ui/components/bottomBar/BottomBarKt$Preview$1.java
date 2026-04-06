package com.hansecom.abt.ui.components.bottomBar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
final class BottomBarKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PersistentList f38000z;

    public static final Unit h(int i2) {
        return Unit.f40552a;
    }

    public static final Unit i() {
        return Unit.f40552a;
    }

    public static final Unit k(int i2) {
        return Unit.f40552a;
    }

    public static final Unit p() {
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-966357404, i3, -1, "com.hansecom.abt.ui.components.bottomBar.Preview.<anonymous> (BottomBar.kt:211)");
            }
            PersistentList persistentList = this.f38000z;
            Modifier.Companion companion = Modifier.f15489d;
            Arrangement.Vertical g2 = Arrangement.f3739a.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
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
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            float f2 = (float) 150;
            Modifier i4 = SizeKt.i(companion, Dp.m(f2));
            MeasurePolicy g3 = BoxKt.g(companion2.b(), false);
            int a5 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I2 = composer.I();
            Modifier e3 = ComposedModifierKt.e(composer2, i4);
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
            Composer b4 = Updater.b(composer);
            Updater.g(b4, g3, companion3.c());
            Updater.g(b4, I2, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a5))) {
                b4.N(Integer.valueOf(a5));
                b4.A(Integer.valueOf(a5), b5);
            }
            Updater.g(b4, e3, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            composer2.X(-2077211359);
            Object g4 = composer.g();
            Composer.Companion companion4 = Composer.f14567a;
            if (g4 == companion4.a()) {
                g4 = new e();
                composer2.N(g4);
            }
            Function1 function1 = (Function1) g4;
            composer.M();
            composer2.X(-2077207167);
            Object g5 = composer.g();
            if (g5 == companion4.a()) {
                g5 = new f();
                composer2.N(g5);
            }
            composer.M();
            BottomBarKt.c(0, persistentList, function1, true, true, (Function0) g5, (Modifier) null, composer, 224646, 64);
            composer.T();
            Modifier i5 = SizeKt.i(companion, Dp.m(f2));
            MeasurePolicy g6 = BoxKt.g(companion2.b(), false);
            int a7 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I3 = composer.I();
            Modifier e4 = ComposedModifierKt.e(composer2, i5);
            Function0 a8 = companion3.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a8);
            } else {
                composer.K();
            }
            Composer b6 = Updater.b(composer);
            Updater.g(b6, g6, companion3.c());
            Updater.g(b6, I3, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a7))) {
                b6.N(Integer.valueOf(a7));
                b6.A(Integer.valueOf(a7), b7);
            }
            Updater.g(b6, e4, companion3.d());
            composer2.X(-2077197055);
            Object g7 = composer.g();
            if (g7 == companion4.a()) {
                g7 = new g();
                composer2.N(g7);
            }
            Function1 function12 = (Function1) g7;
            composer.M();
            composer2.X(-2077192799);
            Object g8 = composer.g();
            if (g8 == companion4.a()) {
                g8 = new h();
                composer2.N(g8);
            }
            composer.M();
            BottomBarKt.c(0, persistentList, function12, false, false, (Function0) g8, (Modifier) null, composer, 224646, 64);
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
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
