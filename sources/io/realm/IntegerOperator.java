package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class IntegerOperator extends SetValueOperator<Integer> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.v(obj == null ? null : Long.valueOf(((Integer) obj).longValue()));
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.O((Integer) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(Integer num) {
        return this.f40076b.e(num);
    }
}
