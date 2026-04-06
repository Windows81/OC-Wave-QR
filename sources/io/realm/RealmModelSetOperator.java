package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class RealmModelSetOperator<T extends RealmModel> extends SetValueOperator<T> {
    private void A(RealmModel realmModel) {
        if (realmModel == null) {
            throw new NullPointerException("This set does not permit null values.");
        } else if (!RealmObject.isValid(realmModel) || !RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        } else if (((RealmObjectProxy) realmModel).b().d() != this.f40075a) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    private void z(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A((RealmModel) it.next());
        }
    }

    public final RealmModel B(RealmModel realmModel) {
        if (realmModel != null) {
            return CollectionUtils.a(this.f40075a, realmModel, this.f40077c.getName(), "set") ? CollectionUtils.c(this.f40075a, realmModel) : realmModel;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    public boolean c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(B((RealmModel) it.next()));
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
    public boolean a(RealmModel realmModel) {
        return this.f40076b.o(((RealmObjectProxy) B(realmModel)).b().e().S());
    }
}
