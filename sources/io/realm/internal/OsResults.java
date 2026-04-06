package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.RealmModel;
import io.realm.internal.ObservableCollection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsResults implements NativeObject, ObservableCollection {
    public static final long G = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final OsSharedRealm f40191A;

    /* renamed from: B  reason: collision with root package name */
    public final NativeContext f40192B;
    public final Table C;
    public boolean D;
    public boolean E = false;
    public final ObserverPairList F = new ObserverPairList();

    /* renamed from: z  reason: collision with root package name */
    public final long f40193z;

    /* renamed from: io.realm.internal.OsResults$1  reason: invalid class name */
    class AnonymousClass1 implements AddListTypeDelegate<String> {
    }

    /* renamed from: io.realm.internal.OsResults$10  reason: invalid class name */
    class AnonymousClass10 implements AddListTypeDelegate<Double> {
    }

    /* renamed from: io.realm.internal.OsResults$11  reason: invalid class name */
    class AnonymousClass11 implements AddListTypeDelegate<RealmModel> {
    }

    /* renamed from: io.realm.internal.OsResults$12  reason: invalid class name */
    class AnonymousClass12 implements AddListTypeDelegate<Decimal128> {
    }

    /* renamed from: io.realm.internal.OsResults$13  reason: invalid class name */
    class AnonymousClass13 implements AddListTypeDelegate<ObjectId> {
    }

    /* renamed from: io.realm.internal.OsResults$14  reason: invalid class name */
    class AnonymousClass14 implements AddListTypeDelegate<UUID> {
    }

    /* renamed from: io.realm.internal.OsResults$2  reason: invalid class name */
    class AnonymousClass2 implements AddListTypeDelegate<Byte> {
    }

    /* renamed from: io.realm.internal.OsResults$3  reason: invalid class name */
    class AnonymousClass3 implements AddListTypeDelegate<Short> {
    }

    /* renamed from: io.realm.internal.OsResults$4  reason: invalid class name */
    class AnonymousClass4 implements AddListTypeDelegate<Integer> {
    }

    /* renamed from: io.realm.internal.OsResults$5  reason: invalid class name */
    class AnonymousClass5 implements AddListTypeDelegate<Long> {
    }

    /* renamed from: io.realm.internal.OsResults$6  reason: invalid class name */
    class AnonymousClass6 implements AddListTypeDelegate<Boolean> {
    }

    /* renamed from: io.realm.internal.OsResults$7  reason: invalid class name */
    class AnonymousClass7 implements AddListTypeDelegate<byte[]> {
    }

    /* renamed from: io.realm.internal.OsResults$8  reason: invalid class name */
    class AnonymousClass8 implements AddListTypeDelegate<Date> {
    }

    /* renamed from: io.realm.internal.OsResults$9  reason: invalid class name */
    class AnonymousClass9 implements AddListTypeDelegate<Float> {
    }

    public interface AddListTypeDelegate<T> {
    }

    public enum Aggregate {
        MINIMUM((byte) 1),
        MAXIMUM((byte) 2),
        AVERAGE((byte) 3),
        SUM((byte) 4);
        

        /* renamed from: z  reason: collision with root package name */
        public final byte f40196z;

        /* access modifiers changed from: public */
        Aggregate(byte b2) {
            this.f40196z = b2;
        }
    }

    public static abstract class Iterator<T> implements java.util.Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public int f40197A = -1;

        /* renamed from: z  reason: collision with root package name */
        public OsResults f40198z;

        public Iterator(OsResults osResults) {
            if (!osResults.f40191A.isClosed()) {
                this.f40198z = osResults;
                if (!osResults.E) {
                    if (osResults.f40191A.isInTransaction()) {
                        c();
                    } else {
                        this.f40198z.f40191A.addIterator(this);
                    }
                }
            } else {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
        }

        public void b() {
            if (this.f40198z == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        public void c() {
            this.f40198z = this.f40198z.h();
        }

        public Object d(int i2) {
            return e(i2, this.f40198z);
        }

        public abstract Object e(int i2, OsResults osResults);

        public void f() {
            this.f40198z = null;
        }

        public boolean hasNext() {
            b();
            return ((long) (this.f40197A + 1)) < this.f40198z.s();
        }

        public Object next() {
            b();
            int i2 = this.f40197A + 1;
            this.f40197A = i2;
            if (((long) i2) < this.f40198z.s()) {
                return d(this.f40197A);
            }
            throw new NoSuchElementException("Cannot access index " + this.f40197A + " when size is " + this.f40198z.s() + ". Remember to check hasNext() before using next().");
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    public static abstract class ListIterator<T> extends Iterator<T> implements java.util.ListIterator<T> {
        public ListIterator(OsResults osResults, int i2) {
            super(osResults);
            if (i2 < 0 || ((long) i2) > this.f40198z.s()) {
                throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.f40198z.s() - 1) + "]. Yours was " + i2);
            }
            this.f40197A = i2 - 1;
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        public boolean hasPrevious() {
            b();
            return this.f40197A >= 0;
        }

        public int nextIndex() {
            b();
            return this.f40197A + 1;
        }

        public Object previous() {
            b();
            try {
                this.f40197A--;
                return d(this.f40197A);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.f40197A + ". Remember to check hasPrevious() before using previous().");
            }
        }

        public int previousIndex() {
            b();
            return this.f40197A;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    public enum Mode {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        public static Mode d(byte b2) {
            if (b2 == 0) {
                return EMPTY;
            }
            if (b2 == 1) {
                return TABLE;
            }
            if (b2 == 2) {
                return PRIMITIVE_LIST;
            }
            if (b2 == 3) {
                return QUERY;
            }
            if (b2 == 4) {
                return TABLEVIEW;
            }
            throw new IllegalArgumentException("Invalid value: " + b2);
        }
    }

    public OsResults(OsSharedRealm osSharedRealm, long j2) {
        boolean z2 = false;
        this.f40191A = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.f40192B = nativeContext;
        this.f40193z = j2;
        nativeContext.a(this);
        this.D = k() != Mode.QUERY ? true : z2;
        this.C = new Table(osSharedRealm, nativeGetTable(j2));
    }

    public static OsResults f(OsSharedRealm osSharedRealm, long j2) {
        return new OsResults(osSharedRealm, j2);
    }

    public static OsResults g(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.i();
        return new OsResults(osSharedRealm, tableQuery.g(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    private static native void nativeClear(long j2);

    public static native long nativeCreateResults(long j2, long j3);

    private static native long nativeCreateSnapshot(long j2);

    private static native void nativeEvaluateQueryIfNeeded(long j2, boolean z2);

    private static native long nativeFirstRow(long j2);

    private static native long nativeFreeze(long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j2);

    private static native long nativeGetRow(long j2, int i2);

    private static native long nativeGetTable(long j2);

    private static native Object nativeGetValue(long j2, int i2);

    private static native boolean nativeIsValid(long j2);

    private static native long nativeSize(long j2);

    private native void nativeStartListening(long j2);

    private native void nativeStopListening(long j2);

    public void c(Object obj, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        if (this.F.d()) {
            nativeStartListening(this.f40193z);
        }
        this.F.a(new ObservableCollection.CollectionObserverPair(obj, orderedRealmCollectionChangeListener));
    }

    public void d(Object obj, RealmChangeListener realmChangeListener) {
        c(obj, new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public void e() {
        nativeClear(this.f40193z);
    }

    public long getNativeFinalizerPtr() {
        return G;
    }

    public long getNativePtr() {
        return this.f40193z;
    }

    public OsResults h() {
        if (this.E) {
            return this;
        }
        OsResults osResults = new OsResults(this.f40191A, this.C, nativeCreateSnapshot(this.f40193z));
        osResults.E = true;
        return osResults;
    }

    public UncheckedRow i() {
        long nativeFirstRow = nativeFirstRow(this.f40193z);
        if (nativeFirstRow != 0) {
            return this.C.q(nativeFirstRow);
        }
        return null;
    }

    public OsResults j(OsSharedRealm osSharedRealm) {
        OsResults osResults = new OsResults(osSharedRealm, this.C.c(osSharedRealm), nativeFreeze(this.f40193z, osSharedRealm.getNativePtr()));
        if (n()) {
            osResults.p();
        }
        return osResults;
    }

    public Mode k() {
        return Mode.d(nativeGetMode(this.f40193z));
    }

    public UncheckedRow l(int i2) {
        return this.C.q(nativeGetRow(this.f40193z, i2));
    }

    public Object m(int i2) {
        return nativeGetValue(this.f40193z, i2);
    }

    public boolean n() {
        return this.D;
    }

    public void notifyChangeListeners(long j2) {
        OsCollectionChangeSet emptyLoadChangeSet = j2 == 0 ? new EmptyLoadChangeSet() : new OsCollectionChangeSet(j2, !n());
        if (!emptyLoadChangeSet.e() || !n()) {
            this.D = true;
            this.F.c(new ObservableCollection.Callback(emptyLoadChangeSet));
        }
    }

    public boolean o() {
        return nativeIsValid(this.f40193z);
    }

    public void p() {
        if (!this.D) {
            try {
                nativeEvaluateQueryIfNeeded(this.f40193z, false);
            } catch (IllegalStateException e2) {
                throw new IllegalArgumentException("Illegal Argument: " + e2.getMessage());
            } catch (IllegalArgumentException e3) {
                if (e3.getMessage().contains("Cannot sort on a collection property")) {
                    throw new IllegalStateException("Illegal Argument: " + e3.getMessage());
                }
            }
            notifyChangeListeners(0);
        }
    }

    public void q(Object obj, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        this.F.e(obj, orderedRealmCollectionChangeListener);
        if (this.F.d()) {
            nativeStopListening(this.f40193z);
        }
    }

    public void r(Object obj, RealmChangeListener realmChangeListener) {
        q(obj, new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public long s() {
        return nativeSize(this.f40193z);
    }

    public OsResults(OsSharedRealm osSharedRealm, Table table, long j2) {
        boolean z2 = false;
        this.f40191A = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.f40192B = nativeContext;
        this.C = table;
        this.f40193z = j2;
        nativeContext.a(this);
        this.D = k() != Mode.QUERY ? true : z2;
    }
}
