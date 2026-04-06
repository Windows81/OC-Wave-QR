package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class G implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassCheckoutViewModel f37081A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ GetDefaultPaymentMethodUseCase.Response f37082z;

    public /* synthetic */ G(GetDefaultPaymentMethodUseCase.Response response, PassCheckoutViewModel passCheckoutViewModel) {
        this.f37082z = response;
        this.f37081A = passCheckoutViewModel;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel.AnonymousClass2.E(this.f37082z, this.f37081A, (PassCheckout.State) obj);
    }
}
