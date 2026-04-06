package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

class LinkSelectorForMap<K, V extends RealmModel> extends SelectorForMap<K, V> {
    public Map.Entry a(BaseRealm baseRealm, long j2, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, baseRealm.C(this.f40070d, (String) null, j2));
    }

    /* renamed from: g */
    public RealmModel b(BaseRealm baseRealm, long j2) {
        return baseRealm.C(this.f40070d, (String) null, j2);
    }

    /* renamed from: h */
    public RealmModel e(BaseRealm baseRealm, OsMap osMap, Object obj, RealmModel realmModel) {
        long k2 = osMap.k(obj);
        if (realmModel == null) {
            osMap.m(obj, (Object) null);
        } else if (baseRealm.G().h(this.f40070d).f()) {
            CollectionUtils.g((Realm) baseRealm, realmModel, osMap.f(obj));
        } else {
            if (CollectionUtils.a(baseRealm, realmModel, this.f40070d.getSimpleName(), "dictionary")) {
                realmModel = CollectionUtils.c(baseRealm, realmModel);
            }
            osMap.o(obj, ((RealmObjectProxy) realmModel).b().e().S());
        }
        if (k2 == -1) {
            return null;
        }
        return baseRealm.A(this.f40070d, k2, false, new ArrayList());
    }
}
