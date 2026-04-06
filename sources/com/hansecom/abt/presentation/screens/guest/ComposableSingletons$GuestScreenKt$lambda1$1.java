package com.hansecom.abt.presentation.screens.guest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.guest.Guest;
import com.hansecom.abt.ui.SampleStates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.guest.ComposableSingletons$GuestScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$GuestScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$GuestScreenKt$lambda1$1 f34686z = new ComposableSingletons$GuestScreenKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f40552a;
    }

    public static final Unit p(Guest.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit s() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit t(String str, String str2) {
        Intrinsics.i(str, "<unused var>");
        return Unit.f40552a;
    }

    public static final Unit u(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void i(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(85633577, i2, -1, "com.hansecom.abt.presentation.screens.guest.ComposableSingletons$GuestScreenKt.lambda-1.<anonymous> (GuestScreen.kt:135)");
            }
            composer.X(-597479667);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new a();
                composer.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer.X(-597478643);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new b();
                composer.N(g3);
            }
            Function0 function02 = (Function0) g3;
            composer.M();
            composer.X(-597477299);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new c();
                composer.N(g4);
            }
            Function0 function03 = (Function0) g4;
            composer.M();
            composer.X(-597476298);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new d();
                composer.N(g5);
            }
            Function2 function2 = (Function2) g5;
            composer.M();
            composer.X(-597475027);
            Object g6 = composer.g();
            if (g6 == companion.a()) {
                g6 = new e();
                composer.N(g6);
            }
            Function1 function1 = (Function1) g6;
            composer.M();
            Guest.State state = new Guest.State(SampleStates.f37859a.j(), "1.0.0");
            composer.X(-597470419);
            Object g7 = composer.g();
            if (g7 == companion.a()) {
                g7 = new f();
                composer.N(g7);
            }
            composer.M();
            GuestScreenKt.i(function0, function02, function03, function2, function1, (Function0) null, state, (Function1) g7, FlowKt.A(), composer, 12610998, 32);
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
