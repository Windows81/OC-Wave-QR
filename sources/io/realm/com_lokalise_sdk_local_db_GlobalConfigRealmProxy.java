package io.realm;

import com.lokalise.sdk.local_db.GlobalConfig;
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

public class com_lokalise_sdk_local_db_GlobalConfigRealmProxy extends GlobalConfig implements RealmObjectProxy, com_lokalise_sdk_local_db_GlobalConfigRealmProxyInterface {

    /* renamed from: B  reason: collision with root package name */
    public static final OsObjectSchemaInfo f40092B = f();

    /* renamed from: A  reason: collision with root package name */
    public ProxyState f40093A;

    /* renamed from: z  reason: collision with root package name */
    public GlobalConfigColumnInfo f40094z;

    public static final class ClassNameHelper {
    }

    public static final class GlobalConfigColumnInfo extends ColumnInfo {

        /* renamed from: e  reason: collision with root package name */
        public long f40095e;

        /* renamed from: f  reason: collision with root package name */
        public long f40096f;

        /* renamed from: g  reason: collision with root package name */
        public long f40097g;

        public GlobalConfigColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b2 = osSchemaInfo.b("GlobalConfig");
            this.f40095e = a("userUUID", "userUUID", b2);
            this.f40096f = a("bundleId", "bundleId", b2);
            this.f40097g = a("lastKnownAppVersion", "lastKnownAppVersion", b2);
        }

