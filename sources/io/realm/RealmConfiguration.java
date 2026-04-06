package io.realm;

import android.content.Context;
import io.realm.Realm;
import io.realm.annotations.RealmModule;
import io.realm.coroutines.FlowFactory;
import io.realm.coroutines.RealmFlowFactory;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.RealmCore;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import io.realm.internal.modules.CompositeMediator;
import io.realm.internal.modules.FilterableMediator;
import io.realm.rx.RealmObservableFactory;
import io.realm.rx.RxObservableFactory;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class RealmConfiguration {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f39974t;

    /* renamed from: u  reason: collision with root package name */
    public static final RealmProxyMediator f39975u;

    /* renamed from: a  reason: collision with root package name */
    public final File f39976a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39977b;

    /* renamed from: c  reason: collision with root package name */
    public final String f39978c;

    /* renamed from: d  reason: collision with root package name */
    public final String f39979d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f39980e;

    /* renamed from: f  reason: collision with root package name */
    public final long f39981f;

    /* renamed from: g  reason: collision with root package name */
    public final RealmMigration f39982g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f39983h;

    /* renamed from: i  reason: collision with root package name */
    public final OsRealmConfig.Durability f39984i;

    /* renamed from: j  reason: collision with root package name */
    public final RealmProxyMediator f39985j;

    /* renamed from: k  reason: collision with root package name */
    public final RxObservableFactory f39986k;

    /* renamed from: l  reason: collision with root package name */
    public final FlowFactory f39987l;

    /* renamed from: m  reason: collision with root package name */
    public final Realm.Transaction f39988m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f39989n;

    /* renamed from: o  reason: collision with root package name */
    public final CompactOnLaunchCallback f39990o;

    /* renamed from: p  reason: collision with root package name */
    public final long f39991p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f39992q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f39993r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f39994s;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public File f39995a;

        /* renamed from: b  reason: collision with root package name */
        public String f39996b;

        /* renamed from: c  reason: collision with root package name */
        public String f39997c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f39998d;

        /* renamed from: e  reason: collision with root package name */
        public long f39999e;

        /* renamed from: f  reason: collision with root package name */
        public RealmMigration f40000f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f40001g;

        /* renamed from: h  reason: collision with root package name */
        public OsRealmConfig.Durability f40002h;

        /* renamed from: i  reason: collision with root package name */
        public HashSet f40003i;

        /* renamed from: j  reason: collision with root package name */
        public HashSet f40004j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f40005k;

        /* renamed from: l  reason: collision with root package name */
        public RxObservableFactory f40006l;

        /* renamed from: m  reason: collision with root package name */
        public FlowFactory f40007m;

        /* renamed from: n  reason: collision with root package name */
        public Realm.Transaction f40008n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f40009o;

        /* renamed from: p  reason: collision with root package name */
        public CompactOnLaunchCallback f40010p;

        /* renamed from: q  reason: collision with root package name */
        public long f40011q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f40012r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f40013s;

        public Builder() {
            this(BaseRealm.G);
        }

        public final Builder a(Object obj) {
            if (obj != null) {
                d(obj);
                this.f40003i.add(obj);
            }
            return this;
        }

        public Builder b(boolean z2) {
            this.f40012r = z2;
            return this;
        }

        public RealmConfiguration c() {
            if (this.f40009o) {
                if (this.f40008n != null) {
                    throw new IllegalStateException("This Realm is marked as read-only. Read-only Realms cannot use initialData(Realm.Transaction).");
                } else if (this.f39997c == null) {
                    throw new IllegalStateException("Only Realms provided using 'assetFile(path)' can be marked read-only. No such Realm was provided.");
                } else if (this.f40001g) {
                    throw new IllegalStateException("'deleteRealmIfMigrationNeeded()' and read-only Realms cannot be combined");
                } else if (this.f40010p != null) {
                    throw new IllegalStateException("'compactOnLaunch()' and read-only Realms cannot be combined");
                }
            }
            if (this.f40006l == null && Util.h()) {
                this.f40006l = new RealmObservableFactory(true);
            }
            if (this.f40007m == null && Util.f()) {
                this.f40007m = new RealmFlowFactory(Boolean.TRUE);
            }
            File file = r2;
            File file2 = new File(this.f39995a, this.f39996b);
            RealmConfiguration realmConfiguration = r3;
            RealmConfiguration realmConfiguration2 = new RealmConfiguration(file, this.f39997c, this.f39998d, this.f39999e, this.f40000f, this.f40001g, this.f40002h, RealmConfiguration.b(this.f40003i, this.f40004j, this.f40005k), this.f40006l, this.f40007m, this.f40008n, this.f40009o, this.f40010p, false, this.f40011q, this.f40012r, this.f40013s);
            return realmConfiguration;
        }

        public final void d(Object obj) {
            if (!obj.getClass().isAnnotationPresent(RealmModule.class)) {
                throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not a RealmModule. Add @RealmModule to the class definition.");
            }
        }

        public Builder e() {
            return f(new DefaultCompactOnLaunchCallback());
        }

        public Builder f(CompactOnLaunchCallback compactOnLaunchCallback) {
            if (compactOnLaunchCallback != null) {
                this.f40010p = compactOnLaunchCallback;
                return this;
            }
            throw new IllegalArgumentException("A non-null compactOnLaunch must be provided");
        }

        public final void g(Context context) {
            this.f39995a = context.getFilesDir();
            this.f39996b = "default.realm";
            this.f39998d = null;
            this.f39999e = 0;
            this.f40000f = null;
            this.f40001g = false;
            this.f40002h = OsRealmConfig.Durability.FULL;
            this.f40009o = false;
            this.f40010p = null;
            if (RealmConfiguration.f39974t != null) {
                this.f40003i.add(RealmConfiguration.f39974t);
            }
            this.f40012r = false;
            this.f40013s = true;
        }

        public Builder h(RealmMigration realmMigration) {
            if (realmMigration != null) {
                this.f40000f = realmMigration;
                return this;
            }
            throw new IllegalArgumentException("A non-null migration must be provided");
        }

        public Builder i(Object obj, Object... objArr) {
            this.f40003i.clear();
            a(obj);
            if (objArr != null) {
                for (Object a2 : objArr) {
                    a(a2);
                }
            }
            return this;
        }

        public Builder j(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("A non-empty filename must be provided");
            }
            this.f39996b = str;
            return this;
        }

        public Builder k(long j2) {
            if (j2 >= 0) {
                this.f39999e = j2;
                return this;
            }
            throw new IllegalArgumentException("Realm schema version numbers must be 0 (zero) or higher. Yours was: " + j2);
        }

        public Builder(Context context) {
            this.f40003i = new HashSet();
            this.f40004j = new HashSet();
            this.f40005k = false;
            this.f40011q = Long.MAX_VALUE;
            if (context != null) {
                RealmCore.a(context);
                g(context);
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }
    }

    static {
        Object E0 = Realm.E0();
        f39974t = E0;
        if (E0 != null) {
            RealmProxyMediator j2 = j(E0.getClass().getCanonicalName());
            if (j2.u()) {
                f39975u = j2;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://docs.mongodb.com/realm/sdk/android/install/#customize-dependecies-defined-by-the-realm-gradle-plugin");
        }
        f39975u = null;
    }

    public RealmConfiguration(File file, String str, byte[] bArr, long j2, RealmMigration realmMigration, boolean z2, OsRealmConfig.Durability durability, RealmProxyMediator realmProxyMediator, RxObservableFactory rxObservableFactory, FlowFactory flowFactory, Realm.Transaction transaction, boolean z3, CompactOnLaunchCallback compactOnLaunchCallback, boolean z4, long j3, boolean z5, boolean z6) {
        this.f39976a = file.getParentFile();
        this.f39977b = file.getName();
        this.f39978c = file.getAbsolutePath();
        this.f39979d = str;
        this.f39980e = bArr;
        this.f39981f = j2;
        this.f39982g = realmMigration;
        this.f39983h = z2;
        this.f39984i = durability;
        this.f39985j = realmProxyMediator;
        this.f39986k = rxObservableFactory;
        this.f39987l = flowFactory;
        this.f39988m = transaction;
        this.f39989n = z3;
        this.f39990o = compactOnLaunchCallback;
        this.f39994s = z4;
        this.f39991p = j3;
        this.f39992q = z5;
        this.f39993r = z6;
    }

    public static RealmProxyMediator b(Set set, Set set2, boolean z2) {
        if (set2.size() > 0) {
            return new FilterableMediator(f39975u, set2, z2);
        }
        if (set.size() == 1) {
            return j(set.iterator().next().getClass().getCanonicalName());
        }
        RealmProxyMediator[] realmProxyMediatorArr = new RealmProxyMediator[set.size()];
        int i2 = 0;
        for (Object obj : set) {
            realmProxyMediatorArr[i2] = j(obj.getClass().getCanonicalName());
            i2++;
        }
        return new CompositeMediator(realmProxyMediatorArr);
    }

    public static RealmProxyMediator j(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", new Object[]{split[split.length - 1], "Mediator"});
        try {
            Constructor constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (RealmProxyMediator) constructor.newInstance((Object[]) null);
        } catch (ClassNotFoundException e2) {
            throw new RealmException("Could not find " + format, e2);
        } catch (InvocationTargetException e3) {
            throw new RealmException("Could not create an instance of " + format, e3);
        } catch (InstantiationException e4) {
            throw new RealmException("Could not create an instance of " + format, e4);
        } catch (IllegalAccessException e5) {
            throw new RealmException("Could not create an instance of " + format, e5);
        }
    }

    public String c() {
        return this.f39979d;
    }

    public CompactOnLaunchCallback d() {
        return this.f39990o;
    }

    public OsRealmConfig.Durability e() {
        return this.f39984i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealmConfiguration realmConfiguration = (RealmConfiguration) obj;
        if (this.f39981f != realmConfiguration.f39981f || this.f39983h != realmConfiguration.f39983h || this.f39989n != realmConfiguration.f39989n || this.f39994s != realmConfiguration.f39994s) {
            return false;
        }
        File file = this.f39976a;
        if (file == null ? realmConfiguration.f39976a != null : !file.equals(realmConfiguration.f39976a)) {
            return false;
        }
        String str = this.f39977b;
        if (str == null ? realmConfiguration.f39977b != null : !str.equals(realmConfiguration.f39977b)) {
            return false;
        }
        if (!this.f39978c.equals(realmConfiguration.f39978c)) {
            return false;
        }
        String str2 = this.f39979d;
        if (str2 == null ? realmConfiguration.f39979d != null : !str2.equals(realmConfiguration.f39979d)) {
            return false;
        }
        if (!Arrays.equals(this.f39980e, realmConfiguration.f39980e)) {
            return false;
        }
        RealmMigration realmMigration = this.f39982g;
        if (realmMigration == null ? realmConfiguration.f39982g != null : !realmMigration.equals(realmConfiguration.f39982g)) {
            return false;
        }
        if (this.f39984i != realmConfiguration.f39984i || !this.f39985j.equals(realmConfiguration.f39985j)) {
            return false;
        }
        RxObservableFactory rxObservableFactory = this.f39986k;
        if (rxObservableFactory == null ? realmConfiguration.f39986k != null : !rxObservableFactory.equals(realmConfiguration.f39986k)) {
            return false;
        }
        Realm.Transaction transaction = this.f39988m;
        if (transaction == null ? realmConfiguration.f39988m != null : !transaction.equals(realmConfiguration.f39988m)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.f39990o;
        if (compactOnLaunchCallback == null ? realmConfiguration.f39990o == null : compactOnLaunchCallback.equals(realmConfiguration.f39990o)) {
            return this.f39991p == realmConfiguration.f39991p;
        }
        return false;
    }

    public byte[] f() {
        byte[] bArr = this.f39980e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public Realm.Transaction g() {
        return this.f39988m;
    }

    public long h() {
        return this.f39991p;
    }

    public int hashCode() {
        File file = this.f39976a;
        int i2 = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f39977b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f39978c.hashCode()) * 31;
        String str2 = this.f39979d;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.f39981f;
        int hashCode4 = (((((hashCode2 + hashCode3) * 31) + Arrays.hashCode(this.f39980e)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        RealmMigration realmMigration = this.f39982g;
        int hashCode5 = (((((((hashCode4 + (realmMigration != null ? realmMigration.hashCode() : 0)) * 31) + (this.f39983h ? 1 : 0)) * 31) + this.f39984i.hashCode()) * 31) + this.f39985j.hashCode()) * 31;
        RxObservableFactory rxObservableFactory = this.f39986k;
        int hashCode6 = (hashCode5 + (rxObservableFactory != null ? rxObservableFactory.hashCode() : 0)) * 31;
        Realm.Transaction transaction = this.f39988m;
        int hashCode7 = (((hashCode6 + (transaction != null ? transaction.hashCode() : 0)) * 31) + (this.f39989n ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.f39990o;
        if (compactOnLaunchCallback != null) {
            i2 = compactOnLaunchCallback.hashCode();
        }
        long j3 = this.f39991p;
        return ((((hashCode7 + i2) * 31) + (this.f39994s ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public RealmMigration i() {
        return this.f39982g;
    }

    public String k() {
        return this.f39978c;
    }

    public File l() {
        return this.f39976a;
    }

    public String m() {
        return this.f39977b;
    }

    public RxObservableFactory n() {
        RxObservableFactory rxObservableFactory = this.f39986k;
        if (rxObservableFactory != null) {
            return rxObservableFactory;
        }
        throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as an implementation dependency. See https://github.com/realm/realm-java/tree/master/examples/rxJavaExample for more details.");
    }

    public RealmProxyMediator o() {
        return this.f39985j;
    }

    public long p() {
        return this.f39981f;
    }

    public boolean q() {
        return !Util.g(this.f39979d);
    }

    public boolean r() {
        return this.f39993r;
    }

    public boolean s() {
        return this.f39992q;
    }

    public boolean t() {
        return this.f39989n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.f39976a;
        sb.append(file != null ? file.toString() : "");
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.f39977b);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.f39978c);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        sb.append(this.f39980e == null ? 0 : 64);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.f39981f));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.f39982g);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.f39983h);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.f39984i);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.f39985j);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.f39989n);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.f39990o);
        sb.append("\n");
        sb.append("maxNumberOfActiveVersions: ");
        sb.append(this.f39991p);
        return sb.toString();
    }

    public boolean u() {
        return this.f39994s;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return new File(this.f39978c).exists();
    }

    public boolean x() {
        return this.f39983h;
    }
}
