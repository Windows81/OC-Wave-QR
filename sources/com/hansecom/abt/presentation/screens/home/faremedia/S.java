package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class S implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f36033A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f36034B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GoogleWalletHelper f36035z;

    public /* synthetic */ S(GoogleWalletHelper googleWalletHelper, MainActivity mainActivity, Function2 function2) {
        this.f36035z = googleWalletHelper;
        this.f36033A = mainActivity;
        this.f36034B = function2;
    }

    public final Object invoke(Object obj) {
        return FareMediaScreenKt.b0(this.f36035z, this.f36033A, this.f36034B, (String) obj);
    }
}
