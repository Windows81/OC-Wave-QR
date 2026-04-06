package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class t implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckout.Action f37160z;

    public /* synthetic */ t(PassCheckout.Action action) {
        this.f37160z = action;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel.U(this.f37160z, (PassCheckout.State) obj);
    }
}
