package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.InstitutionsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaInstitutionsRepository_Factory implements Factory<FareMediaInstitutionsRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33460a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33461b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33462c;

    public static FareMediaInstitutionsRepository b(InstitutionsApi institutionsApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaInstitutionsRepository(institutionsApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaInstitutionsRepository get() {
        return b((InstitutionsApi) this.f33460a.get(), (Json) this.f33461b.get(), (DataStoreFileProducer) this.f33462c.get());
    }
}
