package io.realm;

import io.realm.internal.OsSet;

class ShortSetIterator extends SetIterator<Short> {
    public ShortSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* renamed from: c */
    public Short b(int i2) {
        Object H = this.f40074z.H(i2);
        if (H == null) {
            return null;
        }
        return Short.valueOf(((Long) H).shortValue());
    }
}
