package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class DoubleRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public DoubleRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), RealmAny.Type.DOUBLE, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Double) super.h(Double.class));
    }
}
