package com.hansecom.abt.presentation.screens.auth.register.questionsStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RegisterQuestionsStepScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.QuestionsStep f34482z;

    public static final Unit h(Register.Action.QuestionsStep questionsStep) {
        Intrinsics.i(questionsStep, "it");
        return Unit.f40552a;
    }

    public static final Unit i() {
        return Unit.f40552a;
    }

    public static final Unit k() {
        return Unit.f40552a;
    }

    public static final Unit p(String str, String str2) {
        Intrinsics.i(str, "<unused var>");
        Intrinsics.i(str2, "<unused var>");
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1283419874, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.questionsStep.Preview.<anonymous> (RegisterQuestionsStepScreen.kt:250)");
            }
            Register.State.QuestionsStep questionsStep = this.f34482z;
            composer.X(2101529174);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new i();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(2101530294);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new j();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(2101531606);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new k();
                composer.N(g4);
            }
            Function0 function02 = (Function0) g4;
            composer.M();
            composer.X(2101532575);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new l();
                composer.N(g5);
            }
            composer.M();
            RegisterQuestionsStepScreenKt.l(questionsStep, function1, function0, function02, (Function2) g5, composer, 28080, 0);
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
