package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.SigningApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaKeysRepository_Factory implements Factory<FareMediaKeysRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33471a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33472b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33473c;

    public static FareMediaKeysRepository b(SigningApi signingApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaKeysRepository(signingApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaKeysRepository get() {
        return b((SigningApi) this.f33471a.get(), (Json) this.f33472b.get(), (DataStoreFileProducer) this.f33473c.get());
    }
}
