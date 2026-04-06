package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

final class Decimal128RealmAnyOperator extends PrimitiveRealmAnyOperator {
    public Decimal128RealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), RealmAny.Type.DECIMAL128, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Decimal128) super.h(Decimal128.class));
    }
}
