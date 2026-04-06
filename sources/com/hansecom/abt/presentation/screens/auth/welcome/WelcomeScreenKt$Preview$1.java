package com.hansecom.abt.presentation.screens.auth.welcome;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.welcome.Welcome;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
final class WelcomeScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Welcome.State f34660z;

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f40552a;
    }

    public static final Unit p() {
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-432323316, i2, -1, "com.hansecom.abt.presentation.screens.auth.welcome.Preview.<anonymous> (WelcomeScreen.kt:171)");
            }
            Welcome.State state = this.f34660z;
            composer.X(1061694513);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new c();
                composer.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer.X(1061695473);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new d();
                composer.N(g3);
            }
            Function0 function02 = (Function0) g3;
            composer.M();
            composer.X(1061696624);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new e();
                composer.N(g4);
            }
            Function0 function03 = (Function0) g4;
            composer.M();
            composer.X(1061697585);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new f();
                composer.N(g5);
            }
            composer.M();
            WelcomeScreenKt.c(state, function0, function02, function03, (Function0) g5, composer, 28080);
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
