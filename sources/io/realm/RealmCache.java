package io.realm;

import io.realm.BaseRealm;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.Util;
import io.realm.internal.util.Pair;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

final class RealmCache {

    /* renamed from: f  reason: collision with root package name */
    public static final List f39951f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public static final Collection f39952g = new ConcurrentLinkedQueue();

    /* renamed from: a  reason: collision with root package name */
    public final Map f39953a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final String f39954b;

    /* renamed from: c  reason: collision with root package name */
    public RealmConfiguration f39955c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f39956d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public final Set f39957e = new HashSet();

    public interface Callback {
        void a(int i2);
    }

    public interface Callback0 {
    }

    public static class CreateRealmRunnable<T extends BaseRealm> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final BaseRealm.InstanceCallback f39961A;

        /* renamed from: B  reason: collision with root package name */
        public final Class f39962B;
        public final CountDownLatch C;
        public final RealmNotifier D;
        public Future E;

        /* renamed from: z  reason: collision with root package name */
        public final RealmConfiguration f39963z;

        public void run() {
            BaseRealm baseRealm = null;
            try {
                baseRealm = RealmCache.e(this.f39963z, this.f39962B);
                if (!this.D.post(new Runnable() {
                    public void run() {
                        if (CreateRealmRunnable.this.E == null || CreateRealmRunnable.this.E.isCancelled()) {
                            CreateRealmRunnable.this.C.countDown();
                            return;
                        }
                        BaseRealm baseRealm = null;
                        try {
                            BaseRealm e2 = RealmCache.e(CreateRealmRunnable.this.f39963z, CreateRealmRunnable.this.f39962B);
                            CreateRealmRunnable.this.C.countDown();
                            BaseRealm baseRealm2 = e2;
                            th = null;
                            baseRealm = baseRealm2;
                        } catch (Throwable th) {
                            th = th;
                            CreateRealmRunnable.this.C.countDown();
                        }
                        if (baseRealm != null) {
                            CreateRealmRunnable.this.f39961A.b(baseRealm);
                        } else {
                            CreateRealmRunnable.this.f39961A.a(th);
                        }
                    }
                })) {
                    this.C.countDown();
                }
                if (!this.C.await(2, TimeUnit.SECONDS)) {
                    RealmLog.g("Timeout for creating Realm instance in foreground thread in `CreateRealmRunnable` ", new Object[0]);
                }
                if (baseRealm == null) {
                    return;
                }
            } catch (InterruptedException e2) {
                RealmLog.h(e2, "`CreateRealmRunnable` has been interrupted.", new Object[0]);
                if (baseRealm == null) {
                    return;
                }
            } catch (Throwable th) {
                if (baseRealm != null) {
                    baseRealm.close();
                }
                throw th;
            }
            baseRealm.close();
        }
    }

    public static class GlobalReferenceCounter extends ReferenceCounter {

        /* renamed from: c  reason: collision with root package name */
        public BaseRealm f39967c;

        public GlobalReferenceCounter() {
            super();
        }

        public void a() {
            String F = this.f39967c.F();
            this.f39971a.set((Object) null);
            this.f39967c = null;
            if (this.f39972b.decrementAndGet() < 0) {
                throw new IllegalStateException("Global reference counter of Realm" + F + " not be negative.");
            }
        }

        public BaseRealm c() {
            return this.f39967c;
        }

        public int d() {
            return this.f39972b.get();
        }

        public boolean e() {
            return this.f39967c != null;
        }

        public void g(BaseRealm baseRealm) {
            this.f39967c = baseRealm;
            this.f39971a.set(0);
            this.f39972b.incrementAndGet();
        }
    }

    public enum RealmCacheType {
        TYPED_REALM,
        DYNAMIC_REALM;

        public static RealmCacheType d(Class cls) {
            if (cls == Realm.class) {
                return TYPED_REALM;
            }
            if (cls == DynamicRealm.class) {
                return DYNAMIC_REALM;
            }
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
    }

    public static abstract class ReferenceCounter {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadLocal f39971a;

        /* renamed from: b  reason: collision with root package name */
        public AtomicInteger f39972b;

        public ReferenceCounter() {
            this.f39971a = new ThreadLocal();
            this.f39972b = new AtomicInteger(0);
        }

        public abstract void a();

        public int b() {
            return this.f39972b.get();
        }

        public abstract BaseRealm c();

        public abstract int d();

        public abstract boolean e();

        public void f(int i2) {
            Integer num = (Integer) this.f39971a.get();
            ThreadLocal threadLocal = this.f39971a;
            if (num != null) {
                i2 += num.intValue();
            }
            threadLocal.set(Integer.valueOf(i2));
        }

        public abstract void g(BaseRealm baseRealm);

        public void h(int i2) {
            this.f39971a.set(Integer.valueOf(i2));
        }
    }

    public static class ThreadConfinedReferenceCounter extends ReferenceCounter {

        /* renamed from: c  reason: collision with root package name */
        public final ThreadLocal f39973c;

        public ThreadConfinedReferenceCounter() {
            super();
            this.f39973c = new ThreadLocal();
        }

        public void a() {
            String F = ((BaseRealm) this.f39973c.get()).F();
            this.f39971a.set((Object) null);
            this.f39973c.set((Object) null);
            if (this.f39972b.decrementAndGet() < 0) {
                throw new IllegalStateException("Global reference counter of Realm" + F + " can not be negative.");
            }
        }

        public BaseRealm c() {
            return (BaseRealm) this.f39973c.get();
        }

        public int d() {
            Integer num = (Integer) this.f39971a.get();
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        public boolean e() {
            return this.f39973c.get() != null;
        }

        public void g(BaseRealm baseRealm) {
            this.f39973c.set(baseRealm);
            this.f39971a.set(0);
            this.f39972b.incrementAndGet();
        }
    }

    public RealmCache(String str) {
        this.f39954b = str;
    }

    public static void b(final RealmConfiguration realmConfiguration) {
        final File file = realmConfiguration.q() ? new File(realmConfiguration.l(), realmConfiguration.m()) : null;
        final String g2 = ObjectServerFacade.c(realmConfiguration.v()).g(realmConfiguration);
        boolean g3 = Util.g(g2);
        final boolean z2 = !g3;
        if (file != null || !g3) {
            OsObjectStore.a(realmConfiguration, new Runnable() {
                public void run() {
                    if (file != null) {
                        RealmCache.c(realmConfiguration.c(), file);
                    }
                    if (z2) {
                        RealmCache.c(ObjectServerFacade.c(realmConfiguration.v()).f(realmConfiguration), new File(g2));
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.IOException} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087 A[SYNTHETIC, Splitter:B:47:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c A[SYNTHETIC, Splitter:B:51:0x008c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r6, java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            android.content.Context r1 = io.realm.BaseRealm.G     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            java.io.InputStream r1 = r1.open(r6)     // Catch:{ IOException -> 0x0069, all -> 0x0066 }
            if (r1 == 0) goto L_0x004d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
        L_0x001d:
            int r3 = r1.read(r7)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r4 = -1
            if (r3 <= r4) goto L_0x002f
            r4 = 0
            r2.write(r7, r4, r3)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            goto L_0x001d
        L_0x0029:
            r6 = move-exception
        L_0x002a:
            r0 = r1
            goto L_0x0085
        L_0x002c:
            r7 = move-exception
        L_0x002d:
            r0 = r1
            goto L_0x006b
        L_0x002f:
            r1.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r0 = move-exception
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r6 = move-exception
            if (r0 != 0) goto L_0x003c
            r0 = r6
        L_0x003c:
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            io.realm.exceptions.RealmFileException r6 = new io.realm.exceptions.RealmFileException
            io.realm.exceptions.RealmFileException$Kind r7 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
            r6.<init>((io.realm.exceptions.RealmFileException.Kind) r7, (java.lang.Throwable) r0)
            throw r6
        L_0x0047:
            r6 = move-exception
            r2 = r0
            goto L_0x002a
        L_0x004a:
            r7 = move-exception
            r2 = r0
            goto L_0x002d
        L_0x004d:
            io.realm.exceptions.RealmFileException r7 = new io.realm.exceptions.RealmFileException     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            io.realm.exceptions.RealmFileException$Kind r2 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r4 = "Invalid input stream to the asset file: "
            r3.append(r4)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r3.append(r6)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r7.<init>((io.realm.exceptions.RealmFileException.Kind) r2, (java.lang.String) r3)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            throw r7     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
        L_0x0066:
            r6 = move-exception
            r2 = r0
            goto L_0x0085
        L_0x0069:
            r7 = move-exception
            r2 = r0
        L_0x006b:
            io.realm.exceptions.RealmFileException r1 = new io.realm.exceptions.RealmFileException     // Catch:{ all -> 0x0084 }
            io.realm.exceptions.RealmFileException$Kind r3 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r4.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "Could not resolve the path to the asset file: "
            r4.append(r5)     // Catch:{ all -> 0x0084 }
            r4.append(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0084 }
            r1.<init>(r3, r6, r7)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r6 = move-exception
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r0.close()     // Catch:{ IOException -> 0x008a }
        L_0x008a:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmCache.c(java.lang.String, java.io.File):void");
    }

    public static BaseRealm e(RealmConfiguration realmConfiguration, Class cls) {
        return i(realmConfiguration.k(), true).g(realmConfiguration, cls, OsSharedRealm.VersionID.f40212B);
    }

    public static BaseRealm f(RealmConfiguration realmConfiguration, Class cls, OsSharedRealm.VersionID versionID) {
        return i(realmConfiguration.k(), true).g(realmConfiguration, cls, versionID);
    }

    public static RealmCache i(String str, boolean z2) {
        RealmCache realmCache;
        List list = f39951f;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                realmCache = null;
                while (it.hasNext()) {
                    RealmCache realmCache2 = (RealmCache) ((WeakReference) it.next()).get();
                    if (realmCache2 == null) {
                        it.remove();
                    } else if (realmCache2.f39954b.equals(str)) {
                        realmCache = realmCache2;
                    }
                }
                if (realmCache == null && z2) {
                    realmCache = new RealmCache(str);
                    f39951f.add(new WeakReference(realmCache));
                }
            } finally {
            }
        }
        return realmCache;
    }

    public static void n(RealmConfiguration realmConfiguration, Callback callback) {
        synchronized (f39951f) {
            try {
                RealmCache i2 = i(realmConfiguration.k(), false);
                if (i2 == null) {
                    callback.a(0);
                } else {
                    i2.h(callback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Class cls, ReferenceCounter referenceCounter, OsSharedRealm.VersionID versionID) {
        BaseRealm baseRealm;
        if (cls == Realm.class) {
            baseRealm = Realm.o0(this, versionID);
            baseRealm.G().c();
        } else if (cls == DynamicRealm.class) {
            baseRealm = DynamicRealm.X(this, versionID);
        } else {
            throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
        }
        referenceCounter.g(baseRealm);
    }

    public final synchronized BaseRealm g(RealmConfiguration realmConfiguration, Class cls, OsSharedRealm.VersionID versionID) {
        BaseRealm c2;
        try {
            ReferenceCounter k2 = k(cls, versionID);
            boolean z2 = false;
            if (l() == 0) {
                z2 = true;
            }
            if (z2) {
                b(realmConfiguration);
                boolean w2 = realmConfiguration.w();
                if (realmConfiguration.v()) {
                    if (w2) {
                        if (this.f39957e.contains(realmConfiguration.k())) {
                        }
                    }
                    ObjectServerFacade.e().k(new OsRealmConfig.Builder(realmConfiguration).b());
                    ObjectServerFacade.e().b(realmConfiguration);
                    this.f39957e.remove(realmConfiguration.k());
                }
                this.f39955c = realmConfiguration;
            } else {
                q(realmConfiguration);
            }
            if (!k2.e()) {
                d(cls, k2, versionID);
            }
            k2.f(1);
            c2 = k2.c();
            if (z2) {
                ObjectServerFacade.e().a(Realm.s0(c2.D), realmConfiguration);
                if (!realmConfiguration.t()) {
                    c2.Q();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return c2;
    }

    public final synchronized void h(Callback callback) {
        callback.a(l());
    }

    public RealmConfiguration j() {
        return this.f39955c;
    }

    public final ReferenceCounter k(Class cls, OsSharedRealm.VersionID versionID) {
        Pair pair = new Pair(RealmCacheType.d(cls), versionID);
        ReferenceCounter referenceCounter = (ReferenceCounter) this.f39953a.get(pair);
        if (referenceCounter == null) {
            referenceCounter = versionID.equals(OsSharedRealm.VersionID.f40212B) ? new ThreadConfinedReferenceCounter() : new GlobalReferenceCounter();
            this.f39953a.put(pair, referenceCounter);
        }
        return referenceCounter;
    }

    public final int l() {
        int i2 = 0;
        for (ReferenceCounter b2 : this.f39953a.values()) {
            i2 += b2.b();
        }
        return i2;
    }

    public final int m() {
        int i2 = 0;
        for (ReferenceCounter referenceCounter : this.f39953a.values()) {
            if (referenceCounter instanceof ThreadConfinedReferenceCounter) {
                i2 += referenceCounter.b();
            }
        }
        return i2;
    }

    public void o() {
        if (!this.f39956d.getAndSet(true)) {
            f39952g.add(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void p(io.realm.BaseRealm r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.F()     // Catch:{ all -> 0x0016 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0016 }
            boolean r2 = r4.N()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0018
            io.realm.internal.OsSharedRealm r2 = r4.D     // Catch:{ all -> 0x0016 }
            io.realm.internal.OsSharedRealm$VersionID r2 = r2.getVersionID()     // Catch:{ all -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r4 = move-exception
            goto L_0x0089
        L_0x0018:
            io.realm.internal.OsSharedRealm$VersionID r2 = io.realm.internal.OsSharedRealm.VersionID.f40212B     // Catch:{ all -> 0x0016 }
        L_0x001a:
            io.realm.RealmCache$ReferenceCounter r1 = r3.k(r1, r2)     // Catch:{ all -> 0x0016 }
            int r2 = r1.d()     // Catch:{ all -> 0x0016 }
            if (r2 > 0) goto L_0x0033
            java.lang.String r4 = "%s has been closed already. refCount is %s"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0016 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ all -> 0x0016 }
            io.realm.log.RealmLog.g(r4, r0)     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x0033:
            int r2 = r2 + -1
            if (r2 != 0) goto L_0x0084
            r1.a()     // Catch:{ all -> 0x0016 }
            r4.x()     // Catch:{ all -> 0x0016 }
            int r0 = r3.m()     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0087
            r0 = 0
            r3.f39955c = r0     // Catch:{ all -> 0x0016 }
            java.util.Map r0 = r3.f39953a     // Catch:{ all -> 0x0016 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0016 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0016 }
        L_0x0050:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0016 }
            io.realm.RealmCache$ReferenceCounter r1 = (io.realm.RealmCache.ReferenceCounter) r1     // Catch:{ all -> 0x0016 }
            boolean r2 = r1 instanceof io.realm.RealmCache.GlobalReferenceCounter     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0050
            io.realm.BaseRealm r1 = r1.c()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0050
        L_0x0066:
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0050
            r1.close()     // Catch:{ all -> 0x0016 }
            goto L_0x0066
        L_0x0070:
            io.realm.RealmConfiguration r0 = r4.E()     // Catch:{ all -> 0x0016 }
            boolean r0 = r0.v()     // Catch:{ all -> 0x0016 }
            io.realm.internal.ObjectServerFacade r0 = io.realm.internal.ObjectServerFacade.c(r0)     // Catch:{ all -> 0x0016 }
            io.realm.RealmConfiguration r4 = r4.E()     // Catch:{ all -> 0x0016 }
            r0.i(r4)     // Catch:{ all -> 0x0016 }
            goto L_0x0087
        L_0x0084:
            r1.h(r2)     // Catch:{ all -> 0x0016 }
        L_0x0087:
            monitor-exit(r3)
            return
        L_0x0089:
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmCache.p(io.realm.BaseRealm):void");
    }

    public final void q(RealmConfiguration realmConfiguration) {
        if (!this.f39955c.equals(realmConfiguration)) {
            if (Arrays.equals(this.f39955c.f(), realmConfiguration.f())) {
                RealmMigration i2 = realmConfiguration.i();
                RealmMigration i3 = this.f39955c.i();
                if (i3 == null || i2 == null || !i3.getClass().equals(i2.getClass()) || i2.equals(i3)) {
                    throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. \nCached configuration: \n" + this.f39955c + "\n\nNew configuration: \n" + realmConfiguration);
                }
                throw new IllegalArgumentException("Configurations cannot be different if used to open the same file. The most likely cause is that equals() and hashCode() are not overridden in the migration class: " + realmConfiguration.i().getClass().getCanonicalName());
            }
            throw new IllegalArgumentException("Wrong key used to decrypt Realm.");
        }
    }
}
