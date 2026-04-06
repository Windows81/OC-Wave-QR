package com.hansecom.abt.data.repositories;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaTransferTimeRepository_Factory implements Factory<FareMediaTransferTimeRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33512a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33513b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33514c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33515d;

    public static FareMediaTransferTimeRepository b(UserFareMediaApi userFareMediaApi, AppFeatures appFeatures, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaTransferTimeRepository(userFareMediaApi, appFeatures, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaTransferTimeRepository get() {
        return b((UserFareMediaApi) this.f33512a.get(), (AppFeatures) this.f33513b.get(), (Json) this.f33514c.get(), (DataStoreFileProducer) this.f33515d.get());
    }
}
