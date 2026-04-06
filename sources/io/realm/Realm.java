package io.realm;

import android.content.Context;
import android.os.SystemClock;
import io.realm.BaseRealm;
import io.realm.RealmCache;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmError;
import io.realm.exceptions.RealmException;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import io.realm.internal.ColumnIndices;
import io.realm.internal.ObjectServerFacade;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmNotifier;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.async.RealmAsyncTaskImpl;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Realm extends BaseRealm {
    public static final Object L = new Object();
    public static RealmConfiguration M;
    public final RealmSchema K;

    /* renamed from: io.realm.Realm$2  reason: invalid class name */
    class AnonymousClass2 implements RealmCache.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f39943a;

        public void a(int i2) {
            this.f39943a.set(i2);
        }
    }

    public static abstract class Callback extends BaseRealm.InstanceCallback<Realm> {
        public void a(Throwable th) {
            super.a(th);
        }

        /* renamed from: c */
        public abstract void b(Realm realm);
    }

    public interface Transaction {

        public static class Callback {
        }

        public interface OnError {
            void onError(Throwable th);
        }

        public interface OnSuccess {
            void a();
        }

        void a(Realm realm);
    }

    public Realm(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, n0(realmCache.j().o()), versionID);
        this.K = new ImmutableRealmSchema(this, new ColumnIndices(this.f39852B.o(), this.D.getSchemaInfo()));
        if (this.f39852B.t()) {
            RealmProxyMediator o2 = this.f39852B.o();
            for (Class l2 : o2.j()) {
                String o3 = Table.o(o2.l(l2));
                if (!this.D.hasTable(o3)) {
                    this.D.close();
                    throw new RealmMigrationNeededException(this.f39852B.k(), String.format(Locale.US, "Cannot open the read only Realm. '%s' is missing.", new Object[]{Table.f(o3)}));
                }
            }
        }
    }

    public static Object E0() {
        try {
            Constructor constructor = Class.forName("io.realm.DefaultRealmModule").getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return constructor.newInstance((Object[]) null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e2);
        } catch (InstantiationException e3) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e3);
        } catch (IllegalAccessException e4) {
            throw new RealmException("Could not create an instance of " + "io.realm.DefaultRealmModule", e4);
        }
    }

    public static Realm G0(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (Realm) RealmCache.e(realmConfiguration, Realm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static synchronized void L0(Context context) {
        synchronized (Realm.class) {
            S0(context, "");
        }
    }

    public static void S0(Context context, String str) {
        if (BaseRealm.G != null) {
            return;
        }
        if (context != null) {
            X(context);
            if (!j1(context)) {
                RealmCore.a(context);
                w1(new RealmConfiguration.Builder(context).c());
                ObjectServerFacade.e().h(context, str, new a(), new b());
                if (context.getApplicationContext() != null) {
                    BaseRealm.G = context.getApplicationContext();
                } else {
                    BaseRealm.G = context;
                }
                OsSharedRealm.initialize(new File(context.getFilesDir(), ".realm.temp"));
                return;
            }
            throw new RealmError("Could not initialize Realm: Instant apps are not currently supported.");
        }
        throw new IllegalArgumentException("Non-null context required.");
    }

    public static void X(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            if (!filesDir.exists()) {
                try {
                    filesDir.mkdirs();
                } catch (SecurityException unused) {
                }
            } else {
                return;
            }
        }
        if (filesDir == null || !filesDir.exists()) {
            long[] jArr = {1, 2, 5, 10, 16};
            long j2 = 0;
            int i2 = -1;
            do {
                if (context.getFilesDir() != null && context.getFilesDir().exists()) {
                    break;
                }
                i2++;
                long j3 = jArr[Math.min(i2, 4)];
                SystemClock.sleep(j3);
                j2 += j3;
            } while (j2 <= 200);
        }
        if (context.getFilesDir() == null || !context.getFilesDir().exists()) {
            throw new IllegalStateException("Context.getFilesDir() returns " + context.getFilesDir() + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154");
        }
    }

    public static boolean j1(Context context) {
        return context.getPackageManager().isInstantApp();
    }

    public static OsSchemaInfo n0(RealmProxyMediator realmProxyMediator) {
        return new OsSchemaInfo(realmProxyMediator.g().values());
    }

    public static Realm o0(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new Realm(realmCache, versionID);
    }

    public static Realm s0(OsSharedRealm osSharedRealm) {
        return new Realm(osSharedRealm);
    }

    public static boolean t(RealmConfiguration realmConfiguration) {
        return BaseRealm.t(realmConfiguration);
    }

    public static void w1(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            synchronized (L) {
                M = realmConfiguration;
            }
            return;
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    /* renamed from: A0 */
    public Realm y() {
        return (Realm) RealmCache.f(this.f39852B, Realm.class, this.D.getVersionID());
    }

    public /* bridge */ /* synthetic */ RealmConfiguration E() {
        return super.E();
    }

    public RealmQuery E1(Class cls) {
        j();
        return RealmQuery.d(this, cls);
    }

    public /* bridge */ /* synthetic */ String F() {
        return super.F();
    }

    public RealmSchema G() {
        return this.K;
    }

    public Table H0(Class cls) {
        return this.K.j(cls);
    }

    public boolean J0(Class cls) {
        return this.f39852B.o().n(cls);
    }

    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    public /* bridge */ /* synthetic */ boolean O() {
        return super.O();
    }

    public /* bridge */ /* synthetic */ void Q() {
        super.Q();
    }

    public void T(RealmChangeListener realmChangeListener) {
        b(realmChangeListener);
    }

    public void U0(RealmModel realmModel) {
        k();
        if (realmModel != null) {
            this.f39852B.o().p(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public void W0(RealmModel realmModel) {
        k();
        if (realmModel != null) {
            this.f39852B.o().q(this, realmModel, new HashMap());
            return;
        }
        throw new IllegalArgumentException("Null object cannot be inserted into Realm.");
    }

    public void b1(Collection collection) {
        k();
        if (collection == null) {
            throw new IllegalArgumentException("Null objects cannot be inserted into Realm.");
        } else if (!collection.isEmpty()) {
            this.f39852B.o().r(this, collection);
        }
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void c0(Class cls) {
        if (!J0(cls)) {
            throw new IllegalArgumentException("A RealmObject with no @PrimaryKey cannot be updated: " + cls.toString());
        }
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final void e0(RealmModel realmModel) {
        if (realmModel == null) {
            throw new IllegalArgumentException("Null objects cannot be copied into Realm.");
        }
    }

    public final RealmModel f0(RealmModel realmModel, boolean z2, Map map, Set set) {
        j();
        if (!O()) {
            throw new IllegalStateException("`copyOrUpdate` can only be called inside a write transaction.");
        } else if (!this.f39852B.o().s(Util.d(realmModel.getClass()))) {
            try {
                return this.f39852B.o().c(this, realmModel, z2, map, set);
            } catch (RuntimeException e2) {
                if (e2.getMessage().startsWith("Attempting to create an object of type")) {
                    throw new RealmPrimaryKeyConstraintException(e2.getMessage());
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("Embedded objects cannot be copied into Realm by themselves. They need to be attached to a parent object");
        }
    }

    public RealmModel g0(RealmModel realmModel, ImportFlag... importFlagArr) {
        e0(realmModel);
        return f0(realmModel, false, new HashMap(), Util.i(importFlagArr));
    }

    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public RealmModel m0(RealmModel realmModel, ImportFlag... importFlagArr) {
        e0(realmModel);
        c0(realmModel.getClass());
        return f0(realmModel, true, new HashMap(), Util.i(importFlagArr));
    }

    public void q1(RealmChangeListener realmChangeListener) {
        S(realmChangeListener);
    }

    public void t0(Transaction transaction) {
        if (transaction != null) {
            j();
            g();
            c();
            try {
                transaction.a(this);
                m();
            } catch (Throwable th) {
                if (O()) {
                    d();
                } else {
                    RealmLog.g("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Transaction should not be null");
        }
    }

    public RealmAsyncTask w0(Transaction transaction, Transaction.OnSuccess onSuccess, Transaction.OnError onError) {
        j();
        if (transaction == null) {
            throw new IllegalArgumentException("Transaction should not be null");
        } else if (!N()) {
            final boolean a2 = this.D.capabilities.a();
            if (!(onSuccess == null && onError == null)) {
                this.D.capabilities.c("Callback cannot be delivered on current thread.");
            }
            final RealmConfiguration E = E();
            final RealmNotifier realmNotifier = this.D.realmNotifier;
            RealmThreadPoolExecutor realmThreadPoolExecutor = BaseRealm.H;
            final Transaction transaction2 = transaction;
            final Transaction.OnSuccess onSuccess2 = onSuccess;
            final Transaction.OnError onError2 = onError;
            return new RealmAsyncTaskImpl(realmThreadPoolExecutor.e(new Runnable() {
                /* JADX INFO: finally extract failed */
                public void run() {
                    final OsSharedRealm.VersionID versionID;
                    if (!Thread.currentThread().isInterrupted()) {
                        Realm G0 = Realm.G0(E);
                        G0.c();
                        final Throwable th = null;
                        try {
                            transaction2.a(G0);
                            if (Thread.currentThread().isInterrupted()) {
                                try {
                                    if (G0.O()) {
                                        G0.d();
                                    }
                                } finally {
                                    G0.close();
                                }
                            } else {
                                G0.m();
                                versionID = G0.D.getVersionID();
                                try {
                                    if (G0.O()) {
                                        G0.d();
                                    }
                                    if (a2) {
                                        if (versionID != null && onSuccess2 != null) {
                                            realmNotifier.post(new Runnable() {
                                                public void run() {
                                                    if (Realm.this.isClosed()) {
                                                        onSuccess2.a();
                                                    } else if (Realm.this.D.getVersionID().compareTo(versionID) < 0) {
                                                        Realm.this.D.realmNotifier.addTransactionCallback(new Runnable() {
                                                            public void run() {
                                                                onSuccess2.a();
                                                            }
                                                        });
                                                    } else {
                                                        onSuccess2.a();
                                                    }
                                                }
                                            });
                                        } else if (th != null) {
                                            realmNotifier.post(new Runnable() {
                                                public void run() {
                                                    Transaction.OnError onError = onError2;
                                                    if (onError != null) {
                                                        onError.onError(th);
                                                        return;
                                                    }
                                                    throw new RealmException("Async transaction failed", th);
                                                }
                                            });
                                        }
                                    } else if (th != null) {
                                        throw new RealmException("Async transaction failed", th);
                                    }
                                } finally {
                                    G0.close();
                                }
                            }
                        } catch (Throwable th2) {
                            G0.close();
                            throw th2;
                        }
                    }
                }
            }), realmThreadPoolExecutor);
        } else {
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
    }

    public Realm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.K = new ImmutableRealmSchema(this, new ColumnIndices(this.f39852B.o(), osSharedRealm.getSchemaInfo()));
    }
}
