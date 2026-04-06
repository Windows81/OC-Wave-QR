package io.realm.internal.core;

import io.realm.RealmModel;
import io.realm.internal.NativeContext;
import io.realm.internal.NativeObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.UncheckedRow;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public final class NativeRealmAnyCollection implements NativeObject {

    /* renamed from: z  reason: collision with root package name */
    public final long f40260z;

    public NativeRealmAnyCollection(long j2) {
        this.f40260z = j2;
        NativeContext.f40128c.a(this);
    }

    public static NativeRealmAnyCollection b(Collection collection) {
        byte[][] bArr = new byte[collection.size()][];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            if (bArr2 != null) {
                bArr[i2] = bArr2;
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateBinaryCollection(bArr, zArr));
    }

    public static NativeRealmAnyCollection c(Collection collection) {
        boolean[] zArr = new boolean[collection.size()];
        boolean[] zArr2 = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Boolean bool = (Boolean) it.next();
            if (bool != null) {
                zArr[i2] = bool.booleanValue();
                zArr2[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateBooleanCollection(zArr, zArr2));
    }

    public static NativeRealmAnyCollection d(Collection collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Date date = (Date) it.next();
            if (date != null) {
                jArr[i2] = date.getTime();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateDateCollection(jArr, zArr));
    }

    public static NativeRealmAnyCollection e(Collection collection) {
        long[] jArr = new long[collection.size()];
        long[] jArr2 = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Decimal128 decimal128 = (Decimal128) it.next();
            if (decimal128 != null) {
                jArr[i2] = decimal128.o();
                jArr2[i2] = decimal128.n();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateDecimal128Collection(jArr, jArr2, zArr));
    }

    public static NativeRealmAnyCollection f(Collection collection) {
        double[] dArr = new double[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Double d2 = (Double) it.next();
            if (d2 != null) {
                dArr[i2] = d2.doubleValue();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateDoubleCollection(dArr, zArr));
    }

    public static NativeRealmAnyCollection g(Collection collection) {
        float[] fArr = new float[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Float f2 = (Float) it.next();
            if (f2 != null) {
                fArr[i2] = f2.floatValue();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateFloatCollection(fArr, zArr));
    }

    public static NativeRealmAnyCollection h(Collection collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (number != null) {
                jArr[i2] = number.longValue();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateIntegerCollection(jArr, zArr));
    }

    public static NativeRealmAnyCollection i(Collection collection) {
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ObjectId objectId = (ObjectId) it.next();
            if (objectId != null) {
                strArr[i2] = objectId.toString();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateObjectIdCollection(strArr, zArr));
    }

    public static NativeRealmAnyCollection j(long[] jArr, boolean[] zArr) {
        return new NativeRealmAnyCollection(nativeCreateRealmAnyCollection(jArr, zArr));
    }

    public static NativeRealmAnyCollection k(Collection collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            if (realmModel != null) {
                jArr[i2] = ((UncheckedRow) ((RealmObjectProxy) realmModel).b().e()).getNativePtr();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateObjectCollection(jArr, zArr));
    }

    public static NativeRealmAnyCollection l(Collection collection) {
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                strArr[i2] = str;
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateStringCollection(strArr, zArr));
    }

    public static NativeRealmAnyCollection m(Collection collection) {
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            if (uuid != null) {
                strArr[i2] = uuid.toString();
                zArr[i2] = true;
            }
            i2++;
        }
        return new NativeRealmAnyCollection(nativeCreateUUIDCollection(strArr, zArr));
    }

    private static native long nativeCreateBinaryCollection(byte[][] bArr, boolean[] zArr);

    private static native long nativeCreateBooleanCollection(boolean[] zArr, boolean[] zArr2);

    private static native long nativeCreateDateCollection(long[] jArr, boolean[] zArr);

    private static native long nativeCreateDecimal128Collection(long[] jArr, long[] jArr2, boolean[] zArr);

    private static native long nativeCreateDoubleCollection(double[] dArr, boolean[] zArr);

    private static native long nativeCreateFloatCollection(float[] fArr, boolean[] zArr);

    private static native long nativeCreateIntegerCollection(long[] jArr, boolean[] zArr);

    private static native long nativeCreateObjectCollection(long[] jArr, boolean[] zArr);

    private static native long nativeCreateObjectIdCollection(String[] strArr, boolean[] zArr);

    private static native long nativeCreateRealmAnyCollection(long[] jArr, boolean[] zArr);

    private static native long nativeCreateStringCollection(String[] strArr, boolean[] zArr);

    private static native long nativeCreateUUIDCollection(String[] strArr, boolean[] zArr);

    private static native int nativeGetCollectionSize(long j2);

    private static native long nativeGetFinalizerPtr();

    public int a() {
        return nativeGetCollectionSize(this.f40260z);
    }

    public long getNativeFinalizerPtr() {
        return nativeGetFinalizerPtr();
    }

    public long getNativePtr() {
        return this.f40260z;
    }
}
