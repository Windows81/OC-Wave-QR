package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.util.Pair;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class DynamicSelectorForMap<K> extends TypeSelectorForMap<K, DynamicRealmObject> {

    /* renamed from: c  reason: collision with root package name */
    public final String f39887c;

    public Map.Entry a(BaseRealm baseRealm, long j2, Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, (DynamicRealmObject) baseRealm.C(DynamicRealmObject.class, this.f39887c, j2));
    }

    public Collection c() {
        return g(this.f40087a, this.f40088b.s(), this.f39887c);
    }

    public Set d() {
        return new HashSet(g(this.f40087a, this.f40088b.r(), this.f39887c));
    }

    /* renamed from: f */
    public DynamicRealmObject b(BaseRealm baseRealm, long j2) {
        return (DynamicRealmObject) baseRealm.C(DynamicRealmObject.class, this.f39887c, j2);
    }

    public final RealmResults g(BaseRealm baseRealm, Pair pair, String str) {
        return new RealmResults(baseRealm, OsResults.f(baseRealm.D, ((Long) pair.f40372b).longValue()), str, false);
    }

    /* renamed from: h */
    public DynamicRealmObject e(BaseRealm baseRealm, OsMap osMap, Object obj, DynamicRealmObject dynamicRealmObject) {
        long k2 = osMap.k(obj);
        if (dynamicRealmObject == null) {
            osMap.m(obj, (Object) null);
        } else if (baseRealm.G().i(this.f39887c).f()) {
            CollectionUtils.g((Realm) baseRealm, dynamicRealmObject, osMap.f(obj));
        } else {
            if (CollectionUtils.a(baseRealm, dynamicRealmObject, this.f39887c, "dictionary")) {
                dynamicRealmObject = (DynamicRealmObject) CollectionUtils.c(baseRealm, dynamicRealmObject);
            }
            osMap.o(obj, dynamicRealmObject.b().e().S());
        }
        if (k2 == -1) {
            return null;
        }
        return (DynamicRealmObject) baseRealm.C(DynamicRealmObject.class, this.f39887c, k2);
    }
}
