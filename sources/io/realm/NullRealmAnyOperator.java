package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

final class NullRealmAnyOperator extends RealmAnyOperator {
    public NullRealmAnyOperator() {
        super(RealmAny.Type.NULL);
    }

    public NativeRealmAny b() {
        return new NativeRealmAny();
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (NullRealmAnyOperator.class.equals(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public Object h(Class cls) {
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "null";
    }

    public NullRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(RealmAny.Type.NULL, nativeRealmAny);
    }
}
