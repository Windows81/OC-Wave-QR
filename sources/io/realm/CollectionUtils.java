package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsObjectStore;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class CollectionUtils {
    public static boolean a(BaseRealm baseRealm, RealmModel realmModel, String str, String str2) {
        if (!(realmModel instanceof RealmObjectProxy)) {
            return true;
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
        if (realmObjectProxy instanceof DynamicRealmObject) {
            if (realmObjectProxy.b().d() == baseRealm) {
                String e2 = ((DynamicRealmObject) realmModel).e();
                if (str.equals(RealmAny.class.getCanonicalName()) || str.equals(e2)) {
                    return false;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'.", new Object[]{str2, str2, str, e2}));
            } else if (baseRealm.f39851A == realmObjectProxy.b().d().f39851A) {
                throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
            } else {
                throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
            }
        } else if (realmObjectProxy.b().e() == null || !realmObjectProxy.b().d().F().equals(baseRealm.F())) {
            return true;
        } else {
            if (baseRealm == realmObjectProxy.b().d()) {
                return false;
            }
            throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
        }
    }

    public static void b(BaseRealm baseRealm, Object obj, boolean z2) {
        if (!z2 || obj != null) {
            baseRealm.j();
            baseRealm.D.capabilities.c("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static RealmModel c(BaseRealm baseRealm, RealmModel realmModel) {
        Realm realm = (Realm) baseRealm;
        return OsObjectStore.b(realm.H(), realm.E().o().l(realmModel.getClass())) != null ? realm.m0(realmModel, new ImportFlag[0]) : realm.g0(realmModel, new ImportFlag[0]);
    }

    public static RealmAny d(BaseRealm baseRealm, RealmAny realmAny) {
        if (realmAny.d() != RealmAny.Type.OBJECT) {
            return realmAny;
        }
        Class e2 = realmAny.e();
        RealmModel a2 = realmAny.a(e2);
        if (a2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) a2;
            if (realmObjectProxy instanceof DynamicRealmObject) {
                if (realmObjectProxy.b().d() == baseRealm) {
                    return realmAny;
                }
                if (baseRealm.f39851A == realmObjectProxy.b().d().f39851A) {
                    throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                }
                throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
            } else if (baseRealm.G().h(e2).f()) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
            } else if (realmObjectProxy.b().e() != null && realmObjectProxy.b().d().F().equals(baseRealm.F())) {
                if (baseRealm == realmObjectProxy.b().d()) {
                    return realmAny;
                }
                throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
            }
        }
        return RealmAny.g(c(baseRealm, a2));
    }

    public static boolean e(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    public static boolean f(BaseRealm baseRealm, RealmModel realmModel) {
        if (baseRealm instanceof Realm) {
            return baseRealm.G().h(realmModel.getClass()).f();
        }
        return baseRealm.G().i(((DynamicRealmObject) realmModel).e()).f();
    }

    public static void g(Realm realm, RealmModel realmModel, long j2) {
        RealmProxyMediator o2 = realm.E().o();
        Class d2 = Util.d(realmModel.getClass());
        RealmProxyMediator realmProxyMediator = o2;
        Realm realm2 = realm;
        RealmModel realmModel2 = realmModel;
        realmProxyMediator.v(realm2, realmModel2, realmProxyMediator.t(d2, realm, realm.H0(d2).p(j2), realm.G().e(d2), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}
