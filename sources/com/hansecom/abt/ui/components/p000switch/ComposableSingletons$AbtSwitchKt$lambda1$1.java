package com.hansecom.abt.ui.components.p000switch;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.switch.ComposableSingletons$AbtSwitchKt$lambda-1$1  reason: invalid class name and invalid package */
public final class ComposableSingletons$AbtSwitchKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtSwitchKt$lambda1$1 f38826z = new ComposableSingletons$AbtSwitchKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit h(boolean z2) {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i(boolean z2) {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit k(boolean z2) {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p(boolean z2) {
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1824051904, i2, -1, "com.hansecom.abt.ui.components.switch.ComposableSingletons$AbtSwitchKt.lambda-1.<anonymous> (AbtSwitch.kt:60)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
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
            composer.X(1259433471);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new b();
                composer.N(g2);
            }
            composer.M();
            AbtSwitchKt.b(true, (Function1) g2, (Modifier) null, true, composer, 3126, 4);
            composer.X(1259438623);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new c();
                composer.N(g3);
            }
            composer.M();
            AbtSwitchKt.b(false, (Function1) g3, (Modifier) null, true, composer, 3126, 4);
            composer.X(1259443775);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new d();
                composer.N(g4);
            }
            composer.M();
            AbtSwitchKt.b(true, (Function1) g4, (Modifier) null, false, composer, 3126, 4);
            composer.X(1259448959);
            Object g5 = composer.g();
            if (g5 == companion3.a()) {
                g5 = new e();
                composer.N(g5);
            }
            composer.M();
            AbtSwitchKt.b(false, (Function1) g5, (Modifier) null, false, composer, 3126, 4);
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
