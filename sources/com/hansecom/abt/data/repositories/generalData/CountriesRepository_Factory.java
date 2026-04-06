package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class CountriesRepository_Factory implements Factory<CountriesRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33614a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33615b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33616c;

    public static CountriesRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new CountriesRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public CountriesRepository get() {
        return b((GeneralDataApi) this.f33614a.get(), (Json) this.f33615b.get(), (DataStoreFileProducer) this.f33616c.get());
    }
}
