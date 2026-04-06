package io.realm.internal;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class RealmProxyMediator {
    public static void a(Class cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static void b(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static RealmException h(Class cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{cls.toString()}));
    }

    public static RealmException i(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", new Object[]{str}));
    }

    public static IllegalStateException k(String str) {
        return new IllegalStateException("This class is not marked embedded: " + str);
    }

    public abstract RealmModel c(Realm realm, RealmModel realmModel, boolean z2, Map map, Set set);

    public abstract ColumnInfo d(Class cls, OsSchemaInfo osSchemaInfo);

    public final Class e(String str) {
        return f(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RealmProxyMediator)) {
            return false;
        }
        return j().equals(((RealmProxyMediator) obj).j());
    }

    public abstract Class f(String str);

    public abstract Map g();

    public int hashCode() {
        return j().hashCode();
    }

    public abstract Set j();

    public final String l(Class cls) {
        return m(Util.d(cls));
    }

    public abstract String m(Class cls);

    public boolean n(Class cls) {
        return o(cls);
    }

    public abstract boolean o(Class cls);

    public abstract long p(Realm realm, RealmModel realmModel, Map map);

    public abstract long q(Realm realm, RealmModel realmModel, Map map);

    public abstract void r(Realm realm, Collection collection);

    public abstract boolean s(Class cls);

    public abstract RealmModel t(Class cls, Object obj, Row row, ColumnInfo columnInfo, boolean z2, List list);

    public boolean u() {
        return false;
    }

    public abstract void v(Realm realm, RealmModel realmModel, RealmModel realmModel2, Map map, Set set);
}
