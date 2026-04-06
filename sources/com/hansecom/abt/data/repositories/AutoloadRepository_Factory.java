package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.AutoloadsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class AutoloadRepository_Factory implements Factory<AutoloadRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33401a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33402b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33403c;

    public static AutoloadRepository b(AutoloadsApi autoloadsApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new AutoloadRepository(autoloadsApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public AutoloadRepository get() {
        return b((AutoloadsApi) this.f33401a.get(), (Json) this.f33402b.get(), (DataStoreFileProducer) this.f33403c.get());
    }
}
