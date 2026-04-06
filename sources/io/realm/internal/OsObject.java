package io.realm.internal;

import io.realm.ObjectChangeSet;
import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import io.realm.exceptions.RealmException;
import io.realm.internal.ObserverPairList;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;

public class OsObject implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private ObserverPairList<ObjectObserverPair> observerPairs = new ObserverPairList<>();

    public static class Callback implements ObserverPairList.Callback<ObjectObserverPair> {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f40160a;

        public Callback(String[] strArr) {
            this.f40160a = strArr;
        }

        public final ObjectChangeSet b() {
            String[] strArr = this.f40160a;
            boolean z2 = strArr == null;
            if (z2) {
                strArr = new String[0];
            }
            return new OsObjectChangeSet(strArr, z2);
        }

        /* renamed from: c */
        public void a(ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.a((RealmModel) obj, b());
        }
    }

    public static class ObjectObserverPair<T extends RealmModel> extends ObserverPairList.ObserverPair<T, RealmObjectChangeListener<T>> {
        public ObjectObserverPair(RealmModel realmModel, RealmObjectChangeListener realmObjectChangeListener) {
            super(realmModel, realmObjectChangeListener);
        }

        public void a(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
            ((RealmObjectChangeListener) this.f40147b).a(realmModel, objectChangeSet);
        }
    }

    public static class OsObjectChangeSet implements ObjectChangeSet {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f40161a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f40162b;

        public OsObjectChangeSet(String[] strArr, boolean z2) {
            this.f40161a = strArr;
            this.f40162b = z2;
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.n().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j2, long j3) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j2, j3);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j2, @Nullable Object obj) {
        Object obj2 = obj;
        RealmFieldType k2 = table.k(j2);
        OsSharedRealm n2 = table.n();
        if (k2 == RealmFieldType.STRING) {
            if (obj2 == null || (obj2 instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(n2.getNativePtr(), table.getNativePtr(), j2, (String) obj2);
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj2);
        } else if (k2 == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(n2.getNativePtr(), table.getNativePtr(), j2, obj2 == null ? 0 : Long.parseLong(obj.toString()), obj2 == null);
        } else {
            String str = null;
            if (k2 == RealmFieldType.OBJECT_ID) {
                if (obj2 == null || (obj2 instanceof ObjectId)) {
                    if (obj2 != null) {
                        str = obj.toString();
                    }
                    return nativeCreateRowWithObjectIdPrimaryKey(n2.getNativePtr(), table.getNativePtr(), j2, str);
                }
                throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj2);
            } else if (k2 != RealmFieldType.UUID) {
                throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + k2);
            } else if (obj2 == null || (obj2 instanceof UUID)) {
                if (obj2 != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithUUIDPrimaryKey(n2.getNativePtr(), table.getNativePtr(), j2, str);
            } else {
                throw new IllegalArgumentException("Primary key value is not an UUID: " + obj2);
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, @Nullable Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType k2 = table.k(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm n2 = table.n();
        if (k2 == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(n2.context, table, nativeCreateNewObjectWithStringPrimaryKey(n2.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            throw new IllegalArgumentException("Primary key value is not a String: " + obj);
        } else if (k2 == RealmFieldType.INTEGER) {
            return new UncheckedRow(n2.context, table, nativeCreateNewObjectWithLongPrimaryKey(n2.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0 : Long.parseLong(obj.toString()), obj == null));
        } else if (k2 == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(n2.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(n2.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else if (k2 == RealmFieldType.UUID) {
            return new UncheckedRow(n2.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(n2.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else {
            throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + k2);
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String b2 = OsObjectStore.b(table.n(), table.e());
        if (b2 != null) {
            return table.h(b2);
        }
        throw new IllegalStateException(table.m() + " has no primary key defined.");
    }

    private static native long nativeCreate(long j2, long j3);

    private static native long nativeCreateEmbeddedObject(long j2, long j3, long j4);

    private static native long nativeCreateNewObject(long j2);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j2, long j3, long j4, long j5, boolean z2);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeCreateRow(long j2);

    private static native long nativeCreateRowWithLongPrimaryKey(long j2, long j3, long j4, long j5, boolean z2);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j2, long j3, long j4, @Nullable String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j2);

    private native void nativeStopListening(long j2);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.c(new Callback(strArr));
    }

    public <T extends RealmModel> void addListener(T t2, RealmObjectChangeListener<T> realmObjectChangeListener) {
        if (this.observerPairs.d()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new ObjectObserverPair(t2, realmObjectChangeListener));
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends RealmModel> void removeListener(T t2) {
        this.observerPairs.f(t2);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(ObserverPairList<ObjectObserverPair> observerPairList) {
        if (this.observerPairs.d()) {
            this.observerPairs = observerPairList;
            if (!observerPairList.d()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }

    public <T extends RealmModel> void removeListener(T t2, RealmObjectChangeListener<T> realmObjectChangeListener) {
        this.observerPairs.e(t2, realmObjectChangeListener);
        if (this.observerPairs.d()) {
            nativeStopListening(this.nativePtr);
        }
    }
}
