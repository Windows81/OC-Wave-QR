package com.hansecom.abt.ui.components.coupon;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
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
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$CouponFieldKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CouponFieldKt$lambda2$1 f38115z = new ComposableSingletons$CouponFieldKt$lambda2$1();

    public static final Unit A() {
        return Unit.f40552a;
    }

    public static final Unit s(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit t() {
        return Unit.f40552a;
    }

    public static final Unit u(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public static final Unit v() {
        return Unit.f40552a;
    }

    public static final Unit w() {
        return Unit.f40552a;
    }

    public static final Unit x() {
        return Unit.f40552a;
    }

    public static final Unit y() {
        return Unit.f40552a;
    }

    public static final Unit z(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        q((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }

    public final void q(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1105454939, i3, -1, "com.hansecom.abt.ui.components.coupon.ComposableSingletons$CouponFieldKt.lambda-2.<anonymous> (CouponField.kt:132)");
            }
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 16));
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, companion);
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
            composer2.X(1151112580);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new a();
                composer2.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer2.X(1151113668);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new b();
                composer2.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer2.X(1151114756);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new c();
                composer2.N(g4);
            }
            composer.M();
            CouponFieldKt.b("12345", "Apply", false, function1, function0, (Function0) g4, (Modifier) null, "Hint", "", (AbtButtonState) null, 0, (KeyboardActions) null, composer, 113470902, 0, 3648);
            Composer composer3 = composer;
            composer3.X(1151123716);
            Object g5 = composer.g();
            if (g5 == companion3.a()) {
                g5 = new d();
                composer3.N(g5);
            }
            Function1 function12 = (Function1) g5;
            composer.M();
            composer3.X(1151124804);
            Object g6 = composer.g();
            if (g6 == companion3.a()) {
                g6 = new e();
                composer3.N(g6);
            }
            Function0 function02 = (Function0) g6;
            composer.M();
            composer3.X(1151125892);
            Object g7 = composer.g();
            if (g7 == companion3.a()) {
                g7 = new f();
                composer3.N(g7);
            }
            composer.M();
            CouponFieldKt.b("12345", "Apply", false, function12, function02, (Function0) g7, (Modifier) null, "Hint", "Error", (AbtButtonState) null, 0, (KeyboardActions) null, composer, 113470902, 0, 3648);
            Composer composer4 = composer;
            composer4.X(1151133540);
            Object g8 = composer.g();
            if (g8 == companion3.a()) {
                g8 = new g();
                composer4.N(g8);
            }
            Function1 function13 = (Function1) g8;
            composer.M();
            composer4.X(1151134628);
            Object g9 = composer.g();
            if (g9 == companion3.a()) {
                g9 = new h();
                composer4.N(g9);
            }
            Function0 function03 = (Function0) g9;
            composer.M();
            composer4.X(1151135716);
            Object g10 = composer.g();
            if (g10 == companion3.a()) {
                g10 = new i();
                composer4.N(g10);
            }
            composer.M();
            CouponFieldKt.b("12345", "Apply", true, function13, function03, (Function0) g10, (Modifier) null, (String) null, "", (AbtButtonState) null, 0, (KeyboardActions) null, composer, 100887990, 0, 3776);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }
}
