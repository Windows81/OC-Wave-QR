package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class BooleanOperator extends SetValueOperator<Boolean> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.c(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.c(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.s((Boolean) obj);
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.c(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.K((Boolean) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.c(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(Boolean bool) {
        return this.f40076b.a(bool);
    }
}
