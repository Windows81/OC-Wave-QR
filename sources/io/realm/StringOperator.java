package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class StringOperator extends SetValueOperator<String> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.l(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.l(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.w((String) obj);
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.l(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.R((String) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.l(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(String str) {
        return this.f40076b.h(str);
    }
}
