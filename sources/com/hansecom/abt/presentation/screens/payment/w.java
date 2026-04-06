package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import com.hansecom.mapi.models.FareMedium;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class w implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedium f37843z;

    public /* synthetic */ w(FareMedium fareMedium) {
        this.f37843z = fareMedium;
    }

    public final Object invoke(Object obj) {
        return ChoosePaymentMethodViewModel.S(this.f37843z, (ChoosePaymentMethod.State) obj);
    }
}
