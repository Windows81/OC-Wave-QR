package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.deviceInfo.DeviceInfo;
import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class FareMediaRepository_Factory implements Factory<FareMediaRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33499a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33500b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33501c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33502d;

    public static FareMediaRepository b(DeviceInfo deviceInfo, UserFareMediaApi userFareMediaApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new FareMediaRepository(deviceInfo, userFareMediaApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public FareMediaRepository get() {
        return b((DeviceInfo) this.f33499a.get(), (UserFareMediaApi) this.f33500b.get(), (Json) this.f33501c.get(), (DataStoreFileProducer) this.f33502d.get());
    }
}
