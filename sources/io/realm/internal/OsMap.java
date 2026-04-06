package io.realm.internal;

import io.realm.internal.android.TypeUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsMap implements NativeObject {
    public static final long C = nativeGetFinalizerPtr();

    /* renamed from: A  reason: collision with root package name */
    public final NativeContext f40155A;

    /* renamed from: B  reason: collision with root package name */
    public final Table f40156B;

    /* renamed from: z  reason: collision with root package name */
    public final long f40157z;

    public OsMap(UncheckedRow uncheckedRow, long j2) {
        OsSharedRealm n2 = uncheckedRow.j().n();
        long[] nativeCreate = nativeCreate(n2.getNativePtr(), uncheckedRow.getNativePtr(), j2);
        this.f40157z = nativeCreate[0];
        if (nativeCreate[1] != -1) {
            this.f40156B = new Table(n2, nativeCreate[1]);
        } else {
            this.f40156B = null;
        }
        NativeContext nativeContext = n2.context;
        this.f40155A = nativeContext;
        nativeContext.a(this);
    }

    private static native void nativeClear(long j2);

    private static native boolean nativeContainsBinary(long j2, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j2, boolean z2);

    private static native boolean nativeContainsDate(long j2, long j3);

    private static native boolean nativeContainsDecimal128(long j2, long j3, long j4);

    private static native boolean nativeContainsDouble(long j2, double d2);

    private static native boolean nativeContainsFloat(long j2, float f2);

    private static native boolean nativeContainsKey(long j2, String str);

    private static native boolean nativeContainsLong(long j2, long j3);

    private static native boolean nativeContainsNull(long j2);

    private static native boolean nativeContainsObjectId(long j2, String str);

    private static native boolean nativeContainsRealmAny(long j2, long j3);

    private static native boolean nativeContainsRealmModel(long j2, long j3, long j4);

    private static native boolean nativeContainsString(long j2, String str);

    private static native boolean nativeContainsUUID(long j2, String str);

    private static native long[] nativeCreate(long j2, long j3, long j4);

    private static native long nativeCreateAndPutEmbeddedObject(long j2, String str);

    private static native Object[] nativeGetEntryForModel(long j2, int i2);

    private static native Object[] nativeGetEntryForPrimitive(long j2, int i2);

    private static native Object[] nativeGetEntryForRealmAny(long j2, int i2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long j2, String str);

    private static native long nativeGetRow(long j2, String str);

    private static native Object nativeGetValue(long j2, String str);

    private static native long nativeKeys(long j2);

    private static native void nativePutBinary(long j2, String str, byte[] bArr);

    private static native void nativePutBoolean(long j2, String str, boolean z2);

    private static native void nativePutDate(long j2, String str, long j3);

    private static native void nativePutDecimal128(long j2, String str, long j3, long j4);

    private static native void nativePutDouble(long j2, String str, double d2);

    private static native void nativePutFloat(long j2, String str, float f2);

    private static native void nativePutLong(long j2, String str, long j3);

    private static native void nativePutNull(long j2, String str);

    private static native void nativePutObjectId(long j2, String str, String str2);

    private static native void nativePutRealmAny(long j2, String str, long j3);

    private static native void nativePutRow(long j2, String str, long j3);

    private static native void nativePutString(long j2, String str, String str2);

    private static native void nativePutUUID(long j2, String str, String str2);

    private static native void nativeRemove(long j2, String str);

    private static native long nativeSize(long j2);

    private static native long nativeValues(long j2);

    public void a() {
        nativeClear(this.f40157z);
    }

    public boolean b(Object obj) {
        return nativeContainsKey(this.f40157z, (String) obj);
    }

    public boolean c(Object obj) {
        if (obj == null) {
            return nativeContainsNull(this.f40157z);
        }
        if (obj instanceof Integer) {
            return nativeContainsLong(this.f40157z, ((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return nativeContainsLong(this.f40157z, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return nativeContainsDouble(this.f40157z, ((Double) obj).doubleValue());
        }
        if (obj instanceof Short) {
            return nativeContainsLong(this.f40157z, ((Short) obj).longValue());
        }
        if (obj instanceof Byte) {
            return nativeContainsLong(this.f40157z, ((Byte) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return nativeContainsBoolean(this.f40157z, ((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return nativeContainsString(this.f40157z, (String) obj);
        }
        if (obj instanceof Byte[]) {
            return nativeContainsBinary(this.f40157z, TypeUtils.a((Byte[]) obj));
        }
        if (obj instanceof byte[]) {
            return nativeContainsBinary(this.f40157z, (byte[]) obj);
        }
        if (obj instanceof Float) {
            return nativeContainsFloat(this.f40157z, ((Float) obj).floatValue());
        }
        if (obj instanceof UUID) {
            return nativeContainsUUID(this.f40157z, obj.toString());
        }
        if (obj instanceof ObjectId) {
            return nativeContainsObjectId(this.f40157z, ((ObjectId) obj).toString());
        }
        if (obj instanceof Date) {
            return nativeContainsDate(this.f40157z, ((Date) obj).getTime());
        }
        if (obj instanceof Decimal128) {
            Decimal128 decimal128 = (Decimal128) obj;
            return nativeContainsDecimal128(this.f40157z, decimal128.n(), decimal128.o());
        }
        throw new IllegalArgumentException("Invalid object type: " + obj.getClass().getCanonicalName());
    }

    public boolean d(long j2) {
        return nativeContainsRealmAny(this.f40157z, j2);
    }

    public boolean e(long j2, long j3) {
        return nativeContainsRealmModel(this.f40157z, j2, j3);
    }

    public long f(Object obj) {
        return nativeCreateAndPutEmbeddedObject(this.f40157z, (String) obj);
    }

    public Object g(Object obj) {
        return nativeGetValue(this.f40157z, (String) obj);
    }

    public long getNativeFinalizerPtr() {
        return C;
    }

    public long getNativePtr() {
        return this.f40157z;
    }

    public Pair h(int i2) {
        Object[] nativeGetEntryForPrimitive = nativeGetEntryForPrimitive(this.f40157z, i2);
        return new Pair((String) nativeGetEntryForPrimitive[0], nativeGetEntryForPrimitive[1]);
    }

    public Pair i(int i2) {
        Object[] nativeGetEntryForModel = nativeGetEntryForModel(this.f40157z, i2);
        String str = (String) nativeGetEntryForModel[0];
        Long l2 = (Long) nativeGetEntryForModel[1];
        return l2.longValue() == -1 ? new Pair(str, -1L) : new Pair(str, l2);
    }

    public Pair j(int i2) {
        Object[] nativeGetEntryForRealmAny = nativeGetEntryForRealmAny(this.f40157z, i2);
        return new Pair((String) nativeGetEntryForRealmAny[0], new NativeRealmAny(((Long) nativeGetEntryForRealmAny[1]).longValue()));
    }

    public long k(Object obj) {
        return nativeGetRow(this.f40157z, (String) obj);
    }

    public long l(Object obj) {
        return nativeGetRealmAnyPtr(this.f40157z, (String) obj);
    }

    public void m(Object obj, Object obj2) {
        if (obj2 == null) {
            try {
                nativePutNull(this.f40157z, (String) obj);
            } catch (IllegalArgumentException e2) {
                if (e2.getMessage().contains("Value cannot be null")) {
                    throw new NullPointerException(e2.getMessage());
                }
                throw e2;
            }
        } else {
            String canonicalName = obj2.getClass().getCanonicalName();
            if (Long.class.getCanonicalName().equals(canonicalName)) {
                nativePutLong(this.f40157z, (String) obj, ((Long) obj2).longValue());
            } else if (Integer.class.getCanonicalName().equals(canonicalName)) {
                nativePutLong(this.f40157z, (String) obj, (long) ((Integer) obj2).intValue());
            } else if (Short.class.getCanonicalName().equals(canonicalName)) {
                nativePutLong(this.f40157z, (String) obj, (long) ((Short) obj2).shortValue());
            } else if (Byte.class.getCanonicalName().equals(canonicalName)) {
                nativePutLong(this.f40157z, (String) obj, (long) ((Byte) obj2).byteValue());
            } else if (Float.class.getCanonicalName().equals(canonicalName)) {
                nativePutFloat(this.f40157z, (String) obj, ((Float) obj2).floatValue());
            } else if (Double.class.getCanonicalName().equals(canonicalName)) {
                nativePutDouble(this.f40157z, (String) obj, ((Double) obj2).doubleValue());
            } else if (String.class.getCanonicalName().equals(canonicalName)) {
                nativePutString(this.f40157z, (String) obj, (String) obj2);
            } else if (Boolean.class.getCanonicalName().equals(canonicalName)) {
                nativePutBoolean(this.f40157z, (String) obj, ((Boolean) obj2).booleanValue());
            } else if (Date.class.getCanonicalName().equals(canonicalName)) {
                nativePutDate(this.f40157z, (String) obj, ((Date) obj2).getTime());
            } else if (Decimal128.class.getCanonicalName().equals(canonicalName)) {
                Decimal128 decimal128 = (Decimal128) obj2;
                nativePutDecimal128(this.f40157z, (String) obj, decimal128.n(), decimal128.o());
            } else if (Byte[].class.getCanonicalName().equals(canonicalName)) {
                nativePutBinary(this.f40157z, (String) obj, TypeUtils.a((Byte[]) obj2));
            } else if (byte[].class.getCanonicalName().equals(canonicalName)) {
                nativePutBinary(this.f40157z, (String) obj, (byte[]) obj2);
            } else if (ObjectId.class.getCanonicalName().equals(canonicalName)) {
                nativePutObjectId(this.f40157z, (String) obj, ((ObjectId) obj2).toString());
            } else if (UUID.class.getCanonicalName().equals(canonicalName)) {
                nativePutUUID(this.f40157z, (String) obj, obj2.toString());
            } else {
                throw new UnsupportedOperationException("Class '" + canonicalName + "' not supported.");
            }
        }
    }

    public void n(Object obj, long j2) {
        nativePutRealmAny(this.f40157z, (String) obj, j2);
    }

    public void o(Object obj, long j2) {
        nativePutRow(this.f40157z, (String) obj, j2);
    }

    public void p(Object obj) {
        nativeRemove(this.f40157z, (String) obj);
    }

    public long q() {
        return nativeSize(this.f40157z);
    }

    public Pair r() {
        return new Pair(this.f40156B, Long.valueOf(nativeKeys(this.f40157z)));
    }

    public Pair s() {
        return new Pair(this.f40156B, Long.valueOf(nativeValues(this.f40157z)));
    }
}
