package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import java.util.Date;

class DateOperator extends SetValueOperator<Date> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.d(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.d(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.x(obj == null ? null : (Date) obj);
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.d(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.S((Date) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.d(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(Date date) {
        return this.f40076b.i(date);
    }
}
