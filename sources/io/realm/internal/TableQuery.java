package io.realm.internal;

import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.internal.objectstore.OsKeyPathMapping;

public class TableQuery implements NativeObject {
    public static final long D = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final long f40234A;

    /* renamed from: B  reason: collision with root package name */
    public final RealmAnyNativeFunctionsImpl f40235B = new RealmAnyNativeFunctionsImpl();
    public boolean C = true;

    /* renamed from: z  reason: collision with root package name */
    public final Table f40236z;

    public TableQuery(NativeContext nativeContext, Table table, long j2) {
        this.f40236z = table;
        this.f40234A = j2;
        nativeContext.a(this);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native long nativeFind(long j2);

    private static native long nativeGetFinalizerPtr();

    private native void nativeRawPredicate(long j2, String str, long[] jArr, long j3);

    private native String nativeValidateQuery(long j2);

    public TableQuery a(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f40235B;
        realmAnyNativeFunctionsImpl.a(this, osKeyPathMapping, e(str) + " CONTAINS $0", realmAny);
        this.C = false;
        return this;
    }

    public TableQuery b(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f40235B;
        realmAnyNativeFunctionsImpl.a(this, osKeyPathMapping, e(str) + " CONTAINS[c] $0", realmAny);
        this.C = false;
        return this;
    }

    public TableQuery c(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f40235B;
        realmAnyNativeFunctionsImpl.a(this, osKeyPathMapping, e(str) + " = $0", realmAny);
        this.C = false;
        return this;
    }

    public TableQuery d(OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f40235B;
        realmAnyNativeFunctionsImpl.a(this, osKeyPathMapping, e(str) + " =[c] $0", realmAny);
        this.C = false;
        return this;
    }

    public long f() {
        i();
        return nativeFind(this.f40234A);
    }

    public Table g() {
        return this.f40236z;
    }

    public long getNativeFinalizerPtr() {
        return D;
    }

    public long getNativePtr() {
        return this.f40234A;
    }

    public void h(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        nativeRawPredicate(this.f40234A, str, jArr, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0);
    }

    public void i() {
        if (!this.C) {
            String nativeValidateQuery = nativeValidateQuery(this.f40234A);
            if ("".equals(nativeValidateQuery)) {
                this.C = true;
                return;
            }
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
    }
}
