package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.ComposableSingletons$RegisterChooseQuestionStepScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$RegisterChooseQuestionStepScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$RegisterChooseQuestionStepScreenKt$lambda2$1 f34447z = new ComposableSingletons$RegisterChooseQuestionStepScreenKt$lambda2$1();

    public static final Unit e(Register.Action.ChooseQuestionStep chooseQuestionStep) {
        Intrinsics.i(chooseQuestionStep, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1558916267, i2, -1, "com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep.ComposableSingletons$RegisterChooseQuestionStepScreenKt.lambda-2.<anonymous> (RegisterChooseQuestionStepScreen.kt:83)");
            }
            Register.State.ChooseQuestionStep chooseQuestionStep = new Register.State.ChooseQuestionStep(ExtensionsKt.b("Question 1", "Long question so we break line can me tested tested tested"));
            composer.X(-514419630);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new a();
                composer.N(g2);
            }
            composer.M();
            RegisterChooseQuestionStepScreenKt.i(chooseQuestionStep, (Function1) g2, true, composer, 432);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
