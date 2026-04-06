package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import org.bson.types.ObjectId;

class ObjectIdOperator extends SetValueOperator<ObjectId> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.i(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.i(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.A(obj == null ? null : (ObjectId) obj);
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.i(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.V((ObjectId) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.i(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(ObjectId objectId) {
        return this.f40076b.l(objectId);
    }
}
