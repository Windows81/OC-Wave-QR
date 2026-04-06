package io.realm;

import io.realm.RealmAny;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;

class RealmModelOperator extends RealmAnyOperator {

    /* renamed from: c  reason: collision with root package name */
    public final Class f40034c;

    /* renamed from: d  reason: collision with root package name */
    public final RealmModel f40035d;

    public RealmModelOperator(RealmModel realmModel) {
        super(RealmAny.Type.OBJECT);
        this.f40035d = realmModel;
        this.f40034c = realmModel.getClass();
    }

    public static RealmModel i(BaseRealm baseRealm, Class cls, NativeRealmAny nativeRealmAny) {
        return baseRealm.A(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    public void a(BaseRealm baseRealm) {
        if (!RealmObject.isValid(this.f40035d) || !RealmObject.isManaged(this.f40035d)) {
            throw new IllegalArgumentException("Realm object is not a valid managed object.");
        } else if (((RealmObjectProxy) this.f40035d).b().d() != baseRealm) {
            throw new IllegalArgumentException("Realm object belongs to a different Realm.");
        }
    }

    public NativeRealmAny b() {
        if (this.f40035d instanceof RealmObjectProxy) {
            return new NativeRealmAny((RealmObjectProxy) h(RealmObjectProxy.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        RealmModel realmModel = this.f40035d;
        RealmModel realmModel2 = ((RealmModelOperator) obj).f40035d;
        return realmModel == null ? realmModel2 == null : realmModel.equals(realmModel2);
    }

    public Class g() {
        return RealmObjectProxy.class.isAssignableFrom(this.f40034c) ? this.f40034c.getSuperclass() : this.f40034c;
    }

    public Object h(Class cls) {
        return cls.cast(this.f40035d);
    }

    public int hashCode() {
        return this.f40035d.hashCode();
    }

    public String toString() {
        return this.f40035d.toString();
    }

    public RealmModelOperator(BaseRealm baseRealm, NativeRealmAny nativeRealmAny, Class cls) {
        super(RealmAny.Type.OBJECT, nativeRealmAny);
        this.f40034c = cls;
        this.f40035d = i(baseRealm, cls, nativeRealmAny);
    }
}
