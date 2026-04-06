package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class ChangeSecurityQuestionScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangeSecurityQuestions.State.Main f35343z;

    public static final Unit h(ChangeSecurityQuestions.Action.Main main) {
        Intrinsics.i(main, "it");
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

    /* access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(748964649, i2, -1, "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.Preview.<anonymous> (ChangeSecurityQuestionScreen.kt:220)");
            }
            ChangeSecurityQuestions.State.Main main = this.f35343z;
            composer.X(1113322721);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new g();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(1113324961);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new h();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(1113326273);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new i();
                composer.N(g4);
            }
            Function0 function02 = (Function0) g4;
            composer.M();
            composer.X(1113327073);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new j();
                composer.N(g5);
            }
            composer.M();
            ChangeSecurityQuestionScreenKt.o(main, function1, A2, function0, function02, (Function0) g5, composer, 224304);
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
