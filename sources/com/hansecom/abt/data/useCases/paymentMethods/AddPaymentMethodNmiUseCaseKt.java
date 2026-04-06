package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.mapi.models.BillingAddress;
import com.hansecom.mapi.models.User;
import com.hansecom.mapi.models.UserAddress;
import kotlin.Metadata;

@Metadata
public final class AddPaymentMethodNmiUseCaseKt {
    public static final BillingAddress b(UserAddress userAddress, User user) {
        String e2 = user.e();
        String f2 = user.f();
        String e3 = userAddress.e();
        String f3 = userAddress.f();
        String c2 = userAddress.c();
        return new BillingAddress(e2, f2, e3, f3, userAddress.a(), c2, userAddress.d(), userAddress.b(), userAddress.g());
    }
}
