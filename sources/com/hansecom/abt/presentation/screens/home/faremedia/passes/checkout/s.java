package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckout.Action f37159z;

    public /* synthetic */ s(PassCheckout.Action action) {
        this.f37159z = action;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel.T(this.f37159z, (PassCheckout.State) obj);
    }
}
