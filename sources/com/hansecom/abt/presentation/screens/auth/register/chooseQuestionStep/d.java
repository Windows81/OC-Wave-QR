package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f34461A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f34462B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.ChooseQuestionStep f34463z;

    public /* synthetic */ d(Register.State.ChooseQuestionStep chooseQuestionStep, boolean z2, Function1 function1) {
        this.f34463z = chooseQuestionStep;
        this.f34461A = z2;
        this.f34462B = function1;
    }

    public final Object invoke(Object obj) {
        return RegisterChooseQuestionStepScreenKt.k(this.f34463z, this.f34461A, this.f34462B, (LazyListScope) obj);
    }
}
