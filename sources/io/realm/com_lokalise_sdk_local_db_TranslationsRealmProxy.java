package io.realm;

import com.lokalise.sdk.local_db.Translations;
import io.realm.BaseRealm;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class com_lokalise_sdk_local_db_TranslationsRealmProxy extends Translations implements RealmObjectProxy, com_lokalise_sdk_local_db_TranslationsRealmProxyInterface {

    /* renamed from: B  reason: collision with root package name */
    public static final OsObjectSchemaInfo f40103B = f();

    /* renamed from: A  reason: collision with root package name */
    public ProxyState f40104A;

    /* renamed from: z  reason: collision with root package name */
    public TranslationsColumnInfo f40105z;

    public static final class ClassNameHelper {
    }

    public static final class TranslationsColumnInfo extends ColumnInfo {

        /* renamed from: e  reason: collision with root package name */
        public long f40106e;

        /* renamed from: f  reason: collision with root package name */
        public long f40107f;

        /* renamed from: g  reason: collision with root package name */
        public long f40108g;

        /* renamed from: h  reason: collision with root package name */
        public long f40109h;

        public TranslationsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b2 = osSchemaInfo.b("Translations");
            this.f40106e = a("key", "key", b2);
            this.f40107f = a("value", "value", b2);
            this.f40108g = a("type", "type", b2);
            this.f40109h = a("langId", "langId", b2);
        }

        public final void b(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TranslationsColumnInfo translationsColumnInfo = (TranslationsColumnInfo) columnInfo;
            TranslationsColumnInfo translationsColumnInfo2 = (TranslationsColumnInfo) columnInfo2;
            translationsColumnInfo2.f40106e = translationsColumnInfo.f40106e;
            translationsColumnInfo2.f40107f = translationsColumnInfo.f40107f;
            translationsColumnInfo2.f40108g = translationsColumnInfo.f40108g;
            translationsColumnInfo2.f40109h = translationsColumnInfo.f40109h;
        }
    }

    public com_lokalise_sdk_local_db_TranslationsRealmProxy() {
        this.f40104A.n();
    }

    public static Translations c(Realm realm, TranslationsColumnInfo translationsColumnInfo, Translations translations, boolean z2, Map map, Set set) {
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) map.get(translations);
        if (realmObjectProxy != null) {
            return (Translations) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.H0(Translations.class), set);
        osObjectBuilder.d(translationsColumnInfo.f40106e, translations.realmGet$key());
        osObjectBuilder.d(translationsColumnInfo.f40107f, translations.realmGet$value());
        osObjectBuilder.b(translationsColumnInfo.f40108g, Integer.valueOf(translations.realmGet$type()));
        osObjectBuilder.d(translationsColumnInfo.f40109h, translations.realmGet$langId());
        com_lokalise_sdk_local_db_TranslationsRealmProxy k2 = k(realm, osObjectBuilder.f());
        map.put(translations, k2);
        return k2;
    }

    public static Translations d(Realm realm, TranslationsColumnInfo translationsColumnInfo, Translations translations, boolean z2, Map map, Set set) {
        if ((translations instanceof RealmObjectProxy) && !RealmObject.isFrozen(translations)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) translations;
            if (realmObjectProxy.b().d() != null) {
                BaseRealm d2 = realmObjectProxy.b().d();
                if (d2.f39851A != realm.f39851A) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (d2.F().equals(realm.F())) {
                    return translations;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
        RealmObjectProxy realmObjectProxy2 = (RealmObjectProxy) map.get(translations);
        return realmObjectProxy2 != null ? (Translations) realmObjectProxy2 : c(realm, translationsColumnInfo, translations, z2, map, set);
    }

    public static TranslationsColumnInfo e(OsSchemaInfo osSchemaInfo) {
        return new TranslationsColumnInfo(osSchemaInfo);
    }

    private static OsObjectSchemaInfo f() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Translations", false, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        RealmFieldType realmFieldType2 = realmFieldType;
        builder.a("", "key", realmFieldType2, false, true, true);
        builder.a("", "value", realmFieldType2, false, false, true);
        builder.a("", "type", RealmFieldType.INTEGER, false, false, true);
        builder.a("", "langId", realmFieldType, false, false, true);
        return builder.b();
    }

    public static OsObjectSchemaInfo g() {
        return f40103B;
    }

    public static long h(Realm realm, Translations translations, Map map) {
        if ((translations instanceof RealmObjectProxy) && !RealmObject.isFrozen(translations)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) translations;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<Translations> cls = Translations.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        TranslationsColumnInfo translationsColumnInfo = (TranslationsColumnInfo) realm.G().e(cls);
        long createRow = OsObject.createRow(H0);
        map.put(translations, Long.valueOf(createRow));
        String realmGet$key = translations.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40106e, createRow, realmGet$key, false);
        }
        String realmGet$value = translations.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40107f, createRow, realmGet$value, false);
        }
        Table.nativeSetLong(nativePtr, translationsColumnInfo.f40108g, createRow, (long) translations.realmGet$type(), false);
        String realmGet$langId = translations.realmGet$langId();
        if (realmGet$langId != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40109h, createRow, realmGet$langId, false);
        }
        return createRow;
    }

    public static long i(Realm realm, Translations translations, Map map) {
        if ((translations instanceof RealmObjectProxy) && !RealmObject.isFrozen(translations)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) translations;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<Translations> cls = Translations.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        TranslationsColumnInfo translationsColumnInfo = (TranslationsColumnInfo) realm.G().e(cls);
        long createRow = OsObject.createRow(H0);
        map.put(translations, Long.valueOf(createRow));
        String realmGet$key = translations.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40106e, createRow, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, translationsColumnInfo.f40106e, createRow, false);
        }
        String realmGet$value = translations.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40107f, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, translationsColumnInfo.f40107f, createRow, false);
        }
        Table.nativeSetLong(nativePtr, translationsColumnInfo.f40108g, createRow, (long) translations.realmGet$type(), false);
        String realmGet$langId = translations.realmGet$langId();
        if (realmGet$langId != null) {
            Table.nativeSetString(nativePtr, translationsColumnInfo.f40109h, createRow, realmGet$langId, false);
        } else {
            Table.nativeSetNull(nativePtr, translationsColumnInfo.f40109h, createRow, false);
        }
        return createRow;
    }

    public static void j(Realm realm, Iterator it, Map map) {
        Map map2 = map;
        Class<Translations> cls = Translations.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        TranslationsColumnInfo translationsColumnInfo = (TranslationsColumnInfo) realm.G().e(cls);
        while (it.hasNext()) {
            Translations translations = (Translations) it.next();
            if (!map2.containsKey(translations)) {
                if ((translations instanceof RealmObjectProxy) && !RealmObject.isFrozen(translations)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) translations;
                    if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                        map2.put(translations, Long.valueOf(realmObjectProxy.b().e().S()));
                    }
                }
                long createRow = OsObject.createRow(H0);
                map2.put(translations, Long.valueOf(createRow));
                String realmGet$key = translations.realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(nativePtr, translationsColumnInfo.f40106e, createRow, realmGet$key, false);
                } else {
                    Table.nativeSetNull(nativePtr, translationsColumnInfo.f40106e, createRow, false);
                }
                String realmGet$value = translations.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, translationsColumnInfo.f40107f, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, translationsColumnInfo.f40107f, createRow, false);
                }
                Table.nativeSetLong(nativePtr, translationsColumnInfo.f40108g, createRow, (long) translations.realmGet$type(), false);
                String realmGet$langId = translations.realmGet$langId();
                if (realmGet$langId != null) {
                    Table.nativeSetString(nativePtr, translationsColumnInfo.f40109h, createRow, realmGet$langId, false);
                } else {
                    Table.nativeSetNull(nativePtr, translationsColumnInfo.f40109h, createRow, false);
                }
            }
        }
    }

    public static com_lokalise_sdk_local_db_TranslationsRealmProxy k(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
        realmObjectContext.g(baseRealm, row, baseRealm.G().e(Translations.class), false, Collections.emptyList());
        com_lokalise_sdk_local_db_TranslationsRealmProxy com_lokalise_sdk_local_db_translationsrealmproxy = new com_lokalise_sdk_local_db_TranslationsRealmProxy();
        realmObjectContext.a();
        return com_lokalise_sdk_local_db_translationsrealmproxy;
    }

    public void a() {
        if (this.f40104A == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
            this.f40105z = (TranslationsColumnInfo) realmObjectContext.c();
            ProxyState proxyState = new ProxyState(this);
            this.f40104A = proxyState;
            proxyState.p(realmObjectContext.e());
            this.f40104A.q(realmObjectContext.f());
            this.f40104A.m(realmObjectContext.b());
            this.f40104A.o(realmObjectContext.d());
        }
    }

    public ProxyState b() {
        return this.f40104A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_lokalise_sdk_local_db_TranslationsRealmProxy com_lokalise_sdk_local_db_translationsrealmproxy = (com_lokalise_sdk_local_db_TranslationsRealmProxy) obj;
        BaseRealm d2 = this.f40104A.d();
        BaseRealm d3 = com_lokalise_sdk_local_db_translationsrealmproxy.f40104A.d();
        String F = d2.F();
        String F2 = d3.F();
        if (F == null ? F2 != null : !F.equals(F2)) {
            return false;
        }
        if (d2.N() != d3.N() || !d2.D.getVersionID().equals(d3.D.getVersionID())) {
            return false;
        }
        String m2 = this.f40104A.e().j().m();
        String m3 = com_lokalise_sdk_local_db_translationsrealmproxy.f40104A.e().j().m();
        if (m2 == null ? m3 == null : m2.equals(m3)) {
            return this.f40104A.e().S() == com_lokalise_sdk_local_db_translationsrealmproxy.f40104A.e().S();
        }
        return false;
    }

    public int hashCode() {
        String F = this.f40104A.d().F();
        String m2 = this.f40104A.e().j().m();
        long S = this.f40104A.e().S();
        int i2 = 0;
        int hashCode = (527 + (F != null ? F.hashCode() : 0)) * 31;
        if (m2 != null) {
            i2 = m2.hashCode();
        }
        return ((hashCode + i2) * 31) + ((int) ((S >>> 32) ^ S));
    }

    public String realmGet$key() {
        this.f40104A.d().j();
        return this.f40104A.e().I(this.f40105z.f40106e);
    }

    public String realmGet$langId() {
        this.f40104A.d().j();
        return this.f40104A.e().I(this.f40105z.f40109h);
    }

    public int realmGet$type() {
        this.f40104A.d().j();
        return (int) this.f40104A.e().p(this.f40105z.f40108g);
    }

    public String realmGet$value() {
        this.f40104A.d().j();
        return this.f40104A.e().I(this.f40105z.f40107f);
    }

    public void realmSet$key(String str) {
        if (!this.f40104A.g()) {
            this.f40104A.d().j();
            if (str != null) {
                this.f40104A.e().h(this.f40105z.f40106e, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
        } else if (this.f40104A.c()) {
            Row e2 = this.f40104A.e();
            if (str != null) {
                e2.j().z(this.f40105z.f40106e, e2.S(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
        }
    }

    public void realmSet$langId(String str) {
        if (!this.f40104A.g()) {
            this.f40104A.d().j();
            if (str != null) {
                this.f40104A.e().h(this.f40105z.f40109h, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'langId' to null.");
        } else if (this.f40104A.c()) {
            Row e2 = this.f40104A.e();
            if (str != null) {
                e2.j().z(this.f40105z.f40109h, e2.S(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'langId' to null.");
        }
    }

    public void realmSet$type(int i2) {
        if (!this.f40104A.g()) {
            this.f40104A.d().j();
            this.f40104A.e().t(this.f40105z.f40108g, (long) i2);
        } else if (this.f40104A.c()) {
            Row e2 = this.f40104A.e();
            e2.j().y(this.f40105z.f40108g, e2.S(), (long) i2, true);
        }
    }

    public void realmSet$value(String str) {
        if (!this.f40104A.g()) {
            this.f40104A.d().j();
            if (str != null) {
                this.f40104A.e().h(this.f40105z.f40107f, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        } else if (this.f40104A.c()) {
            Row e2 = this.f40104A.e();
            if (str != null) {
                e2.j().z(this.f40105z.f40107f, e2.S(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Translations = proxy[" + "{key:" + realmGet$key() + "}" + "," + "{value:" + realmGet$value() + "}" + "," + "{type:" + realmGet$type() + "}" + "," + "{langId:" + realmGet$langId() + "}" + "]";
    }
}
