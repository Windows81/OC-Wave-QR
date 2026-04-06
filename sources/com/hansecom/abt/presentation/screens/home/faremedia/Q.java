package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.main.MainActivity;
import com.hansecom.abt.presentation.wallet.GoogleWalletHelper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class Q implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MainActivity f36030A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f36031B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GoogleWalletHelper f36032z;

    public /* synthetic */ Q(GoogleWalletHelper googleWalletHelper, MainActivity mainActivity, Function2 function2) {
        this.f36032z = googleWalletHelper;
        this.f36030A = mainActivity;
        this.f36031B = function2;
    }

    public final Object invoke(Object obj) {
        return FareMediaScreenKt.a0(this.f36032z, this.f36030A, this.f36031B, (String) obj);
    }
}
