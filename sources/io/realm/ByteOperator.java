package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class ByteOperator extends SetValueOperator<Byte> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.v(obj == null ? null : Long.valueOf(((Byte) obj).longValue()));
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.L((Byte) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.h(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(Byte b2) {
        return this.f40076b.b(b2);
    }
}
