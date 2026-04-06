package com.hansecom.abt.ui.components.formFields;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$SwitchFieldKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$SwitchFieldKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$SwitchFieldKt$lambda2$1 f38307z = new ComposableSingletons$SwitchFieldKt$lambda2$1();

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
                ComposerKt.Y(-2099321521, i2, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$SwitchFieldKt.lambda-2.<anonymous> (SwitchField.kt:110)");
            }
            Modifier i3 = PaddingKt.i(Modifier.f15489d, Dp.m((float) 16));
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer, 0);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, i3);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer.X(874351593);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new H();
                composer.N(g2);
            }
            composer.M();
            SwitchFieldKt.c("option", true, (Function1) g2, (Modifier) null, false, composer, 438, 24);
            composer.X(874354057);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new I();
                composer.N(g3);
            }
            composer.M();
            SwitchFieldKt.c("option", true, (Function1) g3, (Modifier) null, false, composer, 25014, 8);
            composer.X(874355497);
            Object g4 = composer.g();
            if (g4 == companion2.a()) {
                g4 = new J();
                composer.N(g4);
            }
            composer.M();
            SwitchFieldKt.c("option", false, (Function1) g4, (Modifier) null, false, composer, 438, 24);
            composer.X(874357993);
            Object g5 = composer.g();
            if (g5 == companion2.a()) {
                g5 = new K();
                composer.N(g5);
            }
            composer.M();
            SwitchFieldKt.c("option", false, (Function1) g5, (Modifier) null, false, composer, 25014, 8);
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
