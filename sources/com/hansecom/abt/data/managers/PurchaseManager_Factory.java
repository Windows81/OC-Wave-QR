package com.hansecom.abt.data.managers;

import com.hansecom.mapi.apis.PurchaseOperationsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PurchaseManager_Factory implements Factory<PurchaseManager> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33303a;

    public static PurchaseManager b(PurchaseOperationsApi purchaseOperationsApi) {
        return new PurchaseManager(purchaseOperationsApi);
    }

    /* renamed from: a */
    public PurchaseManager get() {
        return b((PurchaseOperationsApi) this.f33303a.get());
    }
}
