package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class BooleanRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public BooleanRealmAnyOperator(Boolean bool) {
        super(bool, RealmAny.Type.BOOLEAN);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Boolean) super.h(Boolean.class));
    }

    public BooleanRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), RealmAny.Type.BOOLEAN, nativeRealmAny);
    }
}
