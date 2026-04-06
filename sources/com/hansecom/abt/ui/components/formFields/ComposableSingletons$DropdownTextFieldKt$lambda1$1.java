package com.hansecom.abt.ui.components.formFields;

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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$DropdownTextFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$DropdownTextFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$DropdownTextFieldKt$lambda1$1 f38295z = new ComposableSingletons$DropdownTextFieldKt$lambda1$1();

    public static final Unit k() {
        return Unit.f40552a;
    }

    public static final Unit p() {
        return Unit.f40552a;
    }

    public static final Unit q() {
        return Unit.f40552a;
    }

    public static final Unit s() {
        return Unit.f40552a;
    }

    public static final Unit t() {
        return Unit.f40552a;
    }

    public static final Unit u() {
        return Unit.f40552a;
    }

    public final void i(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1620465743, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$DropdownTextFieldKt.lambda-1.<anonymous> (DropdownTextField.kt:53)");
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
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            composer2.X(-1291286286);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new C0655w();
                composer2.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer2.X(-1291285134);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new C0656x();
                composer2.N(g3);
            }
            composer.M();
            Modifier.Companion companion4 = companion;
            DropdownTextFieldKt.c("", "Label", function0, h2, false, (String) null, (String) null, (Painter) null, (Painter) null, (Function0) null, (Function0) g3, composer, 3510, 6, 1008);
            Modifier h3 = SizeKt.h(companion4, 0.0f, 1, (Object) null);
            Modifier.Companion companion5 = companion4;
            Composer composer3 = composer;
            composer3.X(-1291278926);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new C0657y();
                composer3.N(g4);
            }
            Function0 function02 = (Function0) g4;
            composer.M();
            composer3.X(-1291277774);
            Object g5 = composer.g();
            if (g5 == companion3.a()) {
                g5 = new C0658z();
                composer3.N(g5);
            }
            composer.M();
            DropdownTextFieldKt.c("Value", "Label", function02, h3, false, (String) null, (String) null, (Painter) null, (Painter) null, (Function0) null, (Function0) g5, composer, 3510, 6, 1008);
            Modifier h4 = SizeKt.h(companion5, 0.0f, 1, (Object) null);
            Composer composer4 = composer;
            composer4.X(-1291270510);
            Object g6 = composer.g();
            if (g6 == companion3.a()) {
                g6 = new A();
                composer4.N(g6);
            }
            Function0 function03 = (Function0) g6;
            composer.M();
            composer4.X(-1291269358);
            Object g7 = composer.g();
            if (g7 == companion3.a()) {
                g7 = new B();
                composer4.N(g7);
            }
            composer.M();
            DropdownTextFieldKt.c("Value", "Label", function03, h4, false, (String) null, "Error", (Painter) null, (Painter) null, (Function0) null, (Function0) g7, composer, 1576374, 6, 944);
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
        i((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
