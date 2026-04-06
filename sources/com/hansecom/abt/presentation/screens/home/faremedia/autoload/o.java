package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import com.hansecom.mapi.models.FareMediaAutoload;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class o implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f36286A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f36287B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaAutoload f36288z;

    public /* synthetic */ o(FareMediaAutoload fareMediaAutoload, PaymentMethodState.CreditCard creditCard, PaymentMethodState.CreditCard creditCard2) {
        this.f36288z = fareMediaAutoload;
        this.f36286A = creditCard;
        this.f36287B = creditCard2;
    }

    public final Object invoke(Object obj) {
        return AutoloadViewModel.K(this.f36288z, this.f36286A, this.f36287B, (Autoload.State) obj);
    }
}
