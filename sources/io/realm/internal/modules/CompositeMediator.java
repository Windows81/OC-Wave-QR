package io.realm.internal.modules;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompositeMediator extends RealmProxyMediator {

    /* renamed from: a  reason: collision with root package name */
    public final Map f40344a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f40345b = new HashMap();

    public CompositeMediator(RealmProxyMediator... realmProxyMediatorArr) {
        HashMap hashMap = new HashMap();
        if (realmProxyMediatorArr != null) {
            for (RealmProxyMediator realmProxyMediator : realmProxyMediatorArr) {
                for (Class cls : realmProxyMediator.j()) {
                    String l2 = realmProxyMediator.l(cls);
                    Class cls2 = (Class) this.f40345b.get(l2);
                    if (cls2 == null || cls2.equals(cls)) {
                        hashMap.put(cls, realmProxyMediator);
                        this.f40345b.put(l2, cls);
                    } else {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", new Object[]{cls2, cls, hashMap.get(cls2), realmProxyMediator, l2}));
                    }
                }
            }
        }
        this.f40344a = Collections.unmodifiableMap(hashMap);
    }

    public RealmModel c(Realm realm, RealmModel realmModel, boolean z2, Map map, Set set) {
        return w(Util.d(realmModel.getClass())).c(realm, realmModel, z2, map, set);
    }

    public ColumnInfo d(Class cls, OsSchemaInfo osSchemaInfo) {
        return w(cls).d(cls, osSchemaInfo);
    }

    public Class f(String str) {
        return x(str).e(str);
    }

    public Map g() {
        HashMap hashMap = new HashMap();
        for (RealmProxyMediator g2 : this.f40344a.values()) {
            hashMap.putAll(g2.g());
        }
        return hashMap;
    }

    public Set j() {
        return this.f40344a.keySet();
    }

    public String m(Class cls) {
        return w(cls).l(cls);
    }

    public boolean o(Class cls) {
        return w(cls).n(cls);
    }

    public long p(Realm realm, RealmModel realmModel, Map map) {
        return w(Util.d(realmModel.getClass())).p(realm, realmModel, map);
    }

    public long q(Realm realm, RealmModel realmModel, Map map) {
        return w(Util.d(realmModel.getClass())).q(realm, realmModel, map);
    }

    public void r(Realm realm, Collection collection) {
        w(Util.d(Util.d(((RealmModel) collection.iterator().next()).getClass()))).r(realm, collection);
    }

    public boolean s(Class cls) {
        return w(Util.d(cls)).s(cls);
    }

    public RealmModel t(Class cls, Object obj, Row row, ColumnInfo columnInfo, boolean z2, List list) {
        return w(cls).t(cls, obj, row, columnInfo, z2, list);
    }

    public boolean u() {
        for (Map.Entry value : this.f40344a.entrySet()) {
            if (!((RealmProxyMediator) value.getValue()).u()) {
                return false;
            }
        }
        return true;
    }

    public void v(Realm realm, RealmModel realmModel, RealmModel realmModel2, Map map, Set set) {
        w(Util.d(realmModel2.getClass())).v(realm, realmModel, realmModel2, map, set);
    }

    public final RealmProxyMediator w(Class cls) {
        RealmProxyMediator realmProxyMediator = (RealmProxyMediator) this.f40344a.get(Util.d(cls));
        if (realmProxyMediator != null) {
            return realmProxyMediator;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    public final RealmProxyMediator x(String str) {
        return w((Class) this.f40345b.get(str));
    }
}
