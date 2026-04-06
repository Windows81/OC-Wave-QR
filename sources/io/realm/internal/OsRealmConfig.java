package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.RealmConfiguration;
import io.realm.internal.OsSharedRealm;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import javax.annotation.Nullable;

public class OsRealmConfig implements NativeObject {
    public static final long I = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final Object f40172A;

    /* renamed from: B  reason: collision with root package name */
    public final RealmConfiguration f40173B;
    public final URI C;
    public final long D;
    public final NativeContext E;
    public final CompactOnLaunchCallback F;
    public final OsSharedRealm.MigrationCallback G;
    public final OsSharedRealm.InitializationCallback H;

    /* renamed from: z  reason: collision with root package name */
    public final Object f40174z;

    /* renamed from: io.realm.internal.OsRealmConfig$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40175a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f40175a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public RealmConfiguration f40176a;

        /* renamed from: b  reason: collision with root package name */
        public OsSchemaInfo f40177b = null;

        /* renamed from: c  reason: collision with root package name */
        public OsSharedRealm.MigrationCallback f40178c = null;

        /* renamed from: d  reason: collision with root package name */
        public OsSharedRealm.InitializationCallback f40179d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f40180e = false;

        /* renamed from: f  reason: collision with root package name */
        public String f40181f = "";

        public Builder(RealmConfiguration realmConfiguration) {
            this.f40176a = realmConfiguration;
        }

