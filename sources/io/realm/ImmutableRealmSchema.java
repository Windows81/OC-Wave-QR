package io.realm;

import io.realm.internal.ColumnIndices;
import io.realm.internal.Table;

class ImmutableRealmSchema extends RealmSchema {
    public ImmutableRealmSchema(BaseRealm baseRealm, ColumnIndices columnIndices) {
        super(baseRealm, columnIndices);
    }

    public RealmObjectSchema d(String str) {
        b(str, "Null or empty class names are not allowed");
        String o2 = Table.o(str);
        if (!this.f40063f.H().hasTable(o2)) {
            return null;
        }
        return new ImmutableRealmObjectSchema(this.f40063f, this, this.f40063f.H().getTable(o2), f(str));
    }
}
