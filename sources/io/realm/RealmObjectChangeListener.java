package io.realm;

import io.realm.RealmModel;

public interface RealmObjectChangeListener<T extends RealmModel> {
    void a(RealmModel realmModel, ObjectChangeSet objectChangeSet);
}
