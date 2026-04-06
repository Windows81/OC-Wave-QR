package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.InstitutionsApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class InstitutionsRepository_Factory implements Factory<InstitutionsRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33524a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33525b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33526c;

    public static InstitutionsRepository b(InstitutionsApi institutionsApi, DataStoreFileProducer dataStoreFileProducer, Json json) {
        return new InstitutionsRepository(institutionsApi, dataStoreFileProducer, json);
    }

    /* renamed from: a */
    public InstitutionsRepository get() {
        return b((InstitutionsApi) this.f33524a.get(), (DataStoreFileProducer) this.f33525b.get(), (Json) this.f33526c.get());
    }
}
