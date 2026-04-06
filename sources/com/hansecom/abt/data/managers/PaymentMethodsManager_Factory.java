package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PaymentMethodsManager_Factory implements Factory<PaymentMethodsManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33301a;

    public static PaymentMethodsManager b(UserDataApi userDataApi) {
        return new PaymentMethodsManager(userDataApi);
    }

    /* renamed from: a */
    public PaymentMethodsManager get() {
        return b((UserDataApi) this.f33301a.get());
    }
}
