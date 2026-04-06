package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareCappingRepository_Factory implements Factory<FareCappingRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33436a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33437b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33438c;

    public static FareCappingRepository b(UserFareMediaApi userFareMediaApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareCappingRepository(userFareMediaApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareCappingRepository get() {
        return b((UserFareMediaApi) this.f33436a.get(), (Json) this.f33437b.get(), (DataStoreFileProducer) this.f33438c.get());
    }
}
