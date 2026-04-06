package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class StringRealmAnyOperator extends PrimitiveRealmAnyOperator {
    public StringRealmAnyOperator(String str) {
        super(str, RealmAny.Type.STRING);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny((String) super.h(String.class));
    }

    public StringRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), RealmAny.Type.STRING, nativeRealmAny);
    }
}
