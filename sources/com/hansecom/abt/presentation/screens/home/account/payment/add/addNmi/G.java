package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class G implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f35662A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmiViewModel f35663z;

    public /* synthetic */ G(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, boolean z2) {
        this.f35663z = addPaymentMethodNmiViewModel;
        this.f35662A = z2;
    }

    public final Object invoke(Object obj) {
        return AddPaymentMethodNmiViewModel.n0(this.f35663z, this.f35662A, (AddPaymentMethodNmi.State) obj);
    }
}
