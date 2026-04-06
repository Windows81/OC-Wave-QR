package io.realm;

import com.lokalise.sdk.local_db.LocaleConfig;
import io.realm.BaseRealm;
import io.realm.exceptions.RealmException;
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

public class com_lokalise_sdk_local_db_LocaleConfigRealmProxy extends LocaleConfig implements RealmObjectProxy, com_lokalise_sdk_local_db_LocaleConfigRealmProxyInterface {

    /* renamed from: B  reason: collision with root package name */
    public static final OsObjectSchemaInfo f40098B = f();

    /* renamed from: A  reason: collision with root package name */
    public ProxyState f40099A;

    /* renamed from: z  reason: collision with root package name */
    public LocaleConfigColumnInfo f40100z;

    public static final class ClassNameHelper {
    }

    public static final class LocaleConfigColumnInfo extends ColumnInfo {

        /* renamed from: e  reason: collision with root package name */
        public long f40101e;

        /* renamed from: f  reason: collision with root package name */
        public long f40102f;

        public LocaleConfigColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo b2 = osSchemaInfo.b("LocaleConfig");
            this.f40101e = a("langId", "langId", b2);
            this.f40102f = a("isDefault", "isDefault", b2);
        }

        public final void b(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            LocaleConfigColumnInfo localeConfigColumnInfo = (LocaleConfigColumnInfo) columnInfo;
            LocaleConfigColumnInfo localeConfigColumnInfo2 = (LocaleConfigColumnInfo) columnInfo2;
            localeConfigColumnInfo2.f40101e = localeConfigColumnInfo.f40101e;
            localeConfigColumnInfo2.f40102f = localeConfigColumnInfo.f40102f;
        }
    }

    public com_lokalise_sdk_local_db_LocaleConfigRealmProxy() {
        this.f40099A.n();
    }

    public static LocaleConfig c(Realm realm, LocaleConfigColumnInfo localeConfigColumnInfo, LocaleConfig localeConfig, boolean z2, Map map, Set set) {
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) map.get(localeConfig);
        if (realmObjectProxy != null) {
            return (LocaleConfig) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.H0(LocaleConfig.class), set);
        osObjectBuilder.d(localeConfigColumnInfo.f40101e, localeConfig.realmGet$langId());
        osObjectBuilder.a(localeConfigColumnInfo.f40102f, Boolean.valueOf(localeConfig.realmGet$isDefault()));
        com_lokalise_sdk_local_db_LocaleConfigRealmProxy k2 = k(realm, osObjectBuilder.f());
        map.put(localeConfig, k2);
        return k2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.lokalise.sdk.local_db.LocaleConfig d(io.realm.Realm r7, io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy.LocaleConfigColumnInfo r8, com.lokalise.sdk.local_db.LocaleConfig r9, boolean r10, java.util.Map r11, java.util.Set r12) {
        /*
            boolean r0 = r9 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x003e
            boolean r0 = io.realm.RealmObject.isFrozen(r9)
            if (r0 != 0) goto L_0x003e
            r0 = r9
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.b()
            io.realm.BaseRealm r1 = r1.d()
            if (r1 == 0) goto L_0x003e
            io.realm.ProxyState r0 = r0.b()
            io.realm.BaseRealm r0 = r0.d()
            long r1 = r0.f39851A
            long r3 = r7.f39851A
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
            java.lang.String r0 = r0.F()
            java.lang.String r1 = r7.F()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            return r9
        L_0x0036:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r7.<init>(r8)
            throw r7
        L_0x003e:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = io.realm.BaseRealm.J
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r11.get(r9)
            io.realm.internal.RealmObjectProxy r1 = (io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x0051
            com.lokalise.sdk.local_db.LocaleConfig r1 = (com.lokalise.sdk.local_db.LocaleConfig) r1
            return r1
        L_0x0051:
            r1 = 0
            if (r10 == 0) goto L_0x0087
            java.lang.Class<com.lokalise.sdk.local_db.LocaleConfig> r2 = com.lokalise.sdk.local_db.LocaleConfig.class
            io.realm.internal.Table r2 = r7.H0(r2)
            long r3 = r8.f40101e
            java.lang.String r5 = r9.realmGet$langId()
            long r3 = r2.b(r3, r5)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x006d
            r0 = 0
        L_0x006b:
            r3 = r1
            goto L_0x008e
        L_0x006d:
            io.realm.internal.UncheckedRow r3 = r2.p(r3)     // Catch:{ all -> 0x0089 }
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0089 }
            r5 = 0
            r1 = r0
            r2 = r7
            r4 = r8
            r1.g(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0089 }
            io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy r1 = new io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            r11.put(r9, r1)     // Catch:{ all -> 0x0089 }
            r0.a()
        L_0x0087:
            r0 = r10
            goto L_0x006b
        L_0x0089:
            r7 = move-exception
            r0.a()
            throw r7
        L_0x008e:
            if (r0 == 0) goto L_0x009a
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r11
            r6 = r12
            com.lokalise.sdk.local_db.LocaleConfig r7 = l(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            com.lokalise.sdk.local_db.LocaleConfig r7 = c(r7, r8, r9, r10, r11, r12)
        L_0x009e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy.d(io.realm.Realm, io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy$LocaleConfigColumnInfo, com.lokalise.sdk.local_db.LocaleConfig, boolean, java.util.Map, java.util.Set):com.lokalise.sdk.local_db.LocaleConfig");
    }

    public static LocaleConfigColumnInfo e(OsSchemaInfo osSchemaInfo) {
        return new LocaleConfigColumnInfo(osSchemaInfo);
    }

    private static OsObjectSchemaInfo f() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "LocaleConfig", false, 2, 0);
        builder.a("", "langId", RealmFieldType.STRING, true, false, true);
        builder.a("", "isDefault", RealmFieldType.BOOLEAN, false, false, true);
        return builder.b();
    }

    public static OsObjectSchemaInfo g() {
        return f40098B;
    }

    public static long h(Realm realm, LocaleConfig localeConfig, Map map) {
        if ((localeConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(localeConfig)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) localeConfig;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<LocaleConfig> cls = LocaleConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        LocaleConfigColumnInfo localeConfigColumnInfo = (LocaleConfigColumnInfo) realm.G().e(cls);
        long j2 = localeConfigColumnInfo.f40101e;
        String realmGet$langId = localeConfig.realmGet$langId();
        long nativeFindFirstString = realmGet$langId != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$langId) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(H0, j2, realmGet$langId);
        } else {
            Table.B(realmGet$langId);
        }
        long j3 = nativeFindFirstString;
        map.put(localeConfig, Long.valueOf(j3));
        Table.nativeSetBoolean(nativePtr, localeConfigColumnInfo.f40102f, j3, localeConfig.realmGet$isDefault(), false);
        return j3;
    }

    public static long i(Realm realm, LocaleConfig localeConfig, Map map) {
        if ((localeConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(localeConfig)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) localeConfig;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<LocaleConfig> cls = LocaleConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        LocaleConfigColumnInfo localeConfigColumnInfo = (LocaleConfigColumnInfo) realm.G().e(cls);
        long j2 = localeConfigColumnInfo.f40101e;
        String realmGet$langId = localeConfig.realmGet$langId();
        long nativeFindFirstString = realmGet$langId != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$langId) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(H0, j2, realmGet$langId);
        }
        long j3 = nativeFindFirstString;
        map.put(localeConfig, Long.valueOf(j3));
        Table.nativeSetBoolean(nativePtr, localeConfigColumnInfo.f40102f, j3, localeConfig.realmGet$isDefault(), false);
        return j3;
    }

    public static void j(Realm realm, Iterator it, Map map) {
        Map map2 = map;
        Class<LocaleConfig> cls = LocaleConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        LocaleConfigColumnInfo localeConfigColumnInfo = (LocaleConfigColumnInfo) realm.G().e(cls);
        long j2 = localeConfigColumnInfo.f40101e;
        while (it.hasNext()) {
            LocaleConfig localeConfig = (LocaleConfig) it.next();
            if (!map2.containsKey(localeConfig)) {
                if ((localeConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(localeConfig)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) localeConfig;
                    if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                        map2.put(localeConfig, Long.valueOf(realmObjectProxy.b().e().S()));
                    }
                }
                String realmGet$langId = localeConfig.realmGet$langId();
                long nativeFindFirstString = realmGet$langId != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$langId) : -1;
                if (nativeFindFirstString == -1) {
                    nativeFindFirstString = OsObject.createRowWithPrimaryKey(H0, j2, realmGet$langId);
                }
                map2.put(localeConfig, Long.valueOf(nativeFindFirstString));
                Table.nativeSetBoolean(nativePtr, localeConfigColumnInfo.f40102f, nativeFindFirstString, localeConfig.realmGet$isDefault(), false);
            }
        }
    }

    public static com_lokalise_sdk_local_db_LocaleConfigRealmProxy k(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
        realmObjectContext.g(baseRealm, row, baseRealm.G().e(LocaleConfig.class), false, Collections.emptyList());
        com_lokalise_sdk_local_db_LocaleConfigRealmProxy com_lokalise_sdk_local_db_localeconfigrealmproxy = new com_lokalise_sdk_local_db_LocaleConfigRealmProxy();
        realmObjectContext.a();
        return com_lokalise_sdk_local_db_localeconfigrealmproxy;
    }

    public static LocaleConfig l(Realm realm, LocaleConfigColumnInfo localeConfigColumnInfo, LocaleConfig localeConfig, LocaleConfig localeConfig2, Map map, Set set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.H0(LocaleConfig.class), set);
        osObjectBuilder.d(localeConfigColumnInfo.f40101e, localeConfig2.realmGet$langId());
        osObjectBuilder.a(localeConfigColumnInfo.f40102f, Boolean.valueOf(localeConfig2.realmGet$isDefault()));
        osObjectBuilder.g();
        return localeConfig;
    }

    public void a() {
        if (this.f40099A == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
            this.f40100z = (LocaleConfigColumnInfo) realmObjectContext.c();
            ProxyState proxyState = new ProxyState(this);
            this.f40099A = proxyState;
            proxyState.p(realmObjectContext.e());
            this.f40099A.q(realmObjectContext.f());
            this.f40099A.m(realmObjectContext.b());
            this.f40099A.o(realmObjectContext.d());
        }
    }

    public ProxyState b() {
        return this.f40099A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_lokalise_sdk_local_db_LocaleConfigRealmProxy com_lokalise_sdk_local_db_localeconfigrealmproxy = (com_lokalise_sdk_local_db_LocaleConfigRealmProxy) obj;
        BaseRealm d2 = this.f40099A.d();
        BaseRealm d3 = com_lokalise_sdk_local_db_localeconfigrealmproxy.f40099A.d();
        String F = d2.F();
        String F2 = d3.F();
        if (F == null ? F2 != null : !F.equals(F2)) {
            return false;
        }
        if (d2.N() != d3.N() || !d2.D.getVersionID().equals(d3.D.getVersionID())) {
            return false;
        }
        String m2 = this.f40099A.e().j().m();
        String m3 = com_lokalise_sdk_local_db_localeconfigrealmproxy.f40099A.e().j().m();
        if (m2 == null ? m3 == null : m2.equals(m3)) {
            return this.f40099A.e().S() == com_lokalise_sdk_local_db_localeconfigrealmproxy.f40099A.e().S();
        }
        return false;
    }

    public int hashCode() {
        String F = this.f40099A.d().F();
        String m2 = this.f40099A.e().j().m();
        long S = this.f40099A.e().S();
        int i2 = 0;
        int hashCode = (527 + (F != null ? F.hashCode() : 0)) * 31;
        if (m2 != null) {
            i2 = m2.hashCode();
        }
        return ((hashCode + i2) * 31) + ((int) ((S >>> 32) ^ S));
    }

    public boolean realmGet$isDefault() {
        this.f40099A.d().j();
        return this.f40099A.e().o(this.f40100z.f40102f);
    }

    public String realmGet$langId() {
        this.f40099A.d().j();
        return this.f40099A.e().I(this.f40100z.f40101e);
    }

    public void realmSet$isDefault(boolean z2) {
        if (!this.f40099A.g()) {
            this.f40099A.d().j();
            this.f40099A.e().k(this.f40100z.f40102f, z2);
        } else if (this.f40099A.c()) {
            Row e2 = this.f40099A.e();
            e2.j().x(this.f40100z.f40102f, e2.S(), z2, true);
        }
    }

    public void realmSet$langId(String str) {
        if (!this.f40099A.g()) {
            this.f40099A.d().j();
            throw new RealmException("Primary key field 'langId' cannot be changed after object was created.");
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "LocaleConfig = proxy[" + "{langId:" + realmGet$langId() + "}" + "," + "{isDefault:" + realmGet$isDefault() + "}" + "]";
    }
}
