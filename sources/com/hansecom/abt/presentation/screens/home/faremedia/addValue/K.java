package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class K implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FareMediaAddValueViewModel f36112A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GetDefaultPaymentMethodUseCase.Response f36113z;

    public /* synthetic */ K(GetDefaultPaymentMethodUseCase.Response response, FareMediaAddValueViewModel fareMediaAddValueViewModel) {
        this.f36113z = response;
        this.f36112A = fareMediaAddValueViewModel;
    }

    public final Object invoke(Object obj) {
        return FareMediaAddValueViewModel$1$paymentMethodJob$1.C(this.f36113z, this.f36112A, (FareMediaAddValue.State) obj);
    }
}
