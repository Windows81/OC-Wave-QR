package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import com.hansecom.mapi.models.FareMediaAutoload;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class o implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f36356A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f36357B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAutoload f36358z;

    public /* synthetic */ o(FareMediaAutoload fareMediaAutoload, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2) {
        this.f36358z = fareMediaAutoload;
        this.f36356A = creditCard;
        this.f36357B = creditCard2;
    }

    public final Object invoke(Object obj) {
        return AutoloadSetupViewModel.V(this.f36358z, this.f36356A, this.f36357B, (AutoloadSetup.State) obj);
    }
}
