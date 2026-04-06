package com.hansecom.abt.presentation.screens.auth.register.questionsStep;

import android.content.res.Resources;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Resources f34486A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Register.State.QuestionsStep f34487B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f34488z;

    public /* synthetic */ d(Function2 function2, Resources resources, Register.State.QuestionsStep questionsStep) {
        this.f34488z = function2;
        this.f34486A = resources;
        this.f34487B = questionsStep;
    }

    public final Object invoke(Object obj) {
        return RegisterQuestionsStepScreenKt.m(this.f34488z, this.f34486A, this.f34487B, (String) obj);
    }
}
