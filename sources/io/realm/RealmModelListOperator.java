package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.Locale;

final class RealmModelListOperator<T> extends ManagedListOperator<T> {

    /* renamed from: d  reason: collision with root package name */
    public final String f40033d;

    public RealmModelListOperator(BaseRealm baseRealm, OsList osList, Class cls, String str) {
        super(baseRealm, osList, cls);
        this.f40033d = str;
    }

    public void c(Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean a2 = CollectionUtils.a(this.f39897a, realmModel, this.f40033d, "list");
        if (!CollectionUtils.f(this.f39897a, realmModel)) {
            if (a2) {
                realmModel = CollectionUtils.c(this.f39897a, realmModel);
            }
            this.f39898b.m(((RealmObjectProxy) realmModel).b().e().S());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.g((Realm) this.f39897a, realmModel, this.f39898b.p());
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }

    public void e(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("RealmList does not accept null values.");
        } else if (!(obj instanceof RealmModel)) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", new Object[]{"java.lang.String", obj.getClass().getName()}));
        }
    }

    public Object f(int i2) {
        return this.f39897a.D(this.f39899c, this.f40033d, this.f39898b.t((long) i2));
    }

    public void i(int i2) {
        throw new RuntimeException("Should not reach here.");
    }

    public void j(int i2, Object obj) {
        d(i2);
        RealmModel realmModel = (RealmModel) obj;
        boolean a2 = CollectionUtils.a(this.f39897a, realmModel, this.f40033d, "list");
        if (!CollectionUtils.f(this.f39897a, realmModel)) {
            if (a2) {
                realmModel = CollectionUtils.c(this.f39897a, realmModel);
            }
            this.f39898b.F((long) i2, ((RealmObjectProxy) realmModel).b().e().S());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.g((Realm) this.f39897a, realmModel, this.f39898b.q((long) i2));
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }

    public void o(int i2) {
        throw new RuntimeException("Should not reach here.");
    }

    public void p(int i2, Object obj) {
        RealmModel realmModel = (RealmModel) obj;
        boolean a2 = CollectionUtils.a(this.f39897a, realmModel, this.f40033d, "list");
        if (!CollectionUtils.f(this.f39897a, realmModel)) {
            if (a2) {
                realmModel = CollectionUtils.c(this.f39897a, realmModel);
            }
            this.f39898b.X((long) i2, ((RealmObjectProxy) realmModel).b().e().S());
        } else if (!(obj instanceof DynamicRealmObject)) {
            CollectionUtils.g((Realm) this.f39897a, realmModel, this.f39898b.r((long) i2));
        } else {
            throw new IllegalArgumentException("Embedded objects are not supported by RealmLists of DynamicRealmObjects yet.");
        }
    }
}
