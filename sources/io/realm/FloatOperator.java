package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;

class FloatOperator extends SetValueOperator<Float> {
    public boolean c(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.g(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    public boolean g(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.g(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    public boolean h(Object obj) {
        return this.f40076b.u(obj == null ? null : (Float) obj);
    }

    public boolean t(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.g(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    public boolean u(Object obj) {
        return this.f40076b.N((Float) obj);
    }

    public boolean w(Collection collection) {
        return this.f40076b.r(NativeRealmAnyCollection.g(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }

    /* renamed from: y */
    public boolean a(Float f2) {
        return this.f40076b.d(f2);
    }
}
