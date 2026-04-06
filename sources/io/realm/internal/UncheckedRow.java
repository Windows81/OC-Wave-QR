package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class UncheckedRow implements NativeObject, Row {
    public static final long C = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final Table f40237A;

    /* renamed from: B  reason: collision with root package name */
    public final long f40238B;

    /* renamed from: z  reason: collision with root package name */
    public final NativeContext f40239z;

    /* renamed from: io.realm.internal.UncheckedRow$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40240a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40240a = r0
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40240a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = io.realm.RealmFieldType.LIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.realm.internal.UncheckedRow.AnonymousClass1.<clinit>():void");
        }
    }

    public UncheckedRow(NativeContext nativeContext, Table table, long j2) {
        this.f40239z = nativeContext;
        this.f40237A = table;
        this.f40238B = j2;
        nativeContext.a(this);
    }

    public static UncheckedRow a(NativeContext nativeContext, Table table, long j2) {
        return new UncheckedRow(nativeContext, table, table.nativeGetRowPtr(table.getNativePtr(), j2));
    }

    public static UncheckedRow b(NativeContext nativeContext, Table table, long j2) {
        return new UncheckedRow(nativeContext, table, j2);
    }

    private static native long nativeGetFinalizerPtr();

    public OsMap A(long j2) {
        return new OsMap(this, j2);
    }

    public OsSet B(long j2, RealmFieldType realmFieldType) {
        return new OsSet(this, j2);
    }

    public NativeRealmAny C(long j2) {
        return new NativeRealmAny(nativeGetRealmAny(this.f40238B, j2));
    }

    public boolean D(long j2) {
        return nativeIsNullLink(this.f40238B, j2);
    }

    public byte[] E(long j2) {
        return nativeGetByteArray(this.f40238B, j2);
    }

    public void F() {
        if (!d()) {
            throw new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
        }
    }

    public double G(long j2) {
        return nativeGetDouble(this.f40238B, j2);
    }

    public float H(long j2) {
        return nativeGetFloat(this.f40238B, j2);
    }

    public String I(long j2) {
        return nativeGetString(this.f40238B, j2);
    }

    public OsList M(long j2, RealmFieldType realmFieldType) {
        return new OsList(this, j2);
    }

    public OsMap N(long j2, RealmFieldType realmFieldType) {
        return new OsMap(this, j2);
    }

    public RealmFieldType Q(long j2) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f40238B, j2));
    }

    public Row R(OsSharedRealm osSharedRealm) {
        return !d() ? InvalidRow.INSTANCE : new UncheckedRow(this.f40239z, this.f40237A.c(osSharedRealm), nativeFreeze(this.f40238B, osSharedRealm.getNativePtr()));
    }

    public long S() {
        return nativeGetObjectKey(this.f40238B);
    }

    public OsMap c(long j2) {
        return new OsMap(this, j2);
    }

    public boolean d() {
        long j2 = this.f40238B;
        return j2 != 0 && nativeIsValid(j2);
    }

    public Decimal128 f(long j2) {
        long[] nativeGetDecimal128 = nativeGetDecimal128(this.f40238B, j2);
        if (nativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeGetDecimal128[1], nativeGetDecimal128[0]);
        }
        return null;
    }

    public String[] getColumnNames() {
        return nativeGetColumnNames(this.f40238B);
    }

    public long getNativeFinalizerPtr() {
        return C;
    }

    public long getNativePtr() {
        return this.f40238B;
    }

    public void h(long j2, String str) {
        this.f40237A.a();
        if (str == null) {
            nativeSetNull(this.f40238B, j2);
            return;
        }
        nativeSetString(this.f40238B, j2, str);
    }

    public boolean isLoaded() {
        return true;
    }

    public Table j() {
        return this.f40237A;
    }

    public void k(long j2, boolean z2) {
        this.f40237A.a();
        nativeSetBoolean(this.f40238B, j2, z2);
    }

    public OsSet l(long j2) {
        return new OsSet(this, j2);
    }

    public ObjectId m(long j2) {
        return new ObjectId(nativeGetObjectId(this.f40238B, j2));
    }

    public UUID n(long j2) {
        return UUID.fromString(nativeGetUUID(this.f40238B, j2));
    }

    public native long nativeFreeze(long j2, long j3);

    public native boolean nativeGetBoolean(long j2, long j3);

    public native byte[] nativeGetByteArray(long j2, long j3);

    public native long nativeGetColumnKey(long j2, String str);

    public native String[] nativeGetColumnNames(long j2);

    public native int nativeGetColumnType(long j2, long j3);

    public native long[] nativeGetDecimal128(long j2, long j3);

    public native double nativeGetDouble(long j2, long j3);

    public native float nativeGetFloat(long j2, long j3);

    public native long nativeGetLong(long j2, long j3);

    public native String nativeGetObjectId(long j2, long j3);

    public native long nativeGetObjectKey(long j2);

    public native long nativeGetRealmAny(long j2, long j3);

    public native String nativeGetString(long j2, long j3);

    public native long nativeGetTimestamp(long j2, long j3);

    public native String nativeGetUUID(long j2, long j3);

    public native boolean nativeIsNull(long j2, long j3);

    public native boolean nativeIsNullLink(long j2, long j3);

    public native boolean nativeIsValid(long j2);

    public native void nativeSetBoolean(long j2, long j3, boolean z2);

    public native void nativeSetLong(long j2, long j3, long j4);

    public native void nativeSetNull(long j2, long j3);

    public native void nativeSetString(long j2, long j3, String str);

    public boolean o(long j2) {
        return nativeGetBoolean(this.f40238B, j2);
    }

    public long p(long j2) {
        return nativeGetLong(this.f40238B, j2);
    }

    public OsList r(long j2) {
        return new OsList(this, j2);
    }

    public void t(long j2, long j3) {
        this.f40237A.a();
        nativeSetLong(this.f40238B, j2, j3);
    }

    public Date x(long j2) {
        return new Date(nativeGetTimestamp(this.f40238B, j2));
    }

    public boolean y(long j2) {
        return nativeIsNull(this.f40238B, j2);
    }

    public long z(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f40238B, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public UncheckedRow(UncheckedRow uncheckedRow) {
        this.f40239z = uncheckedRow.f40239z;
        this.f40237A = uncheckedRow.f40237A;
        this.f40238B = uncheckedRow.f40238B;
    }
}
