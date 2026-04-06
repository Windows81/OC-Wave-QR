package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class PaymentMethodsRepository_Factory implements Factory<PaymentMethodsRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33535a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33536b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33537c;

    public static PaymentMethodsRepository b(UserDataApi userDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new PaymentMethodsRepository(userDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public PaymentMethodsRepository get() {
        return b((UserDataApi) this.f33535a.get(), (Json) this.f33536b.get(), (DataStoreFileProducer) this.f33537c.get());
    }
}
