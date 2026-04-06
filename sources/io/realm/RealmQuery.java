package io.realm;

import io.realm.internal.OsCollection;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;

public class RealmQuery<E> {

    /* renamed from: a  reason: collision with root package name */
    public final Table f40048a;

    /* renamed from: b  reason: collision with root package name */
    public final BaseRealm f40049b;

    /* renamed from: c  reason: collision with root package name */
    public final TableQuery f40050c;

    /* renamed from: d  reason: collision with root package name */
    public final RealmObjectSchema f40051d;

    /* renamed from: e  reason: collision with root package name */
    public Class f40052e;

    /* renamed from: f  reason: collision with root package name */
    public String f40053f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f40054g;

    /* renamed from: h  reason: collision with root package name */
    public final OsCollection f40055h;

    /* renamed from: io.realm.RealmQuery$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40056a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40056a = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40056a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40056a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40056a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40056a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.MIXED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.RealmQuery.AnonymousClass1.<clinit>():void");
        }
    }

    public RealmQuery(Realm realm, Class cls) {
        this.f40049b = realm;
        this.f40052e = cls;
        boolean n2 = n(cls);
        this.f40054g = !n2;
        if (n2) {
            RealmObjectSchema h2 = realm.G().h(cls);
            this.f40051d = h2;
            Table e2 = h2.e();
            this.f40048a = e2;
            this.f40055h = null;
            this.f40050c = e2.D();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    public static RealmQuery d(Realm realm, Class cls) {
        return new RealmQuery(realm, cls);
    }

    public static boolean n(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    public RealmQuery a() {
        this.f40049b.j();
        return this;
    }

    public RealmQuery b(String str, RealmAny realmAny, Case caseR) {
        this.f40049b.j();
        if (caseR == Case.SENSITIVE) {
            this.f40050c.a(this.f40049b.G().g(), str, realmAny);
        } else {
            this.f40050c.b(this.f40049b.G().g(), str, realmAny);
        }
        return this;
    }

    public RealmQuery c(String str, String str2, Case caseR) {
        Util.b(str2, "value");
        this.f40049b.j();
        b(str, RealmAny.j(str2), caseR);
        return this;
    }

    public final RealmResults e(TableQuery tableQuery, boolean z2) {
        OsResults g2 = OsResults.g(this.f40049b.D, tableQuery);
        RealmResults realmResults = o() ? new RealmResults(this.f40049b, g2, this.f40053f) : new RealmResults(this.f40049b, g2, this.f40052e);
        if (z2) {
            realmResults.q();
        }
        return realmResults;
    }

    public RealmQuery f(String str, RealmAny realmAny, Case caseR) {
        this.f40049b.j();
        if (caseR == Case.SENSITIVE) {
            this.f40050c.c(this.f40049b.G().g(), str, realmAny);
        } else {
            this.f40050c.d(this.f40049b.G().g(), str, realmAny);
        }
        return this;
    }

    public RealmQuery g(String str, Boolean bool) {
        this.f40049b.j();
        this.f40050c.c(this.f40049b.G().g(), str, RealmAny.h(bool));
        return this;
    }

    public RealmQuery h(String str, Integer num) {
        this.f40049b.j();
        this.f40050c.c(this.f40049b.G().g(), str, RealmAny.i(num));
        return this;
    }

    public RealmQuery i(String str, String str2) {
        return j(str, str2, Case.SENSITIVE);
    }

    public RealmQuery j(String str, String str2, Case caseR) {
        this.f40049b.j();
        f(str, RealmAny.j(str2), caseR);
        return this;
    }

    public RealmResults k() {
        this.f40049b.j();
        this.f40049b.f();
        return e(this.f40050c, true);
    }

    public Object l() {
        this.f40049b.j();
        this.f40049b.f();
        if (this.f40054g) {
            return null;
        }
        long m2 = m();
        if (m2 < 0) {
            return null;
        }
        return this.f40049b.C(this.f40052e, this.f40053f, m2);
    }

    public final long m() {
        return this.f40050c.f();
    }

    public final boolean o() {
        return this.f40053f != null;
    }
}
