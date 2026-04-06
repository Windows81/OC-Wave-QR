package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class VirtualFareMediaRepository_Factory implements Factory<VirtualFareMediaRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33681a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33682b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33683c;

    public static VirtualFareMediaRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new VirtualFareMediaRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public VirtualFareMediaRepository get() {
        return b((GeneralDataApi) this.f33681a.get(), (Json) this.f33682b.get(), (DataStoreFileProducer) this.f33683c.get());
    }
}
