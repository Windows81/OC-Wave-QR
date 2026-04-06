package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaConfigRepository_Factory implements Factory<FareMediaConfigRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33448a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33449b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33450c;

    public static FareMediaConfigRepository b(UserFareMediaApi userFareMediaApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaConfigRepository(userFareMediaApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaConfigRepository get() {
        return b((UserFareMediaApi) this.f33448a.get(), (Json) this.f33449b.get(), (DataStoreFileProducer) this.f33450c.get());
    }
}
