package io.realm.internal;

import io.realm.SetChangeSet;
import io.realm.internal.ObservableSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsSet implements NativeObject, OsCollection {
    public static final long D = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final NativeContext f40205A;

    /* renamed from: B  reason: collision with root package name */
    public final OsSharedRealm f40206B;
    public final Table C;

    /* renamed from: z  reason: collision with root package name */
    public final long f40207z;

    /* renamed from: io.realm.internal.OsSet$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40208a;

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
                f40208a = r0
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.CONTAINS_ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40208a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.ADD_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40208a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.REMOVE_ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40208a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.internal.OsSet$ExternalCollectionOperation r1 = io.realm.internal.OsSet.ExternalCollectionOperation.RETAIN_ALL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.OsSet.AnonymousClass1.<clinit>():void");
        }
    }

    public enum ExternalCollectionOperation {
        CONTAINS_ALL,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL
    }

    public OsSet(UncheckedRow uncheckedRow, long j2) {
        OsSharedRealm n2 = uncheckedRow.j().n();
        this.f40206B = n2;
        long[] nativeCreate = nativeCreate(n2.getNativePtr(), uncheckedRow.getNativePtr(), j2);
        this.f40207z = nativeCreate[0];
        NativeContext nativeContext = n2.context;
        this.f40205A = nativeContext;
        nativeContext.a(this);
        if (nativeCreate[1] != 0) {
            this.C = new Table(n2, nativeCreate[1]);
        } else {
            this.C = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j2, long j3);

    private static native long[] nativeAddBinary(long j2, byte[] bArr);

    private static native long[] nativeAddBoolean(long j2, boolean z2);

    private static native long[] nativeAddDate(long j2, long j3);

    private static native long[] nativeAddDecimal128(long j2, long j3, long j4);

    private static native long[] nativeAddDouble(long j2, double d2);

    private static native long[] nativeAddFloat(long j2, float f2);

    private static native long[] nativeAddLong(long j2, long j3);

    private static native long[] nativeAddNull(long j2);

    private static native long[] nativeAddObjectId(long j2, String str);

    private static native long[] nativeAddRealmAny(long j2, long j3);

    private static native long[] nativeAddRow(long j2, long j3);

    private static native long[] nativeAddString(long j2, String str);

    private static native long[] nativeAddUUID(long j2, String str);

    private static native boolean nativeAsymmetricDifference(long j2, long j3);

    private static native void nativeClear(long j2);

    private static native boolean nativeContainsAll(long j2, long j3);

    private static native boolean nativeContainsAllRealmAnyCollection(long j2, long j3);

    private static native boolean nativeContainsBinary(long j2, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j2, boolean z2);

    private static native boolean nativeContainsDate(long j2, long j3);

    private static native boolean nativeContainsDecimal128(long j2, long j3, long j4);

    private static native boolean nativeContainsDouble(long j2, double d2);

    private static native boolean nativeContainsFloat(long j2, float f2);

    private static native boolean nativeContainsLong(long j2, long j3);

    private static native boolean nativeContainsNull(long j2);

    private static native boolean nativeContainsObjectId(long j2, String str);

    private static native boolean nativeContainsRealmAny(long j2, long j3);

    private static native boolean nativeContainsRow(long j2, long j3);

    private static native boolean nativeContainsString(long j2, String str);

    private static native boolean nativeContainsUUID(long j2, String str);

    private static native long[] nativeCreate(long j2, long j3, long j4);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAny(long j2, int i2);

    private static native long nativeGetRow(long j2, int i2);

    private static native Object nativeGetValueAtIndex(long j2, int i2);

    private static native boolean nativeIntersect(long j2, long j3);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j2, long j3);

    private static native long[] nativeRemoveBinary(long j2, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j2, boolean z2);

    private static native long[] nativeRemoveDate(long j2, long j3);

    private static native long[] nativeRemoveDecimal128(long j2, long j3, long j4);

    private static native long[] nativeRemoveDouble(long j2, double d2);

    private static native long[] nativeRemoveFloat(long j2, float f2);

    private static native long[] nativeRemoveLong(long j2, long j3);

    private static native long[] nativeRemoveNull(long j2);

    private static native long[] nativeRemoveObjectId(long j2, String str);

    private static native long[] nativeRemoveRealmAny(long j2, long j3);

    private static native long[] nativeRemoveRow(long j2, long j3);

    private static native long[] nativeRemoveString(long j2, String str);

    private static native long[] nativeRemoveUUID(long j2, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j2, long j3);

    private static native long nativeSize(long j2);

    private static native boolean nativeUnion(long j2, long j3);

    public boolean A(ObjectId objectId) {
        return objectId == null ? nativeContainsNull(this.f40207z) : nativeContainsObjectId(this.f40207z, objectId.toString());
    }

    public boolean B(byte[] bArr) {
        return bArr == null ? nativeContainsNull(this.f40207z) : nativeContainsBinary(this.f40207z, bArr);
    }

    public boolean C(OsSet osSet) {
        return nativeContainsAll(this.f40207z, osSet.getNativePtr());
    }

    public boolean D(long j2) {
        return nativeContainsRealmAny(this.f40207z, j2);
    }

    public boolean E(long j2) {
        return nativeContainsRow(this.f40207z, j2);
    }

    public long F(int i2) {
        return nativeGetRealmAny(this.f40207z, i2);
    }

    public long G(int i2) {
        return nativeGetRow(this.f40207z, i2);
    }

    public Object H(int i2) {
        return nativeGetValueAtIndex(this.f40207z, i2);
    }

    public boolean I(OsSet osSet) {
        return nativeIntersect(this.f40207z, osSet.getNativePtr());
    }

    public void J(long j2, ObserverPairList observerPairList) {
        SetChangeSet setChangeSet = new SetChangeSet(new OsCollectionChangeSet(j2, false));
        if (!setChangeSet.a()) {
            observerPairList.c(new ObservableSet.Callback(setChangeSet));
        }
    }

    public boolean K(Boolean bool) {
        return (bool == null ? nativeRemoveNull(this.f40207z) : nativeRemoveBoolean(this.f40207z, bool.booleanValue()))[1] == 1;
    }

    public boolean L(Byte b2) {
        return (b2 == null ? nativeRemoveNull(this.f40207z) : nativeRemoveLong(this.f40207z, b2.longValue()))[1] == 1;
    }

    public boolean M(Double d2) {
        return (d2 == null ? nativeRemoveNull(this.f40207z) : nativeRemoveDouble(this.f40207z, d2.doubleValue()))[1] == 1;
    }

    public boolean N(Float f2) {
        return (f2 == null ? nativeRemoveNull(this.f40207z) : nativeRemoveFloat(this.f40207z, f2.floatValue()))[1] == 1;
    }

    public boolean O(Integer num) {
        return (num == null ? nativeRemoveNull(this.f40207z) : nativeRemoveLong(this.f40207z, num.longValue()))[1] == 1;
    }

    public boolean P(Long l2) {
        return (l2 == null ? nativeRemoveNull(this.f40207z) : nativeRemoveLong(this.f40207z, l2.longValue()))[1] == 1;
    }

    public boolean Q(Short sh) {
        return (sh == null ? nativeRemoveNull(this.f40207z) : nativeRemoveLong(this.f40207z, sh.longValue()))[1] == 1;
    }

    public boolean R(String str) {
        return (str == null ? nativeRemoveNull(this.f40207z) : nativeRemoveString(this.f40207z, str))[1] == 1;
    }

    public boolean S(Date date) {
        return (date == null ? nativeRemoveNull(this.f40207z) : nativeRemoveDate(this.f40207z, date.getTime()))[1] == 1;
    }

    public boolean T(UUID uuid) {
        return (uuid == null ? nativeRemoveNull(this.f40207z) : nativeRemoveUUID(this.f40207z, uuid.toString()))[1] == 1;
    }

    public boolean U(Decimal128 decimal128) {
        return (decimal128 == null ? nativeRemoveNull(this.f40207z) : nativeRemoveDecimal128(this.f40207z, decimal128.o(), decimal128.n()))[1] == 1;
    }

    public boolean V(ObjectId objectId) {
        return (objectId == null ? nativeRemoveNull(this.f40207z) : nativeRemoveObjectId(this.f40207z, objectId.toString()))[1] == 1;
    }

    public boolean W(byte[] bArr) {
        return (bArr == null ? nativeRemoveNull(this.f40207z) : nativeRemoveBinary(this.f40207z, bArr))[1] == 1;
    }

    public boolean X(long j2) {
        return nativeRemoveRealmAny(this.f40207z, j2)[1] != 0;
    }

    public boolean Y(long j2) {
        return nativeRemoveRow(this.f40207z, j2)[1] != 0;
    }

    public final boolean Z(NativeRealmAnyCollection nativeRealmAnyCollection) {
        if (a0() == 0) {
            return false;
        }
        if (nativeRealmAnyCollection.a() != 0) {
            return nativeRetainAllRealmAnyCollection(this.f40207z, nativeRealmAnyCollection.getNativePtr());
        }
        q();
        return true;
    }

    public boolean a(Boolean bool) {
        return (bool == null ? nativeAddNull(this.f40207z) : nativeAddBoolean(this.f40207z, bool.booleanValue()))[1] != 0;
    }

    public long a0() {
        return nativeSize(this.f40207z);
    }

    public boolean b(Byte b2) {
        return (b2 == null ? nativeAddNull(this.f40207z) : nativeAddLong(this.f40207z, b2.longValue()))[1] != 0;
    }

    public boolean b0(OsSet osSet) {
        return nativeUnion(this.f40207z, osSet.getNativePtr());
    }

    public boolean c(Double d2) {
        return (d2 == null ? nativeAddNull(this.f40207z) : nativeAddDouble(this.f40207z, d2.doubleValue()))[1] != 0;
    }

    public boolean d(Float f2) {
        return (f2 == null ? nativeAddNull(this.f40207z) : nativeAddFloat(this.f40207z, f2.floatValue()))[1] != 0;
    }

    public boolean e(Integer num) {
        return (num == null ? nativeAddNull(this.f40207z) : nativeAddLong(this.f40207z, num.longValue()))[1] != 0;
    }

    public boolean f(Long l2) {
        return (l2 == null ? nativeAddNull(this.f40207z) : nativeAddLong(this.f40207z, l2.longValue()))[1] != 0;
    }

    public boolean g(Short sh) {
        return (sh == null ? nativeAddNull(this.f40207z) : nativeAddLong(this.f40207z, sh.longValue()))[1] != 0;
    }

    public long getNativeFinalizerPtr() {
        return D;
    }

    public long getNativePtr() {
        return this.f40207z;
    }

    public boolean h(String str) {
        return (str == null ? nativeAddNull(this.f40207z) : nativeAddString(this.f40207z, str))[1] != 0;
    }

    public boolean i(Date date) {
        return (date == null ? nativeAddNull(this.f40207z) : nativeAddDate(this.f40207z, date.getTime()))[1] != 0;
    }

    public boolean j(UUID uuid) {
        return (uuid == null ? nativeAddNull(this.f40207z) : nativeAddUUID(this.f40207z, uuid.toString()))[1] != 0;
    }

    public boolean k(Decimal128 decimal128) {
        return (decimal128 == null ? nativeAddNull(this.f40207z) : nativeAddDecimal128(this.f40207z, decimal128.o(), decimal128.n()))[1] != 0;
    }

    public boolean l(ObjectId objectId) {
        return (objectId == null ? nativeAddNull(this.f40207z) : nativeAddObjectId(this.f40207z, objectId.toString()))[1] != 0;
    }

    public boolean m(byte[] bArr) {
        return (bArr == null ? nativeAddNull(this.f40207z) : nativeAddBinary(this.f40207z, bArr))[1] != 0;
    }

    public boolean n(long j2) {
        return nativeAddRealmAny(this.f40207z, j2)[1] != 0;
    }

    public boolean o(long j2) {
        return nativeAddRow(this.f40207z, j2)[1] != 0;
    }

    public boolean p(OsSet osSet) {
        return nativeAsymmetricDifference(this.f40207z, osSet.getNativePtr());
    }

    public void q() {
        nativeClear(this.f40207z);
    }

    public boolean r(NativeRealmAnyCollection nativeRealmAnyCollection, ExternalCollectionOperation externalCollectionOperation) {
        int i2 = AnonymousClass1.f40208a[externalCollectionOperation.ordinal()];
        if (i2 == 1) {
            return nativeContainsAllRealmAnyCollection(this.f40207z, nativeRealmAnyCollection.getNativePtr());
        }
        if (i2 == 2) {
            return nativeAddAllRealmAnyCollection(this.f40207z, nativeRealmAnyCollection.getNativePtr());
        }
        if (i2 == 3) {
            return nativeRemoveAllRealmAnyCollection(this.f40207z, nativeRealmAnyCollection.getNativePtr());
        }
        if (i2 == 4) {
            return Z(nativeRealmAnyCollection);
        }
        throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
    }

    public boolean s(Boolean bool) {
        return bool == null ? nativeContainsNull(this.f40207z) : nativeContainsBoolean(this.f40207z, bool.booleanValue());
    }

    public boolean t(Double d2) {
        return d2 == null ? nativeContainsNull(this.f40207z) : nativeContainsDouble(this.f40207z, d2.doubleValue());
    }

    public boolean u(Float f2) {
        return f2 == null ? nativeContainsNull(this.f40207z) : nativeContainsFloat(this.f40207z, f2.floatValue());
    }

    public boolean v(Long l2) {
        return l2 == null ? nativeContainsNull(this.f40207z) : nativeContainsLong(this.f40207z, l2.longValue());
    }

    public boolean w(String str) {
        return str == null ? nativeContainsNull(this.f40207z) : nativeContainsString(this.f40207z, str);
    }

    public boolean x(Date date) {
        return date == null ? nativeContainsNull(this.f40207z) : nativeContainsDate(this.f40207z, date.getTime());
    }

    public boolean y(UUID uuid) {
        return uuid == null ? nativeContainsNull(this.f40207z) : nativeContainsUUID(this.f40207z, uuid.toString());
    }

    public boolean z(Decimal128 decimal128) {
        return decimal128 == null ? nativeContainsNull(this.f40207z) : nativeContainsDecimal128(this.f40207z, decimal128.o(), decimal128.n());
    }
}
