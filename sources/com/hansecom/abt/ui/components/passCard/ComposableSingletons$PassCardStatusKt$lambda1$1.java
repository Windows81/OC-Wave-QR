package com.hansecom.abt.ui.components.passCard;

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
import com.hansecom.abt.ui.SampleStates;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.passCard.ComposableSingletons$PassCardStatusKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PassCardStatusKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PassCardStatusKt$lambda1$1 f38595z = new ComposableSingletons$PassCardStatusKt$lambda1$1();

    public static final Unit i(boolean z2) {
        return Unit.f40552a;
    }

    public static final Unit k(boolean z2) {
        return Unit.f40552a;
    }

    public static final Unit p(boolean z2) {
        return Unit.f40552a;
    }

    public static final Unit q(boolean z2) {
        return Unit.f40552a;
    }

    public static final Unit s(boolean z2) {
        return Unit.f40552a;
    }

    public final void h(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-213053108, i3, -1, "com.hansecom.abt.ui.components.passCard.ComposableSingletons$PassCardStatusKt.lambda-1.<anonymous> (PassCardStatus.kt:192)");
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
            SampleStates sampleStates = SampleStates.f37859a;
            PassCardState a5 = sampleStates.a();
            composer2.X(-1264315301);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new m();
                composer2.N(g2);
            }
            composer.M();
            PassCardStatusKt.k(a5, (Function1) g2, h2, composer, 432, 0);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            PassCardState b4 = PassCardState.b(sampleStates.a(), 0, (String) null, false, false, false, 3, (LocalDateTime) null, (LocalDateTime) null, 223, (Object) null);
            composer2.X(-1264308677);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new n();
                composer2.N(g3);
            }
            composer.M();
            PassCardStatusKt.k(b4, (Function1) g3, h3, composer, 432, 0);
            Modifier h4 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            PassCardState b5 = PassCardState.b(sampleStates.a(), 0, (String) null, false, true, false, 0, (LocalDateTime) null, (LocalDateTime) null, 247, (Object) null);
            composer2.X(-1264301637);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new o();
                composer2.N(g4);
            }
            composer.M();
            PassCardStatusKt.k(b5, (Function1) g4, h4, composer, 432, 0);
            Modifier h5 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            PassCardState b6 = PassCardState.b(sampleStates.a(), 0, (String) null, false, true, true, 0, (LocalDateTime) null, (LocalDateTime) null, 231, (Object) null);
            composer2.X(-1264293925);
            Object g5 = composer.g();
            if (g5 == companion3.a()) {
                g5 = new p();
                composer2.N(g5);
            }
            composer.M();
            PassCardStatusKt.k(b6, (Function1) g5, h5, composer, 432, 0);
            Modifier h6 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            PassCardState b7 = PassCardState.b(sampleStates.i(), 0, (String) null, false, true, true, 3, (LocalDateTime) null, (LocalDateTime) null, 199, (Object) null);
            composer2.X(-1264283141);
            Object g6 = composer.g();
            if (g6 == companion3.a()) {
                g6 = new q();
                composer2.N(g6);
            }
            composer.M();
            PassCardStatusKt.k(b7, (Function1) g6, h6, composer, 432, 0);
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
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
