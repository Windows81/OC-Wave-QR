package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class IntegerRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public IntegerRealmAnyOperator(Integer num) {
        super(num, RealmAny.Type.INTEGER);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Number) super.h(Number.class));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!IntegerRealmAnyOperator.class.equals(obj.getClass())) {
            return false;
        }
        Class<Number> cls = Number.class;
        return ((Number) h(cls)).longValue() == ((Number) ((RealmAnyOperator) obj).h(cls)).longValue();
    }

    public IntegerRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), RealmAny.Type.INTEGER, nativeRealmAny);
    }
}
