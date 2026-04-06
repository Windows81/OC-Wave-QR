package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

abstract class PrimitiveRealmAnyOperator extends RealmAnyOperator {

    /* renamed from: c  reason: collision with root package name */
    public final Object f39924c;

    public PrimitiveRealmAnyOperator(Object obj, RealmAny.Type type) {
        super(type);
        this.f39924c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f39924c;
        Object obj3 = ((PrimitiveRealmAnyOperator) obj).f39924c;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public Object h(Class cls) {
        return cls.cast(this.f39924c);
    }

    public final int hashCode() {
        Object obj = this.f39924c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f39924c.toString();
    }

    public PrimitiveRealmAnyOperator(Object obj, RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.f39924c = obj;
    }
}
