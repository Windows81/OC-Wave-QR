package io.realm;

import io.realm.internal.OsSet;
import org.bson.types.Decimal128;

class Decimal128SetIterator extends SetIterator<Decimal128> {
    public Decimal128SetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
