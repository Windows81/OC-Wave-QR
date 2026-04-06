package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

final class DateRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public DateRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), RealmAny.Type.DATE, nativeRealmAny);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((Date) super.h(Date.class));
    }
}
