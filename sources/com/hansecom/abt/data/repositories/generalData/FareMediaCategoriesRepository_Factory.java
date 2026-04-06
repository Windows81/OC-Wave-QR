package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaCategoriesRepository_Factory implements Factory<FareMediaCategoriesRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33636a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33637b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33638c;

    public static FareMediaCategoriesRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaCategoriesRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaCategoriesRepository get() {
        return b((GeneralDataApi) this.f33636a.get(), (Json) this.f33637b.get(), (DataStoreFileProducer) this.f33638c.get());
    }
}
