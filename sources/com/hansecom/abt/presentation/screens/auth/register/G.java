package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class G implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ RegisterViewModel f34347A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.Action.QuestionsStep f34348z;

    public /* synthetic */ G(Register.Action.QuestionsStep questionsStep, RegisterViewModel registerViewModel) {
        this.f34348z = questionsStep;
        this.f34347A = registerViewModel;
    }

    public final Object invoke(Object obj) {
        return RegisterViewModel.z0(this.f34348z, this.f34347A, (Register.State) obj);
    }
}
