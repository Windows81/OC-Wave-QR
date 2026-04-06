package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class DynamicSetOperator extends SetValueOperator<DynamicRealmObject> {
    public final void A(RealmModel realmModel) {
        if (realmModel == null) {
            throw new NullPointerException("This set does not permit null values.");
        } else if (!RealmObject.isValid(realmModel) || !RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        } else if (((RealmObjectProxy) realmModel).b().d() != this.f40075a) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    public final DynamicRealmObject B(DynamicRealmObject dynamicRealmObject) {
        if (dynamicRealmObject != null) {
            boolean a2 = CollectionUtils.a(this.f40075a, dynamicRealmObject, this.f40078d, "set");
            RealmModel realmModel = dynamicRealmObject;
            if (a2) {
                realmModel = CollectionUtils.c(this.f40075a, dynamicRealmObject);
            }
            return (DynamicRealmObject) realmModel;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    public boolean c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(B((DynamicRealmObject) it.next()));
        }
        return this.f40076b.r(NativeRealmAnyCollection.k(arrayList), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        z(collection);
        return this.f40076b.r(NativeRealmAnyCollection.k(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        A((RealmModel) obj);
        return this.f40076b.E(((RealmObjectProxy) obj).b().e().S());
    }

    public boolean t(Collection collection) {
        z(collection);
        return this.f40076b.r(NativeRealmAnyCollection.k(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        A((RealmModel) obj);
        return this.f40076b.Y(((RealmObjectProxy) obj).b().e().S());
    }

    public boolean w(Collection collection) {
        z(collection);
        return this.f40076b.r(NativeRealmAnyCollection.k(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(DynamicRealmObject dynamicRealmObject) {
        return this.f40076b.o(B(dynamicRealmObject).b().e().S());
    }

    public final void z(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A((DynamicRealmObject) it.next());
        }
    }
}
