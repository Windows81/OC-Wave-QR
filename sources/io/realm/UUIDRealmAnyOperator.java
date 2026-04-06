package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

final class UUIDRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public UUIDRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), RealmAny.Type.UUID, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((UUID) super.h(UUID.class));
    }
}
