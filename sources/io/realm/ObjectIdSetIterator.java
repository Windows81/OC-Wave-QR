package io.realm;

import io.realm.internal.OsSet;
import org.bson.types.ObjectId;

class ObjectIdSetIterator extends SetIterator<ObjectId> {
    public ObjectIdSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
