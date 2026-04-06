package io.realm;

import io.realm.internal.OsSet;

class DynamicSetIterator extends SetIterator<DynamicRealmObject> {
    public final String C;

    public DynamicSetIterator(OsSet osSet, BaseRealm baseRealm, String str) {
        super(osSet, baseRealm);
        this.C = str;
    }

    /* renamed from: c */
    public DynamicRealmObject b(int i2) {
        return (DynamicRealmObject) this.f40072A.C(DynamicRealmObject.class, this.C, this.f40074z.G(i2));
    }
}
