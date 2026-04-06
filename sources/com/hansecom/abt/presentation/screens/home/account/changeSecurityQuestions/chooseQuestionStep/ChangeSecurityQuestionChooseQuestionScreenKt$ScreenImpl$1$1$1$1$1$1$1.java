package com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.chooseQuestionStep;

import com.hansecom.abt.presentation.screens.home.account.changeSecurityQuestions.ChangeSecurityQuestions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$1$1$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35392A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f35393B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f35394z;

    public ChangeSecurityQuestionChooseQuestionScreenKt$ScreenImpl$1$1$1$1$1$1$1(boolean z2, Function1 function1, String str) {
        this.f35394z = z2;
        this.f35392A = function1;
        this.f35393B = str;
    }

    public final void b() {
        if (this.f35394z) {
            this.f35392A.invoke(new ChangeSecurityQuestions.Action.Questions.ChooseSecondSecurityQuestion(this.f35393B));
        } else {
            this.f35392A.invoke(new ChangeSecurityQuestions.Action.Questions.ChooseSecurityQuestion(this.f35393B));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
