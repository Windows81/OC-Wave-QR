package io.realm;

import android.content.Context;
import io.realm.Realm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.ColumnInfo;
import io.realm.internal.InvalidRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.async.RealmThreadPoolExecutor;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class BaseRealm implements Closeable {
    public static volatile Context G;
    public static final RealmThreadPoolExecutor H = RealmThreadPoolExecutor.c();
    public static final RealmThreadPoolExecutor I = RealmThreadPoolExecutor.d();
    public static final ThreadLocalRealmObjectContext J = new ThreadLocalRealmObjectContext();

    /* renamed from: A  reason: collision with root package name */
    public final long f39851A;

    /* renamed from: B  reason: collision with root package name */
    public final RealmConfiguration f39852B;
    public RealmCache C;
    public OsSharedRealm D;
    public boolean E;
    public OsSharedRealm.SchemaChangedCallback F;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f39853z;

    /* renamed from: io.realm.BaseRealm$3  reason: invalid class name */
    class AnonymousClass3 implements RealmCache.Callback0 {
    }

    /* renamed from: io.realm.BaseRealm$5  reason: invalid class name */
    class AnonymousClass5 implements RealmCache.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmConfiguration f39859a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f39860b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ RealmMigration f39861c;

        public void a(int i2) {
            if (i2 != 0) {
                throw new IllegalStateException("Cannot migrate a Realm file that is already open: " + this.f39859a.k());
            } else if (!new File(this.f39859a.k()).exists()) {
                this.f39860b.set(true);
            } else {
                OsSchemaInfo osSchemaInfo = new OsSchemaInfo(this.f39859a.o().g().values());
                RealmMigration realmMigration = this.f39861c;
                if (realmMigration == null) {
                    realmMigration = this.f39859a.i();
                }
                OsSharedRealm instance = OsSharedRealm.getInstance(new OsRealmConfig.Builder(this.f39859a).a(false).f(osSchemaInfo).e(realmMigration != null ? BaseRealm.r(realmMigration) : null), OsSharedRealm.VersionID.f40212B);
                if (instance != null) {
                    instance.close();
                }
            }
        }
    }

    public static abstract class InstanceCallback<T extends BaseRealm> {
        public void a(Throwable th) {
            throw new RealmException("Exception happens when initializing Realm in the background thread.", th);
        }

        public abstract void b(BaseRealm baseRealm);
    }

    public static final class RealmObjectContext {

        /* renamed from: a  reason: collision with root package name */
        public BaseRealm f39863a;

        /* renamed from: b  reason: collision with root package name */
        public Row f39864b;

        /* renamed from: c  reason: collision with root package name */
        public ColumnInfo f39865c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f39866d;

        /* renamed from: e  reason: collision with root package name */
        public List f39867e;

        public void a() {
            this.f39863a = null;
            this.f39864b = null;
            this.f39865c = null;
            this.f39866d = false;
            this.f39867e = null;
        }

        public boolean b() {
            return this.f39866d;
        }

        public ColumnInfo c() {
            return this.f39865c;
        }

        public List d() {
            return this.f39867e;
        }

        public BaseRealm e() {
            return this.f39863a;
        }

        public Row f() {
            return this.f39864b;
        }

        public void g(BaseRealm baseRealm, Row row, ColumnInfo columnInfo, boolean z2, List list) {
            this.f39863a = baseRealm;
            this.f39864b = row;
            this.f39865c = columnInfo;
            this.f39866d = z2;
            this.f39867e = list;
        }
    }

    public static final class ThreadLocalRealmObjectContext extends ThreadLocal<RealmObjectContext> {
        /* renamed from: a */
        public RealmObjectContext initialValue() {
            return new RealmObjectContext();
        }
    }

    public BaseRealm(RealmCache realmCache, OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this(realmCache.j(), osSchemaInfo, versionID);
        this.C = realmCache;
    }

    public static OsSharedRealm.MigrationCallback r(final RealmMigration realmMigration) {
        return new OsSharedRealm.MigrationCallback() {
            public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j2, long j3) {
                RealmMigration.this.migrate(DynamicRealm.c0(osSharedRealm), j2, j3);
            }
        };
    }

    public static boolean t(final RealmConfiguration realmConfiguration) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.a(realmConfiguration, new Runnable() {
            public void run() {
                atomicBoolean.set(Util.c(RealmConfiguration.this.k(), RealmConfiguration.this.l(), RealmConfiguration.this.m()));
            }
        })) {
            return atomicBoolean.get();
        }
        throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: " + realmConfiguration.k());
    }

    public RealmModel A(Class cls, long j2, boolean z2, List list) {
        return this.f39852B.o().t(cls, this, G().j(cls).p(j2), G().e(cls), z2, list);
    }

    public RealmModel C(Class cls, String str, long j2) {
        boolean z2 = str != null;
        Table k2 = z2 ? G().k(str) : G().j(cls);
        if (z2) {
            return new DynamicRealmObject(this, j2 != -1 ? k2.d(j2) : InvalidRow.INSTANCE);
        }
        return this.f39852B.o().t(cls, this, j2 != -1 ? k2.p(j2) : InvalidRow.INSTANCE, G().e(cls), false, Collections.emptyList());
    }

    public RealmModel D(Class cls, String str, UncheckedRow uncheckedRow) {
        if (str != null) {
            return new DynamicRealmObject(this, CheckedRow.g(uncheckedRow));
        }
        return this.f39852B.o().t(cls, this, uncheckedRow, G().e(cls), false, Collections.emptyList());
    }

    public RealmConfiguration E() {
        return this.f39852B;
    }

    public String F() {
        return this.f39852B.k();
    }

    public abstract RealmSchema G();

    public OsSharedRealm H() {
        return this.D;
    }

    public long I() {
        return OsObjectStore.c(this.D);
    }

    public boolean N() {
        OsSharedRealm osSharedRealm = this.D;
        if (osSharedRealm != null && !osSharedRealm.isClosed()) {
            return this.f39853z;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }

    public boolean O() {
        j();
        return this.D.isInTransaction();
    }

    public void Q() {
        j();
        f();
        if (!O()) {
            this.D.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }

    public void S(RealmChangeListener realmChangeListener) {
        if (realmChangeListener != null) {
            if (isClosed()) {
                RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.f39852B.k());
            }
            this.D.realmNotifier.removeChangeListener(this, realmChangeListener);
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void b(RealmChangeListener realmChangeListener) {
        if (realmChangeListener != null) {
            j();
            this.D.capabilities.c("Listeners cannot be used on current thread.");
            if (!this.f39853z) {
                this.D.realmNotifier.addChangeListener(this, realmChangeListener);
                return;
            }
            throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public void c() {
        j();
        this.D.beginTransaction();
    }

    public void close() {
        if (this.f39853z || this.f39851A == Thread.currentThread().getId()) {
            RealmCache realmCache = this.C;
            if (realmCache != null) {
                realmCache.p(this);
            } else {
                x();
            }
        } else {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
    }

    public void d() {
        j();
        this.D.cancelTransaction();
    }

    public void f() {
        if (H().capabilities.b() && !E().r()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public void finalize() {
        OsSharedRealm osSharedRealm;
        if (this.E && (osSharedRealm = this.D) != null && !osSharedRealm.isClosed()) {
            RealmLog.g("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f39852B.k());
            RealmCache realmCache = this.C;
            if (realmCache != null) {
                realmCache.o();
            }
        }
        super.finalize();
    }

    public void g() {
        if (H().capabilities.b() && !E().s()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }

    public boolean isClosed() {
        if (this.f39853z || this.f39851A == Thread.currentThread().getId()) {
            OsSharedRealm osSharedRealm = this.D;
            return osSharedRealm == null || osSharedRealm.isClosed();
        }
        throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
    }

    public void j() {
        OsSharedRealm osSharedRealm = this.D;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        } else if (!this.f39853z && this.f39851A != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public void k() {
        if (!O()) {
            throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
        }
    }

    public void l() {
        if (this.f39852B.v()) {
            throw new UnsupportedOperationException("You cannot perform destructive changes to a schema of a synced Realm");
        }
    }

    public void m() {
        j();
        this.D.commitTransaction();
    }

    public void x() {
        this.C = null;
        OsSharedRealm osSharedRealm = this.D;
        if (osSharedRealm != null && this.E) {
            osSharedRealm.close();
            this.D = null;
        }
    }

    public abstract BaseRealm y();

    public BaseRealm(RealmConfiguration realmConfiguration, OsSchemaInfo osSchemaInfo, OsSharedRealm.VersionID versionID) {
        this.F = new OsSharedRealm.SchemaChangedCallback() {
            public void onSchemaChanged() {
                RealmSchema G = BaseRealm.this.G();
                if (G != null) {
                    G.n();
                }
                if (BaseRealm.this instanceof Realm) {
                    G.c();
                }
            }
        };
        this.f39851A = Thread.currentThread().getId();
        this.f39852B = realmConfiguration;
        AnonymousClass2 r0 = null;
        this.C = null;
        OsSharedRealm.MigrationCallback r2 = (osSchemaInfo == null || realmConfiguration.i() == null) ? null : r(realmConfiguration.i());
        final Realm.Transaction g2 = realmConfiguration.g();
        OsSharedRealm instance = OsSharedRealm.getInstance(new OsRealmConfig.Builder(realmConfiguration).c(new File(G.getFilesDir(), ".realm.temp")).a(true).e(r2).f(osSchemaInfo).d(g2 != null ? new OsSharedRealm.InitializationCallback() {
            public void onInit(OsSharedRealm osSharedRealm) {
                g2.a(Realm.s0(osSharedRealm));
            }
        } : r0), versionID);
        this.D = instance;
        this.f39853z = instance.isFrozen();
        this.E = true;
        this.D.registerSchemaChangedCallback(this.F);
    }

    public BaseRealm(OsSharedRealm osSharedRealm) {
        this.F = new OsSharedRealm.SchemaChangedCallback() {
            public void onSchemaChanged() {
                RealmSchema G = BaseRealm.this.G();
                if (G != null) {
                    G.n();
                }
                if (BaseRealm.this instanceof Realm) {
                    G.c();
                }
            }
        };
        this.f39851A = Thread.currentThread().getId();
        this.f39852B = osSharedRealm.getConfiguration();
        this.C = null;
        this.D = osSharedRealm;
        this.f39853z = osSharedRealm.isFrozen();
        this.E = false;
    }
}
