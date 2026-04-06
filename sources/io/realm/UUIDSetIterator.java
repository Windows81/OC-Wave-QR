package io.realm;

import io.realm.internal.OsSet;
import java.util.UUID;

class UUIDSetIterator extends SetIterator<UUID> {
    public UUIDSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