        public Builder a(boolean z2) {
            this.f40180e = z2;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.f40176a, this.f40181f, this.f40180e, this.f40177b, this.f40178c, this.f40179d, (AnonymousClass1) null);
        }

        public Builder c(File file) {
            this.f40181f = file.getAbsolutePath();
            return this;
        }

        public Builder d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.f40179d = initializationCallback;
            return this;
        }

        public Builder e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.f40178c = migrationCallback;
            return this;
        }

        public Builder f(OsSchemaInfo osSchemaInfo) {
            this.f40177b = osSchemaInfo;
            return this;
        }
    }

    public enum Durability {
        FULL(0),
        MEM_ONLY(1);
        

        /* renamed from: z  reason: collision with root package name */
        public final int f40184z;

        /* access modifiers changed from: public */
        Durability(int i2) {
            this.f40184z = i2;
        }
    }

    public enum SchemaMode {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);
        

        /* renamed from: z  reason: collision with root package name */
        public final byte f40187z;

        /* access modifiers changed from: public */
        SchemaMode(byte b2) {
            this.f40187z = b2;
        }

        public byte d() {
            return this.f40187z;
        }
    }

    public enum SyncSessionStopPolicy {
        IMMEDIATELY((byte) 0),
        LIVE_INDEFINITELY((byte) 1),
        AFTER_CHANGES_UPLOADED((byte) 2);
        

        /* renamed from: z  reason: collision with root package name */
        public final byte f40190z;

        /* access modifiers changed from: public */
        SyncSessionStopPolicy(byte b2) {
            this.f40190z = b2;
        }
    }

    public /* synthetic */ OsRealmConfig(RealmConfiguration realmConfiguration, String str, boolean z2, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, AnonymousClass1 r7) {
        this(realmConfiguration, str, z2, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private static native long nativeCreate(String str, String str2, boolean z2, long j2);

    private native String nativeCreateAndSetSyncConfig(long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, byte b2, String str7, String str8, String[] strArr, byte b3, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j2, boolean z2);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j2, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j2, byte[] bArr);

    private static native void nativeSetInMemory(long j2, boolean z2);

    private native void nativeSetInitializationCallback(long j2, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j2, byte b2, long j3, long j4, @Nullable OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j2, byte b2, String str, int i2);

    private static native void nativeSetSyncConfigSslSettings(long j2, boolean z2, String str);

    public NativeContext a() {
        return this.E;
    }

    public final String b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.getHostName() != null) {
            return inetSocketAddress.getHostName();
        }
        if (inetSocketAddress.getAddress() == null) {
            return null;
        }
        InetAddress address = inetSocketAddress.getAddress();
        return address.getHostName() != null ? address.getHostName() : address.getHostAddress();
    }

    public RealmConfiguration c() {
        return this.f40173B;
    }

    public URI d() {
        return this.C;
    }

    public long getNativeFinalizerPtr() {
        return I;
    }

    public long getNativePtr() {
        return this.D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OsRealmConfig(io.realm.RealmConfiguration r38, java.lang.String r39, boolean r40, io.realm.internal.OsSchemaInfo r41, io.realm.internal.OsSharedRealm.MigrationCallback r42, io.realm.internal.OsSharedRealm.InitializationCallback r43) {
        /*
            r37 = this;
            r15 = r37
            r0 = r38
            r10 = r43
            java.lang.String r14 = "Cannot create a URI from the Realm URL address"
            r37.<init>()
            io.realm.internal.NativeContext r1 = new io.realm.internal.NativeContext
            r1.<init>()
            r15.E = r1
            r15.f40173B = r0
            java.lang.String r1 = r38.k()
            long r2 = r38.h()
            r13 = 1
            r4 = r39
            long r1 = nativeCreate(r1, r4, r13, r2)
            r15.D = r1
            io.realm.internal.NativeContext r1 = io.realm.internal.NativeContext.f40128c
            r1.a(r15)
            io.realm.internal.ObjectServerFacade r1 = io.realm.internal.ObjectServerFacade.e()
            java.lang.Object[] r1 = r1.d(r0)
            r11 = 0
            r2 = r1[r11]
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            r2 = r1[r13]
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            r2 = 2
            r3 = r1[r2]
            r21 = r3
            java.lang.String r21 = (java.lang.String) r21
            r3 = 3
            r3 = r1[r3]
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            r3 = 4
            r3 = r1[r3]
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            r3 = 5
            r3 = r1[r3]
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            r3 = 6
            r3 = r1[r3]
            r24 = r3
            java.lang.String r24 = (java.lang.String) r24
            r3 = 7
            r3 = r1[r3]
            r16 = r3
            java.lang.Byte r16 = (java.lang.Byte) r16
            r3 = 8
            r3 = r1[r3]
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r3 = 9
            r3 = r1[r3]
            r25 = r3
            java.lang.String r25 = (java.lang.String) r25
            r3 = 10
            r3 = r1[r3]
            java.util.Map r3 = (java.util.Map) r3
            r4 = 11
            r4 = r1[r4]
            r17 = r4
            java.lang.Byte r17 = (java.lang.Byte) r17
            r4 = 12
            r4 = r1[r4]
            r15.f40174z = r4
            r4 = 13
            r4 = r1[r4]
            r15.f40172A = r4
            r4 = 14
            r4 = r1[r4]
            r26 = r4
            java.lang.String r26 = (java.lang.String) r26
            r4 = 15
            r27 = r1[r4]
            r4 = 16
            r4 = r1[r4]
            r18 = r4
            java.lang.Long r18 = (java.lang.Long) r18
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5 = 17
            r5 = r1[r5]
            boolean r7 = r4.equals(r5)
            r4 = 18
            r1 = r1[r4]
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            if (r3 == 0) goto L_0x00be
            int r1 = r3.size()
            int r1 = r1 * r2
            goto L_0x00bf
        L_0x00be:
            r1 = r11
        L_0x00bf:
            java.lang.String[] r5 = new java.lang.String[r1]
            if (r3 == 0) goto L_0x00ec
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = r11
        L_0x00cc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ec
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r5[r3] = r6
            int r6 = r3 + 1
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r5[r6] = r4
            int r3 = r3 + r2
            goto L_0x00cc
        L_0x00ec:
            byte[] r1 = r38.f()
            if (r1 == 0) goto L_0x00f7
            long r2 = r15.D
            nativeSetEncryptionKey(r2, r1)
        L_0x00f7:
            long r1 = r15.D
            io.realm.internal.OsRealmConfig$Durability r3 = r38.e()
            io.realm.internal.OsRealmConfig$Durability r4 = io.realm.internal.OsRealmConfig.Durability.MEM_ONLY
            if (r3 != r4) goto L_0x0103
            r3 = r13
            goto L_0x0104
        L_0x0103:
            r3 = r11
        L_0x0104:
            nativeSetInMemory(r1, r3)
            long r1 = r15.D
            r3 = r40
            nativeEnableChangeNotification(r1, r3)
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_MANUAL
            boolean r2 = r38.u()
            if (r2 == 0) goto L_0x0119
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_IMMUTABLE
            goto L_0x012f
        L_0x0119:
            boolean r2 = r38.t()
            if (r2 == 0) goto L_0x0122
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_READONLY
            goto L_0x012f
        L_0x0122:
            if (r21 == 0) goto L_0x0127
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_ADDITIVE_DISCOVERED
            goto L_0x012f
        L_0x0127:
            boolean r2 = r38.x()
            if (r2 == 0) goto L_0x012f
            io.realm.internal.OsRealmConfig$SchemaMode r1 = io.realm.internal.OsRealmConfig.SchemaMode.SCHEMA_MODE_SOFT_RESET_FILE
        L_0x012f:
            long r28 = r38.p()
            if (r41 != 0) goto L_0x013c
            r2 = 0
        L_0x0137:
            r6 = r42
            r30 = r2
            goto L_0x0141
        L_0x013c:
            long r2 = r41.getNativePtr()
            goto L_0x0137
        L_0x0141:
            r15.G = r6
            long r2 = r15.D
            byte r4 = r1.d()
            r1 = r37
            r32 = r5
            r5 = r28
            r33 = r7
            r34 = r8
            r7 = r30
            r39 = r9
            r9 = r42
            r1.nativeSetSchemaConfig(r2, r4, r5, r7, r9)
            io.realm.CompactOnLaunchCallback r0 = r38.d()
            r15.F = r0
            if (r0 == 0) goto L_0x0169
            long r1 = r15.D
            nativeSetCompactOnLaunchCallback(r1, r0)
        L_0x0169:
            r15.H = r10
            if (r10 == 0) goto L_0x0172
            long r0 = r15.D
            r15.nativeSetInitializationCallback(r0, r10)
        L_0x0172:
            r28 = 0
            if (r21 == 0) goto L_0x0288
            long r2 = r18.longValue()
            long r4 = r15.D
            byte r0 = r16.byteValue()
            r10 = r12
            r12 = r0
            byte r16 = r17.byteValue()
            java.lang.Object r0 = r15.f40174z
            r17 = r0
            java.lang.Object r0 = r15.f40172A
            r18 = r0
            r1 = r37
            r6 = r21
            r7 = r19
            r8 = r20
            r9 = r22
            r0 = r10
            r10 = r23
            r11 = r24
            r13 = r39
            r35 = r14
            r14 = r25
            r15 = r32
            r19 = r26
            r20 = r27
            java.lang.String r1 = r1.nativeCreateAndSetSyncConfig(r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x01d6 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x01d6 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x01d6 }
            r0 = r39
            r3 = 1
            java.lang.String r0 = r0.substring(r3)     // Catch:{ URISyntaxException -> 0x01d3 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x01d3 }
            java.lang.String r1 = r2.toString()     // Catch:{ URISyntaxException -> 0x01d3 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01d3 }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x01d3 }
            r2 = 0
            r4 = r37
            r5 = r35
            r36 = r1
            r1 = r0
            r0 = r36
            goto L_0x01e5
        L_0x01d3:
            r0 = move-exception
        L_0x01d4:
            r2 = 0
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            r3 = 1
            goto L_0x01d4
        L_0x01d9:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = r35
            io.realm.log.RealmLog.b(r0, r5, r4)
            r4 = r37
            r0 = r1
            r1 = r28
        L_0x01e5:
            long r6 = r4.D
            r8 = r33
            r9 = r34
            nativeSetSyncConfigSslSettings(r6, r8, r9)
            java.net.ProxySelector r6 = java.net.ProxySelector.getDefault()
            if (r1 == 0) goto L_0x028b
            if (r6 == 0) goto L_0x028b
            java.net.URI r7 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0204 }
            java.lang.String r8 = "ws"
            java.lang.String r9 = "http"
            java.lang.String r0 = r0.replaceFirst(r8, r9)     // Catch:{ URISyntaxException -> 0x0204 }
            r7.<init>(r0)     // Catch:{ URISyntaxException -> 0x0204 }
            goto L_0x020c
        L_0x0204:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r2]
            io.realm.log.RealmLog.b(r0, r5, r7)
            r7 = r28
        L_0x020c:
            java.util.List r0 = r6.select(r7)
            if (r0 == 0) goto L_0x028b
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x028b
            java.lang.Object r0 = r0.get(r2)
            java.net.Proxy r0 = (java.net.Proxy) r0
            java.net.Proxy$Type r5 = r0.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 == r6) goto L_0x028b
            int[] r5 = io.realm.internal.OsRealmConfig.AnonymousClass1.f40175a
            java.net.Proxy$Type r6 = r0.type()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L_0x0236
            r11 = -1
            goto L_0x0237
        L_0x0236:
            r11 = r2
        L_0x0237:
            java.net.Proxy$Type r3 = r0.type()
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP
            if (r3 != r5) goto L_0x0280
            java.net.SocketAddress r0 = r0.address()
            boolean r3 = r0 instanceof java.net.InetSocketAddress
            if (r3 == 0) goto L_0x0261
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            java.lang.String r3 = r4.b(r0)
            if (r3 == 0) goto L_0x0259
            long r5 = r4.D
            int r0 = r0.getPort()
            nativeSetSyncConfigProxySettings(r5, r11, r3, r0)
            goto L_0x028b
        L_0x0259:
            java.lang.String r0 = "Could not retrieve proxy's hostname."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            io.realm.log.RealmLog.a(r0, r2)
            goto L_0x028b
        L_0x0261:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unsupported proxy socket address type: "
            r3.append(r5)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            io.realm.log.RealmLog.a(r0, r2)
            goto L_0x028b
        L_0x0280:
            java.lang.String r0 = "SOCKS proxies are not supported."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            io.realm.log.RealmLog.a(r0, r2)
            goto L_0x028b
        L_0x0288:
            r4 = r15
            r1 = r28
        L_0x028b:
            r4.C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsRealmConfig.<init>(io.realm.RealmConfiguration, java.lang.String, boolean, io.realm.internal.OsSchemaInfo, io.realm.internal.OsSharedRealm$MigrationCallback, io.realm.internal.OsSharedRealm$InitializationCallback):void");
    }
}
