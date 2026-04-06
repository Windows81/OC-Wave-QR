package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class FloatRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public FloatRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), RealmAny.Type.FLOAT, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Float) super.h(Float.class));
    }
}
