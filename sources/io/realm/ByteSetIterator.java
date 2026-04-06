package io.realm;

import io.realm.internal.OsSet;

class ByteSetIterator extends SetIterator<Byte> {
    public ByteSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* renamed from: c */
    public Byte b(int i2) {
        Object H = this.f40074z.H(i2);
        if (H == null) {
            return null;
        }
        return Byte.valueOf(((Long) H).byteValue());
    }
}
