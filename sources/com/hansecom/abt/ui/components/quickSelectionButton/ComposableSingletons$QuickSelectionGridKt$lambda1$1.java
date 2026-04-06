package com.hansecom.abt.ui.components.quickSelectionButton;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionGridKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$QuickSelectionGridKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$QuickSelectionGridKt$lambda1$1 f38754z = new ComposableSingletons$QuickSelectionGridKt$lambda1$1();

    public static final String g(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final void h(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    public static final Unit i(MutableState mutableState, String str) {
        Intrinsics.i(str, "it");
        h(mutableState, str);
        return Unit.f40552a;
    }

    public static final Unit k(MutableState mutableState, String str) {
        Intrinsics.i(str, "it");
        h(mutableState, str);
        return Unit.f40552a;
    }

    public static final Unit p(MutableState mutableState, String str) {
        Intrinsics.i(str, "it");
        h(mutableState, str);
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1745051451, i3, -1, "com.hansecom.abt.ui.components.quickSelectionButton.ComposableSingletons$QuickSelectionGridKt.lambda-1.<anonymous> (QuickSelectionGrid.kt:94)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            float f2 = (float) 32;
            Modifier i4 = PaddingKt.i(SizeKt.f(companion, 0.0f, 1, (Object) null), Dp.m(f2));
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
            composer2.X(255656060);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e("10", (SnapshotMutationPolicy) null, 2, (Object) null);
                composer2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            composer.M();
            List p2 = CollectionsKt.p("5", "10", "32");
            List p3 = CollectionsKt.p("5", "10", "32", "35");
            List p4 = CollectionsKt.p("5", "10", "32", "35", "23");
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            String g3 = g(mutableState);
            PersistentList e3 = ExtensionsKt.e(p2);
            composer2.X(255671403);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new b(mutableState);
                composer2.N(g4);
            }
            composer.M();
            QuickSelectionGridKt.b(g3, e3, (Function1) g4, h2, false, composer, 3456, 16);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            String g5 = g(mutableState);
            PersistentList e4 = ExtensionsKt.e(p3);
            composer2.X(255680171);
            Object g6 = composer.g();
            if (g6 == companion3.a()) {
                g6 = new c(mutableState);
                composer2.N(g6);
            }
            composer.M();
            QuickSelectionGridKt.b(g5, e4, (Function1) g6, h3, false, composer, 3456, 16);
            Modifier h4 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            String g7 = g(mutableState);
            PersistentList e5 = ExtensionsKt.e(p4);
            composer2.X(255688939);
            Object g8 = composer.g();
            if (g8 == companion3.a()) {
                g8 = new d(mutableState);
                composer2.N(g8);
            }
            composer.M();
            QuickSelectionGridKt.b(g7, e5, (Function1) g8, h4, false, composer, 3456, 16);
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
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
