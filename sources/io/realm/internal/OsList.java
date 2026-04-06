package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.internal.ObservableCollection;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsList implements NativeObject, ObservableCollection, OsCollection {
    public static final long D = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final NativeContext f40152A;

    /* renamed from: B  reason: collision with root package name */
    public final Table f40153B;
    public final ObserverPairList C = new ObserverPairList();

    /* renamed from: z  reason: collision with root package name */
    public final long f40154z;

    public OsList(UncheckedRow uncheckedRow, long j2) {
        OsSharedRealm n2 = uncheckedRow.j().n();
        long[] nativeCreate = nativeCreate(n2.getNativePtr(), uncheckedRow.getNativePtr(), j2);
        this.f40154z = nativeCreate[0];
        NativeContext nativeContext = n2.context;
        this.f40152A = nativeContext;
        nativeContext.a(this);
        if (nativeCreate[1] != 0) {
            this.f40153B = new Table(n2, nativeCreate[1]);
        } else {
            this.f40153B = null;
        }
    }

    private static native void nativeAddBinary(long j2, @Nullable byte[] bArr);

    private static native void nativeAddBoolean(long j2, boolean z2);

    private static native void nativeAddDate(long j2, long j3);

    private static native void nativeAddDecimal128(long j2, long j3, long j4);

    private static native void nativeAddDouble(long j2, double d2);

    private static native void nativeAddFloat(long j2, float f2);

    private static native void nativeAddLong(long j2, long j3);

    private static native void nativeAddNull(long j2);

    private static native void nativeAddObjectId(long j2, String str);

    private static native void nativeAddRealmAny(long j2, long j3);

    private static native void nativeAddRow(long j2, long j3);

    private static native void nativeAddString(long j2, @Nullable String str);

    private static native void nativeAddUUID(long j2, String str);

    private static native long[] nativeCreate(long j2, long j3, long j4);

    private static native long nativeCreateAndAddEmbeddedObject(long j2, long j3);

    private static native long nativeCreateAndSetEmbeddedObject(long j2, long j3);

    private static native long nativeFreeze(long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRow(long j2, long j3);

    private static native Object nativeGetValue(long j2, long j3);

    private static native void nativeInsertBinary(long j2, long j3, @Nullable byte[] bArr);

    private static native void nativeInsertBoolean(long j2, long j3, boolean z2);

    private static native void nativeInsertDate(long j2, long j3, long j4);

    private static native void nativeInsertDecimal128(long j2, long j3, long j4, long j5);

    private static native void nativeInsertDouble(long j2, long j3, double d2);

    private static native void nativeInsertFloat(long j2, long j3, float f2);

    private static native void nativeInsertLong(long j2, long j3, long j4);

    private static native void nativeInsertNull(long j2, long j3);

    private static native void nativeInsertObjectId(long j2, long j3, String str);

    private static native void nativeInsertRealmAny(long j2, long j3, long j4);

    private static native void nativeInsertRow(long j2, long j3, long j4);

    private static native void nativeInsertString(long j2, long j3, @Nullable String str);

    private static native void nativeInsertUUID(long j2, long j3, String str);

    private static native boolean nativeIsValid(long j2);

    private static native void nativeRemove(long j2, long j3);

    private static native void nativeRemoveAll(long j2);

    private static native void nativeSetBinary(long j2, long j3, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j2, long j3, boolean z2);

    private static native void nativeSetDate(long j2, long j3, long j4);

    private static native void nativeSetDecimal128(long j2, long j3, long j4, long j5);

    private static native void nativeSetDouble(long j2, long j3, double d2);

    private static native void nativeSetFloat(long j2, long j3, float f2);

    private static native void nativeSetLong(long j2, long j3, long j4);

    private static native void nativeSetNull(long j2, long j3);

    private static native void nativeSetObjectId(long j2, long j3, String str);

    private static native void nativeSetRealmAny(long j2, long j3, long j4);

    private static native void nativeSetRow(long j2, long j3, long j4);

    private static native void nativeSetString(long j2, long j3, @Nullable String str);

    private static native void nativeSetUUID(long j2, long j3, String str);

    private static native long nativeSize(long j2);

    private native void nativeStartListening(long j2);

    private native void nativeStopListening(long j2);

    public void A(long j2, float f2) {
        nativeInsertFloat(this.f40154z, j2, f2);
    }

    public void B(long j2, long j3) {
        nativeInsertLong(this.f40154z, j2, j3);
    }

    public void C(long j2) {
        nativeInsertNull(this.f40154z, j2);
    }

    public void D(long j2, ObjectId objectId) {
        if (objectId == null) {
            nativeInsertNull(this.f40154z, j2);
        } else {
            nativeInsertObjectId(this.f40154z, j2, objectId.toString());
        }
    }

    public void E(long j2, long j3) {
        nativeInsertRealmAny(this.f40154z, j2, j3);
    }

    public void F(long j2, long j3) {
        nativeInsertRow(this.f40154z, j2, j3);
    }

    public void G(long j2, String str) {
        nativeInsertString(this.f40154z, j2, str);
    }

    public void H(long j2, UUID uuid) {
        if (uuid == null) {
            nativeInsertNull(this.f40154z, j2);
        } else {
            nativeInsertUUID(this.f40154z, j2, uuid.toString());
        }
    }

    public boolean I() {
        return nativeIsValid(this.f40154z);
    }

    public void J(long j2) {
        nativeRemove(this.f40154z, j2);
    }

    public void K() {
        nativeRemoveAll(this.f40154z);
    }

    public void L(Object obj, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        this.C.e(obj, orderedRealmCollectionChangeListener);
        if (this.C.d()) {
            nativeStopListening(this.f40154z);
        }
    }

    public void M(Object obj, RealmChangeListener realmChangeListener) {
        L(obj, new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public void N(long j2, byte[] bArr) {
        nativeSetBinary(this.f40154z, j2, bArr);
    }

    public void O(long j2, boolean z2) {
        nativeSetBoolean(this.f40154z, j2, z2);
    }

    public void P(long j2, Date date) {
        if (date == null) {
            nativeSetNull(this.f40154z, j2);
            return;
        }
        nativeSetDate(this.f40154z, j2, date.getTime());
    }

    public void Q(long j2, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.f40154z, j2);
            return;
        }
        nativeSetDecimal128(this.f40154z, j2, decimal128.o(), decimal128.n());
    }

    public void R(long j2, double d2) {
        nativeSetDouble(this.f40154z, j2, d2);
    }

    public void S(long j2, float f2) {
        nativeSetFloat(this.f40154z, j2, f2);
    }

    public void T(long j2, long j3) {
        nativeSetLong(this.f40154z, j2, j3);
    }

    public void U(long j2) {
        nativeSetNull(this.f40154z, j2);
    }

    public void V(long j2, ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.f40154z, j2);
        } else {
            nativeSetObjectId(this.f40154z, j2, objectId.toString());
        }
    }

    public void W(long j2, long j3) {
        nativeSetRealmAny(this.f40154z, j2, j3);
    }

    public void X(long j2, long j3) {
        nativeSetRow(this.f40154z, j2, j3);
    }

    public void Y(long j2, String str) {
        nativeSetString(this.f40154z, j2, str);
    }

    public void Z(long j2, UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.f40154z, j2);
        } else {
            nativeSetUUID(this.f40154z, j2, uuid.toString());
        }
    }

    public void a(byte[] bArr) {
        nativeAddBinary(this.f40154z, bArr);
    }

    public long a0() {
        return nativeSize(this.f40154z);
    }

    public void b(boolean z2) {
        nativeAddBoolean(this.f40154z, z2);
    }

    public void c(Date date) {
        if (date == null) {
            nativeAddNull(this.f40154z);
        } else {
            nativeAddDate(this.f40154z, date.getTime());
        }
    }

    public void d(Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.f40154z);
        } else {
            nativeAddDecimal128(this.f40154z, decimal128.o(), decimal128.n());
        }
    }

    public void e(double d2) {
        nativeAddDouble(this.f40154z, d2);
    }

    public void f(float f2) {
        nativeAddFloat(this.f40154z, f2);
    }

    public void g(Object obj, OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener) {
        if (this.C.d()) {
            nativeStartListening(this.f40154z);
        }
        this.C.a(new ObservableCollection.CollectionObserverPair(obj, orderedRealmCollectionChangeListener));
    }

    public long getNativeFinalizerPtr() {
        return D;
    }

    public long getNativePtr() {
        return this.f40154z;
    }

    public void h(Object obj, RealmChangeListener realmChangeListener) {
        g(obj, new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public void i(long j2) {
        nativeAddLong(this.f40154z, j2);
    }

    public void j() {
        nativeAddNull(this.f40154z);
    }

    public void k(ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.f40154z);
        } else {
            nativeAddObjectId(this.f40154z, objectId.toString());
        }
    }

    public void l(long j2) {
        nativeAddRealmAny(this.f40154z, j2);
    }

    public void m(long j2) {
        nativeAddRow(this.f40154z, j2);
    }

    public void n(String str) {
        nativeAddString(this.f40154z, str);
    }

    public void notifyChangeListeners(long j2) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j2, false);
        if (!osCollectionChangeSet.e()) {
            this.C.c(new ObservableCollection.Callback(osCollectionChangeSet));
        }
    }

    public void o(UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.f40154z);
        } else {
            nativeAddUUID(this.f40154z, uuid.toString());
        }
    }

    public long p() {
        return nativeCreateAndAddEmbeddedObject(this.f40154z, a0());
    }

    public long q(long j2) {
        return nativeCreateAndAddEmbeddedObject(this.f40154z, j2);
    }

    public long r(long j2) {
        return nativeCreateAndSetEmbeddedObject(this.f40154z, j2);
    }

    public OsList s(OsSharedRealm osSharedRealm) {
        long nativeFreeze = nativeFreeze(this.f40154z, osSharedRealm.getNativePtr());
        Table table = this.f40153B;
        return new OsList(osSharedRealm, nativeFreeze, table != null ? table.c(osSharedRealm) : null);
    }

    public UncheckedRow t(long j2) {
        return this.f40153B.q(nativeGetRow(this.f40154z, j2));
    }

    public Object u(long j2) {
        return nativeGetValue(this.f40154z, j2);
    }

    public void v(long j2, byte[] bArr) {
        nativeInsertBinary(this.f40154z, j2, bArr);
    }

    public void w(long j2, boolean z2) {
        nativeInsertBoolean(this.f40154z, j2, z2);
    }

    public void x(long j2, Date date) {
        if (date == null) {
            nativeInsertNull(this.f40154z, j2);
            return;
        }
        nativeInsertDate(this.f40154z, j2, date.getTime());
    }

    public void y(long j2, Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.f40154z, j2);
            return;
        }
        nativeInsertDecimal128(this.f40154z, j2, decimal128.o(), decimal128.n());
    }

    public void z(long j2, double d2) {
        nativeInsertDouble(this.f40154z, j2, d2);
    }

    public OsList(OsSharedRealm osSharedRealm, long j2, Table table) {
        this.f40154z = j2;
        this.f40153B = table;
        NativeContext nativeContext = osSharedRealm.context;
        this.f40152A = nativeContext;
        nativeContext.a(this);
    }
}
