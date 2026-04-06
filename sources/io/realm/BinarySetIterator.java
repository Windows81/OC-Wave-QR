package io.realm;

import io.realm.internal.OsSet;

class BinarySetIterator extends SetIterator<byte[]> {
    public BinarySetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }

    /* renamed from: c */
    public byte[] b(int i2) {
        Object H = this.f40074z.H(i2);
        if (H == null) {
            return null;
        }
        return (byte[]) H;
    }
}
