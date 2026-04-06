package io.realm.internal.core;

import io.realm.RealmAny;
import io.realm.RealmModel;
import io.realm.internal.NativeContext;
import io.realm.internal.NativeObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Table;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class NativeRealmAny implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;

    public NativeRealmAny(long j2) {
        this.nativePtr = j2;
        NativeContext.f40128c.a(this);
    }

    private static long createRealmAnyLink(RealmObjectProxy realmObjectProxy) {
        Row e2 = realmObjectProxy.b().e();
        return nativeCreateLink(e2.j().getNativePtr(), e2.S());
    }

    private static native byte[] nativeAsBinary(long j2);

    private static native boolean nativeAsBoolean(long j2);

    private static native long nativeAsDate(long j2);

    private static native long[] nativeAsDecimal128(long j2);

    private static native double nativeAsDouble(long j2);

    private static native float nativeAsFloat(long j2);

    private static native long nativeAsLong(long j2);

    private static native String nativeAsObjectId(long j2);

    private static native String nativeAsString(long j2);

    private static native String nativeAsUUID(long j2);

    private static native long nativeCreateBinary(byte[] bArr);

    private static native long nativeCreateBoolean(boolean z2);

    private static native long nativeCreateDate(long j2);

    private static native long nativeCreateDecimal128(long j2, long j3);

    private static native long nativeCreateDouble(double d2);

    private static native long nativeCreateFloat(float f2);

    private static native long nativeCreateLink(long j2, long j3);

    private static native long nativeCreateLong(long j2);

    private static native long nativeCreateNull();

    private static native long nativeCreateObjectId(String str);

    private static native long nativeCreateString(String str);

    private static native long nativeCreateUUID(String str);

    private static native boolean nativeEquals(long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmModelRowKey(long j2);

    private static native String nativeGetRealmModelTableName(long j2, long j3);

    private static native int nativeGetType(long j2);

    public byte[] asBinary() {
        return nativeAsBinary(this.nativePtr);
    }

    public boolean asBoolean() {
        return nativeAsBoolean(this.nativePtr);
    }

    public Date asDate() {
        return new Date(nativeAsDate(this.nativePtr));
    }

    public Decimal128 asDecimal128() {
        long[] nativeAsDecimal128 = nativeAsDecimal128(this.nativePtr);
        return Decimal128.fromIEEE754BIDEncoding(nativeAsDecimal128[1], nativeAsDecimal128[0]);
    }

    public double asDouble() {
        return nativeAsDouble(this.nativePtr);
    }

    public float asFloat() {
        return nativeAsFloat(this.nativePtr);
    }

    public long asLong() {
        return nativeAsLong(this.nativePtr);
    }

    public ObjectId asObjectId() {
        return new ObjectId(nativeAsObjectId(this.nativePtr));
    }

    public String asString() {
        return nativeAsString(this.nativePtr);
    }

    public UUID asUUID() {
        return UUID.fromString(nativeAsUUID(this.nativePtr));
    }

    public boolean coercedEquals(NativeRealmAny nativeRealmAny) {
        return nativeEquals(this.nativePtr, nativeRealmAny.nativePtr);
    }

    public <T extends RealmModel> Class<T> getModelClass(OsSharedRealm osSharedRealm, RealmProxyMediator realmProxyMediator) {
        return realmProxyMediator.e(Table.f(nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr())));
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getRealmModelRowKey() {
        return nativeGetRealmModelRowKey(this.nativePtr);
    }

    public String getRealmModelTableName(OsSharedRealm osSharedRealm) {
        return nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr());
    }

    public RealmAny.Type getType() {
        return RealmAny.Type.d(nativeGetType(this.nativePtr));
    }

    public NativeRealmAny(Boolean bool) {
        this(nativeCreateBoolean(bool.booleanValue()));
    }

    public NativeRealmAny(Number number) {
        this(nativeCreateLong(number.longValue()));
    }

    public NativeRealmAny(Float f2) {
        this(nativeCreateFloat(f2.floatValue()));
    }

    public NativeRealmAny(Double d2) {
        this(nativeCreateDouble(d2.doubleValue()));
    }

    public NativeRealmAny(String str) {
        this(nativeCreateString(str));
    }

    public NativeRealmAny(byte[] bArr) {
        this(nativeCreateBinary(bArr));
    }

    public NativeRealmAny(Date date) {
        this(nativeCreateDate(date.getTime()));
    }

    public NativeRealmAny(ObjectId objectId) {
        this(nativeCreateObjectId(objectId.toString()));
    }

    public NativeRealmAny(Decimal128 decimal128) {
        this(nativeCreateDecimal128(decimal128.o(), decimal128.n()));
    }

    public NativeRealmAny(UUID uuid) {
        this(nativeCreateUUID(uuid.toString()));
    }

    public NativeRealmAny(RealmObjectProxy realmObjectProxy) {
        this(createRealmAnyLink(realmObjectProxy));
    }

    public NativeRealmAny() {
        this(nativeCreateNull());
    }
}
