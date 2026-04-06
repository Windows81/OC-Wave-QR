package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class StatesRepository_Factory implements Factory<StatesRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33670a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33671b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33672c;

    public static StatesRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new StatesRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public StatesRepository get() {
        return b((GeneralDataApi) this.f33670a.get(), (Json) this.f33671b.get(), (DataStoreFileProducer) this.f33672c.get());
    }
}
