package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class RegisterChooseQuestionStepScreenKt$ScreenImpl$2$1$1$1$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34454A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f34455B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f34456z;

    public RegisterChooseQuestionStepScreenKt$ScreenImpl$2$1$1$1$1$1(boolean z2, Function1 function1, String str) {
        this.f34456z = z2;
        this.f34454A = function1;
        this.f34455B = str;
    }

    public final void b() {
        if (this.f34456z) {
            this.f34454A.invoke(new Register.Action.ChooseQuestionStep.ChooseSecondSecurityQuestion(this.f34455B));
        } else {
            this.f34454A.invoke(new Register.Action.ChooseQuestionStep.ChooseSecurityQuestion(this.f34455B));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
