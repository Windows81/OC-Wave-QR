package com.google.android.gms.internal.measurement;

import com.google.common.base.Function;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzir<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f25524h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile zziy f25525i;

    /* renamed from: j  reason: collision with root package name */
    public static zzjc f25526j = new zzjc(new zzis());

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicInteger f25527k = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final zziz f25528a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25529b;

    /* renamed from: c  reason: collision with root package name */
    public Object f25530c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f25531d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f25532e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f25533f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f25534g;

    static {
        new AtomicReference();
    }

    public static /* synthetic */ zzir a(zziz zziz, String str, Boolean bool, boolean z2) {
        return new zziu(zziz, str, bool, true);
    }

    public static /* synthetic */ zzir b(zziz zziz, String str, Double d2, boolean z2) {
        return new zzix(zziz, str, d2, true);
    }

    public static /* synthetic */ zzir c(zziz zziz, String str, Long l2, boolean z2) {
        return new zziv(zziz, str, l2, true);
    }

    public static /* synthetic */ zzir d(zziz zziz, String str, String str2, boolean z2) {
        return new zziw(zziz, str, str2, true);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void l(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zziy r0 = f25525i
            if (r0 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x0007
            goto L_0x004e
        L_0x0007:
            java.lang.Object r0 = f25524h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zziy r1 = f25525i     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x004a
            monitor-enter(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.measurement.zziy r1 = f25525i     // Catch:{ all -> 0x0022 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            if (r1 == 0) goto L_0x0024
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0022 }
            if (r2 == r3) goto L_0x0044
            goto L_0x0024
        L_0x0022:
            r3 = move-exception
            goto L_0x0046
        L_0x0024:
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.internal.measurement.zzic.d()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.zzja.c()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.zzik.b()     // Catch:{ all -> 0x0022 }
        L_0x002f:
            com.google.android.gms.internal.measurement.zzit r1 = new com.google.android.gms.internal.measurement.zzit     // Catch:{ all -> 0x0022 }
            r1.<init>(r3)     // Catch:{ all -> 0x0022 }
            com.google.common.base.Supplier r1 = com.google.common.base.Suppliers.a(r1)     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.zzhz r2 = new com.google.android.gms.internal.measurement.zzhz     // Catch:{ all -> 0x0022 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
            f25525i = r2     // Catch:{ all -> 0x0022 }
            java.util.concurrent.atomic.AtomicInteger r3 = f25527k     // Catch:{ all -> 0x0022 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0022 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x004a
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r3 = move-exception
            goto L_0x004c
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzir.l(android.content.Context):void");
    }

    public static void m() {
        f25527k.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f() {
        /*
            r8 = this;
            boolean r0 = r8.f25533f
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.internal.measurement.zzjc r0 = f25526j
            java.lang.String r1 = r8.f25529b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.common.base.Preconditions.x(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f25527k
            int r0 = r0.get()
            int r1 = r8.f25531d
            if (r1 >= r0) goto L_0x0099
            monitor-enter(r8)
            int r1 = r8.f25531d     // Catch:{ all -> 0x004e }
            if (r1 >= r0) goto L_0x0095
            com.google.android.gms.internal.measurement.zziy r1 = f25525i     // Catch:{ all -> 0x004e }
            com.google.common.base.Optional r2 = com.google.common.base.Optional.a()     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x0050
            com.google.common.base.Supplier r2 = r1.b()     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x004e }
            com.google.common.base.Optional r2 = (com.google.common.base.Optional) r2     // Catch:{ all -> 0x004e }
            boolean r4 = r2.c()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r3 = r2.b()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.zzil r3 = (com.google.android.gms.internal.measurement.zzil) r3     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.zziz r4 = r8.f25528a     // Catch:{ all -> 0x004e }
            android.net.Uri r5 = r4.f25537b     // Catch:{ all -> 0x004e }
            java.lang.String r6 = r4.f25536a     // Catch:{ all -> 0x004e }
            java.lang.String r4 = r4.f25539d     // Catch:{ all -> 0x004e }
            java.lang.String r7 = r8.f25529b     // Catch:{ all -> 0x004e }
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r0 = move-exception
            goto L_0x0097
        L_0x0050:
            if (r1 == 0) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            com.google.common.base.Preconditions.x(r4, r5)     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.zziz r4 = r8.f25528a     // Catch:{ all -> 0x004e }
            boolean r4 = r4.f25541f     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r8.g(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0067
            goto L_0x0080
        L_0x0067:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x007c
            goto L_0x0080
        L_0x006e:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            java.lang.Object r4 = r8.g(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.lang.Object r4 = r8.o()     // Catch:{ all -> 0x004e }
        L_0x0080:
            boolean r1 = r2.c()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x008d
            java.lang.Object r4 = r8.o()     // Catch:{ all -> 0x004e }
            goto L_0x0091
        L_0x008d:
            java.lang.Object r4 = r8.h(r3)     // Catch:{ all -> 0x004e }
        L_0x0091:
            r8.f25532e = r4     // Catch:{ all -> 0x004e }
            r8.f25531d = r0     // Catch:{ all -> 0x004e }
        L_0x0095:
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            goto L_0x0099
        L_0x0097:
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x0099:
            java.lang.Object r0 = r8.f25532e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzir.f():java.lang.Object");
    }

    public final Object g(zziy zziy) {
        Function function;
        zziz zziz = this.f25528a;
        if (!zziz.f25540e && ((function = zziz.f25544i) == null || ((Boolean) function.apply(zziy.a())).booleanValue())) {
            zzik a2 = zzik.a(zziy.a());
            zziz zziz2 = this.f25528a;
            Object m2 = a2.m(zziz2.f25540e ? null : i(zziz2.f25538c));
            if (m2 != null) {
                return h(m2);
            }
        }
        return null;
    }

    public abstract Object h(Object obj);

    public final String i(String str) {
        if (str != null && str.isEmpty()) {
            return this.f25529b;
        }
        String str2 = this.f25529b;
        return str + str2;
    }

    public final Object j(zziy zziy) {
        Object m2;
        zzif a2 = this.f25528a.f25537b != null ? zzip.b(zziy.a(), this.f25528a.f25537b) ? this.f25528a.f25543h ? zzic.a(zziy.a().getContentResolver(), zzio.a(zzio.b(zziy.a(), this.f25528a.f25537b.getLastPathSegment())), new zziq()) : zzic.a(zziy.a().getContentResolver(), this.f25528a.f25537b, new zziq()) : null : zzja.b(zziy.a(), this.f25528a.f25536a, new zziq());
        if (a2 == null || (m2 = a2.m(k())) == null) {
            return null;
        }
        return h(m2);
    }

    public final String k() {
        return i(this.f25528a.f25539d);
    }

    public final Object o() {
        return this.f25530c;
    }

    public zzir(zziz zziz, String str, Object obj, boolean z2) {
        this.f25531d = -1;
        String str2 = zziz.f25536a;
        if (str2 == null && zziz.f25537b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || zziz.f25537b == null) {
            this.f25528a = zziz;
            this.f25529b = str;
            this.f25530c = obj;
            this.f25533f = z2;
            this.f25534g = false;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }
}
