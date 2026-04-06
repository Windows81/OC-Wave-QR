package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaPassesRepository_Factory implements Factory<FareMediaPassesRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33483a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33484b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33485c;

    public static FareMediaPassesRepository b(UserFareMediaApi userFareMediaApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaPassesRepository(userFareMediaApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaPassesRepository get() {
        return b((UserFareMediaApi) this.f33483a.get(), (Json) this.f33484b.get(), (DataStoreFileProducer) this.f33485c.get());
    }
}
