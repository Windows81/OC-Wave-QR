package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserDataApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class UserRepository_Factory implements Factory<UserRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33546a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33547b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33548c;

    public static UserRepository b(UserDataApi userDataApi, DataStoreFileProducer dataStoreFileProducer, Json json) {
        return new UserRepository(userDataApi, dataStoreFileProducer, json);
    }

    /* renamed from: a */
    public UserRepository get() {
        return b((UserDataApi) this.f33546a.get(), (DataStoreFileProducer) this.f33547b.get(), (Json) this.f33548c.get());
    }
}
