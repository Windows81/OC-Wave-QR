package io.realm;

import io.realm.internal.ColumnIndices;
import io.realm.internal.Table;

class MutableRealmSchema extends RealmSchema {
    public MutableRealmSchema(BaseRealm baseRealm) {
        super(baseRealm, (ColumnIndices) null);
    }

    public RealmObjectSchema d(String str) {
        b(str, "Null or empty class names are not allowed");
        String o2 = Table.o(str);
        if (!this.f40063f.H().hasTable(o2)) {
            return null;
        }
        return new MutableRealmObjectSchema(this.f40063f, this, this.f40063f.H().getTable(o2));
    }
}
