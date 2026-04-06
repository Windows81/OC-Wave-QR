package io.realm;

import io.realm.internal.OsSet;

class IntegerSetIterator extends SetIterator<Integer> {
    public IntegerSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* renamed from: c */
    public Integer b(int i2) {
        Object H = this.f40074z.H(i2);
        if (H == null) {
            return null;
        }
        return Integer.valueOf(((Long) H).intValue());
    }
}
