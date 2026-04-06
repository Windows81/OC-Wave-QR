package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethodViewModel f37841A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f37842z;

    public /* synthetic */ s(List list, ChoosePaymentMethodViewModel choosePaymentMethodViewModel) {
        this.f37842z = list;
        this.f37841A = choosePaymentMethodViewModel;
    }

    public final Object invoke(Object obj) {
        return ChoosePaymentMethodViewModel.Q(this.f37842z, this.f37841A, (ChoosePaymentMethod.State) obj);
    }
}
