package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class E implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassOfferCardState f37077A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckoutViewModel f37078z;

    public /* synthetic */ E(PassCheckoutViewModel passCheckoutViewModel, PassOfferCardState passOfferCardState) {
        this.f37078z = passCheckoutViewModel;
        this.f37077A = passOfferCardState;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel.AnonymousClass1.AnonymousClass3.C(this.f37078z, this.f37077A, (PassCheckout.State) obj);
    }
}
