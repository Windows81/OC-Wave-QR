package com.hansecom.abt.presentation.screens.main.lock;

import com.hansecom.abt.presentation.biometric.BiometricHelper;
import com.hansecom.abt.presentation.main.MainActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class d implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f37687A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f37688B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Function1 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BiometricHelper f37689z;

    public /* synthetic */ d(BiometricHelper biometricHelper, MainActivity mainActivity, String str, String str2, String str3, Function1 function1) {
        this.f37689z = biometricHelper;
        this.f37687A = mainActivity;
        this.f37688B = str;
        this.C = str2;
        this.D = str3;
        this.E = function1;
    }

    public final Object invoke() {
        return LockScreenKt.o(this.f37689z, this.f37687A, this.f37688B, this.C, this.D, this.E);
    }
}
