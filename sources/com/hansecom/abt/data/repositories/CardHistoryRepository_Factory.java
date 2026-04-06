package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.UserFareMediaApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class CardHistoryRepository_Factory implements Factory<CardHistoryRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33415a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33416b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33417c;

    public static CardHistoryRepository b(UserFareMediaApi userFareMediaApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new CardHistoryRepository(userFareMediaApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public CardHistoryRepository get() {
        return b((UserFareMediaApi) this.f33415a.get(), (Json) this.f33416b.get(), (DataStoreFileProducer) this.f33417c.get());
    }
}
