package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.GeneralDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class SecurityQuestionsRepository_Factory implements Factory<SecurityQuestionsRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33658a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33659b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33660c;

    public static SecurityQuestionsRepository b(GeneralDataApi generalDataApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new SecurityQuestionsRepository(generalDataApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public SecurityQuestionsRepository get() {
        return b((GeneralDataApi) this.f33658a.get(), (Json) this.f33659b.get(), (DataStoreFileProducer) this.f33660c.get());
    }
}
