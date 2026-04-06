package io.realm;

import io.realm.internal.OsSet;

class StringSetIterator extends SetIterator<String> {
    public StringSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
