package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaPassesToOfferRepository_Factory implements Factory<FareMediaPassesToOfferRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33647a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33648b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33649c;

    public static FareMediaPassesToOfferRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaPassesToOfferRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaPassesToOfferRepository get() {
        return b((GeneralDataApi) this.f33647a.get(), (Json) this.f33648b.get(), (DataStoreFileProducer) this.f33649c.get());
    }
}