        public final void b(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            GlobalConfigColumnInfo globalConfigColumnInfo = (GlobalConfigColumnInfo) columnInfo;
            GlobalConfigColumnInfo globalConfigColumnInfo2 = (GlobalConfigColumnInfo) columnInfo2;
            globalConfigColumnInfo2.f40095e = globalConfigColumnInfo.f40095e;
            globalConfigColumnInfo2.f40096f = globalConfigColumnInfo.f40096f;
            globalConfigColumnInfo2.f40097g = globalConfigColumnInfo.f40097g;
        }
    }

    public com_lokalise_sdk_local_db_GlobalConfigRealmProxy() {
        this.f40093A.n();
    }

    public static GlobalConfig c(Realm realm, GlobalConfigColumnInfo globalConfigColumnInfo, GlobalConfig globalConfig, boolean z2, Map map, Set set) {
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) map.get(globalConfig);
        if (realmObjectProxy != null) {
            return (GlobalConfig) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.H0(GlobalConfig.class), set);
        osObjectBuilder.d(globalConfigColumnInfo.f40095e, globalConfig.realmGet$userUUID());
        osObjectBuilder.c(globalConfigColumnInfo.f40096f, Long.valueOf(globalConfig.realmGet$bundleId()));
        osObjectBuilder.d(globalConfigColumnInfo.f40097g, globalConfig.realmGet$lastKnownAppVersion());
        com_lokalise_sdk_local_db_GlobalConfigRealmProxy k2 = k(realm, osObjectBuilder.f());
        map.put(globalConfig, k2);
        return k2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.lokalise.sdk.local_db.GlobalConfig d(io.realm.Realm r7, io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy.GlobalConfigColumnInfo r8, com.lokalise.sdk.local_db.GlobalConfig r9, boolean r10, java.util.Map r11, java.util.Set r12) {
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
            com.lokalise.sdk.local_db.GlobalConfig r1 = (com.lokalise.sdk.local_db.GlobalConfig) r1
            return r1
        L_0x0051:
            r1 = 0
            if (r10 == 0) goto L_0x0087
            java.lang.Class<com.lokalise.sdk.local_db.GlobalConfig> r2 = com.lokalise.sdk.local_db.GlobalConfig.class
            io.realm.internal.Table r2 = r7.H0(r2)
            long r3 = r8.f40095e
            java.lang.String r5 = r9.realmGet$userUUID()
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
            io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy r1 = new io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy     // Catch:{ all -> 0x0089 }
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
            com.lokalise.sdk.local_db.GlobalConfig r7 = l(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            com.lokalise.sdk.local_db.GlobalConfig r7 = c(r7, r8, r9, r10, r11, r12)
        L_0x009e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy.d(io.realm.Realm, io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy$GlobalConfigColumnInfo, com.lokalise.sdk.local_db.GlobalConfig, boolean, java.util.Map, java.util.Set):com.lokalise.sdk.local_db.GlobalConfig");
    }

    public static GlobalConfigColumnInfo e(OsSchemaInfo osSchemaInfo) {
        return new GlobalConfigColumnInfo(osSchemaInfo);
    }

    public static OsObjectSchemaInfo f() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "GlobalConfig", false, 3, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        builder.a("", "userUUID", realmFieldType, true, false, true);
        builder.a("", "bundleId", RealmFieldType.INTEGER, false, false, true);
        builder.a("", "lastKnownAppVersion", realmFieldType, false, false, true);
        return builder.b();
    }

    public static OsObjectSchemaInfo g() {
        return f40092B;
    }

    public static long h(Realm realm, GlobalConfig globalConfig, Map map) {
        if ((globalConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(globalConfig)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) globalConfig;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<GlobalConfig> cls = GlobalConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        GlobalConfigColumnInfo globalConfigColumnInfo = (GlobalConfigColumnInfo) realm.G().e(cls);
        long j2 = globalConfigColumnInfo.f40095e;
        String realmGet$userUUID = globalConfig.realmGet$userUUID();
        long nativeFindFirstString = realmGet$userUUID != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$userUUID) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(H0, j2, realmGet$userUUID);
        } else {
            Table.B(realmGet$userUUID);
        }
        long j3 = nativeFindFirstString;
        map.put(globalConfig, Long.valueOf(j3));
        Table.nativeSetLong(nativePtr, globalConfigColumnInfo.f40096f, j3, globalConfig.realmGet$bundleId(), false);
        String realmGet$lastKnownAppVersion = globalConfig.realmGet$lastKnownAppVersion();
        if (realmGet$lastKnownAppVersion != null) {
            Table.nativeSetString(nativePtr, globalConfigColumnInfo.f40097g, j3, realmGet$lastKnownAppVersion, false);
        }
        return j3;
    }

    public static long i(Realm realm, GlobalConfig globalConfig, Map map) {
        if ((globalConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(globalConfig)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) globalConfig;
            if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                return realmObjectProxy.b().e().S();
            }
        }
        Class<GlobalConfig> cls = GlobalConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        GlobalConfigColumnInfo globalConfigColumnInfo = (GlobalConfigColumnInfo) realm.G().e(cls);
        long j2 = globalConfigColumnInfo.f40095e;
        String realmGet$userUUID = globalConfig.realmGet$userUUID();
        long nativeFindFirstString = realmGet$userUUID != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$userUUID) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(H0, j2, realmGet$userUUID);
        }
        long j3 = nativeFindFirstString;
        map.put(globalConfig, Long.valueOf(j3));
        Table.nativeSetLong(nativePtr, globalConfigColumnInfo.f40096f, j3, globalConfig.realmGet$bundleId(), false);
        String realmGet$lastKnownAppVersion = globalConfig.realmGet$lastKnownAppVersion();
        if (realmGet$lastKnownAppVersion != null) {
            Table.nativeSetString(nativePtr, globalConfigColumnInfo.f40097g, j3, realmGet$lastKnownAppVersion, false);
        } else {
            Table.nativeSetNull(nativePtr, globalConfigColumnInfo.f40097g, j3, false);
        }
        return j3;
    }

    public static void j(Realm realm, Iterator it, Map map) {
        Map map2 = map;
        Class<GlobalConfig> cls = GlobalConfig.class;
        Table H0 = realm.H0(cls);
        long nativePtr = H0.getNativePtr();
        GlobalConfigColumnInfo globalConfigColumnInfo = (GlobalConfigColumnInfo) realm.G().e(cls);
        long j2 = globalConfigColumnInfo.f40095e;
        while (it.hasNext()) {
            GlobalConfig globalConfig = (GlobalConfig) it.next();
            if (!map2.containsKey(globalConfig)) {
                if ((globalConfig instanceof RealmObjectProxy) && !RealmObject.isFrozen(globalConfig)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) globalConfig;
                    if (realmObjectProxy.b().d() != null && realmObjectProxy.b().d().F().equals(realm.F())) {
                        map2.put(globalConfig, Long.valueOf(realmObjectProxy.b().e().S()));
                    }
                }
                String realmGet$userUUID = globalConfig.realmGet$userUUID();
                long nativeFindFirstString = realmGet$userUUID != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$userUUID) : -1;
                long createRowWithPrimaryKey = nativeFindFirstString == -1 ? OsObject.createRowWithPrimaryKey(H0, j2, realmGet$userUUID) : nativeFindFirstString;
                map2.put(globalConfig, Long.valueOf(createRowWithPrimaryKey));
                long j3 = j2;
                Table.nativeSetLong(nativePtr, globalConfigColumnInfo.f40096f, createRowWithPrimaryKey, globalConfig.realmGet$bundleId(), false);
                String realmGet$lastKnownAppVersion = globalConfig.realmGet$lastKnownAppVersion();
                if (realmGet$lastKnownAppVersion != null) {
                    Table.nativeSetString(nativePtr, globalConfigColumnInfo.f40097g, createRowWithPrimaryKey, realmGet$lastKnownAppVersion, false);
                } else {
                    Table.nativeSetNull(nativePtr, globalConfigColumnInfo.f40097g, createRowWithPrimaryKey, false);
                }
                j2 = j3;
            }
        }
    }

    public static com_lokalise_sdk_local_db_GlobalConfigRealmProxy k(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
        realmObjectContext.g(baseRealm, row, baseRealm.G().e(GlobalConfig.class), false, Collections.emptyList());
        com_lokalise_sdk_local_db_GlobalConfigRealmProxy com_lokalise_sdk_local_db_globalconfigrealmproxy = new com_lokalise_sdk_local_db_GlobalConfigRealmProxy();
        realmObjectContext.a();
        return com_lokalise_sdk_local_db_globalconfigrealmproxy;
    }

    public static GlobalConfig l(Realm realm, GlobalConfigColumnInfo globalConfigColumnInfo, GlobalConfig globalConfig, GlobalConfig globalConfig2, Map map, Set set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.H0(GlobalConfig.class), set);
        osObjectBuilder.d(globalConfigColumnInfo.f40095e, globalConfig2.realmGet$userUUID());
        osObjectBuilder.c(globalConfigColumnInfo.f40096f, Long.valueOf(globalConfig2.realmGet$bundleId()));
        osObjectBuilder.d(globalConfigColumnInfo.f40097g, globalConfig2.realmGet$lastKnownAppVersion());
        osObjectBuilder.g();
        return globalConfig;
    }

    public void a() {
        if (this.f40093A == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
            this.f40094z = (GlobalConfigColumnInfo) realmObjectContext.c();
            ProxyState proxyState = new ProxyState(this);
            this.f40093A = proxyState;
            proxyState.p(realmObjectContext.e());
            this.f40093A.q(realmObjectContext.f());
            this.f40093A.m(realmObjectContext.b());
            this.f40093A.o(realmObjectContext.d());
        }
    }

    public ProxyState b() {
        return this.f40093A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_lokalise_sdk_local_db_GlobalConfigRealmProxy com_lokalise_sdk_local_db_globalconfigrealmproxy = (com_lokalise_sdk_local_db_GlobalConfigRealmProxy) obj;
        BaseRealm d2 = this.f40093A.d();
        BaseRealm d3 = com_lokalise_sdk_local_db_globalconfigrealmproxy.f40093A.d();
        String F = d2.F();
        String F2 = d3.F();
        if (F == null ? F2 != null : !F.equals(F2)) {
            return false;
        }
        if (d2.N() != d3.N() || !d2.D.getVersionID().equals(d3.D.getVersionID())) {
            return false;
        }
        String m2 = this.f40093A.e().j().m();
        String m3 = com_lokalise_sdk_local_db_globalconfigrealmproxy.f40093A.e().j().m();
        if (m2 == null ? m3 == null : m2.equals(m3)) {
            return this.f40093A.e().S() == com_lokalise_sdk_local_db_globalconfigrealmproxy.f40093A.e().S();
        }
        return false;
    }

    public int hashCode() {
        String F = this.f40093A.d().F();
        String m2 = this.f40093A.e().j().m();
        long S = this.f40093A.e().S();
        int i2 = 0;
        int hashCode = (527 + (F != null ? F.hashCode() : 0)) * 31;
        if (m2 != null) {
            i2 = m2.hashCode();
        }
        return ((hashCode + i2) * 31) + ((int) ((S >>> 32) ^ S));
    }

    public long realmGet$bundleId() {
        this.f40093A.d().j();
        return this.f40093A.e().p(this.f40094z.f40096f);
    }

    public String realmGet$lastKnownAppVersion() {
        this.f40093A.d().j();
        return this.f40093A.e().I(this.f40094z.f40097g);
    }

    public String realmGet$userUUID() {
        this.f40093A.d().j();
        return this.f40093A.e().I(this.f40094z.f40095e);
    }

    public void realmSet$bundleId(long j2) {
        if (!this.f40093A.g()) {
            this.f40093A.d().j();
            this.f40093A.e().t(this.f40094z.f40096f, j2);
        } else if (this.f40093A.c()) {
            Row e2 = this.f40093A.e();
            e2.j().y(this.f40094z.f40096f, e2.S(), j2, true);
        }
    }

    public void realmSet$lastKnownAppVersion(String str) {
        if (!this.f40093A.g()) {
            this.f40093A.d().j();
            if (str != null) {
                this.f40093A.e().h(this.f40094z.f40097g, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastKnownAppVersion' to null.");
        } else if (this.f40093A.c()) {
            Row e2 = this.f40093A.e();
            if (str != null) {
                e2.j().z(this.f40094z.f40097g, e2.S(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastKnownAppVersion' to null.");
        }
    }

    public void realmSet$userUUID(String str) {
        if (!this.f40093A.g()) {
            this.f40093A.d().j();
            throw new RealmException("Primary key field 'userUUID' cannot be changed after object was created.");
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "GlobalConfig = proxy[" + "{userUUID:" + realmGet$userUUID() + "}" + "," + "{bundleId:" + realmGet$bundleId() + "}" + "," + "{lastKnownAppVersion:" + realmGet$lastKnownAppVersion() + "}" + "]";
    }
}
