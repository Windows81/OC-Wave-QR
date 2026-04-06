package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel;
import com.hansecom.mapi.models.FareMedium;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class F implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PassCheckoutViewModel f37079A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMedium f37080z;

    public /* synthetic */ F(FareMedium fareMedium, PassCheckoutViewModel passCheckoutViewModel) {
        this.f37080z = fareMedium;
        this.f37079A = passCheckoutViewModel;
    }

    public final Object invoke(Object obj) {
        return PassCheckoutViewModel.AnonymousClass2.D(this.f37080z, this.f37079A, (PassCheckout.State) obj);
    }
}
