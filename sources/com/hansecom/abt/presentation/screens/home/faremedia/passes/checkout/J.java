package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class J implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throwable f37084A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckoutViewModel f37085z;

    public /* synthetic */ J(PassCheckoutViewModel passCheckoutViewModel, Throwable th) {
        this.f37085z = passCheckoutViewModel;
        this.f37084A = th;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel$applyCoupon$1.G(this.f37085z, this.f37084A, (PassCheckout.State) obj);
    }
}
