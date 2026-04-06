package io.realm.internal.modules;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilterableMediator extends RealmProxyMediator {

    /* renamed from: a  reason: collision with root package name */
    public final RealmProxyMediator f40346a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f40347b;

    public FilterableMediator(RealmProxyMediator realmProxyMediator, Collection collection, boolean z2) {
        this.f40346a = realmProxyMediator;
        HashSet hashSet = new HashSet();
        if (realmProxyMediator != null) {
            Set<Class> j2 = realmProxyMediator.j();
            if (!z2) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (j2.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class cls2 : j2) {
                    if (!collection.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.f40347b = Collections.unmodifiableSet(hashSet);
    }

    public RealmModel c(Realm realm, RealmModel realmModel, boolean z2, Map map, Set set) {
        w(Util.d(realmModel.getClass()));
        return this.f40346a.c(realm, realmModel, z2, map, set);
    }

    public ColumnInfo d(Class cls, OsSchemaInfo osSchemaInfo) {
        w(cls);
        return this.f40346a.d(cls, osSchemaInfo);
    }

    public Class f(String str) {
        return this.f40346a.e(str);
    }

    public Map g() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f40346a.g().entrySet()) {
            if (this.f40347b.contains(entry.getKey())) {
                hashMap.put((Class) entry.getKey(), (OsObjectSchemaInfo) entry.getValue());
            }
        }
        return hashMap;
    }

    public Set j() {
        return this.f40347b;
    }

    public String m(Class cls) {
        w(cls);
        return this.f40346a.l(cls);
    }

    public boolean o(Class cls) {
        return this.f40346a.n(cls);
    }

    public long p(Realm realm, RealmModel realmModel, Map map) {
        w(Util.d(realmModel.getClass()));
        return this.f40346a.p(realm, realmModel, map);
    }

    public long q(Realm realm, RealmModel realmModel, Map map) {
        w(Util.d(realmModel.getClass()));
        return this.f40346a.q(realm, realmModel, map);
    }

    public void r(Realm realm, Collection collection) {
        w(Util.d(((RealmModel) collection.iterator().next()).getClass()));
        this.f40346a.r(realm, collection);
    }

    public boolean s(Class cls) {
        w(Util.d(cls));
        return this.f40346a.s(cls);
    }

    public RealmModel t(Class cls, Object obj, Row row, ColumnInfo columnInfo, boolean z2, List list) {
        w(cls);
        return this.f40346a.t(cls, obj, row, columnInfo, z2, list);
    }

    public boolean u() {
        RealmProxyMediator realmProxyMediator = this.f40346a;
        if (realmProxyMediator == null) {
            return true;
        }
        return realmProxyMediator.u();
    }

    public void v(Realm realm, RealmModel realmModel, RealmModel realmModel2, Map map, Set set) {
        w(Util.d(realmModel2.getClass()));
        this.f40346a.v(realm, realmModel, realmModel2, map, set);
    }

    public final void w(Class cls) {
        if (!this.f40347b.contains(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
        }
    }
}
