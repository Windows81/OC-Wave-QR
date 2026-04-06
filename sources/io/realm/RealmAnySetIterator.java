package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;

class RealmAnySetIterator extends SetIterator<RealmAny> {
    public RealmAnySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* renamed from: c */
    public RealmAny b(int i2) {
        return new RealmAny(RealmAnyOperator.c(this.f40072A, new NativeRealmAny(this.f40074z.F(i2))));
    }
}
