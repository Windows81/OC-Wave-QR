package io.realm;

import io.realm.internal.OsSet;

class LongSetIterator extends SetIterator<Long> {
    public LongSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
