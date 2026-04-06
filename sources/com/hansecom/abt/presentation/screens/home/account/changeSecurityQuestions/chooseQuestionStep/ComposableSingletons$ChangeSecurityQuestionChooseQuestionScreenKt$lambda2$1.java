package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt$lambda2$1 f35399z = new ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt$lambda2$1();

    public static final Unit f(ChangeSecurityQuestions.Action.Questions questions) {
        Intrinsics.i(questions, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-244149072, i2, -1, "com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep.ComposableSingletons$ChangeSecurityQuestionChooseQuestionScreenKt.lambda-2.<anonymous> (ChangeSecurityQuestionChooseQuestionScreen.kt:104)");
            }
            ChangeSecurityQuestions.State.Questions questions = new ChangeSecurityQuestions.State.Questions(ExtensionsKt.b("Question 1", "Long question so we break line can me tested tested tested"));
            Flow A2 = FlowKt.A();
            composer.X(-1815556287);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new e();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(-1815554367);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new f();
                composer.N(g3);
            }
            composer.M();
            ChangeSecurityQuestionChooseQuestionScreenKt.h(questions, function1, A2, true, (Function0) g3, composer, 27696);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
