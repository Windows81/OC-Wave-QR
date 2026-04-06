package com.hansecom.abt.ui.components.passCard;

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
import com.hansecom.abt.ui.SampleStates;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.passCard.ComposableSingletons$GroupPassOfferCardKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$GroupPassOfferCardKt$lambda3$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GroupPassOfferCardKt$lambda3$1 f38592z = new ComposableSingletons$GroupPassOfferCardKt$lambda3$1();

    public static final Unit A() {
        return Unit.f40552a;
    }

    public static final Unit B() {
        return Unit.f40552a;
    }

    public static final Unit C() {
        return Unit.f40552a;
    }

    public static final Unit D() {
        return Unit.f40552a;
    }

    public static final Unit E() {
        return Unit.f40552a;
    }

    public static final Unit F() {
        return Unit.f40552a;
    }

    public static final Unit G() {
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

    public static final Unit z() {
        return Unit.f40552a;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        u((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }

    public final void u(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(216068227, i3, -1, "com.hansecom.abt.ui.components.passCard.ComposableSingletons$GroupPassOfferCardKt.lambda-3.<anonymous> (GroupPassOfferCard.kt:221)");
            }
            float f2 = (float) 16;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Modifier i4 = PaddingKt.i(Modifier.f15489d, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            SampleStates sampleStates = SampleStates.f37859a;
            PassOfferCardState g2 = sampleStates.g();
            composer2.X(708623828);
            Object g3 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g3 == companion2.a()) {
                g3 = new C0660a();
                composer2.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer2.X(708624916);
            Object g4 = composer.g();
            if (g4 == companion2.a()) {
                g4 = new C0665f();
                composer2.N(g4);
            }
            Function0 function02 = (Function0) g4;
            composer.M();
            composer2.X(708626068);
            Object g5 = composer.g();
            if (g5 == companion2.a()) {
                g5 = new C0666g();
                composer2.N(g5);
            }
            composer.M();
            GroupPassOfferCardKt.e(g2, (Modifier) null, "Add pass", function0, function02, (Function0) g5, composer, 224640, 2);
            PassOfferCardState e3 = sampleStates.e();
            composer2.X(708632148);
            Object g6 = composer.g();
            if (g6 == companion2.a()) {
                g6 = new C0667h();
                composer2.N(g6);
            }
            Function0 function03 = (Function0) g6;
            composer.M();
            composer2.X(708633236);
            Object g7 = composer.g();
            if (g7 == companion2.a()) {
                g7 = new i();
                composer2.N(g7);
            }
            Function0 function04 = (Function0) g7;
            composer.M();
            composer2.X(708634388);
            Object g8 = composer.g();
            if (g8 == companion2.a()) {
                g8 = new j();
                composer2.N(g8);
            }
            composer.M();
            GroupPassOfferCardKt.e(e3, (Modifier) null, "Add pass", function03, function04, (Function0) g8, composer, 224640, 2);
            PassOfferCardState b4 = PassOfferCardState.b(sampleStates.g(), 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, false, sampleStates.g().g(), 0, 0, 895, (Object) null);
            composer2.X(708643764);
            Object g9 = composer.g();
            if (g9 == companion2.a()) {
                g9 = new k();
                composer2.N(g9);
            }
            Function0 function05 = (Function0) g9;
            composer.M();
            composer2.X(708644852);
            Object g10 = composer.g();
            if (g10 == companion2.a()) {
                g10 = new l();
                composer2.N(g10);
            }
            Function0 function06 = (Function0) g10;
            composer.M();
            composer2.X(708646004);
            Object g11 = composer.g();
            if (g11 == companion2.a()) {
                g11 = new C0661b();
                composer2.N(g11);
            }
            composer.M();
            GroupPassOfferCardKt.e(b4, (Modifier) null, "Add pass", function05, function06, (Function0) g11, composer, 224640, 2);
            PassOfferCardState b5 = PassOfferCardState.b(sampleStates.g(), 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, false, sampleStates.g().f(), 0, 0, 895, (Object) null);
            composer2.X(708655380);
            Object g12 = composer.g();
            if (g12 == companion2.a()) {
                g12 = new C0662c();
                composer2.N(g12);
            }
            Function0 function07 = (Function0) g12;
            composer.M();
            composer2.X(708656468);
            Object g13 = composer.g();
            if (g13 == companion2.a()) {
                g13 = new C0663d();
                composer2.N(g13);
            }
            Function0 function08 = (Function0) g13;
            composer.M();
            composer2.X(708657620);
            Object g14 = composer.g();
            if (g14 == companion2.a()) {
                g14 = new C0664e();
                composer2.N(g14);
            }
            composer.M();
            GroupPassOfferCardKt.e(b5, (Modifier) null, "Add pass", function07, function08, (Function0) g14, composer, 224640, 2);
            GroupPassOfferCardKt.g(sampleStates.g(), (Modifier) null, composer2, 0, 2);
            GroupPassOfferCardKt.g(sampleStates.e(), (Modifier) null, composer2, 0, 2);
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
