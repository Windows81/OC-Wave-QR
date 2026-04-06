package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

public class CheckedRow extends UncheckedRow {
    public UncheckedRow D;

    public CheckedRow(NativeContext nativeContext, Table table, long j2) {
        super(nativeContext, table, j2);
    }

    public static CheckedRow e(NativeContext nativeContext, Table table, long j2) {
        return new CheckedRow(nativeContext, table, table.nativeGetRowPtr(table.getNativePtr(), j2));
    }

    public static CheckedRow g(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    public OsMap A(long j2) {
        if (j().k(j2) == RealmFieldType.STRING_TO_LINK_MAP) {
            return super.c(j2);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", new Object[]{j().i(j2)}));
    }

    public OsSet B(long j2, RealmFieldType realmFieldType) {
        if (realmFieldType == j().k(j2)) {
            return super.B(j2, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", new Object[]{j().i(j2), realmFieldType.name()}));
    }

    public boolean D(long j2) {
        RealmFieldType Q = Q(j2);
        if (Q == RealmFieldType.OBJECT || Q == RealmFieldType.LIST) {
            return super.D(j2);
        }
        return false;
    }

    public OsList M(long j2, RealmFieldType realmFieldType) {
        if (realmFieldType == j().k(j2)) {
            return super.M(j2, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", new Object[]{j().i(j2), realmFieldType.name()}));
    }

    public OsMap N(long j2, RealmFieldType realmFieldType) {
        if (realmFieldType == j().k(j2)) {
            return super.N(j2, realmFieldType);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", new Object[]{j().i(j2), realmFieldType.name()}));
    }

    public Row R(OsSharedRealm osSharedRealm) {
        return !d() ? InvalidRow.INSTANCE : new CheckedRow(this.f40239z, this.f40237A.c(osSharedRealm), nativeFreeze(getNativePtr(), osSharedRealm.getNativePtr()));
    }

    public OsSet l(long j2) {
        return super.l(j2);
    }

    public native boolean nativeGetBoolean(long j2, long j3);

    public native byte[] nativeGetByteArray(long j2, long j3);

    public native long nativeGetColumnKey(long j2, String str);

    public native int nativeGetColumnType(long j2, long j3);

    public native long[] nativeGetDecimal128(long j2, long j3);

    public native double nativeGetDouble(long j2, long j3);

    public native float nativeGetFloat(long j2, long j3);

    public native long nativeGetLong(long j2, long j3);

    public native String nativeGetObjectId(long j2, long j3);

    public native String nativeGetString(long j2, long j3);

    public native long nativeGetTimestamp(long j2, long j3);

    public native boolean nativeIsNullLink(long j2, long j3);

    public native void nativeSetBoolean(long j2, long j3, boolean z2);

    public native void nativeSetLong(long j2, long j3, long j4);

    public native void nativeSetString(long j2, long j3, String str);

    public OsList r(long j2) {
        if (j().k(j2) == RealmFieldType.LIST) {
            return super.r(j2);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", new Object[]{j().i(j2)}));
    }

    public boolean y(long j2) {
        return super.y(j2);
    }

    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
        this.D = uncheckedRow;
    }
}
