package io.realm;

import io.realm.internal.ColumnIndices;
import io.realm.internal.ColumnInfo;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;

public abstract class RealmSchema {

    /* renamed from: a  reason: collision with root package name */
    public final Map f40058a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f40059b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f40060c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f40061d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public OsKeyPathMapping f40062e = null;

    /* renamed from: f  reason: collision with root package name */
    public final BaseRealm f40063f;

    /* renamed from: g  reason: collision with root package name */
    public final ColumnIndices f40064g;

    public RealmSchema(BaseRealm baseRealm, ColumnIndices columnIndices) {
        this.f40063f = baseRealm;
        this.f40064g = columnIndices;
    }

    public final void a() {
        if (!l()) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    public void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(str2);
        }
    }

    public void c() {
        this.f40062e = new OsKeyPathMapping(this.f40063f.D.getNativePtr());
    }

    public abstract RealmObjectSchema d(String str);

    public final ColumnInfo e(Class cls) {
        a();
        return this.f40064g.a(cls);
    }

    public final ColumnInfo f(String str) {
        a();
        return this.f40064g.b(str);
    }

    public final OsKeyPathMapping g() {
        return this.f40062e;
    }

    public RealmObjectSchema h(Class cls) {
        ImmutableRealmObjectSchema immutableRealmObjectSchema = (RealmObjectSchema) this.f40060c.get(cls);
        if (immutableRealmObjectSchema != null) {
            return immutableRealmObjectSchema;
        }
        Class d2 = Util.d(cls);
        if (m(d2, cls)) {
            immutableRealmObjectSchema = (RealmObjectSchema) this.f40060c.get(d2);
        }
        if (immutableRealmObjectSchema == null) {
            ImmutableRealmObjectSchema immutableRealmObjectSchema2 = new ImmutableRealmObjectSchema(this.f40063f, this, j(cls), e(d2));
            this.f40060c.put(d2, immutableRealmObjectSchema2);
            immutableRealmObjectSchema = immutableRealmObjectSchema2;
        }
        if (m(d2, cls)) {
            this.f40060c.put(cls, immutableRealmObjectSchema);
        }
        return immutableRealmObjectSchema;
    }

    public RealmObjectSchema i(String str) {
        String o2 = Table.o(str);
        RealmObjectSchema realmObjectSchema = (RealmObjectSchema) this.f40061d.get(o2);
        if (realmObjectSchema != null && realmObjectSchema.e().u() && realmObjectSchema.c().equals(str)) {
            return realmObjectSchema;
        }
        if (this.f40063f.H().hasTable(o2)) {
            BaseRealm baseRealm = this.f40063f;
            ImmutableRealmObjectSchema immutableRealmObjectSchema = new ImmutableRealmObjectSchema(baseRealm, this, baseRealm.H().getTable(o2));
            this.f40061d.put(o2, immutableRealmObjectSchema);
            return immutableRealmObjectSchema;
        }
        throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
    }

    public Table j(Class cls) {
        Table table = (Table) this.f40059b.get(cls);
        if (table != null) {
            return table;
        }
        Class d2 = Util.d(cls);
        if (m(d2, cls)) {
            table = (Table) this.f40059b.get(d2);
        }
        if (table == null) {
            table = this.f40063f.H().getTable(Table.o(this.f40063f.E().o().l(d2)));
            this.f40059b.put(d2, table);
        }
        if (m(d2, cls)) {
            this.f40059b.put(cls, table);
        }
        return table;
    }

    public Table k(String str) {
        String o2 = Table.o(str);
        Table table = (Table) this.f40058a.get(o2);
        if (table != null) {
            return table;
        }
        Table table2 = this.f40063f.H().getTable(o2);
        this.f40058a.put(o2, table2);
        return table2;
    }

    public final boolean l() {
        return this.f40064g != null;
    }

    public final boolean m(Class cls, Class cls2) {
        return cls.equals(cls2);
    }

    public void n() {
        ColumnIndices columnIndices = this.f40064g;
        if (columnIndices != null) {
            columnIndices.c();
        }
        this.f40058a.clear();
        this.f40059b.clear();
        this.f40060c.clear();
        this.f40061d.clear();
    }
}
