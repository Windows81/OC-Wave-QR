package io.realm.rx;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.Realm;
import io.realm.RealmModel;

public interface RxObservableFactory {
    Observable a(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);

    Flowable b(Realm realm, RealmModel realmModel);

    Observable c(Realm realm, RealmModel realmModel);

    Flowable d(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject);
}
