package io.realm;

import io.realm.BaseRealm;
import io.realm.RealmCache;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;

public class DynamicRealm extends BaseRealm {
    public final RealmSchema K = new MutableRealmSchema(this);

    /* renamed from: io.realm.DynamicRealm$2  reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Transaction f39873A;

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ boolean f39874B;
        public final /* synthetic */ Transaction.OnSuccess C;
        public final /* synthetic */ RealmNotifier D;
        public final /* synthetic */ Transaction.OnError E;
        public final /* synthetic */ DynamicRealm F;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ RealmConfiguration f39875z;

        /* JADX INFO: finally extract failed */
        public void run() {
            final OsSharedRealm.VersionID versionID;
            if (!Thread.currentThread().isInterrupted()) {
                DynamicRealm f0 = DynamicRealm.f0(this.f39875z);
                f0.c();
                final Throwable th = null;
                try {
                    this.f39873A.a(f0);
                    if (Thread.currentThread().isInterrupted()) {
                        try {
                            if (f0.O()) {
                                f0.d();
                            }
                        } finally {
                            f0.close();
                        }
                    } else {
                        f0.m();
                        versionID = f0.D.getVersionID();
                        try {
                            if (f0.O()) {
                                f0.d();
                            }
                            if (this.f39874B) {
                                if (versionID != null && this.C != null) {
                                    this.D.post(new Runnable() {
                                        public void run() {
                                            if (AnonymousClass2.this.F.isClosed()) {
                                                AnonymousClass2.this.C.a();
                                            } else if (AnonymousClass2.this.F.D.getVersionID().compareTo(versionID) < 0) {
                                                AnonymousClass2.this.F.D.realmNotifier.addTransactionCallback(new Runnable() {
                                                    public void run() {
                                                        AnonymousClass2.this.C.a();
                                                    }
                                                });
                                            } else {
                                                AnonymousClass2.this.C.a();
                                            }
                                        }
                                    });
                                } else if (th != null) {
                                    this.D.post(new Runnable() {
                                        public void run() {
                                            Transaction.OnError onError = AnonymousClass2.this.E;
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
                            f0.close();
                        }
                    }
                } catch (Throwable th2) {
                    f0.close();
                    throw th2;
                }
            }
        }
    }

    public static abstract class Callback extends BaseRealm.InstanceCallback<DynamicRealm> {
        public void a(Throwable th) {
            super.a(th);
        }

        /* renamed from: c */
        public abstract void b(DynamicRealm dynamicRealm);
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

        void a(DynamicRealm dynamicRealm);
    }

    public DynamicRealm(final RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        super(realmCache, (OsSchemaInfo) null, versionID);
        RealmCache.n(realmCache.j(), new RealmCache.Callback() {
            public void a(int i2) {
                if (i2 <= 0 && !realmCache.j().t() && OsObjectStore.c(DynamicRealm.this.D) == -1) {
                    DynamicRealm.this.D.beginTransaction();
                    if (OsObjectStore.c(DynamicRealm.this.D) == -1) {
                        OsObjectStore.d(DynamicRealm.this.D, -1);
                    }
                    DynamicRealm.this.D.commitTransaction();
                }
            }
        });
    }

    public static DynamicRealm X(RealmCache realmCache, OsSharedRealm.VersionID versionID) {
        return new DynamicRealm(realmCache, versionID);
    }

    public static DynamicRealm c0(OsSharedRealm osSharedRealm) {
        return new DynamicRealm(osSharedRealm);
    }

    public static DynamicRealm f0(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (DynamicRealm) RealmCache.e(realmConfiguration, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public /* bridge */ /* synthetic */ RealmConfiguration E() {
        return super.E();
    }

    public /* bridge */ /* synthetic */ String F() {
        return super.F();
    }

    public RealmSchema G() {
        return this.K;
    }

    public /* bridge */ /* synthetic */ long I() {
        return super.I();
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

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    /* renamed from: e0 */
    public DynamicRealm y() {
        OsSharedRealm.VersionID versionID;
        try {
            versionID = this.D.getVersionID();
        } catch (IllegalStateException unused) {
            I();
            versionID = this.D.getVersionID();
        }
        return (DynamicRealm) RealmCache.f(this.f39852B, DynamicRealm.class, versionID);
    }

    public void g0(RealmChangeListener realmChangeListener) {
        S(realmChangeListener);
    }

    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public DynamicRealm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
    }
}
