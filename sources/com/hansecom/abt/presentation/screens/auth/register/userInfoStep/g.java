package com.hansecom.abt.presentation.screens.auth.register.userInfoStep;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34584A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f34585B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.State.UserInfoStep f34586z;

    public /* synthetic */ g(Register.State.UserInfoStep userInfoStep, Function1 function1, int i2) {
        this.f34586z = userInfoStep;
        this.f34584A = function1;
        this.f34585B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return RegisterUserInfoStepScreenKt.C(this.f34586z, this.f34584A, this.f34585B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
