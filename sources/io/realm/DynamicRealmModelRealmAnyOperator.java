package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

final class DynamicRealmModelRealmAnyOperator extends RealmModelOperator {
    public DynamicRealmModelRealmAnyOperator(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        super(j(baseRealm, nativeRealmAny));
    }

    public static RealmModel j(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        return baseRealm.C(DynamicRealmObject.class, Table.f(nativeRealmAny.getRealmModelTableName(baseRealm.H())), nativeRealmAny.getRealmModelRowKey());
    }

    public Class g() {
        return DynamicRealmObject.class;
    }
}
