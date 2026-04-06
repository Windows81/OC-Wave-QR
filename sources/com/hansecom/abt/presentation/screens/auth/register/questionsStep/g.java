package com.hansecom.abt.presentation.screens.auth.register.questionsStep;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34492A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34493B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.QuestionsStep f34494z;

    public /* synthetic */ g(Register.State.QuestionsStep questionsStep, Function1 function1, Function0 function0, Function0 function02, Function2 function2, int i2, int i3) {
        this.f34494z = questionsStep;
        this.f34492A = function1;
        this.f34493B = function0;
        this.C = function02;
        this.D = function2;
        this.E = i2;
        this.F = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterQuestionsStepScreenKt.s(this.f34494z, this.f34492A, this.f34493B, this.C, this.D, this.E, this.F, (Composer) obj, ((Integer) obj2).intValue());
    }
}
