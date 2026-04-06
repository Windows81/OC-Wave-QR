package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class UserSecurityQuestionsRepository_Factory implements Factory<UserSecurityQuestionsRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33557a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33558b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33559c;

    public static UserSecurityQuestionsRepository b(UserDataApi userDataApi, DataStoreFileProducer dataStoreFileProducer, Json json) {
        return new UserSecurityQuestionsRepository(userDataApi, dataStoreFileProducer, json);
    }

    /* renamed from: a */
    public UserSecurityQuestionsRepository get() {
        return b((UserDataApi) this.f33557a.get(), (DataStoreFileProducer) this.f33558b.get(), (Json) this.f33559c.get());
    }
}
