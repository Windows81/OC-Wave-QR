package io.realm.internal;

import io.realm.ProxyState;
import io.realm.RealmModel;

public interface RealmObjectProxy extends RealmModel {

    public static class CacheData<E extends RealmModel> {
    }

    void a();

    ProxyState b();
}
