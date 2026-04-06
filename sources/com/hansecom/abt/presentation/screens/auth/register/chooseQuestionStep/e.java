package com.hansecom.abt.presentation.screens.auth.register.chooseQuestionStep;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34464A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f34465B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.ChooseQuestionStep f34466z;

    public /* synthetic */ e(Register.State.ChooseQuestionStep chooseQuestionStep, Function1 function1, boolean z2, int i2) {
        this.f34466z = chooseQuestionStep;
        this.f34464A = function1;
        this.f34465B = z2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterChooseQuestionStepScreenKt.j(this.f34466z, this.f34464A, this.f34465B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
