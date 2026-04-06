package io.realm;

import io.realm.internal.ObservableSet;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsSet;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

abstract class SetValueOperator<E> implements ObservableSet {

    /* renamed from: a  reason: collision with root package name */
    public final BaseRealm f40075a;

    /* renamed from: b  reason: collision with root package name */
    public final OsSet f40076b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f40077c;

    /* renamed from: d  reason: collision with root package name */
    public final String f40078d;

    /* renamed from: e  reason: collision with root package name */
    public final ObserverPairList f40079e;

    /* renamed from: io.realm.SetValueOperator$1  reason: invalid class name */
    class AnonymousClass1 implements SetChangeListener<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmChangeListener f40080a;

        public void a(RealmSet realmSet, SetChangeSet setChangeSet) {
            this.f40080a.a(realmSet);
        }
    }

    /* renamed from: io.realm.SetValueOperator$2  reason: invalid class name */
    class AnonymousClass2 implements SetChangeListener<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealmChangeListener f40081a;

        public void a(RealmSet realmSet, SetChangeSet setChangeSet) {
            this.f40081a.a(realmSet);
        }
    }

    /* renamed from: io.realm.SetValueOperator$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40082a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.realm.internal.OsSet$ExternalCollectionOperation[] r0 = io.realm.internal.OsSet.ExternalCollectionOperation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40082a = r0
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40082a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40082a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40082a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.SetValueOperator.AnonymousClass3.<clinit>():void");
        }
    }

    public static SetIterator q(Class cls, OsSet osSet, BaseRealm baseRealm, String str) {
        if (cls == Boolean.class) {
            return new BooleanSetIterator(osSet, baseRealm);
        }
        if (cls == String.class) {
            return new StringSetIterator(osSet, baseRealm);
        }
        if (cls == Integer.class) {
            return new IntegerSetIterator(osSet, baseRealm);
        }
        if (cls == Long.class) {
            return new LongSetIterator(osSet, baseRealm);
        }
        if (cls == Short.class) {
            return new ShortSetIterator(osSet, baseRealm);
        }
        if (cls == Byte.class) {
            return new ByteSetIterator(osSet, baseRealm);
        }
        if (cls == Float.class) {
            return new FloatSetIterator(osSet, baseRealm);
        }
        if (cls == Double.class) {
            return new DoubleSetIterator(osSet, baseRealm);
        }
        if (cls == byte[].class) {
            return new BinarySetIterator(osSet, baseRealm);
        }
        if (cls == Date.class) {
            return new DateSetIterator(osSet, baseRealm);
        }
        if (cls == Decimal128.class) {
            return new Decimal128SetIterator(osSet, baseRealm);
        }
        if (cls == ObjectId.class) {
            return new ObjectIdSetIterator(osSet, baseRealm);
        }
        if (cls == UUID.class) {
            return new UUIDSetIterator(osSet, baseRealm);
        }
        if (cls == RealmAny.class) {
            return new RealmAnySetIterator(osSet, baseRealm);
        }
        if (cls == DynamicRealmObject.class) {
            return new DynamicSetIterator(osSet, baseRealm, str);
        }
        if (CollectionUtils.e(cls)) {
            return new RealmModelSetIterator(osSet, baseRealm, cls);
        }
        throw new IllegalArgumentException("Unknown class for iterator: " + cls.getSimpleName());
    }

    public abstract boolean a(Object obj);

    public boolean b(Collection collection) {
        if (n(collection)) {
            return i(((RealmSet) collection).e(), OsSet.ExternalCollectionOperation.ADD_ALL);
        }
        if (o(collection)) {
            return c(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'addAll'.");
    }

    public abstract boolean c(Collection collection);

    public void d() {
        this.f40076b.q();
    }

    public boolean e(Object obj) {
        if (m(obj)) {
            return h(obj);
        }
        throw new ClassCastException("Set contents and object must be the same type when calling 'contains'.");
    }

    public boolean f(Collection collection) {
        if (n(collection)) {
            return i(((RealmSet) collection).e(), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
        }
        if (k(collection)) {
            return g(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'containsAll'.");
    }

    public abstract boolean g(Collection collection);

    public abstract boolean h(Object obj);

    public boolean i(OsSet osSet, OsSet.ExternalCollectionOperation externalCollectionOperation) {
        if (this.f40076b.getNativePtr() == osSet.getNativePtr()) {
            int i2 = AnonymousClass3.f40082a[externalCollectionOperation.ordinal()];
            if (i2 == 1) {
                return true;
            }
            if (i2 == 2) {
                return false;
            }
            if (i2 == 3) {
                this.f40076b.q();
                return true;
            } else if (i2 == 4) {
                return false;
            } else {
                throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
            }
        } else {
            int i3 = AnonymousClass3.f40082a[externalCollectionOperation.ordinal()];
            if (i3 == 1) {
                return this.f40076b.C(osSet);
            }
            if (i3 == 2) {
                return this.f40076b.b0(osSet);
            }
            if (i3 == 3) {
                return this.f40076b.p(osSet);
            }
            if (i3 == 4) {
                return this.f40076b.I(osSet);
            }
            throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
        }
    }

    public OsSet j() {
        return this.f40076b;
    }

    public final boolean k(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object next : collection) {
            if (next != null && !this.f40077c.isAssignableFrom(next.getClass())) {
                return false;
            }
        }
        return true;
    }

    public boolean l() {
        return x() == 0;
    }

    public final boolean m(Object obj) {
        if (obj != null) {
            return this.f40077c.isAssignableFrom(obj.getClass());
        }
        return true;
    }

    public boolean n(Collection collection) {
        return (collection instanceof RealmSet) && ((RealmSet) collection).isManaged();
    }

    public void notifyChangeListeners(long j2) {
        this.f40076b.J(j2, this.f40079e);
    }

    public final boolean o(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object next : collection) {
            if (next != null && !this.f40077c.isAssignableFrom(next.getClass())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return q(this.f40077c, this.f40076b, this.f40075a, this.f40078d);
    }

    public boolean r(Object obj) {
        if (m(obj)) {
            return u(obj);
        }
        throw new ClassCastException("Set contents and object must be the same type when calling 'remove'.");
    }

    public boolean s(Collection collection) {
        if (n(collection)) {
            return i(((RealmSet) collection).e(), OsSet.ExternalCollectionOperation.REMOVE_ALL);
        }
        if (k(collection)) {
            return t(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'removeAll'.");
    }

    public abstract boolean t(Collection collection);

    public abstract boolean u(Object obj);

    public boolean v(Collection collection) {
        if (n(collection)) {
            return i(((RealmSet) collection).e(), OsSet.ExternalCollectionOperation.RETAIN_ALL);
        }
        if (k(collection)) {
            return w(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'retainAll'.");
    }

    public abstract boolean w(Collection collection);

    public int x() {
        return Long.valueOf(this.f40076b.a0()).intValue();
    }
}
