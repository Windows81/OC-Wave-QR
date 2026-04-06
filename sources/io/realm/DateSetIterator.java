package io.realm;

import io.realm.internal.OsSet;
import java.util.Date;

class DateSetIterator extends SetIterator<Date> {
    public DateSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
